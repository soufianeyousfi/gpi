
    <%@ taglib prefix="s" uri="/struts-tags"%>

<script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
 <script type="text/javascript"  src="js/lib/footable.js" ></script>
 <script type="text/javascript" src="js/lib/jquery.dataTables.min.js"></script>
  <script type="text/javascript" src="js/lib/liste.js"></script>
 
<%-- <script type="text/javascript" src="js/lib/zebra_dialog.src.js"></script> --%>
    <script src="js/bootstrap.min.js"></script>
    
    







                     
                      



	
	
	

	<div data-original-title="" class="box-header">
                            <h2>
                            <i class="halflings-icon white user"></i>
                            <span class="break"></span> Liste Entreprise</h2>
                        </div>

	<div class="box-content">
	
	<table  id="example1" class="footable1 table-hover table-striped "   >
		<thead>
		<tr>
		
<!-- 			<th>EntrpriseID </th> -->
			<th>Nom Entrprise </th>
			<th>Raison Sociale</th>
			<th>Adresse</th>
			<th>Telephone</th>
			<th>Fax</th>
			<th>Courriel</th>
			<th>Delete </th>
			<th>update</th>
			
		
		</tr>
		</thead>
		<tbody class="tableContainer">
			<s:if test="%{entreprises.size()>0}">
			<s:iterator value="entreprises">
		<tr>
			 
<%-- 			<td><s:property value="entrepriseID"/>    </td>  --%>
			<td> <a href="listMaterielEntreprise?entreprise.entrepriseID=<s:property value='entrepriseID'/>" > <s:property value="nom"/>  </a>  </td> 
			<td><s:property value="raisonSociale"/>    </td> 
			<td><s:property value="adresse"/>    </td> 
			<td><s:property value="telephone"/>    </td> 
			<td><s:property value="fax"/>    </td> 
			<td><s:property value="courriel"/>    </td> 
			<td> <a href="deleteEntreprise?entreprise.entrepriseID=<s:property value='entrepriseID'/>" > X </a>  </td> 
			<td> <a href="initUpdateEnt?entreprise.entrepriseID=<s:property value='entrepriseID'/>" > O </a>  </td> 
		</tr>
		
				</s:iterator>

</s:if>
						<s:else>
							<tr><td colspan="5">No data</td></tr>
						</s:else>
					</tbody>
	</table>
	<br>

		
	</div>
