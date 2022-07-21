package sistemaMedico;
 

class Consultorio {

	private int numeroDeConsultorio;
	private int cantidadPrestaciones;
	private int cantidadTurno;
	
	Prestacion [] prestacion;
	Turno [] turno;
 
	//Constructor por defecto
	Consultorio()
	{
		this.numeroDeConsultorio=0;
		this.cantidadPrestaciones=0;
		this.cantidadTurno=0;
	}
	
	
	Consultorio(int numeroDeConsultorio, int cantPrestaciones,
	int cantTurno)
	{
		this.numeroDeConsultorio=numeroDeConsultorio;
		
		prestacion=new Prestacion[cantPrestaciones];
		turno=new Turno[cantTurno];
		this.cantidadPrestaciones=0;
		this.cantidadTurno=0;
	}
	
	public void agregarPrestacion(Prestacion unaPrestacion)
	{
		prestacion[this.cantidadPrestaciones]=unaPrestacion;
		this.cantidadPrestaciones++;
	}
	
	public void agregarTurno(Turno unTurno)
	{
		this.turno[this.cantidadTurno]=unTurno;
		this.cantidadTurno++;
	}
	
	public Turno[] getTurnos()
	{
		return  turno;
	}
	
	public Prestacion[] getPrestaciones()
	{
		return this.prestacion;
	}
	
	int getNumeroConsultorio()
	{
		return this.numeroDeConsultorio;
	}
	
	void setNumeroConsultorio(int c)
	{
		this.numeroDeConsultorio=c;
	}
	
}
