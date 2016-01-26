<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter Groupe</title>
</head>
<body>
	<h1 align="center">Ajouter Groupe</h1>
	<form action="addGroupe" method="POST">
		Nom Groupe : <select name="groupe.goupID">
			<s:iterator value="groupes">
				<option value="<s:property value="groupID"  />">
					<s:property value="nom" /></option>
			</s:iterator>
		</select><br>
		<!-- 		Description : <input type="text" name="groupe.description"><br> -->
		Entreprise <select name="entreprise.entrepriseID">
			<s:iterator value="entreprises">
				<option value="<s:property value="entrepriseID"  />">
					<s:property value="nom" /></option>
			</s:iterator>
		</select><br> <input type="submit" value="ajouter">
	</form>

</body>
</html>