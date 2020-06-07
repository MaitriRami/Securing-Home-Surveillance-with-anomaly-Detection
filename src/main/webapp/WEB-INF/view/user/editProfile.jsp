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
  <title>SHSAD | Edit Profile</title>
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
  <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
</head>

<body>

<!-- start loader -->
   <div id="pageloader-overlay" class="visible incoming"><div class="loader-wrapper-outer"><div class="loader-wrapper-inner" ><div class="loader"></div></div></div></div>
   <!-- end loader -->
<div id="wrapper">
   <!--Start sidebar-wrapper-->
		<jsp:include page="menu.jsp"></jsp:include>

		<!--End sidebar-wrapper-->

		<!--Start topbar header-->
		<header class="topbar-nav">

			<jsp:include page="header.jsp"></jsp:include>
		</header>
		<!--End topbar header-->
   


<div class="clearfix"></div>
	
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumb-->
     <div class="row pt-2 pb-2">
        <div class="col-sm-9">
		    <h4 class="page-title">SHSAD | Edit Profile</h4>
		    <ol class="breadcrumb">
           
            <li class="breadcrumb-item"><a href="javaScript:void();">Manage Profile</a></li>
            <li class="breadcrumb-item active" aria-current="page">Edit Profile</li>
         </ol>
	   </div>
     <!-- <div class="col-sm-3">
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
      <div style="width:150%">
        <div class="col-lg-8">
          <div class="card">
            <div class="card-header">
              <div class="row align-items-center">
                <div class="col">
                  <h6 class="mb-0 text-uppercase">Edit profile </h6>
                </div>
                <div class="col text-right">
                  <i class="zmdi zmdi-more-vert fa-2x"></i>
                </div>
              </div>
            </div>
             <f:form id="personal-info" action="insertUser" modelAttribute="registerVO" method="post">
             <f:hidden path="id"/>
             <f:hidden path="loginVO.id"/>
             <f:hidden path="loginVO.role"/>
             <f:hidden path="loginVO.enabled"/>
             <f:hidden path="loginVO.password"/>
             
            <div class="card-body">
              <div class="profile-form">
                <h6 class="mb-4">User information</h6>
                <div class="pl-lg-4">
               
                  <div class="row">
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-first-name">First name</label>
                        <f:input type="text"  path="firstName" id="input-first-name" class="form-control" placeholder="First name"/>
                      </div>
                    </div>
                    
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-last-name">Last name</label>
                        <f:input type="text" path="lastName" id="input-last-name" class="form-control" placeholder="Last name" />
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-first-name">Phone No</label>
                        <f:input type="text"  path="phoneNo" id="input-first-name" class="form-control" placeholder="First name" />
                      </div>
                    </div>
                   <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-email">Email address</label>
                        <f:input type="email" path="loginVO.username" id="input-email" class="form-control" placeholder="gracie@example.com" readonly="true"/>
                      </div>
                    </div>
                  </div>
                </div>
                <hr class="my-4">
                <!-- Address -->
                <h6 class="mb-4">Contact information</h6>
                <div class="pl-lg-4">
                  <div class="row">
                    <div class="col-md-12">
                      <div class="form-group">
                        <label class="form-control-label" for="input-address">Address</label>
                        <f:textarea path="address" rows="4" class="form-control" placeholder="Address"/>
                        
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-lg-4">
                      <div class="form-group">
                        <label class="form-control-label" for="input-city">Country</label>
                          <f:select class="form-control"  path="countryVO.id" id="country" onChange="getState()">
												<f:option value="${registerVO.countryVO.id}" label="Select"></f:option>
												<f:options items="${countryList}" itemLabel="countryName" itemValue="id"/>
												</f:select>
                      </div>
                    </div>
                    <div class="col-lg-4">
                      <div class="form-group">
                        <label class="form-control-label" for="input-country">State</label>
                        <f:select class="form-control"  path="stateVO.id" id="state" onChange="getCity()">
												<f:option value="${registerVO.stateVO.id}" label="Select">${registerVO.stateVO.stateName}</f:option>
												</f:select>
                      </div>
                    </div>
                    <div class="col-lg-4">
                      <div class="form-group">
                        <label class="form-control-label" for="input-city">City</label>
                         <f:select class="form-control"  path="cityVO.id" id="city">
												<f:option value="${registerVO.cityVO.id}" label="Select">${registerVO.cityVO.cityName}</f:option>
												</f:select>
                      </div>
                    </div>   
                </div>
              <!--   <hr class="my-4">
                Description
                <h6 class="mb-4">About me</h6>
                <div class="pl-lg-4">
                  <div class="form-group">
                    <label class="form-control-label">About Me</label>
                    <textarea rows="4" class="form-control" placeholder="A few words about you ...">I am a UI/UX developer. I love front end coding. Bootstrap is the best front-end framework. it is very easy and developer friendly.</textarea>
                  </div>
                </div> -->
                <div class="form-footer">
										<button type="submit" class="btn btn-success">
											<i class="fa fa-check-square-o"></i> SAVE
										</button>
									</div>
              </div>
            </div>
            </f:form>
          </div> 
         
        </div>
     
    </div><!--end row-->
</div>
    </div>
    <!-- End container-fluid-->
  <!--End content-wrapper-->
   <!--Start Back To Top Button-->
    <a href="javaScript:void();" class="back-to-top"><i class="fa fa-angle-double-up"></i> </a>
    <!--End Back To Top Button-->
	
	<%-- <!--Start footer-->
	<footer class="footer">
      <div class="container">
        <div class="text-center">
          Copyright © 2019 Xmino Admin
        </div>
      </div>
    </footer>
	<!--End footer--> --%>
	</div>

  <!-- Bootstrap core JavaScript-->
  <script src="<%=request.getContextPath()%>/adminResources/js/jquery.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/popper.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/bootstrap.min.js"></script>
  <script
		src="<%=request.getContextPath()%>/adminResources/js/register.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/cityJS.js"></script>
	
  <!-- simplebar js -->
  <script src="<%=request.getContextPath()%>/adminResources/plugins/simplebar/js/simplebar.js"></script>
  <!-- sidebar-menu js -->
  <script src="<%=request.getContextPath()%>/adminResources/js/sidebar-menu.js"></script>
  
  <!-- Custom scripts -->
  <script src="<%=request.getContextPath()%>/adminResources/js/app-script.js"></script>
	
</body>
</html>
    