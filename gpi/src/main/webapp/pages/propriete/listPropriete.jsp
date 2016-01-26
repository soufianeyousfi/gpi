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

<h1 align="center"> Liste Utilisateur</h1>

<table border="bold">
		<tr>
			<th>UserID</th>
			<th>nom</th>
			<th>email</th>
			<th>login</th>
			<th>login</th>
			<th>password</th>
			<th>Delete </th>
			<th>update</th>
			
			
		</tr>
			<s:iterator value="users">
		<tr>
			 
			<td> <a href="deleteUser?user.userID=<s:property value='iuserID'/>" > <s:property value="iuserID"/>  </a>     </td> 
			<td><s:property value="nom"/>    </td> 
			<td><s:property value="email"/>    </td> 
			<td><s:property value="login"/>    </td> 
			<td><s:property value="password"/>    </td> 
			<td><s:property value="tel"/>    </td> 
			<td> <a href="deleteUser?user.iuserID=<s:property value='iuserID'/>" > X </a>  </td> 
			<td> <a href="initUpdateUser?user.iuserID=<s:property value='iuserID'/>" > O </a>  </td> 
		</tr>
		
				</s:iterator>


		
	</table>
	
	
	<a href="/gpi/pages/user/addUser.jsp">Ajouter un nouvel utilisateur </a>


</body>
</html>