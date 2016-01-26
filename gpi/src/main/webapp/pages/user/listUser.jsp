<%@ taglib prefix="s" uri="/struts-tags"%>


<script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
  <script type="text/javascript" src="js/lib/jquery.dataTables.min.js"></script>
  <script type="text/javascript"  src="js/lib/footable.js" ></script>
 <script src="js/bootstrap.min.js"></script>
 <script type="text/javascript" src="js/lib/liste.js"></script>




<div data-original-title="" class="box-header">
                            <h2>
                            <i class="halflings-icon white user"></i>
                            <span class="break"></span> Utilisateurs</h2>
                        </div>

	<div class="box-content">
	
	<table  class="footable1 display"   id="example1" >
	<thead>
		<tr>
			<th>UserID</th>
			<th>NOM</th>
			<th>EMAIL</th>
			<th>LOGIN</th>
			<th>PASSWORD</th>
			<th>TEL</th>
			<th>Delete</th>
			<th>update</th>


		</tr>
		</thead>
				<tbody class="tableContainer">
		<s:iterator value="users">
			<tr>

				<td ><s:property  value="iuserID"  /></td>
				<td><s:property value="nom" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="login" /></td>
				<td><s:property value="password" /></td>
				<td><s:property value="tel" /></td>
				<td><a
					href="deleteUser?user.iuserID=<s:property value='iuserID'/>">
						X </a></td>
				<td><a class="initUpdateUser"
					href="initUpdateUser?user.iuserID=<s:property  value='iuserID'/>">
						O </a></td>
			</tr>

		</s:iterator>


</tbody>
	</table>

</div>
	


