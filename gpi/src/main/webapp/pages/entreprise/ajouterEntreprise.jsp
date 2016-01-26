<%@ taglib prefix="s" uri="/struts-tags"%>
 <script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
<script type="application/javascript" src="js/lib/jquery-migrate-1.2.1.js"></script>


                        <div class="box-header" data-original-title>
                            <h2><i class="halflings-icon white user"></i><span class="break"></span> Ajouter Entreprise</h2>
                        </div>
                        <div class="box-content">


<form action="addEntreprise" method="POST">
Nom Entrprise :  <input type="text" name="entreprise.nom" ><br>
Raison Sociale :  <input type="text" name="entreprise.raisonSociale" ><br>
Adresse :  <input type="text" name="entreprise.adresse" ><br>
Telephone :  <input type="text" name="entreprise.telephone" ><br>
Fax :  <input type="text" name="entreprise.fax" ><br>
Courriel :  <input type="text" name="entreprise.courriel" ><br>



Affecter Groupe :

									
									<s:iterator value="groupes">
								<label> <s:property value="nom" /> </label>	<input type="checkbox"   name="tab" value="<s:property value="groupID"  />"> 
									<br>
									
									</s:iterator>
							
						
							
						
			<br>
	
<br>

<input type="submit" value="ajouter"> 
</form>
</div>
                  

 