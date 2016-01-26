<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier Imprimante</title>
</head>
<body>

<h1 align="center"> Modifier Imprimante</h1>



	<form action="updateMateriel" method="POST">
	
         <input type="hidden" name="proprieteMateriel.materID" value='<s:property value="proprieteMateriel.materID" />'> <br>  
 		 <input type="hidden" name="proprieteMateriel.typeMateriel.typeMaterielID" value='<s:property value="proprieteMateriel.typeMateriel.typeMaterielID" />'> <br>  
 		 <input type="hidden" name="proprieteMateriel.groupe.entreprise.entrepriseID" value='<s:property value="proprieteMateriel.groupe.entreprise.entrepriseID" />'> <br>
		 Type Imprimante :<input type="text"   name="proprieteMateriel.typeImprimante" value='<s:property value="proprieteMateriel.typeImprimante" />'> <br> 
		 Cartouche :<input type="text"   name="proprieteMateriel.cartouche" value='<s:property value="proprieteMateriel.cartouche" />'> <br> 
<%-- 		 STATUT :<input type="text"   name="proprieteMateriel.statut.type" value='<s:property value="proprieteMateriel.statut.type" />'> <br>  --%>
		 Numero de Serie :<input type="text"   name="proprieteMateriel.numeroSerie" value='<s:property value="proprieteMateriel.numeroSerie" />'> <br> 
		 Model :<input type="text"   name="proprieteMateriel.model" value='<s:property value="proprieteMateriel.model" />'> <br> 
		 Fabricant :<input type="text"   name="proprieteMateriel.fabricant" value='<s:property value="proprieteMateriel.fabricant" />'> <br> 
		 Pages par minute :<input type="text"   name="proprieteMateriel.ppm" value='<s:property value="proprieteMateriel.ppm" />'> <br> 
		 Utilisateur :<input type="text"   name="proprieteMateriel.utilisateur" value='<s:property value="proprieteMateriel.fabricant" />'> <br> 
		 Adresse Ip :<input type="text"   name="proprieteMateriel.adresseIp" value='<s:property value="proprieteMateriel.adresseIp" />'> <br> 
		 Description :<textarea rows="2" cols="50"  name="proprieteMateriel.descritpion" > <s:property value="proprieteMateriel.descritpion"/> </textarea>  <br> 
		 DOccument Attacher :<input type="text"   name="proprieteMateriel.docAttacher" value='<s:property value="proprieteMateriel.docAttacher" />'> <br> 
		 Groupe : 
		 <select  name="proprieteMateriel.groupe.groupID">
										<option  value="<s:property value="proprieteMateriel.groupe.groupID" />" >
										<s:property value="proprieteMateriel.groupe.nom" /></option>
									<s:iterator value="groupes">
										<option  value="<s:property value="groupID" />" >
										<s:property value="nom" /></option>
									</s:iterator>
							
								</select>
						
								
		Type Connexion :<input type="text"   name="proprieteMateriel.media" value='<s:property value="proprieteMateriel.media" />'> <br> 
		Pilote :<input type="text"   name="proprieteMateriel.pilote" value='<s:property value="proprieteMateriel.pilote" />'> <br> 
		
		
		
		
		<input type="submit" value="Valider">

	</form>

	<br> <br> <br>  <a href="index"> Retouer Acceuil</a>
</body>
</html>