<%@ taglib prefix="s" uri="/struts-tags"%>


<script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
 <script type="text/javascript" src="js/lib/liste.js"></script>
 <script type="text/javascript"  src="js/lib/footable.js" ></script>
 <script type="text/javascript" src="js/lib/jquery.dataTables.min.js"></script>




 
 
 
 
                        <div class="box-header" data-original-title>
                            <h2><i class="halflings-icon white user"></i><span class="break"></span> Liste Materiel</h2>
                         
                        </div>
                        <div class="box-content">



	
	

	
<h1 align="center"> Liste Materiel</h1>
<table  class="footable table-hover table-striped " data-filter="#filter" id="example" >
		<thead>
		<tr>
			<th>materielID</th>
			<th>OS</th>
			<th>statut</th>
			<th>numeroSerie</th>
			<th>model</th>
			<th>fabricant</th>
			<th>descritpion</th>
			<th>document attache</th>
			<th>type</th>
			<th>nom</th>
			<th>Delete </th>
			<th>update</th>
			
			
		</tr>
		</thead>
		<tbody class="tableContainer">
		<s:if test="%{proprieteMateriels.size()>0}">
			<s:iterator value="proprieteMateriels">
		<tr>
			 
			<td><s:property value="materID"/>    </td> 
			<td><s:property value="os"/>    </td> 
			<td><s:property value="statut.type"/>    </td> 
			<td><s:property value="numeroSerie"/>    </td> 
			<td><s:property value="model"/>    </td> 
			<td><s:property value="fabricant"/>    </td> 
			<td><s:property value="descritpion"/>    </td> 
			<td><s:property value="docAttacher"/>    </td> 
			<td><s:property value="nom"/>    </td> 
			<td> <a href="deleteMateriel?proprieteMateriel.materID=<s:property value='materID'/>" > X </a>  </td> 
			<td> <a href="initUpdatePro?proprieteMateriel.materID=<s:property value='materID'/>" > O </a>  </td> 
		</tr>
		
				</s:iterator>
</s:if>
						<s:else>
							<tr><td colspan="5">No data</td></tr>
						</s:else>
					</tbody>
	</table>


</div>
