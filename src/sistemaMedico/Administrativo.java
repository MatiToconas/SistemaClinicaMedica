package sistemaMedico;

import java.util.GregorianCalendar;
import java.util.LinkedList;

class Administrativo extends Empleado {

	private LinkedList<Cobertura> listaCoberturas = new LinkedList<Cobertura>();
	private LinkedList<Prestacion> listaPrestaciones = new LinkedList<Prestacion>();
	private LinkedList<Paciente> listaPacientes = new LinkedList<Paciente>();
	private LinkedList<Turno> listaTurnosConsultorio = new LinkedList<Turno>();
	private LinkedList<Turno> listaTurnosLaboratorio = new LinkedList<Turno>();
	private LinkedList<Turno> listaSobreturnos = new LinkedList<Turno>();

	// constructor
	public Administrativo(String nombreEmp, String apellEmp, long dniEmp, String domicEmp, String telEmp,
			Fecha fechaNacEmp) {
		super(nombreEmp, apellEmp, dniEmp, domicEmp, telEmp, fechaNacEmp);
	}

	// getter y setter

	public LinkedList<Cobertura> getListaCoberturas() {
		return listaCoberturas;
	}

	public void setListaCoberturas(LinkedList<Cobertura> listaCoberturas) {
		this.listaCoberturas = listaCoberturas;
	}

	public LinkedList<Prestacion> getListaPrestaciones() {
		return listaPrestaciones;
	}

	public void setListaPrestaciones(LinkedList<Prestacion> listaPrestaciones) {
		this.listaPrestaciones = listaPrestaciones;
	}

	public LinkedList<Paciente> getListaPacientes() {
		return listaPacientes;
	}

	public void setListaPacientes(LinkedList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}

	public LinkedList<Turno> getListaTurnosConsultorio() {
		return listaTurnosConsultorio;
	}

	public void setListaTurnosConsultorio(LinkedList<Turno> listaTurnosConsultorio) {
		this.listaTurnosConsultorio = listaTurnosConsultorio;
	}

	public LinkedList<Turno> getListaTurnosLaboratorio() {
		return listaTurnosLaboratorio;
	}

	public void setListaTurnosLaboratorio(LinkedList<Turno> listaTurnosLaboratorio) {
		this.listaTurnosLaboratorio = listaTurnosLaboratorio;
	}

	public LinkedList<Turno> getListaSobreturnos() {
		return listaSobreturnos;
	}

	public void setListaSobreturnos(LinkedList<Turno> listaSobreturnos) {
		this.listaSobreturnos = listaSobreturnos;
	}

	// métodos
	public void brindarSobreTurno(Turno sobreturno, Paciente paciente) {
		listaSobreturnos.add(sobreturno);
		paciente.cargarTurno(sobreturno);
	}

	public void consultarEspecialidades(LinkedList<Especialidad> listaEspecialidades) {
		for (Especialidad obj : listaEspecialidades) {
			System.out.println(obj.getNombreEspecialidad());
		}
	}

	public void mostrarCoberturasVigentes() {
		for (Cobertura obj : listaCoberturas) {
			System.out.println(obj.getNombre());
		}
	}

	public void mostrarPrestacionesVigentes() {
		for (Prestacion obj : listaPrestaciones) {
			System.out.println(obj.getTipoPrestacion());
		}
	}

	public void consultarTurno() {

		System.out.println("Mostrando Turnos de Consultorio: ");
		for (Turno obj : listaTurnosConsultorio) {
			System.out.println(obj.getPacienteTurno().getApellidoPaciente());
			System.out.println(obj.getPacienteTurno().getNombrePaciente());
			System.out.println(obj.getPacienteTurno().getDniPaciente());
			System.out.println(obj.getEspecialidadRef().getNombreEspecialidad());
			System.out.println(obj.getMedicoTurno().getApellidoEmpleado());
			System.out.println(obj.getMedicoTurno().getNombreEmpleado());
			System.out.println(obj.getConsultorioRef().getNumeroConsultorio());
			System.out.println(obj.getFechaTurno().toString());
			System.out.println(obj.getHoraInicioTurno());
			System.out.println(obj.getHoraFinalTurno());
		}

		System.out.println("Mostrando Turnos de Laboratorio: ");
		for (Turno obj : listaTurnosLaboratorio) {
			System.out.println(obj.getPacienteTurno().getApellidoPaciente());
			System.out.println(obj.getPacienteTurno().getNombrePaciente());
			System.out.println(obj.getFechaTurno().toString());
			System.out.println(obj.getHoraInicioTurno());
			System.out.println(obj.getHoraFinalTurno());
		}

		System.out.println("Mostrando SobreTurnos: ");
		for (Turno obj : listaSobreturnos) {
			System.out.println(obj.getPacienteTurno().getApellidoPaciente());
			System.out.println(obj.getPacienteTurno().getNombrePaciente());
			System.out.println(obj.getPacienteTurno().getDniPaciente());
			System.out.println(obj.getEspecialidadRef().getNombreEspecialidad());
			System.out.println(obj.getMedicoTurno().getApellidoEmpleado());
			System.out.println(obj.getMedicoTurno().getNombreEmpleado());
			System.out.println(obj.getConsultorioRef().getNumeroConsultorio());
			System.out.println(obj.getFechaTurno().toString());
			System.out.println(obj.getHoraInicioTurno());
			System.out.println(obj.getHoraFinalTurno());
		}
	}

	public void registrarPaciente(Paciente paciente) {
		listaPacientes.add(paciente);
	}

	public void asignarTurnoConsultorio(Turno turno, Paciente paciente, MedicoDeAtencion medico) {
		listaTurnosConsultorio.add(turno);
		paciente.cargarTurno(turno);
		medico.agregarTurno(turno);
	}

	public void asignarTurnoLaboratorio(Turno turno, Paciente paciente) {
		listaTurnosLaboratorio.add(turno);
		paciente.cargarTurno(turno);
	}

	public void cobrarPrestación(Pago pago, Cobertura cobertura, Prestacion prestacion) {
		cobertura.cargarPago(pago);
		prestacion.setPago(pago);
	}

	public void agregarCobertura(Cobertura cobertura) {
		listaCoberturas.add(cobertura);
	}

	public void agregarPrestacion(Prestacion prestacion) {
		listaPrestaciones.add(prestacion);
	}

	public Paciente buscarPaciente(long dni) {
		Paciente encontrado = null;
		for (Paciente obj : listaPacientes) {
			if (obj.getDniPaciente() == dni)
				encontrado = obj;
		}
		return encontrado;
	}

}
