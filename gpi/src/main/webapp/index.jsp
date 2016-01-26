<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>



<script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
  <script type="text/javascript"  src="js/lib/footable.js" ></script>
    <script type="text/javascript" src="js/lib/jquery.dataTables.min.js"></script>
<script type="application/javascript" src="js/lib/jquery-migrate-1.2.1.js"></script>


<script type="application/javascript" src="js/lib/liste.js"></script>
    <script src="js/bootstrap.min.js"></script>
 <script type="text/javascript"  src="js/lib/index.js" ></script>
 <script type="text/javascript"  src="js/script.js" ></script>
  <script type="text/javascript" src="js/custom.js "></script>
    <script type="text/javascript" src="js/employe.js "></script>
    <script type="text/javascript" src="js/retina.js "></script>


<%-- <script type="text/javascript" src="js/lib/zebra_dialog.src.js"></script> --%>



	
<%-- </script> --%>


	
		<title>Gestion De Parc Informatique</title>
<!-- 		{% block stylesheets %}{% endblock %} -->
<!--        <meta  charset="UTF-8" /> -->
		
		<link    href="css/bootstrap.min.css"  rel="stylesheet">
		<link    href="css/styles.css"  rel="stylesheet">
		<link    href="css/bootstrap-responsive.min.css"  rel="stylesheet">
		<link    href="css/jquery.dataTables.min.css"  rel="stylesheet">
		<link 	 href="css/footable.metro.css" rel="stylesheet" type="text/css" />
		<link    href="css/footable.core.css" rel="stylesheet" type="text/css" />
		<link    href="css/index.css" rel="stylesheet" type="text/css" />
		<link id="base-style" href="css/style.css" rel="stylesheet">
		<link id="base-style-responsive" href="css/style-responsive.css" rel="stylesheet">
<!-- 		<link id="base-style-responsive" href="css/glyphicons.css" rel="stylesheet"> -->
<!-- 		<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext" rel='stylesheet' type='text/css'> -->
		<link rel="shortcut icon" href="img/favicon.ico">
		<link    href="css/font-awesome.min.css"  rel="stylesheet">
	</head>
	
	
	
	
	
	
	
	
	
	<body>
<%-- 	 <select  name="proprieteMateriel.entreprise.entrepriseID"> --%>
										
<%-- 									<s:iterator value="entreprises"> --%>
<%-- 										<option  value="<s:property value="entrepriseID"  />"  > --%>
<%-- 										<s:property  value="nom" /></option> --%>
<%-- 									</s:iterator> --%>
							
<%-- 								</select><br> --%>

 <div class="navbar">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse"> </a>                  
					 	<div class="div-img-logo"> <a href="index" class="brand" >	
							<img class="logo" src="images/logo_supmti.png"/>  </a>
							
								<div  class="div-titre-logo">
				<%-- 	 <span >  Gestion  Parc 
							 Informatique </span>  --%>
						</div>	
							</div>

                <!-- start: Header Menu -->
                <div class="nav-no-collapse header-nav">
                    <ul class="nav pull-right">
                        <li class="dropdown hidden-phone">
                         
<%--<s:iterator value="notifications"> --%>
							<li>
								
<%-- 									<a style="background: #f6f7f8 none repeat scroll 0 0;" href="updateNotificationStatut?notificationInstance.notificationID=<s:property value="notificationID"/>" class="notification"> <img src="images/wa.jpg" alt="" height="50" width="50" />  --%>
										<span class="notif-desc">
											<b><s:property value="name"/></b><br/><s:property value="description"/>
										</span>
<!-- 																			</a> -->
							
<%-- 								<s:else> --%>
<%-- 									<a href="updateNotificationStatut?notificationInstance.notificationID=<s:property value="notificationID"/>" class="notification"> <img src="images/wa.jpg" alt="" height="50" width="50" />  --%>
<%-- 										<span class="notif-desc"> --%>
<%-- 											<b><s:property value="name"/></b><br/><s:property value="description"/> --%>
<%-- 										</span> --%>
<!-- 									</a> -->
<%-- 								</s:else> --%>
							</li>
<%-- 						</s:iterator> --%>
                            
                            <ul class="dropdown-menu notifications">
                                <li class="dropdown-menu-title">
                                    <span>You have 11 notifications</span>
                                    <a href="#refresh"><i class="icon-repeat"></i></a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="icon blue"><i class="icon-user"></i></span>
                                        <span class="message">New user registration</span>
                                        <span class="time">1 min</span>
                                    </a>
                                </li>




                                <li class="dropdown-menu-sub-footer">
                                    <a>View all notifications</a>
                                </li>
                            </ul>
                        
                        <!-- start: Notifications Dropdown -->
                        <li class="dropdown hidden-phone">
                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                <i class="icon-bell "></i>
								<span class="badge red">
								5 </span>
                            </a>
                            <ul class="dropdown-menu tasks">
                                <li class="dropdown-menu-title">
                                    <span>You have 17 tasks in progress</span>
                                    <a href="#refresh"><i class="icon-repeat"></i></a>
                                </li>

                                <li>
                                    <a class="dropdown-menu-sub-footer">View all tasks</a>
                                </li>
                            </ul>
                        </li>
                        <!-- end: Notifications Dropdown -->
                        <!-- start: Message Dropdown -->
                        <li class="dropdown hidden-phone">
                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                <i class="icon-globe"></i>
									<s:iterator value="notifications"> 
								<span class="badge red">
							
								<s:property value="notifications.size()"/>  </span>
                           </s:iterator>
                            </a>
                            <ul class="dropdown-menu messages">
                                   <li class="dropdown-menu-title">
                                    <span>You have <s:property value="notifications.size()"/>  notifications</span>
                                    <a href="#refresh"><i class="icon-repeat"></i></a>
                                </li>
									<s:iterator value="notifications">
                                 <s:if test='seen == null'> 
                                <li>
                                    <a class="dropdown-menu-sub-footer"  style="background: #f6f7f8 none repeat scroll 0 0;" href="updateNotificationStatut?notificationInstance.notificationID=<s:property value="notificationID"/>"  class="notification"><s:property value="description"/>  <input type="hidden" name="notificationID" value="<s:property value="description"/>" >  </a>
                                </li>
                                </s:if>
                                </s:iterator>
                            </ul>
                        </li>

                        <!-- start: User Dropdown -->
                        <li class="dropdown">
                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                <i class="halflings-icon white user"></i> <s:property value="#session['login'].nom"/> <br>
                           
                            </a>
                            <ul class="dropdown-menu">
                                <li class="dropdown-menu-title">
                                    <span>Account Settings</span>
                                </li>
                                <li><a href="#"><i class="halflings-icon user"></i> Profile</a></li>
                                <li><a href="logout"><i class="halflings-icon off"></i> logout</a></li>
                            </ul>
                        </li>
                        <!-- end: User Dropdown -->
                    </ul>
                </div>
                <!-- end: Header Menu -->

            </div>
        </div>
    </div>
    <!-- start: Header -->

    <div class="container-fluid-full">
        <div class="row-fluid">

            <!-- start: Main Menu -->
            <div id="sidebar-left" class="span2">
                <div class="nav-collapse sidebar-nav">
                    <ul class="nav nav-tabs nav-stacked main-menu">              

                        <li>
                            <a class="dropmenu" href="#"><i class="icon-folder-close-alt"></i><span class="hidden-tablet">Gestion Matériel</span></a>
                            <ul>
                            	<li><a class="submenu" id="initcreate" href="initCreate"><i class="icon-align-justify"></i><span class="hidden-tablet">Ajouter Materiel</span></a></li>
                                <li><a class="submenu" id="listImprimante" href="listImprimante"><i class="icon-align-justify"></i><span class="hidden-tablet">Liste Imprimante</span></a></li>
                                <li><a class="submenu" id="listComputer" href="listComputer"><i class="icon-align-justify"></i><span class="hidden-tablet">Liste Computer</span></a></li>
                                
                            </ul>
                        </li>

                    </ul>

                </div>
                <div class="nav-collapse sidebar-nav">
              
                
                <s:if test='#session.login.type == "Admin"'> 
<%--                  <s:property value="#session['login'].nom"/>  --%>
                    <ul class="nav nav-tabs nav-stacked main-menu">

                        <li>
                            <a class="dropmenu" href="#"><i class="icon-folder-close-alt"></i><span class="hidden-tablet">Gestion Utilisateur</span></a>
                            <ul>
                                <li><a class="submenu" id="initAddUser" href="initAddUser"><i class="icon-align-justify"></i><span class="hidden-tablet">Ajouter </span></a></li>
                                <li><a class="submenu" id="listUser" href="listUser"><i class="icon-align-justify"></i><span class="hidden-tablet">Consulter</span></a></li>
                            </ul>
                        </li>



                    </ul>
</s:if>
                </div>
                <div class="nav-collapse sidebar-nav">
                    <ul class="nav nav-tabs nav-stacked main-menu">
                        <li>
                            <a class="dropmenu" href="#"><i class="icon-folder-close-alt"></i><span class="hidden-tablet">Gestion Entreprise</span></a>
                            <ul>
                                <li><a class="submenu" id="initAddEntreprise" href="initAddEntreprise"><i class="icon-align-justify"></i><span class="hidden-tablet">Ajouter </span></a></li>
                                <li><a class="submenu" id="listEntreprise" href="listEntreprise"><i class="icon-align-justify"></i><span class="hidden-tablet">Liste Entreprise</span></a></li>
                                <li><a class="submenu" id="listGroup" href="listGroup"><i class="icon-align-justify"></i><span class="hidden-tablet">Liste departement</span></a></li>
                            </ul>
                        </li>



                    </ul>
                </div>



               <div class="nav-collapse sidebar-nav">
                  <s:if test='#session.login.type == "Admin"'> 
                    <ul class="nav nav-tabs nav-stacked main-menu">

                        <li>
                            <a class="dropmenu" href="#"><i class="icon-folder-close-alt"></i>
                                <span class="hidden-tablet">Historique</span></a>
                            <ul>
                                <li>
                                    <a class="submenu" id="listArchive" href="listArchive">
                                        <i class="icon-align-justify"></i><span class="hidden-tablet">Consultation </span></a></li>
                                                               <li></li>
                               
                            </ul>
                        </li>
                    </ul>
                    </s:if>
                </div>
            </div>
            <!-- end: Main Menu -->

            <noscript>
                <div class="alert alert-block span10">
                    <h4 class="alert-heading">Warning!</h4>
                    <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
                </div>
            </noscript>

            <!-- start: Content -->
            <div id="content" class="span10">


                <ul class="breadcrumb">
                    <li>
                        <i class="icon-home"></i>
                        <a href="listNotification">Acceuil</a>
                        <i class="icon-angle-right"> </i>
                    </li>
                    <li><a href="#"></a></li>
                </ul>

              
                <div class="row-fluid sortable">
                    <div class="box span12">
                        <div class="box-header" data-original-title>
                            <h2><i class="halflings-icon white user"></i><span class="break"></span> Materiels </h2>
<!--                             <div class="box-icon"> -->
<!--                                 <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a> -->
<!--                                 <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a> -->
<!--                                 <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a> -->
<!-- 								<a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a> -->
<!--                             </div> -->
                        </div>
                        <div class="box-content">
                      



	
	
	

	

	
	<!-- <div id="page-wrapper">-->
	
	
<!-- 	<form action="searchMateriel"> -->
<%-- 	<input type="text"   id="searchMateriel" placeholder="Rechercher..."  name="q" value='<s:property value="q"/>'> --%>
<!--     <button class="btn btn-white btn-sm"> Rechercher -->
														
<!-- 													</button> -->
<!--     </form> -->
	<!-- </div>-->
	

	
	
	<table  class="footable1 display" data-filter="#filter"  id="example1" >
		<thead>
		<tr>
			
			<th >Type Materiel</th>
			<th>Alias </th>
			<th>statut</th>
		    <th>Entreprise</th>
			<th data-hide="all">Departement</th>
			<th>Fin Garantie</th>
			<th>numeroSerie</th>
			<th>model</th>
			<th>descritpion</th>
			<th data-hide="all">Doc. Attachés</th>
			<th data-hide="all">Delete</th>
			<th data-hide="all">update</th>


		</tr>
		</thead>
		<tbody class="tableContainer">
<s:iterator value="proprieteMateriels">
			<tr>

			 <td><s:property value="typeMateriel.type"/></td> 
				<td><s:property value="nom" /></td>
				<td><s:property value="statut.type" /></td>
				<td><s:property value="entreprise.nom" /></td>
				<td><s:property value="groupe.nom" /></td>
				<td><s:property value="finGarantie" /></td>
				<td><s:property value="numeroSerie" /></td>
				<td><s:property value="model" /></td>
				<td><s:property value="descritpion" /></td>
				
				
				<td> <ul >
<s:iterator value="documents">
	<li >
	<a  href="fileDownload?documentInstance.url=<s:property value="url"/>&documentInstance.name=<s:property value="name"/>">	<s:property value="name" /> </a> 
															
											<a href="deleteFile?documentInstance.documentID=<s:property value="documentID"/>&proprieteMateriel.materID=<s:property value="proprieteMateriel.materID"/>">
									
											</a>
													
									</li>
</s:iterator>
	                        </ul></td>
<%-- 			<td><s:property value="typeMateriel.typeMaterielID" /></td> --%>
				<td><a
					href="deleteImprimante?proprieteMateriel.materID=<s:property value='materID'/>">
						X </a></td>
				<td><a
					href="initUpdateImprimante?proprieteMateriel.materID=<s:property value='materID'/>">
						O </a></td>
			</tr>

</s:iterator>
					</tbody>
	</table>


      </div>
                    </div><!--/span-->

                </div><!--/row-->


<!-- <ul class="pagination"> -->
<!-- <li> -->
<!-- <a href="listPresale?option=index&page=1"> -->
<!-- <i class="fa fa-chevron-left"></i> -->
<!-- </a> -->
<!-- </li> -->
<!-- <li class="nbPage"> -->
<!-- <a> -->
<!-- <form action="listImprimante"> -->
<!-- <input type="text" style="width:30px;text-align: center;" name="page" value="1"> -->
<!-- <input type="hidden" value="index" name="option"> -->
<!-- </form> -->
<!-- </a> -->
<!-- </li> -->
<!-- <li class="maxPage"><a>/ 1 </a> </li> -->
<!-- <li> <a href="listImprimante?option=index&page=1"> <i class="fa fa-chevron-right"></i> </a></li> -->
<!-- </ul> -->
       </div><!--/.fluid-container-->

            <!-- end: Content -->
        </div><!--/#content.span10-->
    </div><!--/fluid-row-->
   <div class="modal hide fade" id="myModal">
        <div class="modal-header">
            <button type="button" class="close"  data-dismiss="modal">×</button>
            <h3>Settings</h3>
        </div>
        <div class="modal-body">
            <p>Here settings can be configured...</p>
        </div>
        <div class="modal-footer">
            <a href="#" class="btn" data-dismiss="modal">Close</a>
            <a href="#" class="btn btn-primary">Save changes</a>
        </div>
    </div>
    <div class="common-modal modal fade" id="common-Modal1" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <ul class="list-inline item-details">
                <li><a href="http://themifycloud.com">Admin templates</a></li>
                <li><a href="http://themescloud.org">Bootstrap themes</a></li>
            </ul>
        </div>
    </div>
    <div class="clearfix"></div>

<!--     <footer> -->

        <p>
            <span style="text-align:left;float:left">&copy; 2015 <a href="index/"  >Responsive Dashboard</a></span>

        </p>

<!--     </footer> -->

  
   


</body>
</html>