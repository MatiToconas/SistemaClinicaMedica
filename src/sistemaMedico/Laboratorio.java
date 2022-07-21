package sistemaMedico;

class Laboratorio{
	
	private int cantidadEstudio;
	private int cantidadPrestacion;
	
	Estudio[] estudio;
	Prestacion[] prestacion;
	
	public void agregarPrestacion(Prestacion unaPrestacion)
	{
		prestacion[this.cantidadPrestacion] = unaPrestacion;
		this.cantidadPrestacion++;
	}
	
	public void cargarEstudio(Estudio unEstudio)
	{
		estudio[this.cantidadEstudio] = unEstudio;
		this.cantidadEstudio++;
	}

	public Estudio[] getEstudio() {
		return estudio;
	}

	public void setEstudio(Estudio[] estudio) {
		this.estudio = estudio;
	}

	public Prestacion[] getPrestacion() {
		return prestacion;
	}

	public void setPrestacion(Prestacion[] prestacion) {
		this.prestacion = prestacion;
	}
	
}
