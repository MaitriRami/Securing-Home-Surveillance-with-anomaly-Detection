package com.project.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class Basemethods {
	
	public static String getUser(){
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return  user.getUsername();
	}
	private static String ACCESSKEY = "AKIAYGFHCG3P4T6UDBP3";
	private static String SECCRETKEY = "cdFzO832vtNBMq3/xhNZyl7xfNdEQJheOjKRq4I8";
	
	public static String uploadObject(String file,String bucket_name)
	{
		
		File f = new File(file);
		BasicAWSCredentials awsCredentials =
				new BasicAWSCredentials(ACCESSKEY,SECCRETKEY);
		
		AmazonS3 s3 = AmazonS3ClientBuilder.standard()
				.withCredentials(new StaticCredentialsProvider(awsCredentials)).withRegion(Regions.US_EAST_1).build();

	    
	        String link="";
	        try {
	        	
	       System.out.println(f.getName());
	       System.out.println(f);
	        s3.putObject(bucket_name, f.getName(),f);
	       link=s3.getUrl(bucket_name,f.getName()).toString();
	        } catch (AmazonServiceException e) {
	            System.err.println(e.getErrorMessage());
	            System.exit(1);
	        }

	        System.out.println("Done!");
	        return link;
			
	}
	
	public static void createFile(String path,String filename,MultipartFile file) throws IOException
	{
		try{
		byte[] b = file.getBytes();
		System.out.println(file);
		System.out.println(filename);
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(path+"/"+filename));
		bos.write(b);
		bos.flush();
		bos.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void deletefile(String path)
	{
		File f1=new File(path);
		Boolean b=f1.delete();
		System.out.println(b);
	}
	
	
	public static String generatePassword() {

		int n = 8;
		// chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
        
        
	}
	
	public static void sendMail(String receiver,String securityKey,String userName){

		final String from = "noreply.shsad@gmail.com";
		final String username = "";
		final String password = "shsad@123";

		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mails.smtp.ssl.trust","smtp.gmail.com");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(receiver));
			message.setSubject("Approve");
			
			
			/*
			 * int num = 0; String pass = ""; for (int i = 0; i < 4;
			 * i++) { num = (int) (Math.random() * 10); pass += num; }
			 * 
			 * System.out.println(pass);
			 * 
			 * s.setAttribute("password", pass);
			 */

		message.setText("Hello ,  " + userName + " your OTP is " + securityKey);

			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
