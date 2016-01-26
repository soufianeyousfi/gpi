<%@ taglib prefix="s" uri="/struts-tags"%>




 <script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
 <script type="application/javascript" src="js/lib/initCreateForm.js"></script>

 

	    
                   <div data-original-title="" class="box-header">
                            <h2>
                            <i class="icon-hdd"></i>
                            <span class="break"></span> Modifier Utilisateur</h2>
                        </div>

	<div class="box-content">    



	<form action="updateUser" method="POST">
	
		 <input type="hidden" name="user.iuserID" value='<s:property value="user.iuserID" />'> <br> 
		Nom : <input type="text" name="user.nom" value='<s:property value="user.nom" />'> <br> 
		Login : <input type="text" name="user.login" value='<s:property value="user.login" />'> <br> 
		Email : <input type="text" name="user.email" value='<s:property value="user.email" />'> <br> 
		Password : <input type="text" name="user.password" value='<s:property value="user.password" />'> <br> 
		Telephone : <input type="text" name="user.tel" value='<s:property value="user.tel" />'> <br> 
		
		
		
		<input id="updateUserSubmit" type="submit" value="Valider">

	</form>
  </div>  