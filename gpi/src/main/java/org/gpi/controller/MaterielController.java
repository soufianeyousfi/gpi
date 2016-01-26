package org.gpi.controller;

import org.gpi.domain.Materiel;
import org.gpi.domain.TypeMateriel;
import org.gpi.service.MeterielService;

public class MaterielController {
	private MeterielService meterielService = new MeterielService();
	private Materiel materiel;
	private TypeMateriel typeMateriel;
	

	public MeterielService getMeterielService() {
		return meterielService;
	}

	public void setMeterielService(MeterielService meterielService) {
		this.meterielService = meterielService;
	}

	public Materiel getMateriel() {
		return materiel;
	}

	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	public String addMateriel() {
		
			meterielService.addMateriel(materiel);
	
			return "success";


}
//	getters and setters

	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}

	public void setTypeMateriel(TypeMateriel typeMateriel) {
		this.typeMateriel = typeMateriel;
	}
	
}
