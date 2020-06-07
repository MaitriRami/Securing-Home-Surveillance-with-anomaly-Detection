<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>SHSAD | Start Detection</title>
<!--favicon-->
<link rel="icon" href="<%request.getContextPath() ;%>/adminResources/images/favicon.ico"
	type="image/x-icon">
<!-- simplebar CSS-->
<link href="<%request.getContextPath() ;%>/adminResources/css/simplebar.css" rel="stylesheet" />
<!-- Bootstrap core CSS-->
<link href="<%request.getContextPath() ;%>/adminResources/css/bootstrap.min.css" rel="stylesheet" />
<!-- animate CSS-->
<link href="<%request.getContextPath() ;%>/adminResources/css/animate.css" rel="stylesheet"
	type="text/css" />
<!-- Icons CSS-->
<link href="<%request.getContextPath() ;%>/adminResources/css/icons.css" rel="stylesheet"
	type="text/css" />
<!-- Sidebar CSS-->
<link href="<%request.getContextPath() ;%>/adminResources/css/sidebar-menu.css" rel="stylesheet" />
<!-- Custom Style-->
<link href="<%request.getContextPath() ;%>/adminResources/css/app-style.css" rel="stylesheet" />


    	<style type="text/css">

.rating {
    float:left;
}

/* :not(:checked) is a filter, so that browsers that dont support :checked dont 
   follow these rules. Every browser that supports :checked also supports :not(), so
   it doesnt make the test unnecessarily selective */
.rating:not(:checked) > input {
    position:absolute;  
    top:-9999px;
    clip:rect(0,0,0,0);
}

.rating:not(:checked) > label {
    float:right;
    width:1em;
    padding:0 .1em;
    overflow:hidden;
    white-space:nowrap;
    cursor:pointer;
    font-size:200%;
    line-height:1.2;
    color:#ddd;
    text-shadow:1px 1px #bbb, 2px 2px #666, .1em .1em .2em rgba(0,0,0,.5);
}

.rating:not(:checked) > label:before {
    content: ' ';
}

.rating > input:checked ~ label {
    color: #f70;
    text-shadow:1px 1px #c60, 2px 2px #940, .1em .1em .2em rgba(0,0,0,.5);
}

.rating:not(:checked) > label:hover,
.rating:not(:checked) > label:hover ~ label {
    color: gold;
    text-shadow:1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em rgba(0,0,0,.5);
}

.rating > input:checked + label:hover,
.rating > input:checked + label:hover ~ label,
.rating > input:checked ~ label:hover,
.rating > input:checked ~ label:hover ~ label,
.rating > label:hover ~ input:checked ~ label {
    color: #ea0;
    text-shadow:1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em rgba(0,0,0,.5);
}

.rating > label:active {
    position:relative;
    top:2px;
    left:2px;
}

</style>


</head>

<body>

	<!-- start loader -->
	<div id="pageloader-overlay" class="visible incoming">
		<div class="loader-wrapper-outer">
			<div class="loader-wrapper-inner">
				<div class="loader"></div>
			</div>
		</div>
	</div>
	<!-- end loader -->

	<!-- Start wrapper-->
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
						<h4 class="page-title">SHSAD | Start Detection</h4>
						<ol class="breadcrumb">
							<!-- <li class="breadcrumb-item"><a href="javaScript:void();">Xmino</a></li> -->
							<!-- <li class="breadcrumb-item"><a href="javaScript:void();">Feedback</a></li>
							<li class="breadcrumb-item active" aria-current="page">Post Feedback</li> -->
						</ol>
					</div>
					<!-- <div class="col-sm-3">
						<div class="btn-group float-sm-right">
							<button type="button"
								class="btn btn-outline-primary waves-effect waves-light">
								<i class="fa fa-cog mr-1"></i> Setting
							</button>
							<button type="button"
								class="btn btn-primary dropdown-toggle dropdown-toggle-split waves-effect waves-light"
								data-toggle="dropdown">
								<span class="caret"></span>
							</button>
							<div class="dropdown-menu">
								<a href="javaScript:void();" class="dropdown-item">Action</a> <a
									href="javaScript:void();" class="dropdown-item">Another
									action</a> <a href="javaScript:void();" class="dropdown-item">Something
									else here</a>
								<div class="dropdown-divider"></div>
								<a href="javaScript:void();" class="dropdown-item">Separated
									link</a>
							</div>
						</div>
					</div> -->
				</div>
				<!-- End Breadcrumb-->
				<div class="row">
					<div class="col-lg-12">
						<div class="card">
							<div class="card-body">
								<f:form id="personal-info" action="loadDetection"  modelAttribute="familyPhotoVO" method="get"> 
									<h4 class="form-header">
										<i class="fa fa-file-text-o"></i>Start Detection
									</h4>
									
									  <f:input path="id" type="hidden" name="id" value="${familyId}"/> 
									
									<div class="form-group row">
										<label for="input-9" class="col-sm-2 col-form-label">Detect Unknown Member</label>
									</div>										
									<div class="form-footer">
										<input type="button" class="btn btn-success" onClick="getData()" name="Detection" value="Detection">
											<!-- <i class="fa fa-check-square-o"></i>  -->
									<input type="button" class="btn btn-success" onClick="getChild()" name="Detection" value="child Detection">
									
									</div>
								</f:form>
							</div>
						</div>
					</div>
				</div>
				<!--End Row-->


			</div>
			<!-- End container-fluid-->

		</div>
		<!--End content-wrapper-->
		<!--Start Back To Top Button-->
		<a href="javaScript:void();" class="back-to-top"><i
			class="fa fa-angle-double-up"></i> </a>
		<!--End Back To Top Button-->

		<!--Start footer-->
		<footer class="footer">
			<jsp:include page="footer.jsp"></jsp:include>
		</footer>
		<!--End footer-->


	</div>
	<!--End wrapper-->


	<!-- Bootstrap core JavaScript-->
	<script src="<%request.getContextPath() ;%>/adminResources/js/jquery.min.js"></script>
	<script src="<%request.getContextPath() ;%>/adminResources/js/popper.min.js"></script>
	<script src="<%request.getContextPath() ;%>/adminResources/js/bootstrap.min.js"></script>
	<script src="<%request.getContextPath() ;%>/adminResources/js/detection.js"></script>
	<script src="<%request.getContextPath() ;%>/adminResources/js/childDetection.js"></script>
	
	<!-- simplebar js -->
	<script src="<%request.getContextPath() ;%>/adminResources/js/simplebar.js"></script>
	<!-- sidebar-menu js -->
	<script src="<%request.getContextPath() ;%>/adminResources/js/sidebar-menu.js"></script>

	<!-- Custom scripts -->
	<script src="<%request.getContextPath() ;%>/adminResources/js/app-script.js"></script>

	<!--Form Validatin Script-->
	<script src="<%request.getContextPath() ;%>/adminResources/js/jquery.validate.min.js"></script>
	<script>
		$()
				.ready(
						function() {

							$("#personal-info").validate();

							// validate signup form on keyup and submit
							$("#signupForm")
									.validate(
											{
												rules : {
													firstname : "required",
													lastname : "required",
													username : {
														required : true,
														minlength : 2
													},
													password : {
														required : true,
														minlength : 5
													},
													confirm_password : {
														required : true,
														minlength : 5,
														equalTo : "#password"
													},
													email : {
														required : true,
														email : true
													},
													contactnumber : {
														required : true,
														minlength : 10
													},
													topic : {
														required : "#newsletter:checked",
														minlength : 2
													},
													agree : "required"
												},
												messages : {
													firstname : "Please enter your firstname",
													lastname : "Please enter your lastname",
													username : {
														required : "Please enter a username",
														minlength : "Your username must consist of at least 2 characters"
													},
													password : {
														required : "Please provide a password",
														minlength : "Your password must be at least 5 characters long"
													},
													confirm_password : {
														required : "Please provide a password",
														minlength : "Your password must be at least 5 characters long",
														equalTo : "Please enter the same password as above"
													},
													email : "Please enter a valid email address",
													contactnumber : "Please enter your 10 digit number",
													agree : "Please accept our policy",
													topic : "Please select at least 2 topics"
												}
											});

						});
	</script>

</body>
</html>
