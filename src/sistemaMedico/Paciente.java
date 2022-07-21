package sistemaMedico;

import java.util.LinkedList;

class Paciente 
{
	private String nombrePaciente;
	private String apellidoPaciente;
	private long dniPaciente;
	private String domicilioPaciente;
	private String telPaciente;
	private Fecha fechaNacPaciente;
	private LinkedList<Estudio> listaEstudiosPaciente = new LinkedList<Estudio>();
	private LinkedList<Receta> listaRecetasPaciente = new LinkedList<Receta>();
	private LinkedList<Turno> listaTurnosPaciente = new LinkedList<Turno>();


	//Constructor por defecto
	Paciente ()
	{
		this.nombrePaciente= null;
		this.apellidoPaciente= null;
		this.dniPaciente= 0;
		this.domicilioPaciente= null;
		this.telPaciente= null;
		this.fechaNacPaciente= new Fecha();
	}
	
	//Constructor
	Paciente (String nombrePaciente, String apellidoPaciente,long dniPaciente, 
			String domicilioPaciente, String telPaciente, Fecha fechaNacPaciente)
	{
		this.nombrePaciente= nombrePaciente;
		this.apellidoPaciente=apellidoPaciente;
		this.dniPaciente=dniPaciente;
		this.domicilioPaciente=domicilioPaciente;
		this.telPaciente=telPaciente;
		this.fechaNacPaciente=fechaNacPaciente;
	}
	
	public void cargarTurno(Turno turno)
	{
		listaTurnosPaciente.add(turno);
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getApellidoPaciente() {
		return apellidoPaciente;
	}

	public void setApellidoPaciente(String apellidoPaciente) {
		this.apellidoPaciente = apellidoPaciente;
	}

	public long getDniPaciente() {
		return dniPaciente;
	}

	public void setDniPaciente(long dniPaciente) {
		this.dniPaciente = dniPaciente;
	}

	public String getDomicilioPaciente() {
		return domicilioPaciente;
	}

	public void setDomicilioPaciente(String domicilioPaciente) {
		this.domicilioPaciente = domicilioPaciente;
	}

	public String getTelPaciente() {
		return telPaciente;
	}

	public void setTelPaciente(String telPaciente) {
		this.telPaciente = telPaciente;
	}

	public Fecha getFechaNacPaciente() {
		return fechaNacPaciente;
	}

	public void setFechaNacPaciente(Fecha fechaNacPaciente) {
		this.fechaNacPaciente = fechaNacPaciente;
	}


	public LinkedList<Estudio> getListaEstudiosPaciente() {
		return listaEstudiosPaciente;
	}

	public void setListaEstudiosPaciente(LinkedList<Estudio> listaEstudiosPaciente) {
		this.listaEstudiosPaciente = listaEstudiosPaciente;
	}

	public LinkedList<Receta> getListaRecetasPaciente() {
		return listaRecetasPaciente;
	}

	public void setListaRecetasPaciente(LinkedList<Receta> listaRecetasPaciente) {
		this.listaRecetasPaciente = listaRecetasPaciente;
	}
	public void agregarReceta(Receta receta) {
		this.listaRecetasPaciente.add(receta);
	}
	
	public void agregarEstudio(Estudio estudio) {
		this.listaEstudiosPaciente.add(estudio);
	}
}
