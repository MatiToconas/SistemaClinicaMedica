package sistemaMedico;

class Receta 
{

	private String apellidoMedico;
	private String apellidoPaciente;
	private String descripcion;
	private Fecha fechaReceta ;
	private String nombreMedico;
	private String nombrePaciente;
	
	
	//Constructor por defecto.
	Receta()
	{
				this.apellidoMedico="";
				this.apellidoPaciente="";
				this.descripcion="";
				this.fechaReceta=null;
				this.nombreMedico="";
				this.nombrePaciente="";
	}
	
	
	Receta(String apellidoMedico,String apellidoPaciente,
	String descripcion,Fecha fechaReceta, String nombreMedico
	,String nombrePaciente)
	{
		this.apellidoMedico=apellidoMedico;
		this.apellidoPaciente=apellidoPaciente;
		this.descripcion=descripcion;
		this.fechaReceta=fechaReceta;
		this.nombreMedico=nombreMedico;
		this.nombrePaciente=nombrePaciente;
	}
	
	//getters
	
	String getApellidoMedico()
	{
		return this.apellidoMedico;
	}
	
	String getApellidoPaciente()
	{
		return this.apellidoPaciente;
	}
	
	String getDescripcion()
	{
		return this.descripcion;
	}
	
	Fecha getFechaReceta()
	{
		return this.fechaReceta;
	}
	
	String getNombreMedico()
	{
		return this.nombreMedico;
	}
	
	
	String getNombrePaciente()
	{
		return this.nombrePaciente;
	}
	
	//setters
	
	void setApellidoMedico(String a)
	{
		apellidoMedico=a;
	}
	
	void setApellidoPaciente(String a)
	{
		apellidoPaciente=a;
	}
	
	void setDescripcion(String d)
	{
		descripcion=d;
	}
	
	void setFechaReceta(Fecha fecha)
	{
		fechaReceta=fecha;
	}
	
	void setNombreMedico(String m)
	{
		nombreMedico=m;
	}
	
	void setNombrePaciente(String p)
	{
		nombrePaciente=p;
	}
}
