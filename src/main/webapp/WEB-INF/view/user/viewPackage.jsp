<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
  <meta name="description" content=""/>
  <meta name="author" content=""/>
  <title>SHSAD | View Package</title>
  <!--favicon-->
  <link rel="icon" href="<%=request.getContextPath()%>/adminResources/images/favicon.ico" type="image/x-icon">
  <!-- simplebar CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/plugins/simplebar/css/simplebar.css" rel="stylesheet"/>
  <!-- Bootstrap core CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/css/bootstrap.min.css" rel="stylesheet"/>
  <!-- animate CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/css/animate.css" rel="stylesheet" type="text/css"/>
  <!-- Icons CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/css/icons.css" rel="stylesheet" type="text/css"/>
  <!-- Sidebar CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/css/sidebar-menu.css" rel="stylesheet"/>
  <!-- Custom Style-->
  <link href="<%=request.getContextPath()%>/adminResources/css/app-style.css" rel="stylesheet"/>
   <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
</head>

<body>

 <!-- start loader -->
   <div id="pageloader-overlay" class="visible incoming"><div class="loader-wrapper-outer"><div class="loader-wrapper-inner" ><div class="loader"></div></div></div></div>
   <!-- end loader -->
<!-- Start wrapper-->
 <div id="wrapper">

 <jsp:include page="menu.jsp"></jsp:include>
 
 <header class="topbar-nav">
 
 <jsp:include page="header.jsp"></jsp:include>
 
</header>
 

<div class="clearfix"></div>
	
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumb-->
     <div class="row pt-2 pb-2">
        <div class="col-sm-9">
		    <h4 class="page-title">Buy Package</h4>
		    <ol class="breadcrumb">
            
            <li class="breadcrumb-item"><a href="javaScript:void();">Manage Package</a></li>
            <li class="breadcrumb-item active" aria-current="page">Buy Package</li>
         </ol>
	   </div>
    <!--  <div class="col-sm-3">
       <div class="btn-group float-sm-right">
        <button type="button" class="btn btn-primary waves-effect waves-light"><i class="fa fa-cog mr-1"></i> Setting</button>
        <button type="button" class="btn btn-primary dropdown-toggle dropdown-toggle-split waves-effect waves-light" data-toggle="dropdown">
        <span class="caret"></span>
        </button>
        <div class="dropdown-menu">
          <a href="javaScript:void();" class="dropdown-item">Action</a>
          <a href="javaScript:void();" class="dropdown-item">Another action</a>
          <a href="javaScript:void();" class="dropdown-item">Something else here</a>
          <div class="dropdown-divider"></div>
          <a href="javaScript:void();" class="dropdown-item">Separated link</a>
        </div>
      </div>
     </div> -->
     </div>
    <!-- End Breadcrumb-->
 	<div class="row">
   <!--   <div class="col-12 col-lg-4 col-xl-4">
    <div class="pricing-table">
     <div class="card border-0">
      <div class="card-body text-center bg-primary">
     <div class="price-title text-white">PERSONAL</div>
       <h2 class="price text-white"><small class="currency">$</small>199</h2>
    </div>
    <div class="card-body text-center rounded-bottom">
      <ul class="list-group list-group-flush">
        <li class="list-group-item"><b>4 GB</b> Ram</li>
        <li class="list-group-item"><b>80 GB</b> Disk Space</li>
        <li class="list-group-item">Monthly Backups</li>
        <li class="list-group-item">Email Support</li>
        <li class="list-group-item">24X7 Support</li>
      </ul>
      <a href="javascript:void();" class="btn btn-primary my-3 btn-round">View More</a>
    </div>
     </div>
     </div>
    </div>-->
     <c:set value="1" var="count"></c:set>
      <c:forEach items="${packageList}" var="i" varStatus="count">
    <div class="col-12 col-lg-4 col-xl-4">
    <div class="pricing-table">
     <div class="card border-0">
      <div class="card-body text-center bg-info">
     <div class="price-title text-white">BUSINESS</div>
       <h2 class="price text-white"><small class="currency">$</small>${i.packagePrice}</h2>
    </div>
    <div class="card-body text-center rounded-bottom">
        <ul class="list-group list-group-flush">
          <li class="list-group-item"><b>${i.packageName}</b></li>
          <li class="list-group-item"><b>${i.packageDuration}</b></li>
          <li class="list-group-item"><b>${i.packageDescription}</b></li>
          <li class="list-group-item"><b>24X7 Support</b></li>
       </ul>
      <a href="javascript:void();" class="btn btn-info my-3 btn-round">Buy Now</a>
    </div>
     </div>
     </div>
    </div>
    </c:forEach>
    
   <!--   <div class="col-12 col-lg-4 col-xl-4">
     <div class="pricing-table">
     <div class="card border-0">
      <div class="card-body text-center bg-danger">
     <div class="price-title text-white">CORPORATE</div>
       <h2 class="price text-white"><small class="currency">$</small>399</h2>
    </div>
    <div class="card-body text-center rounded-bottom">
       <ul class="list-group list-group-flush">
        <li class="list-group-item"><b>4 GB</b> Ram</li>
        <li class="list-group-item"><b>80 GB</b> Disk Space</li>
        <li class="list-group-item">Monthly Backups</li>
        <li class="list-group-item">Email Support</li>
        <li class="list-group-item">24X7 Support</li>
      </ul>
      <a href="javascript:void();" class="btn btn-danger my-3 btn-round">View More</a>
    </div>
     </div>
     </div>
    </div>-->
   </div><!--End Row-->
	  
	 
    </div>
    <!-- End container-fluid-->
    
    </div><!--End content-wrapper-->
   <!--Start Back To Top Button-->
    <a href="javaScript:void();" class="back-to-top"><i class="fa fa-angle-double-up"></i> </a>
    <!--End Back To Top Button-->
    
    
<%--  <jsp:include page="footer.jsp"></jsp:include> --%>
 

	
   
  </div><!--End wrapper-->


  <!-- Bootstrap core JavaScript-->
  <script src="<%=request.getContextPath()%>/adminResources/js/jquery.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/popper.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/bootstrap.min.js"></script>
	
  <!-- simplebar js -->
  <script src="<%=request.getContextPath()%>/adminResources/plugins/simplebar/js/simplebar.js"></script>
  <!-- sidebar-menu js -->
  <script src="<%=request.getContextPath()%>/adminResources/js/sidebar-menu.js"></script>
  
  <!-- Custom scripts -->
  <script src="<%=request.getContextPath()%>/adminResources/js/app-script.js"></script>
	
</body>
</html>

