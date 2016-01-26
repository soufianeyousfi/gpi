<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
$(document).ready(function(){

    $(document).off("change","select[class='Materiel']").on("change","select[class='Materiel']",function(){
        var params={};
       // params["ID"]=$(this).val();

        $.ajax({
            type : "POST",
            url : "TypeMateriel", 
            dataType : "html",
            data : $.extend(params,
                {_tzcm : new Date().getTime() }
            ),
            success : function(data) {
            	$(".tableContent").html(data);
            }
        });
    });


});</script>
<body>
<h2>Hello World!</h2>
<form action="addMateriel" method="POST">


<select name="typeMateriel.typeMaterielID" >
									<s:iterator value="typeMateriels">
									
										<option value="<s:property value="typeMaterielID" />">
										<s:property value="type" /></option>
									</s:iterator>
								</select>
<div  class="tableContent">
tesstttt
</div>



<%--  <select  name='Type'  > --%>
<%--      <s:iterator> <jsp:param value="" name=""/> </s:iterator> --%>
<!--          <option value="getTypeID()" >getType()</option> </select>-->


<input type="submit" value="add"> 
</form>

<a href="pages/entreprise/ajouterEntreprise.jsp"> form entreprise</a>

</body>
</html>
