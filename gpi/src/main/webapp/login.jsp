<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

	<!DOCTYPE html>
<html lang="en">
<head>
    <script src="js/bootstrap.min.js"></script>
 <script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>

<title>Gestion De Parc Informatique</title>

		<link    href="<%=request.getContextPath()%>/css/bootstrap.min.css"  rel="stylesheet">
		<link    href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css"  rel="stylesheet">
		<link id="base-style"href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet">
		<link id="base-style-responsive" href="css/style-responsive.css" rel="stylesheet">
<!-- 		<link  href="css/style-forms.css" rel="stylesheet"> -->
		<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext" rel='stylesheet' type='text/css'>
</head>
<body>
<script type="text/javascript">
#btn {
  
display: block;
  margin : auto;

} 
</script>

<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default loginPanel">
					<div class="panel-body">
						<div class="page-header">
							
							<h3  style="text-align: center; color: navy;" >Authentification</h3>
						</div>
						
						<form  action="login" method="post" class="form-signin">
						  <div  class="form-group" align="center">
						    <label for="logine" style="font-family: sans-serif ;  color: maroon; ">Pseudo:</label>
						    <div class="input-group">
						    <span class="input-group-addon"><span class="fa fa-user"></span></span>
						    <input type="text" class="form-control"   name="userInstance.login" id="logine" placeholder="Enter Login">
						    </div>
						  </div>
						  <div class="form-group" align="center">
						    <label for="passworde" style="font-family: sans-serif; color: maroon; ">Mot de passe:</label>
						    <div class="input-group">
						    <span class="input-group-addon"><span class="fa fa-lock"></span></span>
						    <input type="password" name="userInstance.password" class="form-control" id="passworde" placeholder="Password">
						    </div>
						  </div>
						  <hr/>
						  <p align="center">
						  <button type="submit" class="btn btn-primary" id="btn" >  Se connecter</button>
						</form>
						
					</div>
				</div> 
			</div>
		</div>
	</div>

</body>
</html>