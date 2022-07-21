package sistemaMedico;

import java.util.GregorianCalendar;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MenuPrincipal {

	int opcion, dia = 0, mes = 0, anio = 0;
	String nombre, apellido, domicilio, telefono;
	long dni;
	GregorianCalendar fechaTurno, horaFinalTurno, horaInicioTurno;
	Paciente pacienteTurno;
	MedicoDeAtencion medicoTurno;
	Especialidad especialidadTurno;
	Consultorio consultorioTurno;
	Fecha fecha = new Fecha(dia, mes, anio);

	public void menuPrincipal() {
		Scanner dato = new Scanner(System.in);

		// Consultorios

		Consultorio consultorio1 = new Consultorio(1, 3, 3);
		Consultorio consultorio2 = new Consultorio(1, 3, 3);
		Consultorio consultorio3 = new Consultorio(1, 3, 3);
		Consultorio consultorio4 = new Consultorio(1, 3, 3);
		Consultorio consultorio5 = new Consultorio(1, 3, 3);
		Consultorio consultorio6 = new Consultorio(1, 3, 3);

		LinkedList<Consultorio> listaConsultorios = new LinkedList<Consultorio>();

		listaConsultorios.add(consultorio1);

		// Especialidad

		Especialidad ecografia = new Especialidad("Ecografia");
		Especialidad dermatologia = new Especialidad("Dermatología");
		Especialidad traumatologia = new Especialidad("Traumatología");

		// Empleados

		// Director
		Director director1 = new Director("Cristian", "Lopez", 21232343, "Santa Fe", "11121212211",
				new Fecha(4, 7, 1976));

		// Medico de atencion.

		MedicoDeAtencion medico1 = new MedicoDeAtencion("Carlos", "Gonzales", 2121232343, "Moreno", "11232343454",
				new Fecha(23, 6, 1957), consultorio1, ecografia);

		MedicoDeAtencion medico2 = new MedicoDeAtencion("Jose", "Fuentes", 2121232343, "Escobar", "1123675424",
				new Fecha(30, 6, 1970), consultorio2, dermatologia);

		MedicoDeAtencion medico3 = new MedicoDeAtencion("Francisco", "Demeco", 2121232343, "Pilar", "1156821578",
				new Fecha(3, 4, 1982), consultorio3, traumatologia);

		// Prestaciones

		Prestacion prestacion1 = new Prestacion(new Fecha(16, 11, 2020), medico1, "Ultrasonido", 1);

		Prestacion prestacion2 = new Prestacion(new Fecha(16, 11, 2020), medico2, "AnalisisDeSangre", 1);

		Prestacion prestacion3 = new Prestacion(new Fecha(16, 11, 2020), medico3, "RayosX", 1);

		// Areas medicas.
		AreaMedica urgencias = new AreaMedica(3, "Urgencias", 3);
		AreaMedica cuidadoIntensivo = new AreaMedica(3, "CuidadoIntensivo", 3);
		AreaMedica cardiologia = new AreaMedica(3, "Cardiologia", 3);

		// Medico coordinador

		MedicoCoordinador medicoCoordinador1 = new MedicoCoordinador("Pedro", "Sandoval", 212323454, "LaPlata",
				"112465774", new Fecha(3, 5, 1977), consultorio4, ecografia, cardiologia);

		MedicoCoordinador medicoCoordinador2 = new MedicoCoordinador("Braian", "Terra", 2086323454, "Cordoba",
				"157546363", new Fecha(7, 12, 1985), consultorio5, dermatologia, cuidadoIntensivo);

		MedicoCoordinador medicoCoordinador3 = new MedicoCoordinador("Rocio", "Teghy", 222323753, "VictorinoLaPlaza",
				"114668356", new Fecha(3, 1, 1979), consultorio6, traumatologia, urgencias);

		// administrador de sistema
		AdministradorDeSistema administradorDeSistema1 = new AdministradorDeSistema("Juan", "Cardendas", 121212143,
				"Moreno", "1121232323", new Fecha(2, 3, 1955));

		administradorDeSistema1.altaEspecialidad(ecografia);
		administradorDeSistema1.altaEspecialidad(dermatologia);
		administradorDeSistema1.altaEspecialidad(traumatologia);

		administradorDeSistema1.altaDirector(director1);
		administradorDeSistema1.altaMedicoAtención(medico1);
		administradorDeSistema1.altaMedicoAtención(medico2);
		administradorDeSistema1.altaMedicoAtención(medico3);
		administradorDeSistema1.altaMedicoCoordinador(medicoCoordinador1);
		administradorDeSistema1.altaMedicoCoordinador(medicoCoordinador2);
		administradorDeSistema1.altaMedicoCoordinador(medicoCoordinador3);

		// Cobertura.
		Cobertura cobertura1 = new Cobertura("Ospe", "ObraSocial");
		Cobertura cobertura2 = new Cobertura("Galeno", "Prepaga");
		Cobertura cobertura3 = new Cobertura("Particular", "SinCobertura");

		// Pacientes
		Paciente paciente1 = new Paciente("Ariel", "Paez", 38068162, "Jose C. Paz", "1123234546575",
				new Fecha(2, 7, 1995));

		Paciente paciente2 = new Paciente("Pedro", "Perez", 212232343, "Moreno", "112323256467",
				new Fecha(26, 7, 1998));

		Paciente paciente3 = new Paciente("Critian", "Rojas", 121232435, "General Rodriguez", "2323243453456",
				new Fecha(26, 7, 1993));

		Paciente paciente4 = new Paciente("Gissele", "Galen", 212232345, "San Miguel", "2323243453456",
				new Fecha(2, 4, 1998));

		// Turnos consultorio
		Turno turnoConsultorio1 = new Turno(new Fecha(16, 11, 2020), 08.30, 08.00, paciente1, medico1, ecografia,
				consultorio1);

		// Turnos Laboratorio
		Turno turnoLaboratorio1 = new Turno(new Fecha(17, 11, 2020), 08.30, 08.00, paciente2);

		// Laboratorio

		Laboratorio labolatorio1 = new Laboratorio();

		LinkedList<Laboratorio> listaLaboratorios = new LinkedList<Laboratorio>();

		listaLaboratorios.add(labolatorio1);

		// Administrativo
		Administrativo administrativo1 = new Administrativo("David", "Acevedo", 38765312, "Pilar", "1153469778",
				new Fecha(14, 5, 1994));

		administradorDeSistema1.altaAdministrativo(administrativo1);

		administrativo1.agregarCobertura(cobertura1);
		administrativo1.agregarCobertura(cobertura2);
		administrativo1.agregarCobertura(cobertura3);

		administrativo1.registrarPaciente(paciente1);
		administrativo1.registrarPaciente(paciente2);
		administrativo1.registrarPaciente(paciente3);
		administrativo1.registrarPaciente(paciente4);

		administrativo1.asignarTurnoConsultorio(turnoConsultorio1, paciente1, medico1);
		administrativo1.asignarTurnoLaboratorio(turnoLaboratorio1, paciente2);

		administrativo1.agregarPrestacion(prestacion1);
		administrativo1.agregarPrestacion(prestacion2);
		administrativo1.agregarPrestacion(prestacion3);

		boolean banderaPpal = false;
		do {

			banderaPpal = false;
			System.out.println("");
			System.out.println("BIENVENIDO AL SISTEMA MEDICO");
			System.out.println("=============================");

			System.out.println("");
			System.out.println("¿Que tipo de empledo es?");
			System.out.println("================");

			System.out.println("01. Administrativo ");
			System.out.println("02. Medico");
			System.out.println("03. Administrador de Sistemas ");
			System.out.println("04. Salir ");
			System.out.println();

			System.out.print("Introduce un numero: ");
			opcion = dato.nextInt();

			switch (opcion) {

			case 1:

				boolean banderaAdministrativo = false;
				do {

					banderaAdministrativo = false;

					System.out.println("");
					System.out.println("MENU DE OPCIONES ADMINISTRATIVO");
					System.out.println("================");

					System.out.println("01. Registrar paciente ");
					System.out.println("02. Consultar prestaciones");
					System.out.println("03. Consultar coberturas");
					System.out.println("04. Consultar especialidades ");
					System.out.println("05. Ver Turnos Disponibles ");
					System.out.println("06. Consultar historial de turnos ");
					System.out.println("07. Salir");
					System.out.println();

					System.out.print("Introduce un numero: ");
					opcion = dato.nextInt();

					switch (opcion) {

					case 1:
						System.out.println("\nREGISTRO DE PACIENTE ");
						System.out.println("=======================");

						long ban;
						do {
							try {

								ban = 0;

								System.out.print("Ingrese DNI:");
								dni = dato.nextLong();

							} catch (InputMismatchException a) {
								System.out.println("CARACTER NO VALIDO! POR FAVOR REINGRESE SOLO NUMEROS");

								ban = 1;
								dato.next();
							}
						} while (ban != 0);

						System.out.print("Ingrese Nombre:");
						nombre = dato.next();

						System.out.print("Ingrese Apellido:");
						apellido = dato.next();

						System.out.print("Ingrese Domicilio:");
						domicilio = dato.next();

						System.out.print("Ingrese Teléfono:");
						telefono = dato.next();

						int ban1;
						do {
							try {

								ban1 = 0;

								System.out.println("Vamos a ingresar la fecha de nacimiento:");
								System.out.print("Ingrese dia: ");
								dia = dato.nextInt();

							} catch (InputMismatchException a) {
								System.out.println("CARACTER NO VALIDO! POR FAVOR REINGRESE SOLO NUMEROS");

								ban1 = 1;
								dato.next();
							}

						} while (ban1 != 0);

						int ban2;
						do {
							try {

								ban2 = 0;

								System.out.print("Ingrese mes: ");
								mes = dato.nextInt();

							} catch (InputMismatchException a) {
								System.out.println("CARACTER NO VALIDO! POR FAVOR REINGRESE SOLO NUMEROS");

								ban2 = 1;
								dato.next();
							}

						} while (ban2 != 0);

						int ban3;
						do {
							try {

								ban3 = 0;

								System.out.print("Ingrese año: ");
								anio = dato.nextInt();

							} catch (InputMismatchException a) {
								System.out.println("CARACTER NO VALIDO! POR FAVOR REINGRESE SOLO NUMEROS");

								ban3 = 1;
								dato.next();
							}

						} while (ban3 != 0);

						Paciente nuevoPaciente = new Paciente(nombre, apellido, dni, domicilio, telefono, fecha);
						administrativo1.registrarPaciente(nuevoPaciente);

						System.out.println("\n¡PACIENTE REGISTADO CORRECTAMENTE!\n");

						System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
						System.out.println("\n 1.SI.");
						System.out.println("\n 2.NO.");
						System.out.println("");
						System.out.print("Ingrese Opción: ");
						int s = dato.nextInt();

						try {
							switch (s) {
							case 1:
								banderaAdministrativo = true;
								break;
							case 2:
								banderaAdministrativo = false;
								break;
							default:
								throw new Exception("La opción ingresada es incorrecta.");
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							break;
						}

						break;

					case 2:
						System.out.println("\n Seleccionó ver Prestaciones Vigentes...");
						System.out.println("\n Las prestaciones vigentes son: ");

						administrativo1.mostrarPrestacionesVigentes();

						System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
						System.out.println("\n 1.SI.");
						System.out.println("\n 2.NO.");
						System.out.println("");
						System.out.print("Ingrese Opción: ");
						s = dato.nextInt();

						try {
							switch (s) {
							case 1:
								banderaAdministrativo = true;
								break;
							case 2:
								banderaAdministrativo = false;
								break;
							default:
								throw new Exception("La opción ingresada es incorrecta.");
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							break;
						}
						break;

					case 3:
						System.out.println("\n Seleccionó ver Coberturas Vigentes...");
						System.out.println("\n Las coberturas vigentes son: ");

						administrativo1.mostrarCoberturasVigentes();

						System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
						System.out.println("\n 1.SI.");
						System.out.println("\n 2.NO.");
						System.out.println("");
						System.out.print("Ingrese Opción: ");
						s = dato.nextInt();

						try {
							switch (s) {
							case 1:
								banderaAdministrativo = true;
								break;
							case 2:
								banderaAdministrativo = false;
								break;
							default:
								throw new Exception("La opción ingresada es incorrecta.");
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							break;
						}
						break;

					case 4:
						System.out.println("\n Seleccionó consultar especialidades...");
						System.out.println("\n Las especialidades son: ");

						administrativo1.consultarEspecialidades(administradorDeSistema1.getListaEspecialidades());

						System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
						System.out.println("\n 1.SI.");
						System.out.println("\n 2.NO.");
						System.out.println("");
						System.out.print("Ingrese Opción: ");
						s = dato.nextInt();

						try {
							switch (s) {
							case 1:
								banderaAdministrativo = true;
								break;
							case 2:
								banderaAdministrativo = false;
								break;
							default:
								throw new Exception("La opción ingresada es incorrecta.");
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							break;
						}

						break;

					case 5:
						System.out.println("\n Seleccionó ver turnos disponibles");
						System.out.println("\n Seleccione la especialidad: ");

						System.out.println("01. Ecografía, Dr. Gonzales ");
						System.out.println("02. Dermatología, Dr. Fuentes ");
						System.out.println("03. Traumatología, Dr. Demeco ");
						System.out.println("04. Salir ");
						System.out.println();

						System.out.print("Introduce un numero: ");
						opcion = dato.nextInt();

						switch (opcion) {
						case 1:
							System.out.println("Seleccione la fecha deseada: \n");
							System.out.println("1.Lunes 23.11.2020 ");
							System.out.println("2.Martes 24.11.2020 ");
							System.out.println("3.Miércoles 25.11.2020 ");
							System.out.println("4.Jueves 26.11.2020 ");
							System.out.println("5.Viernes 27.11.2020 ");
							System.out.println("6.Volver atrás ");
							System.out.print("Introduce un numero: ");
							opcion = dato.nextInt();

							switch (opcion) {
							case 1:
								System.out.println("Turnos disponibles Lunes 23.11.2020 ");
								ecografia.mostrarListaHorarios(ecografia.getHorariosLunes());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									ecografia.getHorariosLunes().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico1, ecografia, consultorio1);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico1);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;

							case 2:
								System.out.println("Turnos disponibles Martes 24.11.2020 ");
								ecografia.mostrarListaHorarios(ecografia.getHorariosMartes());
								
								
								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									ecografia.getHorariosMartes().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico1, ecografia, consultorio1);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico1);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 3:
								System.out.println("Turnos disponibles Miércoles 25.11.2020 ");
								ecografia.mostrarListaHorarios(ecografia.getHorariosMiercoles());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									ecografia.getHorariosMiercoles().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico1, ecografia, consultorio1);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico1);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 4:
								System.out.println("Turnos disponibles Jueves 26.11.2020 ");
								ecografia.mostrarListaHorarios(ecografia.getHorariosJueves());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									ecografia.getHorariosJueves().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico1, ecografia, consultorio1);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico1);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 5:
								System.out.println("Turnos disponibles Viernes 27.11.2020 ");
								ecografia.mostrarListaHorarios(ecografia.getHorariosViernes());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									ecografia.getHorariosViernes().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico1, ecografia, consultorio1);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico1);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								
								break;
							}
							break;
						case 2:
							System.out.println("Seleccione la fecha deseada: \n");

							System.out.println("1.Lunes 23.11.2020 ");
							System.out.println("2.Martes 24.11.2020 ");
							System.out.println("3.Miércoles 25.11.2020 ");
							System.out.println("4.Jueves 26.11.2020 ");
							System.out.println("5.Viernes 27.11.2020 ");
							System.out.println("6.Volver atrás ");

							System.out.print("Introduce un numero: ");
							opcion = dato.nextInt();

							switch (opcion) {
							case 1:
								System.out.println("Turnos disponibles Lunes 23.11.2020 ");
								dermatologia.mostrarListaHorarios(dermatologia.getHorariosLunes());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									dermatologia.getHorariosLunes().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico2, dermatologia, consultorio2);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico2);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 2:
								System.out.println("Turnos disponibles Martes 24.11.2020 ");
								dermatologia.mostrarListaHorarios(dermatologia.getHorariosMartes());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									dermatologia.getHorariosMartes().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico2, dermatologia, consultorio2);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico2);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 3:
								System.out.println("Turnos disponibles Miércoles 25.11.2020 ");
								dermatologia.mostrarListaHorarios(dermatologia.getHorariosMiercoles());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									dermatologia.getHorariosMiercoles().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico2, dermatologia, consultorio2);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico2);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 4:
								System.out.println("Turnos disponibles Jueves 26.11.2020 ");
								dermatologia.mostrarListaHorarios(dermatologia.getHorariosJueves());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									dermatologia.getHorariosJueves().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico2, dermatologia, consultorio2);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico2);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 5:
								System.out.println("Turnos disponibles Viernes 27.11.2020 ");
								dermatologia.mostrarListaHorarios(dermatologia.getHorariosViernes());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									dermatologia.getHorariosViernes().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico2, dermatologia, consultorio2);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico2);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							}

							break;
						case 3:
							System.out.println("Seleccione la fecha deseada: \n");

							System.out.println("1.Lunes 23.11.2020 ");
							System.out.println("2.Martes 24.11.2020 ");
							System.out.println("3.Miércoles 25.11.2020 ");
							System.out.println("4.Jueves 26.11.2020 ");
							System.out.println("5.Viernes 27.11.2020 ");
							System.out.println("6.Volver atrás ");

							System.out.print("Introduce un numero: ");
							opcion = dato.nextInt();

							switch (opcion) {
							case 1:
								System.out.println("Turnos disponibles Lunes 23.11.2020 ");
								traumatologia.mostrarListaHorarios(traumatologia.getHorariosLunes());
								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									traumatologia.getHorariosLunes().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico3, traumatologia, consultorio3);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico3);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 2:
								System.out.println("Turnos disponibles Martes 24.11.2020 ");
								traumatologia.mostrarListaHorarios(traumatologia.getHorariosMartes());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									traumatologia.getHorariosMartes().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico3, traumatologia, consultorio3);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico3);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 3:
								System.out.println("Turnos disponibles Miércoles 25.11.2020 ");
								traumatologia.mostrarListaHorarios(traumatologia.getHorariosMiercoles());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									traumatologia.getHorariosMiercoles().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico3, traumatologia, consultorio3);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico3);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 4:
								System.out.println("Turnos disponibles Jueves 26.11.2020 ");
								traumatologia.mostrarListaHorarios(traumatologia.getHorariosJueves());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									traumatologia.getHorariosJueves().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico3, traumatologia, consultorio3);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico3);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							case 5:
								System.out.println("Turnos disponibles Viernes 27.11.2020 ");
								traumatologia.mostrarListaHorarios(traumatologia.getHorariosViernes());

								System.out.print("Seleccione una opción, o presione 8 para salir: ");
								opcion = dato.nextInt();
								switch (opcion) {
								case 0:
								case 1:
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
									traumatologia.getHorariosViernes().remove(opcion);

									System.out.print("Ingrese DNI del paciente: ");
									dni = dato.nextLong();
									Paciente quiereTurno = administrativo1.buscarPaciente(dni);
									if (quiereTurno == null)
										System.out.print(
												"El paciente no se encuentre Registrado, no se puede asignar un turno.");
								
									else {
										System.out.print(
												"Generando turno para paciente: " + quiereTurno.getApellidoPaciente());

										System.out.println("Ingrese la fecha del turno:");

										System.out.print("Ingrese dia: ");
										dia = dato.nextInt();
										System.out.print("Ingrese mes: ");
										mes = dato.nextInt();
										System.out.print("Ingrese año: ");
										anio = dato.nextInt();

										Fecha fechaTurno = new Fecha(dia, mes, anio);

										System.out.print("Ingrese HoraInicio: ");
										Double horaInicio = dato.nextDouble();

										System.out.print("Ingrese HoraFin: ");
										Double horaFin = dato.nextDouble();

										Turno nuevoTurno = new Turno(fechaTurno, horaFin, horaInicio, quiereTurno,
												medico3, traumatologia, consultorio3);

										administrativo1.asignarTurnoConsultorio(nuevoTurno, quiereTurno, medico3);

										System.out.println("El turno fue asignado correctamente.");
									}

									System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
									System.out.println("\n 1.SI.");
									System.out.println("\n 2.NO.");
									System.out.println("");
									System.out.print("Ingrese Opción: ");
									s = dato.nextInt();

									try {
										switch (s) {
										case 1:
											banderaAdministrativo = true;
											break;
										case 2:
											banderaAdministrativo = false;
											break;
										default:
											throw new Exception("La opción ingresada es incorrecta.");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										break;
									}

									break;
								case 8:
									System.out.println("Saliendo...");
									break;
								default:
									System.out.println("La opcion ingresada es incorrecta");
									break;
								}

								break;
							}

							break;
						case 4:
							System.out.println("Saliendo...");
							break;
						default:
							System.out.println("La opción ingresada es incorrecta ");
							break;

						}

						break;

					case 6:
						System.out.println("\n Seleccionó consultar Historial de Turnos \n");
						administrativo1.consultarTurno();

						System.out.println("\n¿Desea realizar otra operacion de Administrativo?");
						System.out.println("\n 1.SI.");
						System.out.println("\n 2.NO.");
						System.out.println("");
						System.out.print("Ingrese Opción: ");
						s = dato.nextInt();

						try {
							switch (s) {
							case 1:
								banderaAdministrativo = true;
								break;
							case 2:
								banderaAdministrativo = false;
								break;
							default:
								throw new Exception("La opción ingresada es incorrecta.");
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							break;
						}
						break;

					case 7:
						System.out.println("¡¡Hasta Luego!!");
						break;

					default:
						System.out.println("La opción ingresada es inválida. Digite nuevamente por favor");
					}
				} while (banderaAdministrativo);
				break;

			case 2:

				boolean banderamedico = false;
				do {

					banderamedico = false;
					System.out.println("");
					System.out.println("MENU DE OPCIONES MEDICO");
					System.out.println("================");

					System.out.println("01. Control Asistencia ");
					System.out.println("02. Cargar Estudio ");
					System.out.println("03. Cargar Receta");
					System.out.println("04. Salir");
					System.out.println();

					System.out.print("Introduce un numero: ");
					opcion = dato.nextInt();

					switch (opcion) {
					case 1:
						// carga.cargarAsistencia(turnoConsultorio1);

						System.out.println("\n¿Desea realizar otra operacion de Medico?");
						System.out.println("\n 1.SI.");
						System.out.println("\n 2.NO.");
						System.out.println("");
						System.out.print("Ingrese Opción: ");
						int s = dato.nextInt();

						try {
							switch (s) {
							case 1:
								banderamedico = true;
								break;
							case 2:
								banderamedico = false;
								break;
							default:
								throw new Exception("La opción ingresada es incorrecta.");
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							break;
						}
						break;

					case 2:
						// carga.cargarEstudio(new Paciente(), new Estudio());
						System.out.println("\n¿Desea realizar otra operacion de Medico?");
						System.out.println("\n 1.SI.");
						System.out.println("\n 2.NO.");
						System.out.println("");
						System.out.print("Ingrese Opción: ");
						s = dato.nextInt();

						try {
							switch (s) {
							case 1:
								banderamedico = true;
								break;
							case 2:
								banderamedico = false;
								break;
							default:
								throw new Exception("La opción ingresada es incorrecta.");
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							break;
						}

						break;

					case 3:
						// carga.asignarReceta(paciente, descripcionReceta, fechaReceta);
						System.out.println("\n¿Desea realizar otra operacion de Medico?");
						System.out.println("\n 1.SI.");
						System.out.println("\n 2.NO.");
						System.out.println("");
						System.out.print("Ingrese Opción: ");
						s = dato.nextInt();

						try {
							switch (s) {
							case 1:
								banderamedico = true;
								break;
							case 2:
								banderamedico = false;
								break;
							default:
								throw new Exception("La opción ingresada es incorrecta.");
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							break;
						}
						break;

					case 4:

						System.out.println("¡¡Hasta Luego!!");
						break;

					default:
						System.out.println("La opción ingresada es inválida. Digite nuevamente por favor");
					}
				} while (banderamedico);

				break;

			case 3:

				boolean banderaadministrador = false;
				do {

					banderaadministrador = false;
					System.out.println("");
					System.out.println("MENU DE OPCIONES ADMINISTRADOR DE SISTEMAS");
					System.out.println("==========================================");

					System.out.println("01. Alta Empleado ");
					System.out.println("02. Alta Especialidad ");
					System.out.println("03. Salir");
					System.out.println();

					System.out.print("Introduce un numero: ");
					opcion = dato.nextInt();

					switch (opcion) {
					case 1:

						System.out.println("");
						System.out.println("MENU ALTA EMPLEADO");
						System.out.println("==========================================");

						System.out.println("01. Alta director ");
						System.out.println("02. Alta administrativo ");
						System.out.println("03. Alta Medico Coordinador");
						System.out.println("04. Alta Medico Atencion");
						System.out.println("05. Alta Administrado de Sistemas ");
						System.out.println("06. Salir");
						System.out.println();

						System.out.print("Introduce un numero: ");
						opcion = dato.nextInt();

						switch (opcion) {
						case 1:

							break;

						case 2:
							break;

						case 3:
							break;

						case 4:
							break;

						case 5:
							break;

						case 6:

							break;

						default:
							System.out.println("La opción ingresada es inválida. Digite nuevamente por favor");
						}

						break;

					case 2:

						System.out.println("\n¿Desea realizar otra operacion de Administrador De Sistema?");
						System.out.println("\n 1.SI.");
						System.out.println("\n 2.NO.");
						System.out.println("");
						System.out.print("Ingrese Opción: ");
						int s = dato.nextInt();

						try {
							switch (s) {
							case 1:
								banderaadministrador = true;
								break;
							case 2:
								banderaadministrador = false;
								break;
							default:
								throw new Exception("La opción ingresada es incorrecta.");
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
							break;
						}
						break;

					case 3:

						System.out.println("¡¡Hasta Luego!!");
						break;

					default:
						System.out.println("La opción ingresada es inválida. Digite nuevamente por favor");
					}
				} while (banderaadministrador);

				break;

			case 4:
				System.out.println("¡¡Hasta Luego!!");
				break;

			default:
				System.out.println("La opción ingresada es inválida. Digite nuevamente por favor");

			}

		} while (opcion < 4 || banderaPpal);
	}
}
