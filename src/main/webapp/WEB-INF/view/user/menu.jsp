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
          <span>Add FamilyMember</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
		<li><a href="loadFamily.html"><i class="zmdi zmdi-long-arrow-right"></i>Add FamliyMember</a></li>
        <li><a href="viewFamily.html"><i class="zmdi zmdi-long-arrow-right"></i>View FamliyMember</a></li>
		 </ul>
      </li>
       <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-briefcase"></i>
          <span>Package</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
        <li><a href="loadPackage.html"><i class="zmdi zmdi-long-arrow-right"></i>View Package </a></li>
		 </ul>
      </li>
       <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-camera"></i>
          <span>Detection</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
        <li><a href="loadDetection.html"><i class="zmdi zmdi-long-arrow-right"></i>Start Detection </a></li>
		 </ul>
      </li>
     <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-list"></i>
          <span>Complain</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
      
        <ul class="sidebar-submenu">
        <li><a href="loadComplain.html"><i class="zmdi zmdi-long-arrow-right"></i>Post Complain</a></li>
        <li><a href="viewComplain.html"><i class="zmdi zmdi-long-arrow-right"></i>View Complain</a></li>
		 </ul>
      </li>
      
       <li>
        <a href="javaScript:void();" class="waves-effect">
          <i class="fa fa-book"></i>
          <span>FeedBack</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
		<li><a href="loadFeedback.html"><i class="zmdi zmdi-long-arrow-right"></i>Post Feedback</a></li>
		<li><a href="viewFeedback.html"><i class="zmdi zmdi-long-arrow-right"></i>view Feedback</a></li>
		 </ul>
      </li>
      </ul>
      </div>