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
<title>SHSAD | Index</title>
<!--favicon-->
<link rel="icon"
	href="<%=request.getContextPath()%>/adminResources/images/favicon.ico"
	type="image/x-icon" />
<!-- simplebar CSS-->
<link
	href="<%=request.getContextPath()%>/adminResources/css/simplebar.css"
	rel="stylesheet" />
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
<!-- Sidebar CSS-->
<link
	href="<%=request.getContextPath()%>/adminResources/css/sidebar-menu.css"
	rel="stylesheet" />
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

				<div class="row mt-4">
					<div class="col-12 col-lg-6 col-xl-3">
						<div class="card rounded-0">
							<div class="card-body">
								<div class="media align-items-center">
									<div class="media-body">
										<p class="mb-0">Total Complain</p>
										<h5 class="mb-0">${data.totalComplainList}</h5>
										<!--  <small class="extra-small-font py-1 px-2 rounded mb-0">-1.2%</small> -->
									</div>
									<div class="w-icon">
										<i class="zmdi zmdi-accounts-alt text-white"></i>
									</div>
								</div>
							</div>
							<canvas id="dash1-chart-1" height="45"></canvas>
						</div>
					</div>
					<div class="col-12 col-lg-6 col-xl-3">
						<div class="card rounded-0">
							<div class="card-body">
								<div class="media align-items-center">
									<div class="media-body">
										<p class="mb-0">Pending Complain</p>
										<h5 class="mb-0">${data.pendingComplainList}</h5>
										<!-- <small class="extra-small-font py-1 px-2 rounded mb-0">+2.3%</small> -->
									</div>
									<div class="w-icon">
										<i class="zmdi zmdi-shopping-basket text-white"></i>
									</div>
								</div>

							</div>
							<canvas id="dash1-chart-2" height="45"></canvas>
						</div>
					</div>
					<div class="col-12 col-lg-6 col-xl-3">
						<div class="card rounded-0">
							<div class="card-body">
								<div class="media align-items-center">
									<div class="media-body">
										<p class="mb-0">Resolve Complain</p>
										<h5 class="mb-0">${data.resolveComplainList}</h5>
										<!-- <small class="extra-small-font py-1 px-2 rounded">+1.5%</small> -->
									</div>
									<div class="w-icon">
										<i class="zmdi zmdi-chart-donut text-white"></i>
									</div>
								</div>

							</div>
							<canvas id="dash1-chart-3" height="45"></canvas>
						</div>
					</div>
					<div class="col-12 col-lg-6 col-xl-3">
						<div class="card rounded-0">
							<div class="card-body">
								<div class="media align-items-center">
									<div class="media-body">
										<p class="mb-0">Feeback</p>
										<h5 class="mb-0">${data.feedbackList}</h5>
										<!--  <small class="extra-small-font py-1 px-2 rounded">-1.2%</small> -->
									</div>
									<div class="w-icon">
										<i class="zmdi zmdi-balance-wallet text-white"></i>
									</div>
								</div>

							</div>
							<canvas id="dash1-chart-4" height="45"></canvas>
						</div>
					</div>
				</div>
				<!-- end row -->

				<!-- End Row -->


				<!-- ************************************ GRAPH CODE *********************************************************-->

			

				<div id="container"
					style="min-width: 310px; height: 400px; margin: 0 auto"></div>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
	<c:forEach items="${graphList}" var="i">
					<c:forEach items="${i}" var="k" varStatus="j">
						<c:if test="${j.count eq 1 }">
							<input type="hidden" name="yvalue" value="${k}" />
						</c:if>
						<c:if test="${j.count eq 2 }">
							<input type="hidden" name="xvalue" value="${k}" />
					</c:if>
					</c:forEach>
				</c:forEach>
				
				<!-- ************************************ GRAPH CODE *********************************************************-->
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

	<script
		src="<%=request.getContextPath()%>/adminResources/js/highcharts.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/exporting.js"></script>

	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/popper.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/bootstrap.min.js"></script>

	<!-- simplebar js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/simplebar.js"></script>
	<!-- sidebar-menu js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/sidebar-menu.js"></script>

	<!-- Custom scripts -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/app-script.js"></script>

	<!-- Chart js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/Chart.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/Chart.extension.js"></script>
	<!-- Sparkline JS -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.sparkline.min.js"></script>
	<!-- Easy Pie Chart JS -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.easypiechart.min.js"></script>
	<!-- Knob Chart -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/excanvas.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.knob.js"></script>
	<script>
     $(function() {
        $(".knob").knob();
      });
   </script>
	<!--Peity Chart -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.peity.min.js"></script>

	<script src="<%=request.getContextPath()%>/adminResources/js/index.js"></script>
	<script>
var xvalue= document.getElementsByName("xvalue");
var xdata = [];
var yvalue= document.getElementsByName("yvalue");
var ydata = [];
for(var i=0;i<xvalue.length;i++)
{
	xdata.push(xvalue[i].value);
	ydata.push(parseFloat(yvalue[i].value));
}
Highcharts.chart({
    chart: {
	renderTo:"container",

        type: 'column'
    },
    title: {
        text: 'Unknown Person Detected Per Day'
    },
    subtitle: {
        text: ''
    },
    xAxis: {
        categories: xdata,
        crosshair: true
    },
    yAxis: {
        min: 0,
        title: {
            text: 'Unknown Person Detected(no)'
        }
    },
    plotOptions: {
        column: {
            pointPadding: 0.2,
            borderWidth: 0
        }
    },
    series: [{
        name: 'Date',
        data: ydata

    }]
});
</script>

</body>
</html>
