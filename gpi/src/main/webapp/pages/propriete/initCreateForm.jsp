
<%@ taglib prefix="s" uri="/struts-tags"%>




<script type="application/javascript" src="js/lib/jquery-1.11.3.min.js"></script>
<script type="application/javascript" src="js/lib/initCreateForm.js"></script>
<script type="application/javascript" src="js/lib/jquery-ui.min.js"></script>



<div data-original-title="" class="box-header">
	<h2>
		<i class="icon-hdd"></i> <span class="break"></span> Ajouter Materiel
	</h2>
</div>

<div class="box-content">




	<!-- 3/3/2015 format="%{dd/MM/YYYY}" -->
	<form class="form-horizontal well" action="addPropriete" method="POST"
		enctype="multipart/form-data">
		<div class="control-group">
			<label class="control-label" for="Numero de Serie"> Numero de
				Serie </label>
			<div class="controls">
				<input type="text" id="name" name="proprieteMateriel.numeroSerie">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="Model"> Model </label>
			<div class="controls">
				<input type="text" name="proprieteMateriel.model">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="Fin Garantie"> Fin Garantie</label>
			<div class="controls">
				<input id="dat" type="text" name="proprieteMateriel.finGarantie"
					class="datepicker" data-date-format="dd/mm/yyyy"
					placeholder="DD/MM/YYYY" />
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="NOM Materiel"> NOM Materiel</label>
			<div class="controls">
				<input type="text" name="proprieteMateriel.nom">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="Utilisateur">Utilisateur</label>
			<div class="controls">
				<input type="text" name="proprieteMateriel.utilisateur">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="Utilisateur">Entreprise</label>
			<div class="controls">
				<select name="proprieteMateriel.entreprise.entrepriseID">

					<s:iterator value="entreprises">
						<option value="<s:property value="entrepriseID"  />">
							<s:property value="nom" /></option>
					</s:iterator>
				</select>
			</div>
		</div>


		<div class="control-group">
			<label class="control-label" for="Utilisateur">Departement</label>
			<div class="controls">
				<select name="proprieteMateriel.groupe.groupID">

					<s:iterator value="groupes">
						<option value="<s:property value="groupID" />">
							<s:property value="nom" /></option>
					</s:iterator>

				</select>
			</div>
		</div>


		<div class="control-group">
			<label class="control-label" for="NOM Materiel"> Type
				Materiel </label>
			<div class="controls">
				<select name="proprieteMateriel.typeMateriel.typeMaterielID"
					id="dynamic_select">
					<s:iterator value="typeMateriels">
						<option value="<s:property value="typeMaterielID" />"
							id="typeMaterielID">
							<s:property value="type" /></option>
					</s:iterator>

				</select>
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="NOM Materiel"> Statut </label>
			<div class="controls">
				<select name="proprieteMateriel.statut.statutID">
					<s:iterator value="statuts">
						<option value="<s:property value="statutID" />">
							<s:property value="type" /></option>
					</s:iterator>

				</select>
			</div>
		</div>



		<div id="default_formComputer">
			<div class="control-group">
				<label class="control-label" for="System d'exploitation">
					System d'exploitation</label>
				<div class="controls">
					<input type="text" name="proprieteMateriel.os">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="LOGIN"> LOGIN</label>
				<div class="controls">
					<input type="text" name="proprieteMateriel.login">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="LOGIN"> PASSWORD</label>
				<div class="controls">
					<input type="text" name="proprieteMateriel.password">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="LOGIN"> CPU</label>
				<div class="controls">
					<input type="text" name="proprieteMateriel.cpu">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="LOGIN"> RAM</label>
				<div class="controls">
					<input type="text" name="proprieteMateriel.ram">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="LOGIN"> HDD</label>
				<div class="controls">
					<input type="text" name="proprieteMateriel.hdd">
				</div>
			</div>




		</div>


		<div class="control-group">
			<label class="control-label" for="LOGIN"> ADRESSE IP</label>
			<div class="controls">
				<input type="text" name="proprieteMateriel.adresseIp">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="LOGIN"> Descritpion</label>
			<div class="controls">
				<textarea rows="4" cols="50" name="proprieteMateriel.descritpion">  </textarea>
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<input name="files" type="file" id="file_upload"
					multiple="multiple" >
			</div>
		</div>



		<div class="control-group">
			<div class="controls">
				<input id="initCreateFormSubmit" type="submit" value="Valider"
					class="btn-primary">
			</div>
		</div>


	</form>








</div>














