<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addPropriete" method="POST">

Statut <input type="text" name="proprieteMateriel.statut"><br>
System d'exploitation <input type="text" name="proprieteMateriel.os"><br>
UTILISATEUR <input type="text" name="proprieteMateriel.utilisateur"><br>
PASSWORD <input type="text" name="proprieteMateriel.password"><br>
ADRESSE IP <input type="text" name="proprieteMateriel.adresseIp"><br>
PROCESSEUR <input type="text" name="proprieteMateriel.cpu"><br>
RAM <input type="text" name="proprieteMateriel.ram"><br>
HDD 
Descritpion <textarea  rows="4" cols="50"  name="proprieteMateriel.descritpion">  </textarea><br>
docAttacher <input type="text" name="proprieteMateriel.docAttacher"><br>



<input type="submit" value="add"> 
</form>




</body>
</html>