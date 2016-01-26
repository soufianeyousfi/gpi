<%@ taglib prefix="s" uri="/struts-tags"%>
 <script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
 <script type="application/javascript" src="js/lib/jquery-migrate-1.2.1.js"></script>
 <script type="text/javascript" src="js/lib/liste.js"></script>
  <script type="text/javascript"  src="js/script.js" ></script>
 
 <script type="text/javascript"  src="js/lib/footable.js" ></script>
 <script type="text/javascript" src="js/lib/jquery.dataTables.min.js"></script>






	<div data-original-title="" class="box-header">
                            <h2><i class="halflings-icon white user"></i><span class="break"></span> Archive</h2>
<!--                                 <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a> -->
<!--                                 <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a> -->
<!--                                 <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a> -->
<!-- 								<a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a> -->
                        </div>
                        <div class="box-content">


    <div class="container">

	<table  class="footable1 display"   id="example1"  >
		<thead>
		<tr>
			<th>Type Materiel</th>
			<th>nom</th>
			<th>OS</th>
			<th>statut</th>
			<th>numeroSerie</th>
			<th>model</th>
			<th data-hide="all">fabricant</th>
			<th data-hide="all">descritpion</th>
			<th data-hide="all">document attache</th>
			<th>Supprimer Par</th>
			<th>Delete </th>
			
			
		
			</tr>
		</thead>
			<tbody class="tableContainer">
			<s:iterator value="proprieteMateriels">
		
		<tr>
			 <td><s:property value="typeMateriel.type"/>    </td> 
			 	<td><s:property value="nom"/>    </td> 
			<td><s:property value="os"/>    </td> 
			<td><s:property value="statut.type"/>    </td> 
			<td><s:property value="numeroSerie"/>    </td> 
			<td><s:property value="model"/>    </td> 
			<td><s:property value="fabricant"/>    </td> 
			<td><s:property value="descritpion"/>    </td> 
			<td><s:property value="docAttacher"/>    </td> 
			
		
			<td> <s:property value="user.nom"/>    </td> 
			<td> <a href="confirmDeleteMateriel?proprieteMateriel.materID=<s:property value='materID'/>" > X </a>  </td> 
		</tr>
		
				</s:iterator>
</tbody>
	</table>
	</div>
</div>


 

