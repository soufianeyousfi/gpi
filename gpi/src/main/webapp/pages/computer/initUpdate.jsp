<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier Computer</title>
</head>
<body>

<h1 align="center"> Modifier Computer</h1>



	<form action="updateComputer" method="POST">
	
 		 <input type="hidden" name="proprieteMateriel.materID" value='<s:property value="proprieteMateriel.materID" />'> <br>  
 		 <input type="hidden" name="proprieteMateriel.typeMateriel.typeMaterielID" value='<s:property value="proprieteMateriel.typeMateriel.typeMaterielID" />'> <br>  
 		 <input type="hidden" name="proprieteMateriel.groupe.groupID" value='<s:property value="proprieteMateriel.groupe.groupID" />'> <br>  
 		 <input type="hidden" name="proprieteMateriel.groupe.entreprise.entrepriseID" value='<s:property value="proprieteMateriel.groupe.entreprise.entrepriseID" />'> <br>  
		 OS :<input type="text"   name="proprieteMateriel.os" value='<s:property value="proprieteMateriel.os" />'> <br> 
		 STATUT :<input type="text"   name="proprieteMateriel.statut" value='<s:property value="proprieteMateriel.statut" />'> <br> 
		 Numero de Serie :<input type="text"   name="proprieteMateriel.numeroSerie" value='<s:property value="proprieteMateriel.numeroSerie" />'> <br> 
		 Model :<input type="text"   name="proprieteMateriel.model" value='<s:property value="proprieteMateriel.model" />'> <br> 
		 Fabricant :<input type="text"   name="proprieteMateriel.fabricant" value='<s:property value="proprieteMateriel.fabricant" />'> <br> 
		 Cpu :<input type="text"   name="proprieteMateriel.cpu" value='<s:property value="proprieteMateriel.fabricant" />'> <br> 
		 Ram :<input type="text"   name="proprieteMateriel.ram" value='<s:property value="proprieteMateriel.fabricant" />'> <br> 
		 Utilisateur :<input type="text"   name="proprieteMateriel.utilisateur" value='<s:property value="proprieteMateriel.fabricant" />'> <br> 
		 Password :<input type="text"   name="proprieteMateriel.password" value='<s:property value="proprieteMateriel.adresseIp" />'> <br> 
		 Description :<textarea rows="2" cols="50"  name="proprieteMateriel.descritpion" > <s:property value="proprieteMateriel.descritpion"/> </textarea>  <br> 
		 DOccument Attacher :<input type="text"   name="proprieteMateriel.docAttacher" value='<s:property value="proprieteMateriel.docAttacher" />'> <br> 
		
		
		
		
		<input type="submit" value="Valider">

	</form>
</body>
</html>