package sistemaMedico;

import java.util.GregorianCalendar;

class Turno 
{
	
	private boolean asistencia;
	private Consultorio consultorioRef;
	private Especialidad especialidadRef;
	private Fecha fechaTurno;
	private Double  horaFinalTurno;
	private Double horaInicioTurno;
	private Paciente pacienteTurno;
	private MedicoDeAtencion medicoTurno;
	
	//Constructor por defecto.
	Turno()
	{
		this.fechaTurno=null;
		this.horaFinalTurno=null;
		this.horaInicioTurno=null;
		this.pacienteTurno=null;
		this.medicoTurno=null;
		this.especialidadRef=null;
		this.consultorioRef=null;
				
	}
	
	 
	//Turno Pacientes
	Turno(Fecha fechaTurno,
	Double horaFinalTurno, Double 
	horaInicioTurno,Paciente pacienteTurno,
	MedicoDeAtencion medicoTurno,Especialidad especialidadTurno,
	Consultorio  consultorioTurno)
	{
		this.fechaTurno=fechaTurno;
		this.horaFinalTurno=horaFinalTurno;
		this.horaInicioTurno=horaInicioTurno;
		this.pacienteTurno=pacienteTurno;
		this.medicoTurno=medicoTurno;
		this.especialidadRef=especialidadTurno;
		this.consultorioRef=consultorioTurno;
		
	}
	
	//Turno Consultorio
	Turno(Fecha fechaTurno,
	Double horaFinalTurno, Double 
	horaInicioTurno, Paciente pacienteTurno)
	{
		this.fechaTurno=fechaTurno;
		this.horaFinalTurno=horaFinalTurno;
		this.horaInicioTurno=horaInicioTurno;
		this.horaInicioTurno=horaInicioTurno;
		this.pacienteTurno=pacienteTurno;
		
	}

	//Setter
	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	public void setFechaTurno(Fecha fechaTurno) {
		this.fechaTurno = fechaTurno;
	}

	public void setHoraFinalTurno(Double horaFinalTurno) {
		this.horaFinalTurno = horaFinalTurno;
	}

	public void setHoraInicioTurno(Double horaInicioTurno) {
		this.horaInicioTurno = horaInicioTurno;
	}

	public void setPacienteTurno(Paciente pacienteTurno) {
		this.pacienteTurno = pacienteTurno;
	}

	public void setMedicoTurno(MedicoDeAtencion medicoTurno) {
		this.medicoTurno = medicoTurno;
	}
	
	//getter

	public boolean getAsistencia() {
		return asistencia;
	}

	public Fecha getFechaTurno() {
		return fechaTurno;
	}

	public Double getHoraFinalTurno() {
		return horaFinalTurno;
	}

	public Double getHoraInicioTurno() {
		return horaInicioTurno;
	}

	public Paciente getPacienteTurno() {
		return pacienteTurno;
	}

	public MedicoDeAtencion getMedicoTurno() {
		return medicoTurno;
	}
	
	//Referencias cruzadas a las dos clase relacionadas
	//Especialidad y Consultorio.
	
	public void setEspecialidadRef(Especialidad especialidadRef) {
		this.especialidadRef = especialidadRef;
	}
	
	public Especialidad getEspecialidadRef() {
		return especialidadRef;
	}

	public void setConsultorioRef(Consultorio consultorioRef) {
		this.consultorioRef = consultorioRef;
	}
	
	public Consultorio getConsultorioRef() {
		return consultorioRef;
	}
	 
}

