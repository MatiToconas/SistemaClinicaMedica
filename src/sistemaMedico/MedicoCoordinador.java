package sistemaMedico;

class MedicoCoordinador extends MedicoDeAtencion {
	
	private AreaMedica areaACoordinar;
	
	//constructor
	MedicoCoordinador(String nombreEmp, String apellEmp, long dniEmp, String domicEmp, String telEmp, Fecha fechaNacEmp,
			Consultorio consultorio, Especialidad especialidad, AreaMedica area) {
		super(nombreEmp, apellEmp, dniEmp, domicEmp, telEmp, fechaNacEmp, consultorio, especialidad);
		this.areaACoordinar= area;
	}

	//getter y setter
	public AreaMedica getAreaACoordinar() {
		return areaACoordinar;
	}

	public void setAreaACoordinar(AreaMedica areaACoordinar) {
		this.areaACoordinar = areaACoordinar;
	}
	
	//métodos
	public void asignarConsultorio(MedicoDeAtencion medico, Consultorio consultorio) {
		medico.setConsultorioMedico(consultorio);
	}
	

}
