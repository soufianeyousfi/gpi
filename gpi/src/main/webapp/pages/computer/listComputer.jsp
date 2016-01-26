<%@ taglib prefix="s" uri="/struts-tags"%>



<script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js/lib/liste.js"></script>
<script src="js/bootstrap.min.js"></script>
 <script type="text/javascript" src="js/lib/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/lib/footable.js"></script>












<div data-original-title="" class="box-header">
	<h2>
		<i class="icon-hdd"></i> <span class="break"></span> Liste Computer
	</h2>
</div>

<div class="box-content">








	<table  id="example1" class="footable1 display" >
		<thead>
			<tr>
				<th>Alias</th>
				<th>Statut</th>
				<th>FIn Garantie</th>
				<th>Lieu</th>
				<th>Departement</th>
				<th>Adresse IP</th>
				<th>Utilisateur</th>
				<th>update</th>
				<th data-hide="all">model</th>
				<th data-hide="all">Login</th>
				<th data-hide="all">Password</th>
				<th data-hide="all">Serial</th>
				<th data-hide="all">OS</th>
				<th data-hide="all">CPU(Ghz)</th>
				<th data-hide="all">RAM(Mb)</th>
				<th data-hide="all">HDD(Go)</th>
				<th data-hide="all">Descritpion</th>
				<th data-hide="all">Doc. Attachés</th>
                <th data-hide="all">Delete</th>

			</tr>
		</thead>
		<tbody class="tableContainer">
			<s:iterator value="proprieteMateriels">
				<tr>
					<td><s:property value="nom" /></td>
					<td><s:property value="statut.type" /></td>
					<td><s:property value="finGarantie" /></td>
					<td><s:property value="entreprise.nom" /></td>
					<td><s:property value="groupe.nom" /></td>
					<td><s:property value="adresseIp" /></td>
					<td><s:property value="utilisateur" /></td>
					<td><a
						href="initUpdateComputer?proprieteMateriel.materID=<s:property value='materID'/>">
						[	<i class="icon-pencil"> ] </i>
					</a></td>
					<td><s:property value="model" /></td>
					<td><s:property value="login" /></td>
					<td><s:property value="password" /></td>
					<td><s:property value="numeroSerie" /></td>
					<td><s:property value="os" /></td>
					<td><s:property value="cpu" /></td>
					<td><s:property value="ram" /></td>
					<td><s:property value="hdd" /></td>
					<td><s:property value="descritpion" /></td>
					<td>
						<ul>
							<s:iterator value="documents">
								<li><a
									href="fileDownload?documentInstance.url=<s:property value="url"/>&documentInstance.name=<s:property value="name"/>">
										<s:property value="name" />
								</a> <a
									href="deleteFile?documentInstance.documentID=<s:property value="documentID"/>&proprieteMateriel.materID=<s:property value="proprieteMateriel.materID"/>">

								</a></li>
							</s:iterator>
						</ul>
					</td>
					<%-- 				<td><s:property value="typeMateriel.type" /></td> --%>

					<td><a class=""
						href="deleteComputer?proprieteMateriel.materID=<s:property value='materID'/>">
							<i class="icon-remove">  </i>
					</a></td>
					
				</tr>
			</s:iterator>
		</tbody>
	</table>
</div>





