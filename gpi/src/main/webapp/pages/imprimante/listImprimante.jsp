<%@ taglib prefix="s" uri="/struts-tags"%>


<script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script type="text/javascript" src="js/lib/jquery.dataTables.min.js"></script>
  <script type="text/javascript"  src="js/lib/footable.js" ></script>

 <script type="text/javascript" src="js/lib/liste.js"></script>







                     
                      



	
	
	
	<!-- <div id="page-wrapper">-->
	
	
<!-- 	<form action="searchMateriel"> -->
<%-- 	<input type="text"   id="searchMateriel" placeholder="Rechercher..."  name="q" value='<s:property value="q"/>'> --%>
<!--     <button class="btn btn-white btn-sm"> Rechercher -->
														
<!-- 													</button> -->
<!--     </form> -->
	<!-- </div>-->
	<div data-original-title="" class="box-header">
                            <h2>
                            <i class="halflings-icon white user"></i>
                            <span class="break"></span> Imprimantes</h2>
                        </div>

	<div class="box-content">
	
	<table  id="example1" class="table footable1 display"   >
		<thead>
		<tr>
			<th>Alias </th>
			<th>Type</th>
			<th>statut</th>
			<th data-hide="phone" data-type="numeric">Fin Garantie</th>
			<th data-hide="tablet, phone">numeroSerie</th>
			<th data-hide="tablet, phone">model</th>
			<th data-hide=" phone">Cartouche</th>
			<th data-hide="tablet, phone">Pages/minute</th>
			<th  data-hide="tablet, phone">Connexion</th>
			<th data-hide="tablet, phone">Pilote</th>
			<th  data-hide="tablet, phone">descritpion</th>
			<th data-hide=" phone">Entreprise</th>
			<th data-hide="all">Departement</th>
			<th data-hide="all">Doc. Attachés</th>
			<th data-hide="all">Delete</th>
			<th data-hide="all">update</th>


		</tr>
		</thead>
		<tbody class="tableContainer">
<s:iterator value="proprieteMateriels">
			<tr>

		
				<td><s:property value="nom" /></td>
				<td><s:property value="typeImprimante" /></td>
				<td><s:property value="statut.type" /></td>
				<td><s:property value="finGarantie" /></td>
				<td><s:property value="numeroSerie" /></td>
				<td><s:property value="model" /></td>
				<td><s:property value="cartouche" /></td>
				<td><s:property value="ppm" /></td>
				<td><s:property value="media" /></td>
				<td><s:property value="pilote" /></td>
				<td><s:property value="descritpion" /></td>
				<td><s:property value="entreprise.nom" /></td>
				<td><s:property value="groupe.nom" /></td>
				<td> <ul >
<s:iterator value="documents">
	<li >
	<a  href="fileDownload?documentInstance.url=<s:property value="url"/>&documentInstance.name=<s:property value="name"/>">	<s:property value="name" /> </a> 
															
											<a href="deleteFile?documentInstance.documentID=<s:property value="documentID"/>&proprieteMateriel.materID=<s:property value="proprieteMateriel.materID"/>">
									
											</a>
													
									</li>
</s:iterator>
	                        </ul></td>
<%-- 			<td><s:property value="typeMateriel.typeMaterielID" /></td> --%>
				<td><a
					href="deleteImprimante?proprieteMateriel.materID=<s:property value='materID'/>">
						<span class="icon-remove"></span></a></td>
				<td><a
					href="initUpdateImprimante?proprieteMateriel.materID=<s:property value='materID'/>">
						<i class="icon-pencil"></i></a></td>
			</tr>

</s:iterator>
					</tbody>
	</table>
</div>


