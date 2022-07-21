package sistemaMedico;
 
class Prestacion
{
	private Consultorio consultorioRef;
	private Especialidad especialidadRef;
	private  Estudio estudioRef;
	private Fecha fechaPrestacion;
	private Laboratorio laboratorioRef;
	private MedicoDeAtencion medico;
	private Pago pago[];
	private  String tipoPrestacion;
	private int cantPagos; 
	
	//Constructor por defecto.
	Prestacion()
	{
		this.fechaPrestacion=null;
		this.medico=null;
		this.tipoPrestacion="";
		this.cantPagos=0;
	}
	
	
	Prestacion(Fecha fechaPrestacion,MedicoDeAtencion medico,
	String tipoPrestacion,int cantPagos)
	{
		this.fechaPrestacion=fechaPrestacion;
		this.medico=medico;
		this.tipoPrestacion=tipoPrestacion;
		
		//Se determina el tamanio del vector pago.
		this.pago=new Pago[cantPagos];
		
		this.cantPagos=0;
	}
	
	
	//getters	
	
	Especialidad getEspecialidadRef()
	{
		return this.especialidadRef;
	}
	
	Estudio getEstudioRef()
	{
		return this.estudioRef;
	}
	
	Fecha getFechaPrestacion()
	{
		return this.fechaPrestacion;
	}
	
	Laboratorio getLaboratorioRef()
	{
		return this.laboratorioRef;
	}
	
	MedicoDeAtencion getMedico()
	{
		return this.medico;
	}
	
	Pago[] getPago()
	{
		return this.pago;
	}
	
	String getTipoPrestacion()
	{
		return this.tipoPrestacion;
	}
	
	Consultorio getConsultorioRef()
	{
		return this.consultorioRef;
	}
	
	//setters
	
	void setEspecialidadRef(Especialidad e)
	{
		this.especialidadRef=e;
	}
	
	void setEstudioRef(Estudio e)
	{
		this.estudioRef=e;
	}
	
	void setFechaPrestacion(Fecha f)
	{
		this.fechaPrestacion=f;
	}
	
	void setLaboratorioRef(Laboratorio l)
	{
		this.laboratorioRef=l;
	}
	
	void setMedico(MedicoDeAtencion m)
	{
		this.medico=m;
	}
	
	void setPago(Pago unPago)
	{
		this.pago[this.cantPagos]=unPago;
		this.cantPagos++;
	}
	
	void setTipoPrestacion(String tP)
	{
		this.tipoPrestacion=tP;
	}
	
	void setConsultorioRef(Consultorio c)
	{
		this.consultorioRef=c;
	}

	

}
