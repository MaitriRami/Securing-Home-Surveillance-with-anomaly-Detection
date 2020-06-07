<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>SHSAD | Register</title>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!--favicon-->
<link rel="icon"
	href="<%=request.getContextPath()%>/adminResources/images/favicon.ico"
	type="image/x-icon">
<!-- Bootstrap core CSS-->
<link
	href="<%=request.getContextPath()%>/adminResources/css/bootstrap.min.css"
	rel="stylesheet" />
<!-- animate CSS-->
<link
	href="<%=request.getContextPath()%>/adminResources/css/animate.css"
	rel="stylesheet" type="text/css" />
<!-- Icons CSS-->
<link href="<%=request.getContextPath()%>/adminResources/css/icons.css"
	rel="stylesheet" type="text/css" />
<!-- Custom Style-->
<link
	href="<%=request.getContextPath()%>/adminResources/css/app-style.css"
	rel="stylesheet" />

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

		<div class="card card-authentication1 mx-auto my-4">
			<div class="card-body">
				<div class="card-content p-2">
					<div class="text-center">
						<img
							src="<%=request.getContextPath()%>/adminResources/images/logo-icon.png"
							alt="logo icon">
					</div>
					<div class="card-title text-uppercase text-center py-3">Sign
						Up</div>
					<f:form action="insertUser.html" method="post"
						modelAttribute="registerVO">
						<f:input path="id" type="hidden" />

						<div class="form-group">
							<label for="exampleInputName" class="sr-only">First Name</label>
							<div class="position-relative has-icon-right">
								<f:input type="text" path="firstName"
									class="form-control input-shadow"
									placeholder="Enter Your First Name" />
								<div class="form-control-position">
									<i class="icon-user"></i>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="exampleInputName" class="sr-only">Last Name</label>
							<div class="position-relative has-icon-right">
								<f:input type="text" path="lastName"
									class="form-control input-shadow"
									placeholder="Enter Your Last Name" />
								<div class="form-control-position">
									<i class="icon-user"></i>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="exampleInputName" class="sr-only">Phone No</label>
							<div class="position-relative has-icon-right">
								<f:input type="text" path="phoneNo"
									class="form-control input-shadow"
									placeholder="Enter Your Phone no" />
								<div class="form-control-position">
									<i class="fa fa-phone-square" aria-hidden="true"></i>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="exampleInputName" class="sr-only">Country</label>
							<div class="position-relative has-icon-right">
								<f:select path="countryVO.id" class="form-control input-shadow" id="country" onChange="getState()">
									<%--  <c:forEach items="${Model.countryList}" var="i">
				<option value="${i.id}">${i.countryName}</option>
				</c:forEach> --%>
									<f:option value="${registerVO.countryVO.id}" label="Select"></f:option>
									<f:options items="${countryList}" itemLabel="countryName"
										itemValue="id" />
								</f:select>
							</div>
						</div>
						
						
						<div class="form-group">
							<label for="exampleInputName" class="sr-only">State</label>
							<div class="position-relative has-icon-right">
								<f:select path="stateVO.id" class="form-control input-shadow" id="state" onChange="getCity()">
									<%-- <c:forEach items="${Model.stateList}" var="i">
									<option value="${i.id}">${i.stateName}</option>
									</c:forEach> --%>
									<f:option value="${registerVO.stateVO.id}" label="Select">${registerVO.stateVO.stateName}</f:option>
								</f:select>
							</div>
						</div>
						<div class="form-group">
							<label for="exampleInputName" class="sr-only">City</label>
							<div class="position-relative has-icon-right">
								<f:select path="cityVO.id" class="form-control input-shadow" id="city" >
									<%-- <c:forEach items="${Model.cityList}" var="i">
										<option value="${i.id}">${i.cityName}</option>
									</c:forEach> --%>
									<f:option value="${registerVO.cityVO.id}" label="Select">${registerVO.cityVO.cityName}</f:option>
								</f:select>
							</div>
						</div>
						<div class="form-group">
							<label for="exampleInputName" class="sr-only">Address</label>
							<div class="position-relative has-icon-right">
								<f:textarea rows="5" cols="10" path="address"
									class="form-control input-shadow"
									placeholder="Enter Your Address" />

								<div class="form-control-position">
									<i class="fa fa-address-book"></i>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="exampleInputEmailId" class="sr-only">UserName</label>
							<div class="position-relative has-icon-right">
								<f:input type="text" path="loginVO.username"
									class="form-control input-shadow"
									placeholder="Enter Your Email ID" />
								<div class="form-control-position">
									<i class="icon-envelope-open"></i>
								</div>
							</div>
						</div>

						<div class="form-group">
							<div class="icheck-material-primary">
								<input type="checkbox" id="user-checkbox" checked="" /> <label
									for="user-checkbox">I Agree With Terms & Conditions</label>
							</div>
						</div>

						<input type="submit" class="btn btn-primary btn-block">
						<div class="text-center mt-3">Sign Up With</div>

						<div class="form-row mt-4">
							<div class="form-group mb-0 col-6">
								<button type="button"
									class="btn bg-facebook text-white btn-block">
									<i class="fa fa-facebook-square"></i> Facebook
								</button>
							</div>
							<div class="form-group mb-0 col-6 text-right">
								<button type="button"
									class="btn bg-twitter text-white btn-block">
									<i class="fa fa-twitter-square"></i> Twitter
								</button>
							</div>
						</div>

					</f:form>
				</div>
			</div>
			<div class="card-footer text-center py-3">
				<p class="text-dark mb-0">
					Already have an account? <a href="authentication-signin.html">
						Sign In here</a>
				</p>
			</div>
		</div>

		<!--Start Back To Top Button-->
		<a href="javaScript:void();" class="back-to-top"><i
			class="fa fa-angle-double-up"></i> </a>
		<!--End Back To Top Button-->


	</div>
	<!--wrapper-->

	<!-- Bootstrap core JavaScript-->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/register.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/cityJS.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/popper.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/bootstrap.min.js"></script>

	<!-- sidebar-menu js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/sidebar-menu.js"></script>

	<!-- Custom scripts -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/app-script.js"></script>

</body>
</html>
