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
  <title>SHSAD | View State</title>
  <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
  
  <!--favicon-->
  <link rel="icon" href="<%=request.getContextPath()%>/adminResources/images/favicon.ico" type="image/x-icon">
  <!-- simplebar CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/css/simplebar.css" rel="stylesheet"/>
  <!-- Bootstrap core CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/css/bootstrap.min.css" rel="stylesheet"/>
  <!--Data Tables -->
  <link href="<%=request.getContextPath()%>/adminResources/css/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css">
  <link href="<%=request.getContextPath()%>/adminResources/css/buttons.bootstrap4.min.css" rel="stylesheet" type="text/css">
  <!-- animate CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/css/animate.css" rel="stylesheet" type="text/css"/>
  <!-- Icons CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/css/icons.css" rel="stylesheet" type="text/css"/>
  <!-- Sidebar CSS-->
  <link href="<%=request.getContextPath()%>/adminResources/css/sidebar-menu.css" rel="stylesheet"/>
  <!-- Custom Style-->
  <link href="<%=request.getContextPath()%>/adminResources/css/app-style.css" rel="stylesheet"/>
  
</head>

<body>

<!-- start loader -->
   <div id="pageloader-overlay" class="visible incoming"><div class="loader-wrapper-outer"><div class="loader-wrapper-inner" ><div class="loader"></div></div></div></div>
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
		    <h4 class="page-title">SHSAD | View State</h4>
		    <ol class="breadcrumb">
            
            <li class="breadcrumb-item"><a href="javaScript:void();">Manage State</a></li>
            <li class="breadcrumb-item active" aria-current="page">View State</li>
         </ol>
	   </div>
	  <!--  <div class="col-sm-3">
       <div class="btn-group float-sm-right">
        <button type="button" class="btn btn-outline-primary waves-effect waves-light"><i class="fa fa-cog mr-1"></i> Setting</button>
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
        <div class="col-lg-12">
          <div class="card">
            <div class="card-header"><i class="fa fa-table"></i>VIEW STATE</div>
            <div class="card-body">
              <div class="table-responsive">
              <table id="default-datatable" class="table table-bordered">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>State Name</th>
                        <th>Description</th>
                        <th>Country Name</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                <c:set value="1" var="count" ></c:set>
                <c:forEach items="${stateList}" var="i" varStatus="count">
							<tr>
							<td><c:out value="${count.count}"></c:out></td>
							<td>${i.stateName}</td>
							<td>${i.stateDescription}</td>
							<td>${i.countryVO.countryName}</td>
							<td><div class="form-footer">
										<button type="submit" class="btn btn-success m-1"><a href="editState?editStateId=${i.id}"><font color="White"><b>Edit</b></font></a></button>
							<button type="submit" class="btn btn-danger m-1"><a href="deleteState?deleteStateId=${i.id}"><font color="White"><b>Delete</b></font></a></button>		
							</div></td>
							</tr>
							</c:forEach>
                </tbody>
                          </table>
            </div>
            </div>
          </div>
        </div>
      </div><!-- End Row-->


     
    </div>
    <!-- End container-fluid-->
    
    </div><!--End content-wrapper-->
   <!--Start Back To Top Button-->
    <a href="javaScript:void();" class="back-to-top"><i class="fa fa-angle-double-up"></i> </a>
    <!--End Back To Top Button-->
	
	<%-- <!--Start footer-->
	<footer class="footer">
      <jsp:include page="footer.jsp"></jsp:include>
    </footer>
	<!--End footer--> --%>
	
   
  </div><!--End wrapper-->


  <!-- Bootstrap core JavaScript-->
  <script src="<%=request.getContextPath()%>/adminResources/js/jquery.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/popper.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/bootstrap.min.js"></script>
	
  <!-- simplebar js -->
  <script src="<%=request.getContextPath()%>/adminResources/js/simplebar.js"></script>
  <!-- sidebar-menu js -->
  <script src="<%=request.getContextPath()%>/adminResources/js/sidebar-menu.js"></script>
  
  <!-- Custom scripts -->
  <script src="<%=request.getContextPath()%>/adminResources/js/app-script.js"></script>

  <!--Data Tables js-->
  <script src="<%=request.getContextPath()%>/adminResources/js/jquery.dataTables.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/dataTables.bootstrap4.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/dataTables.buttons.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/buttons.bootstrap4.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/jszip.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/pdfmake.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/vfs_fonts.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/buttons.html5.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/buttons.print.min.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/buttons.colVis.min.js"></script>

    <script>
     $(document).ready(function() {
      //Default data table
       $('#default-datatable').DataTable();


       var table = $('#example').DataTable( {
        lengthChange: false,
        buttons: [ 'copy', 'excel', 'pdf', 'print', 'colvis' ]
      } );
 
     table.buttons().container()
        .appendTo( '#example_wrapper .col-md-6:eq(0)' );
      
      } );

    </script>
	
</body>
</html>
