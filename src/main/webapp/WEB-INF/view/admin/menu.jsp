<div id="sidebar-wrapper" data-simplebar="" data-simplebar-auto-hide="true">
     <div class="brand-logo">
      <a href="index.html">
       <img src="<%=request.getContextPath()%>/adminResources/images/logo-icon.png" class="logo-icon" alt="logo icon">
       <h5 class="logo-text">SHSAD</h5>
     </a>
   </div>

   <div class="user-details">
    <div class="side-avatar mb-3"><img class="side-user-img" src="<%=request.getContextPath()%>/adminResources/images/avatar-13.jpg" alt="user avatar"></div>
    <div class="text-center">
      <h6 class="mb-0">${firstName} ${lastName}</h6>
    </div>
    </div>

   <ul class="sidebar-menu do-nicescrol">
      <li class="sidebar-header"></li>
      <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="zmdi zmdi-view-dashboard"></i> <span>Dashboard</span><i class="fa fa-angle-left pull-right"></i>
        </a>
		<ul class="sidebar-submenu">
		  <li><a href="index.html"><i class="zmdi zmdi-long-arrow-right"></i> Dashboard v1</a></li>
          <!-- <li><a href="index2.html"><i class="zmdi zmdi-long-arrow-right"></i> Dashboard v2</a></li> -->
		</ul>
      </li>
       <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-user"></i>
          <span>Manage Users</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
		<li><a href="viewUser.html"><i class="zmdi zmdi-long-arrow-right"></i>View User</a></li>
		 </ul>
      </li>
       <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-map"></i>
          <span>Manage Country</span> <i class=" fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
		<li><a href="loadCountry.html"><i class="zmdi zmdi-long-arrow-right"></i>Add Country</a></li>
        <li><a href="viewCountry.html"><i class="zmdi zmdi-long-arrow-right"></i>View Country</a></li>
		 </ul>
      </li>
       <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-map-marker"></i>
          <span>Manage State</span>
          <i class=" fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
          <li><a href="loadState.html"><i class="zmdi zmdi-long-arrow-right"></i>Add State</a></li>
          <li><a href="viewState.html"><i class="zmdi zmdi-long-arrow-right"></i>View State</a></li>
         </ul>
      </li>
      <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-crosshairs "></i>
          <span>Manage City</span> <i class=" fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
		<li><a href="loadCity.html"><i class="zmdi zmdi-long-arrow-right"></i>Add City</a></li>
        <li><a href="viewCity.html"><i class="zmdi zmdi-long-arrow-right"></i>View City</a></li>
		 </ul>
      </li>
       <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-briefcase"></i>
          <span>Manage Package</span> <i class=" fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
		<li><a href="loadPackage.html"><i class="zmdi zmdi-long-arrow-right"></i>Add Package</a></li>
        <li><a href="viewPackage.html"><i class="zmdi zmdi-long-arrow-right"></i>View Package </a></li>
		 </ul>
      </li>
       
       <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-database"></i>
          <span>Manage DataSet</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
		<li><a href="loadDataset.html"><i class="zmdi zmdi-long-arrow-right"></i>Add DataSet</a></li>
        <li><a href="viewDataset.html"><i class="zmdi zmdi-long-arrow-right"></i>View DataSet </a></li>
		 </ul>
      </li>
     <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-list"></i>
          <span>Complain</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
		<!--  <li><a href="replayOfComplain.jsp"><i class="zmdi zmdi-long-arrow-right"></i>ReplayOfComplian</a></li>-->
        <li><a href="viewComplain.html"><i class="zmdi zmdi-long-arrow-right"></i>View Complain</a></li>
		 </ul>
      </li>
      
      <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-book"></i>
          <span>Feedback</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
		<li><a href="viewFeedback.html"><i class="zmdi zmdi-long-arrow-right"></i>View Feedback</a></li>
		 </ul>
      </li>
        
   </div>
