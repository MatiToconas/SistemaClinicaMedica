package sistemaMedico;

class Estudio {

	private int cantidadPrestaciones;
	private Fecha fechaEstudio;
	private Receta receta;
	private String tipoEstudio;
	
	Prestacion [] prestacion;
	
	Estudio()
	{
		this.fechaEstudio = new Fecha();
		this.receta = new Receta();
		this.tipoEstudio = null;
	}
	
	Estudio(Fecha fechaEstudio, Receta receta, String tipoEstudio)
	{
		this.fechaEstudio = fechaEstudio;
		this.receta = receta;
		this.tipoEstudio = tipoEstudio;
	}
	public void agregarPrestacion(Prestacion unaPrestacion)
	{
		prestacion[this.cantidadPrestaciones] = unaPrestacion;
		this.cantidadPrestaciones++;
	}

	public Fecha getFechaEstudio() {
		return fechaEstudio;
	}

	public void setFechaEstudio(Fecha fechaEstudio) {
		this.fechaEstudio = fechaEstudio;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public String getTipoEstudio() {
		return tipoEstudio;
	}

	public void setTipoEstudio(String tipoEstudio) {
		this.tipoEstudio = tipoEstudio;
	}

	public Prestacion[] getPrestacion() {
		return prestacion;
	}

}
