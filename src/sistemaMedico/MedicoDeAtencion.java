package sistemaMedico;

import java.util.LinkedList;

class MedicoDeAtencion extends Empleado {

	private Consultorio consultorioMedico;
	private Especialidad especialidadMedico;
	private LinkedList<Turno> listaTurnos = new LinkedList<Turno>(); 
	private LinkedList<Estudio> listaEstudios = new LinkedList<Estudio>();
	
	//constructor
	MedicoDeAtencion(String nombreEmp, String apellEmp,long dniEmp, String domicEmp, 
			String telEmp, Fecha fechaNacEmp,Consultorio consultorio, Especialidad especialidad){
	super(nombreEmp,apellEmp,dniEmp,domicEmp, telEmp, fechaNacEmp);	
	this.consultorioMedico= consultorio;
	this.especialidadMedico= especialidad;
	}
	
	// getters y setters 
	public Consultorio getConsultorioMedico() {
		return consultorioMedico;
	}

	public void setConsultorioMedico(Consultorio consultorioMedico) {
		this.consultorioMedico = consultorioMedico;
	}

	public Especialidad getEspecialidadMedico() {
		return especialidadMedico;
	}

	public void setEspecialidadMedico(Especialidad especialidadMedico) {
		this.especialidadMedico = especialidadMedico;
	}
	

	public LinkedList<Turno> getListaTurnos() {
		return listaTurnos;
	}

	public void setListaTurnos(LinkedList<Turno> listaTurnos) {
		this.listaTurnos = listaTurnos;
	}

	public LinkedList<Estudio> getListaEstudios() {
		return listaEstudios;
	}

	public void setListaEstudios(LinkedList<Estudio> listaEstudios) {
		this.listaEstudios = listaEstudios;
	}

	public void asignarReceta(Paciente paciente, String descripcionReceta, Fecha fechaReceta) {
		Receta receta= new Receta(this.apellidoEmpleado,paciente.getApellidoPaciente(),descripcionReceta,fechaReceta, this.nombreEmpleado,paciente.getNombrePaciente());
		paciente.agregarReceta(receta);
	}
	
	public void cargarAsistencia(Turno turno) {
		turno.setAsistencia(true);
	}
	
	public void cargarInasistencia(Turno turno) {
		turno.setAsistencia(false);
	}
	
	public void cargarEstudio(Paciente paciente, Estudio estudio) {
		listaEstudios.add(estudio);
		paciente.agregarEstudio(estudio);
	}
	
	public void agregarTurno(Turno turno) {
		listaTurnos.add(turno);
	}
	
}
