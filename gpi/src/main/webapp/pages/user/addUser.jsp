	<%@ taglib prefix="s" uri="/struts-tags"%>



 <script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
 
	
	
	

                        <div class="box-header" data-original-title>
                            <h2><i class="halflings-icon white user"></i><span class="break"></span> Ajouter Utlisateur</h2>
                            <div class="box-icon">
                                <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                                <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                                <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
								<a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                            </div>
                        </div>
                        <div class="box-content">







	<form action="addUser" method="POST">
		Nom : <input type="text" name="user.nom"> <br> 
		Login : <input type="text" name="user.login"> <br> 
		Email : <input type="text" name="user.email" value=" "> <br> 
		Password : <input type="password" name="user.password"> <br> 
		Telephone : <input type="text" name="user.tel"> <br> 
		
	
		
		 <input class="addUserSubmit" type="submit" value="ajouter">

	</form>
</div>





