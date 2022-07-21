package sistemaMedico;

class AreaMedica {
	
	private int cantidadConsultorio;
	private int cantidadMedicosDeAtencion;
	private String nombre;
	
	MedicoDeAtencion [] medicosDeAtencion;
	
	MedicoCoordinador medicoCoordinador;
	
	AreaMedica()
	{
		this.cantidadConsultorio = 0;
		this.cantidadMedicosDeAtencion = 0;
		medicoCoordinador=null;
		this.nombre = null;
	}
	
	AreaMedica(int cantidadConsultorio, String nombre,
	int cantMedicosDeAtencion)
	{
		this.cantidadConsultorio = cantidadConsultorio;
		medicosDeAtencion=new MedicoDeAtencion[cantMedicosDeAtencion];
		cantidadMedicosDeAtencion=0;
		this.nombre = nombre;
		 
	}
	
	public void cargarMedico(MedicoDeAtencion medico)
	{
		medicosDeAtencion[cantidadMedicosDeAtencion]=medico;
		cantidadMedicosDeAtencion++;
	}
	

	public int getCantidadConsultorio() {
		return cantidadConsultorio;
	}

	public void setCantidadConsultorio(int cantidadConsultorio) {
		this.cantidadConsultorio = cantidadConsultorio;
	}

	public int getCantidadMedicos() {
		return medicosDeAtencion.length;
	}

	public void setCantidadMedicos(int cantidadMedicos) {
		this.cantidadMedicosDeAtencion = cantidadMedicos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MedicoDeAtencion[] getMedicos() {
		return medicosDeAtencion;
	}

	 
}
