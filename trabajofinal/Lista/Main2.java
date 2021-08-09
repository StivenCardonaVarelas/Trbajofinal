package trabajofinal.Lista;

import java.util.Scanner;

/**
 *
 * @author garci
 */
public class Main2 {

    public static void main(String[] args) {

        ListaSimple lista = new ListaSimple();
        ListaSimple lista2 = new ListaSimple();
        Scanner lector = new Scanner(System.in);

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

        boolean validar = true;

        while (validar == true) {

            System.out.println("Digite (1) si quiere registrar estudiante con Discapacidad visual");
            System.out.println("Digite (2) si quiere registrar un estudiante con discapacidad auditiva");
            System.out.println("digite (3) si quiere terminar el proceso");
            int eleccion = Integer.parseInt(lector.nextLine());

            if (eleccion == 1) {
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

                lista2.insertarPrincipioNodoDV(nivelCeguera, nombreDvisual, causaCeguera, documentoDvisual, sexoDvisual, codHorario);
                lista2.mostrarNodoDV();

            } else if (eleccion == 2) {

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

                lista.insertarFinalNodoDA(documentoDauditiva, nombreDauditiva, sexoDauditiva, nivelDauditiva, causaDauditiva, codHorario);
                lista.mostrarNodoDA();
            }else if(eleccion == 3){
                validar = false;
            }

        }

        System.out.println("Estudiantes discapacidad visual:");
        lista.mostrarNodoDV();
        System.out.println("estudiantes discapacidad auditiva: ");
        lista2.mostrarNodoDA();
    }
}
