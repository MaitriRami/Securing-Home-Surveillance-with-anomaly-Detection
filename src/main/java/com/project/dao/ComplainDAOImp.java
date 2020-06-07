package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.ComplainVO;
@Repository
public class ComplainDAOImp implements ComplainDAO {
	
	@Autowired
	SessionFactory sessionfactory;
	
	public void insertComplain(ComplainVO complainVO) {

		Session s = sessionfactory.getCurrentSession();
		s.saveOrUpdate(complainVO);
	}
	
	public List searchComplain(ComplainVO complainVO){
		
		Session s = sessionfactory.getCurrentSession();
		Query q = s.createQuery("from ComplainVO where status=true AND loginVO.id='"+complainVO.getLoginVO().getId()+"'");
		return q.list();
	}
	
	public List searchComplainById(ComplainVO complainVO){
		
		Session s = sessionfactory.getCurrentSession();
		Query q = s.createQuery("from ComplainVO where id='"+complainVO.getId()+"'");
		return q.list();
	}

   public List displayComplain(ComplainVO complainVO){
		
		Session s = sessionfactory.getCurrentSession();
		Query q = s.createQuery("from ComplainVO where status=true ");
		return q.list();
	}
   
   public List<ComplainVO> viewPendingComplain()
	{
		List<ComplainVO> complainList = new ArrayList<ComplainVO>();
		try{
	 		Session session = sessionfactory.getCurrentSession();
			Query q = session.createQuery("from ComplainVO where status=true and complainStatus = 'Pending'");
			complainList = q.list();

			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
			return complainList;
	}
	
	public List<ComplainVO> viewResolveComplain()
	{
		List<ComplainVO> complainList = new ArrayList<ComplainVO>();
		try{
	 		Session session = sessionfactory.getCurrentSession();
			Query q = session.createQuery("from ComplainVO where status=true and complainStatus = 'Resolved'");
			complainList = q.list();

			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
			return complainList;
	}

	 public List<ComplainVO> viewUserPendingComplain(ComplainVO complainVO)
		{
			List<ComplainVO> complainList = new ArrayList<ComplainVO>();
			try{
		 		Session session = sessionfactory.getCurrentSession();
				Query q = session.createQuery("from ComplainVO where status=true and complainStatus = 'Pending' and "
						+ "  loginVO.id='"+complainVO.getLoginVO().getId()+"'");
				complainList = q.list();

				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
				return complainList;
		}
		
		public List<ComplainVO> viewUserResolveComplain(ComplainVO complainVO)
		{
			List<ComplainVO> complainList = new ArrayList<ComplainVO>();
			try{
		 		Session session = sessionfactory.getCurrentSession();
				Query q = session.createQuery("from ComplainVO where status=true and complainStatus = 'Resolved' and"
						+ "  loginVO.id='"+complainVO.getLoginVO().getId()+"'");
				complainList = q.list();

				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
				return complainList;
		}
}
