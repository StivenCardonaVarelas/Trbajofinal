
package trabajofinal.Lista;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        ListaSimple lista = new ListaSimple();
        ListaSimple2 lista2 = new ListaSimple2();

        boolean valido = false;

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
            }else if(eleccion == 3){
                System.out.println("Estudiantes con discapacidad visual registrados: ");
                lista.mostrarNodos();
                System.out.println("Estudiantes con discapacidad auditiva registrados: ");
                lista2.mostrarNodos();
            }else if(eleccion == 4){
                System.out.println("proceso terminado");
                sesion = false;
            }
            
            
        }
    }
}
