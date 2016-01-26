<%@ taglib prefix="s" uri="/struts-tags"%>


<script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
 <script type="text/javascript" src="js/lib/liste.js"></script>
 <script type="text/javascript"  src="js/lib/footable.js" ></script>
 <script type="text/javascript" src="js/lib/jquery.dataTables.min.js"></script>






                     
                      



	
	
	
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
                            <span class="break"></span> Liste Imprimante</h2>
                        </div>

	<div class="box-content">
	
	<table  class="footable1"   id="example1" >
		<thead>
		
			<th>Nom Departement </th>
			<th>Description</th>
			<th>Entreprise</th>
			
			
		</tr>
		 </thead>
			<tbody class="tableContainer">
			<s:iterator value="groupes">
		<tr>
			 
			 
			<td><s:property value="nom"/>    </td> 
			<td><s:property value="description"/>    </td> 
			<td><s:property value="entreprise.nom"/>    </td> 
			 
		</tr>
		
				</s:iterator>

</tbody>
		
	</table>


<a href="initAddGroupe"> Ajouter un nouvel departement </a> <br>


</div>

