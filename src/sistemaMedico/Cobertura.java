package sistemaMedico;

class Cobertura 
{
	private String nombre;
	private String tipoCobertura;
	private int cantidadPago;
	
	Pago pago[];
	
	
	//Constructor por defecto
	Cobertura()
	{
		this.nombre = null;
		this.tipoCobertura = null;
	}
	
	//Constructor
	Cobertura(String nombre, String tipoCobertura)
	{
		this.nombre = nombre;
		this.tipoCobertura = tipoCobertura;
	}
	
	public void cargarPago(Pago pago)
	{
		this.pago[this.cantidadPago] = pago;
		this.cantidadPago++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoCobertura() {
		return tipoCobertura;
	}

	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}

	public Pago[] getPago() {
		return pago;
	}
}
