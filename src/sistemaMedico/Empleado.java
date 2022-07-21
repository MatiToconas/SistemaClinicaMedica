package sistemaMedico;

abstract class Empleado {
	protected String nombreEmpleado;
	protected String apellidoEmpleado;
	protected long dniEmpleado;
	protected String domicilioEmpleado;
	protected String telEmpleado;
	protected Fecha fechaNacEmpleado;
	
	//constructor por defecto
	Empleado(){
		this.nombreEmpleado= null;
		this.apellidoEmpleado=null;
		this.dniEmpleado=0;
		this.domicilioEmpleado=null;
		this.telEmpleado=null;
		this.fechaNacEmpleado=new Fecha();
	}
	
	//constructor
	Empleado(String nombreEmp, String apellEmp,long dniEmp, String domicEmp, String telEmp, Fecha fechaNacEmp){
		this.nombreEmpleado= nombreEmp;
		this.apellidoEmpleado=apellEmp;
		this.dniEmpleado=dniEmp;
		this.domicilioEmpleado=domicEmp;
		this.telEmpleado=telEmp;
		this.fechaNacEmpleado=fechaNacEmp;
	}

	//getters y setters 
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public long getDniEmpleado() {
		return dniEmpleado;
	}

	public void setDniEmpleado(long dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public String getDomicilioEmpleado() {
		return domicilioEmpleado;
	}

	public void setDomicilioEmpleado(String domicilioEmpleado) {
		this.domicilioEmpleado = domicilioEmpleado;
	}

	public String getTelEmpleado() {
		return telEmpleado;
	}

	public void setTelEmpleado(String telEmpleado) {
		this.telEmpleado = telEmpleado;
	}

	public Fecha getFechaNacEmpleado() {
		return fechaNacEmpleado;
	}

	public void setFechaNacEmpleado(Fecha fechaNacEmpleado) {
		this.fechaNacEmpleado = fechaNacEmpleado;
	}
	

	
}
