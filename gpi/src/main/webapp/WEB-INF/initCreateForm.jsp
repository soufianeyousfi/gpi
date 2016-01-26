<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/lib/jquery-1.7.2.min.js"></script>



<title>Ajouter Materiel</title>
</head>
<body>
   
 

<!-- 3/3/2015 format="%{dd/MM/YYYY}" -->
<form action="addPropriete" method="POST">

Numero de Serie <input type="text" name="proprieteMateriel.numeroSerie"><br>
Model <input type="text" name="proprieteMateriel.model"><br>
Fabricant <input type="text" name="proprieteMateriel.fabricant"><br>
<%-- Date Achat  <input value="<s:date  format="%{YYYY-MM-dd}" name="proprieteMateriel.dateAchat" />"><br> --%>
Date Achat  <input   name="proprieteMateriel.dateAchat" id="dateAchat" ><br>
Fin Garantie <input type="text" name="proprieteMateriel.finGarantie"><br>
NOM Materiel<input type="text" name="proprieteMateriel.nom"><br>
<!-- date finGarantie <input type="text" name="proprieteMateriel.garantie.finGarantie"><br> -->
Utilisateur <input type="text" name="proprieteMateriel.utilisateur"><br>
Entreprise  <select  name="proprieteMateriel.groupe.entreprise.entrepriseID">
										
									<s:iterator value="entreprises">
										<option  value="<s:property value="entrepriseID" />" >
										<s:property  value="nom" /></option>
									</s:iterator>
							
								</select><br>
Groupe  <select  name="proprieteMateriel.groupe.groupID">
										
									<s:iterator value="groupes">
										<option  value="<s:property value="groupID" />"  id="groupID">
										<s:property default="compta" value="nom" /></option>
									</s:iterator>
							
								</select>

										
										
<br>




Type Materiel <select name="proprieteMateriel.typeMateriel.typeMaterielID" id="dynamic_select">
									<s:iterator value="typeMateriels">
										<option  value="<s:property value="typeMaterielID" />" id="typeMaterielID">
										<s:property   value="type" /></option>
									</s:iterator>
							
								</select>
<br>


<div id="default_formComputer">
System d'exploitation <input type="text" name="proprieteMateriel.os"><br>
LOGIN <input type="text" name="proprieteMateriel.login"><br>
PASSWORD <input type="text" name="proprieteMateriel.password"><br>
Systeme Exploitation <input type="text" name="proprieteMateriel.os"><br>
CPU <input type="text" name="proprieteMateriel.cpu"><br>
RAM <input type="text" name="proprieteMateriel.ram"><br>
HDD <input type="text" name="proprieteMateriel.hdd"><br>


</div>


ADRESSE IP <input type="text" name="proprieteMateriel.adresseIp"><br>
Site <input type="text" name="proprieteMateriel.site"><br>
Descritpion <textarea  rows="4" cols="50"  name="proprieteMateriel.descritpion">  </textarea><br>
docAttacher <input type="text" name="proprieteMateriel.docAttacher"><br>
<input type="submit" value="add"> 
</form>
<script type="text/javascript">
$(document).ready(function() {
/* 	$('form[action="addPropriete"]').unbind('submit').bind('click', function () { 
		alert("submit");
		return false;
	}); */
    $('#dynamic_select').change(function () { // bind change event to select
    	
    	var url = $(this).val(); // get selected value
    	
		var params={};
		 params["typeMateriel.typeMaterielID"] = $("#typeMaterielID").val();
	
		
if (url==1)	{
			$.ajax({
	        	
	            type : "POST",
	            url : "initAjouterComputer",
	            dataType : "html",
	            data : $.extend(params,
	                {_tzcm : new Date().getTime() }
	            ), 
	            success : function(data) {
	            	$("#default_formComputer").html(data);
	            }
	        });}
			else{$.ajax({
	        	
	            type : "POST",
	            url : "initAjouterImprimante",
	            dataType : "html",
	            data : $.extend(params,
	                {_tzcm : new Date().getTime() }
	            ), 
	            success : function(data) {
	            	$("#default_formComputer").html(data);
	            }
	        }); }
			


    }); 
    
    });

    	

    
</script>






</body>
</html>