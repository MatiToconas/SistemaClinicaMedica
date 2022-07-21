package sistemaMedico;

import java.util.LinkedList;

class AdministradorDeSistema extends Empleado {

		private LinkedList<Especialidad> listaEspecialidades = new LinkedList<Especialidad>();
		private LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>();
	  
	  
	//constructor
		public AdministradorDeSistema(String nombreEmp, String apellEmp, long dniEmp, 
				String domicEmp, String telEmp,	Fecha fechaNacEmp) {
			super(nombreEmp, apellEmp, dniEmp, domicEmp, telEmp, fechaNacEmp);
		}
	
	//getter y setter

	public LinkedList<Especialidad> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(LinkedList<Especialidad> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}

	public LinkedList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(LinkedList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	//métodos

	public void altaEspecialidad(Especialidad nuevaEsp) {
		listaEspecialidades.add(nuevaEsp);
		nuevaEsp.cargarHorariosDias(nuevaEsp.getHorariosLunes());
		nuevaEsp.cargarHorariosDias(nuevaEsp.getHorariosMartes());
		nuevaEsp.cargarHorariosDias(nuevaEsp.getHorariosMiercoles());
		nuevaEsp.cargarHorariosDias(nuevaEsp.getHorariosJueves());
		nuevaEsp.cargarHorariosDias(nuevaEsp.getHorariosViernes());

		}
		
	public void altaDirector(Director director) {
		listaEmpleados.add(director);
		
	}
	
	public void altaAdministrativo(Administrativo administrativo) {		
		listaEmpleados.add(administrativo);
	}
	
	public void altaMedicoAtención(MedicoDeAtencion medicoAt){
		listaEmpleados.add(medicoAt);
	}
	
	public void altaMedicoCoordinador(MedicoCoordinador medCoord) {		
		listaEmpleados.add(medCoord);
	}
	
	public void altaAdministradorDeSistema(AdministradorDeSistema adminSist) {		
		listaEmpleados.add(adminSist);
	}
}
