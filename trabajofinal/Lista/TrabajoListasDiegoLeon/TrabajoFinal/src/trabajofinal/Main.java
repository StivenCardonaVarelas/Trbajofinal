package trabajofinal;

import java.util.Scanner;
import trabajofinal.Lista.ListaSimple;
import trabajofinal.Lista.ListaSimple2;

public class Main {

    public static void main(String[] args) {

        boolean valido = false;

        String nombreDirectivo = "";
        String documentoDirectivo = "";
        String sexoDirectivo = "";
        String especializacion = "";
        String tipoContrato = "";

        String tipoCargo = "";

        Scanner lector = new Scanner(System.in);

//------------------------------------------------------------------------------------------
        System.out.println("Seleccione (1) registrar un estudiante o (2) si quiere registrar un directivo: ");
        int seleccion = Integer.parseInt(lector.nextLine());

        if (seleccion == 1) {
            ListaSimple lista = new ListaSimple();
            ListaSimple2 lista2 = new ListaSimple2();

            String nivelCeguera = "";
            String causaCeguera = "";
            String nombreDvisual = "";
            String documentoDvisual = "";
            String sexoDvisual = "";
            int codHorario = 0;

            String nivelDauditiva = "";
            String causaDauditiva = "";
            String nombreDauditiva = "";
            String documentoDauditiva = "";
            String sexoDauditiva = "";

            boolean sesion = true;

            while (sesion == true) {

                System.out.println("Digite (1) para ingresar a la sección de estudiantes con discapacidad visual: ");
                System.out.println("Digite (2) para ingresar a la sección de estudiantes con discapacidad auditiva: ");
                System.out.println("Digite (3) para ingresar a la lista de todos los estudiantes registrados: ");
                System.out.println("Digite (4) para terminar proceso: ");
                int eleccion = Integer.parseInt(lector.nextLine());

                if (eleccion == 1) {

                    boolean sesion1 = true;

                    while (sesion1) {

                        System.out.println("Digite (1) si quiere registrar estudiante");
                        System.out.println("Digite (2) si quiere buscar estudiante");
                        System.out.println("Digite (3) si quiere ver lista de estudiantes");
                        System.out.println("Digite (4) si quiere destruir la lista");
                        System.out.println("Digite (5) para salir");
                        int opcion = Integer.parseInt(lector.nextLine());

                        if (opcion == 1) {
                            System.out.println("\nDigite el nombre del estudiante ");
                            nombreDvisual = lector.nextLine();

                            System.out.println("Digite el documento del estudiante ");
                            documentoDvisual = lector.nextLine();

                            while (valido == false) {
                                System.out.println("Digite (1) si el sexo del estudiante es masculino, sino marque (2)");
                                int Sexo = Integer.parseInt(lector.nextLine());
                                if (Sexo == 1) {
                                    sexoDvisual = "Masculino";
                                    valido = true;
                                } else if (Sexo == 2) {
                                    sexoDvisual = "femenino";
                                    valido = true;
                                } else {
                                    System.err.println("*** Valor incorrecto ****");
                                }
                            }

                            valido = false;

                            while (valido == false) {
                                System.out.println("Digite la letra que indique la causa de la ceguera del estudiante");
                                System.out.println("1) nacimiento \n2) accidente \n3) enfermedad");
                                int CausaCeguera = Integer.parseInt(lector.nextLine());
                                if (CausaCeguera == 1) {
                                    causaCeguera = "nacimiento";
                                    valido = true;
                                } else if (CausaCeguera == 2) {
                                    causaCeguera = "accidente";
                                    valido = true;
                                } else if (CausaCeguera == 3) {
                                    causaCeguera = "enfermedad";
                                    valido = true;
                                } else {
                                    System.err.println("*** Valor incorrecto ***");
                                }
                            }

                            valido = false;

                            while (valido == false) {
                                System.out.println("Digite el número que indique el nivel de ceguera del estudiante");
                                System.out.println("1) leve \n2) grave \n3) agudo");
                                int NivelCeguera = Integer.parseInt(lector.nextLine());
                                if (NivelCeguera == 1) {
                                    nivelCeguera = "Leve";
                                    valido = true;
                                } else if (NivelCeguera == 2) {
                                    nivelCeguera = "Severo";
                                    valido = true;
                                } else if (NivelCeguera == 3) {
                                    nivelCeguera = "Grave";
                                    valido = true;
                                } else {
                                    System.err.println("*** Valor incorrecto ***");
                                }
                            }

                            valido = false;

                            while (valido == false) {
                                System.out.println("Seleccione el horario del estudiante");
                                System.out.println("1) horario 1 \n2) horario 2");
                                codHorario = Integer.parseInt(lector.nextLine());

                                if (codHorario == 1 || codHorario == 2) {
                                    System.out.println("Horario asignado.");
                                    valido = true;
                                } else {
                                    System.err.println("*** Valor incorrecto ***");
                                }
                            }

                            lista.insertarPrincipioNodo(nivelCeguera, nombreDvisual, causaCeguera, documentoDvisual, sexoDvisual, codHorario);
                            lista.mostrarNodos();

                        } else if (opcion == 2) {
                            System.out.println("Digite la ubicación del estudiante que desea buscar: ");
                            int numEstudiante = Integer.parseInt(lector.nextLine());
                            System.out.println("Documento del estudiante: " + lista.obtenerEstudiante(numEstudiante).documento);
                            System.out.println("Nombre del estudiante: " + lista.obtenerEstudiante(numEstudiante).nombre);
                            System.out.println("Sexo del estudiante: " + lista.obtenerEstudiante(numEstudiante).sexo);
                            System.out.println("Causa de la ceguera del estudiante: " + lista.obtenerEstudiante(numEstudiante).causaCeguera);
                            System.out.println("Nivel de ceguera del estudiante: " + lista.obtenerEstudiante(numEstudiante).nivelCeguera);
                            System.out.println("Horario del estudiante: " + lista.obtenerEstudiante(numEstudiante).codHorario);

                        } else if (opcion == 3) {
                            lista.mostrarNodos();

                        } else if (opcion == 4) {
                            lista.destruirLista();
                            System.out.println("Lista destruida");

                        } else if (opcion == 5) {
                            sesion1 = false;

                        } else {
                            System.err.println("valor incorrecto");

                        }
                    }
                } else if (eleccion == 2) {

                    boolean sesion1 = true;

                    while (sesion1) {

                        System.out.println("Digite (1) si quiere registrar estudiante");
                        System.out.println("Digite (2) si quiere buscar estudiante");
                        System.out.println("Digite (3) si quiere ver lista de estudiantes");
                        System.out.println("Digite (4) si quiere destruir la lista");
                        System.out.println("Digite (5) para salir");
                        int opcion = Integer.parseInt(lector.nextLine());

                        if (opcion == 1) {
                            System.out.println("Digite el nombre del estudiante: ");
                            nombreDauditiva = lector.nextLine();

                            System.out.println("Digite el documento del estudiante: ");
                            documentoDauditiva = lector.nextLine();

                            valido = false;

                            while (valido == false) {
                                System.out.println("Digite (1) si el sexo del estudiante es masculino, sino marque (2)");
                                int SexoDauditiva = Integer.parseInt(lector.nextLine());
                                if (SexoDauditiva == 1) {
                                    sexoDauditiva = "Masculino";
                                    valido = true;
                                } else if (SexoDauditiva == 2) {
                                    sexoDauditiva = "femenino";
                                    valido = true;
                                } else {
                                    System.err.println("*** Valor incorrecto ****");
                                }
                            }

                            valido = false;

                            while (valido == false) {
                                System.out.println("Digite la letra que indique la causa de la discapacidad del estudiante");
                                System.out.println("1) nacimiento \n2) accidente \n3) enfermedad");
                                int CausaDauditiva = Integer.parseInt(lector.nextLine());
                                if (CausaDauditiva == 1) {
                                    causaDauditiva = "nacimiento";
                                    valido = true;
                                } else if (CausaDauditiva == 2) {
                                    causaDauditiva = "accidente";
                                    valido = true;
                                } else if (CausaDauditiva == 3) {
                                    causaDauditiva = "enfermedad";
                                    valido = true;
                                } else {
                                    System.err.println("*** Valor incorrecto ***");
                                }
                            }

                            valido = false;

                            while (valido == false) {
                                System.out.println("Digite el número que indique el nivel de ceguera del estudiante");
                                System.out.println("1) leve \n2) grave \n3) agudo");
                                int NivelDauditiva = Integer.parseInt(lector.nextLine());
                                if (NivelDauditiva == 1) {
                                    nivelDauditiva = "Leve";
                                    valido = true;
                                } else if (NivelDauditiva == 2) {
                                    nivelDauditiva = "Severo";
                                    valido = true;
                                } else if (NivelDauditiva == 3) {
                                    nivelDauditiva = "Grave";
                                    valido = true;
                                } else {
                                    System.err.println("*** Valor incorrecto ***");
                                }
                            }

                            valido = false;

                            while (valido == false) {
                                System.out.println("Seleccione el horario del estudiante");
                                System.out.println("1) horario 1 \n2) horario 2");
                                codHorario = Integer.parseInt(lector.nextLine());

                                if (codHorario == 1 || codHorario == 2) {
                                    System.out.println("Horario asignado.");
                                    valido = true;
                                } else {
                                    System.err.println("*** Valor incorrecto ***");
                                }
                            }

                            lista2.insertarFinalEstudiante(documentoDauditiva, nombreDauditiva, sexoDauditiva, nivelDauditiva, causaDauditiva, codHorario);
                            lista2.mostrarNodos();
                        } else if (opcion == 2) {
                            System.out.println("Digite la ubicación del estudiante que desea buscar: ");
                            int numEstudiante = Integer.parseInt(lector.nextLine());

                            System.out.println("Documento del estudiante: " + lista2.obtenerEstudiante(numEstudiante).documento);
                            System.out.println("Nombre del estudiante: " + lista2.obtenerEstudiante(numEstudiante).nombre);
                            System.out.println("Sexo del estudiante: " + lista2.obtenerEstudiante(numEstudiante).sexo);
                            System.out.println("Causa de discapacidad del estudiante: " + lista2.obtenerEstudiante(numEstudiante).causaDauditiva);
                            System.out.println("Nivel de discapacidad del estudiante: " + lista2.obtenerEstudiante(numEstudiante).nivelDauditiva);
                            System.out.println("Horario del estudiante: " + lista2.obtenerEstudiante(numEstudiante).codHorario);
                        } else if (opcion == 3) {
                            lista2.mostrarNodos();

                        } else if (opcion == 4) {
                            lista2.destruirLista();
                            System.out.println("Lista destruida");

                        } else if (opcion == 5) {
                            sesion1 = false;

                        } else {
                            System.err.println("valor incorrecto");
                        }
                    }
                } else if (eleccion == 3) {
                    System.out.println("Estudiantes con discapacidad visual registrados: ");
                    lista.mostrarNodos();
                    System.out.println("Estudiantes con discapacidad auditiva registrados: ");
                    lista2.mostrarNodos();
                } else if (eleccion == 4) {
                    System.out.println("proceso terminado");
                    sesion = false;
                }

            }
        } else if (seleccion == 2) {

            System.out.println("Digite (1) si quiere registrar un profesor");
            System.out.println("Digite (2) si quiere registrar un coordinador");
            System.out.println("Digite (3) si quiere buscar un directivo");
            int opcion2 = Integer.parseInt(lector.nextLine());

            if (opcion2 == 1) {
                System.out.println("\nDigite el número de maestros a registrar: ");
                int numeroMaestros = Integer.parseInt(lector.nextLine());
                Maestro[] maestro = new Maestro[numeroMaestros];
                // Maestro maestro1 = new Maestro("", "", "", "", "");

                for (int i = 0; i < numeroMaestros; i++) {
                    System.out.println("\nDigite el nombre del maestro " + (i + 1));
                    nombreDirectivo = lector.nextLine();

                    System.out.println("Digite el documento del maestro " + (i + 1));
                    documentoDirectivo = lector.nextLine();

                    valido = false;

                    while (valido == false) {
                        System.out.println("Digite (1) si el sexo del maestro " + (i + 1) + " es masculino, sino marque (2)");
                        int SexoDirectivo = Integer.parseInt(lector.nextLine());
                        if (SexoDirectivo == 1) {
                            sexoDirectivo = "Masculino";
                            valido = true;
                        } else if (SexoDirectivo == 2) {
                            sexoDirectivo = "femenino";
                            valido = true;
                        } else {
                            System.err.println("*** Valor incorrecto ***");
                        }
                    }

                    System.out.println("En en qué está especializado el maestro: ");
                    especializacion = lector.nextLine();

                    valido = false;

                    while (valido == false) {
                        System.out.println("Digite la letra que indique el tipo de contrato del docente" + (i + 1));
                        System.out.println("1) Fijo \n2) temporal \n3) intercambio");
                        int TipoContrato = Integer.parseInt(lector.nextLine());
                        if (TipoContrato == 1) {
                            tipoContrato = "Fijo";
                            valido = true;
                        } else if (TipoContrato == 2) {
                            tipoContrato = "Temporal";
                            valido = true;
                        } else if (TipoContrato == 3) {
                            tipoContrato = "intercambio";
                            valido = true;
                        } else {
                            System.err.println("*** Valor incorrecto ***");
                        }
                    }
                    maestro[i] = new Maestro(documentoDirectivo, nombreDirectivo, sexoDirectivo, especializacion, tipoContrato);
                    maestro[i].registrar();
                    System.out.println("Proceso terminado");

                }

                for (int i = 0; i < numeroMaestros; i++) {
                    System.out.println("Documento del maestro " + (i + 1) + ": " + maestro[i].documentoDirectivo);
                    System.out.println("Nombre del maestro " + (i + 1) + ": " + maestro[i].nombreDirectivo);
                    System.out.println("Sexo del maestro " + (i + 1) + ": " + maestro[i].sexo);
                    System.out.println("Especialización del maestro " + (i + 1) + ": " + maestro[i].especializacion);
                    System.out.println("Tipo de contrato del maestro " + (i + 1) + ": " + maestro[i].tipoContrato);

                }
            } else if (opcion2 == 2) {
                System.out.println("\nDigite el número de coordinadores a registrar");
                int numeroCoordinadores = Integer.parseInt(lector.nextLine());
                Coordinador[] coordinador = new Coordinador[numeroCoordinadores];
                // Coordinador coordinador1 = new Coordinador("", "", "", "", "", "");

                for (int i = 0; i < numeroCoordinadores; i++) {
                    System.out.println("Digite el nombre del coordinador " + (i + 1));
                    nombreDirectivo = lector.nextLine();

                    System.out.println("Digite el documento del Coordinador " + (i + 1));
                    documentoDirectivo = lector.nextLine();

                    valido = false;

                    while (valido == false) {
                        System.out.println("Digite (1) si el sexo del maestro " + (i + 1) + " es masculino, sino marque (2)");
                        int SexoDirectivo = Integer.parseInt(lector.nextLine());
                        if (SexoDirectivo == 1) {
                            sexoDirectivo = "Masculino";
                            valido = true;
                        } else if (SexoDirectivo == 2) {
                            sexoDirectivo = "femenino";
                            valido = true;
                        } else {
                            System.err.println("*** Valor incorrecto ***");
                        }
                    }

                    System.out.println("En en qué está especializado el coordinador: ");
                    especializacion = lector.nextLine();

                    valido = false;

                    while (valido == false) {
                        System.out.println("Digite la letra que indique el tipo de contrato del coordinador" + (i + 1));
                        System.out.println("1) Fijo \n2) temporal \n3) intercambio");
                        int TipoContrato = Integer.parseInt(lector.nextLine());
                        if (TipoContrato == 1) {
                            tipoContrato = "Fijo";
                            valido = true;
                        } else if (TipoContrato == 2) {
                            tipoContrato = "Temporal";
                            valido = true;
                        } else if (TipoContrato == 3) {
                            tipoContrato = "Intercambio";
                            valido = true;
                        } else {
                            System.err.println("*** Valor incorrecto ***");
                        }
                    }

                    System.out.println("Digite el tipo de cargo:");
                    System.out.println("1) academico \n2) discplinario");
                    int TipoCargo = Integer.parseInt(lector.nextLine());
                    if (TipoCargo == 1) {
                        tipoCargo = "academico";
                    } else if (TipoCargo == 2) {
                        tipoCargo = "disciplinario";
                    }
                    coordinador[i] = new Coordinador(documentoDirectivo, nombreDirectivo, sexoDirectivo, tipoCargo, tipoContrato, especializacion);
                    coordinador[i].registrar();

                }
                for (int i = 0; i < numeroCoordinadores; i++) {
                    System.out.println("Documento del maestro " + (i + 1) + ": " + coordinador[i].documentoDirectivo);
                    System.out.println("Nombre del maestro " + (i + 1) + ": " + coordinador[i].nombreDirectivo);
                    System.out.println("Sexo del maestro " + (i + 1) + ": " + coordinador[i].sexo);
                    System.out.println("Especialización del maestro " + (i + 1) + ": " + coordinador[i].especializacion);
                    System.out.println("Tipo de contrato del maestro " + (i + 1) + ": " + coordinador[i].tipoContrato);

                }
            }
        }
    }
}


/*
//-----------------------------------------------------------------------

        valido = false;
        while (valido == false) {
            System.out.println("\nDigite el documento del usuario que desea buscar: ");
            String busquedaDocumento = lector.nextLine();

            for (int i = 0; i < 10; i++) {
                if (maestro[i].documentoDirectivo.equals(busquedaDocumento)) {
                    System.out.println("¡Maestro encontrado!");
                    System.out.println("Nombre: " + maestro[i].nombreDirectivo + "\nDocumento: " + maestro[i].documentoDirectivo);
                    System.out.println("Sexo: " + maestro[i].sexo + "\nEspecialización: " + maestro[i].especializacion);
                    System.out.println("Tipo de contrato: " + maestro[i].tipoContrato);
                } else if (coordinador[i].documentoDirectivo.equals(busquedaDocumento)) {
                    System.out.println("Coordinador encontrado");
                    System.out.println("Nombre: " + coordinador[i].nombreDirectivo + "\nDocumento: " + coordinador[i].documentoDirectivo);
                    System.out.println("Sexo: " + coordinador[i].sexo + "\nEspecialización: " + coordinador[i].especializacion);
                    System.out.println("TipoCargo" + coordinador[i].tipoCargo + "\nTipo de contrato: " + maestro[i].tipoContrato);
                } else {
                    System.out.println("documento no encontrado");
                }

                System.out.println("digite (1) si desea terminar la busqueda, de lo contrario precione cualquier tecla");
                int busqueda = Integer.parseInt(lector.nextLine());
                if (busqueda == 1) {
                    valido = true;
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Bienvenido al buscador de horario");
            System.out.println("Digite (1) si está en clase de discapacidad visual");
            System.out.println("Digite (2) si está en clase de discapacidad auditiva");
            int buscadorClases = Integer.parseInt(lector.nextLine());
            if (buscadorClases == 1) {
                // discapacidadVisual[i].busqueda();
                System.out.println("");
            } else if (buscadorClases == 2) {
                //estudianteDauditiva[i].busqueda();
                System.out.println("");
            } else {
                System.out.println("número equivocado");
            }
        }

//        valido = false;
//
//        System.out.println("Bienvenido al buscador de horario");
//        System.out.println("Digite (1) si está en clase de discapacidad visual");
//        System.out.println("Digite (2) si está en clase de discapacidad auditiva");
//        int buscadorClases = Integer.parseInt(lector.nextLine());
//        while (valido == false) {
//
//            if (buscadorClases == 1) {
//                discapacidadVisual[numeroEstudiantesDvisual].busqueda();
//                valido = true;
//            } else if (buscadorClases == 2) {
//
//                estudianteDauditiva[numeroEstudiantesDauditiva].busqueda();
//            }
//        }
 */

