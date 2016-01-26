<%@ taglib prefix="s" uri="/struts-tags"%>
 <script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
<script type="application/javascript" src="js/lib/jquery-migrate-1.2.1.js"></script>


                        <div class="box-header" data-original-title>
                            <h2><i class="halflings-icon white user"></i><span class="break"></span> Ajouter Entreprise</h2>
                        </div>
                        <div class="box-content">

<h1> Modifier Entreprise</h1>



	<form action="updateEntreprise" method="POST">
	
		<input type="hidden" name="entreprise.entrepriseID" value='<s:property value="entreprise.entrepriseID" />'> <br> 
		Nom Entreprise: <input type="text" name="entreprise.nom" value='<s:property value="entreprise.nom" />'> <br> 
		Raison Sociale : <input type="text" name="entreprise.raisonSociale" value='<s:property value="entreprise.raisonSociale" />'> <br> 
		Adresse : <input type="text" name="entreprise.adresse" value='<s:property value="entreprise.adresse" />'> <br> 
		Telephone : <input type="text" name="entreprise.telephone" value='<s:property value="entreprise.telephone" />'> <br> 
		Fax : <input type="text" name="entreprise.fax" value='<s:property value="entreprise.fax" />'> <br> 
		Courriel : <input type="text" name="entreprise.courriel" value='<s:property value="entreprise.courriel" />'> <br> 
		
		
		
		<input type="submit" value="Valider">

	</form>
</div>
