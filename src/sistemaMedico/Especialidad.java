package sistemaMedico;

import java.util.LinkedList;

class Especialidad 
{
	private String nombreEspecialidad;
	private int cantPrestacion;
	private int cantTurno;
	
	Prestacion prestacion[];
	Turno turno[];
	
	private LinkedList<String> horariosLunes = new LinkedList<String>();
	private LinkedList<String> horariosMartes = new LinkedList<String>();
	private LinkedList<String> horariosMiercoles = new LinkedList<String>();
	private LinkedList<String> horariosJueves = new LinkedList<String>();
	private LinkedList<String> horariosViernes = new LinkedList<String>();
	
	//Contructor
	Especialidad()
	{
		this.nombreEspecialidad = null;
	}
	
	
	Especialidad( String nombreEspecialidad)
	{
		this.nombreEspecialidad = nombreEspecialidad;

	}
	
	public void agregarPrestacion(Prestacion prestacion)
	{
		this.prestacion[this.cantPrestacion] = prestacion;
		this.cantPrestacion++;
	}
	
	public void cargarTurno(Turno turno)
	{
		this.turno[this.cantTurno] = turno;
		this.cantTurno++;
	}


	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}


	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}


	public Prestacion[] getPrestacion() {
		return prestacion;
	}


	public Turno[] getTurno() {
		return turno;
	}
	
	public void cargarHorariosDias(LinkedList<String> horariosDiaX ) {
		
		horariosDiaX.add("08.00");
		horariosDiaX.add("08.30");
		horariosDiaX.add("09.00");
		horariosDiaX.add("09.30");
		horariosDiaX.add("10.00");
		horariosDiaX.add("10.30");
		horariosDiaX.add("11.00");
		horariosDiaX.add("11.30");
		
	}
	
	public void mostrarListaHorarios(LinkedList<String> horariosDiaX) {
		if( horariosDiaX.isEmpty())
			System.out.println("La fecha seleccionada ya no posee turnos disponibles.");
		else 
		{	
			int i=0;
			for (String elemento : horariosDiaX) {
	            System.out.print(i+" . "+ elemento + "-");
	            i++;
	        System.out.println();
			}
		}
	}

	//getter y setter de listas de horarios
	public LinkedList<String> getHorariosLunes() {
		return horariosLunes;
	}


	public void setHorariosLunes(LinkedList<String> horariosLunes) {
		this.horariosLunes = horariosLunes;
	}


	public LinkedList<String> getHorariosMartes() {
		return horariosMartes;
	}


	public void setHorariosMartes(LinkedList<String> horariosMartes) {
		this.horariosMartes = horariosMartes;
	}


	public LinkedList<String> getHorariosMiercoles() {
		return horariosMiercoles;
	}


	public void setHorariosMiercoles(LinkedList<String> horariosMiercoles) {
		this.horariosMiercoles = horariosMiercoles;
	}


	public LinkedList<String> getHorariosJueves() {
		return horariosJueves;
	}


	public void setHorariosJueves(LinkedList<String> horariosJueves) {
		this.horariosJueves = horariosJueves;
	}


	public LinkedList<String> getHorariosViernes() {
		return horariosViernes;
	}


	public void setHorariosViernes(LinkedList<String> horariosViernes) {
		this.horariosViernes = horariosViernes;
	}
	
	
}
