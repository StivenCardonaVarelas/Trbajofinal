package trabajofinal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean valido = false;

        String nivelCeguera = "";
        String causaCeguera = "";
        String nombreDvisual = "";
        String documentoDvisual = "";
        String sexoDvisual = "";
        int codHorario = 0;

        String nombreDirectivo = "";
        String documentoDirectivo = "";
        String sexoDirectivo = "";
        String especializacion = "";
        String tipoContrato = "";

        String nivelDauditiva = "";
        String causaDauditiva = "";
        String nombreDauditiva = "";
        String documentoDauditiva = "";
        String sexoDauditiva = "";

        String tipoCargo = "";

        Scanner lector = new Scanner(System.in);
        //DiscapacidadVisual discapacidadVisual= new DiscapacidadVisual("leve","accidente");
//------------------------------------------------------------------------------------------
        System.out.println("Digite el número de estudiantes con discpacidad visual a registrar: ");
        int numeroEstudiantesDvisual = Integer.parseInt(lector.nextLine());
        EstudianteDiscapacidadVisual[] discapacidadVisual = new EstudianteDiscapacidadVisual[numeroEstudiantesDvisual];
        //discapacidadVisual[numeroEstudiantesDvisual] = new EstudianteDiscapacidadVisual("","","","","","");
        EstudianteDiscapacidadVisual discpacidadVisual = new EstudianteDiscapacidadVisual("", "", "", "", "", 0);

        for (int i = 0; i < numeroEstudiantesDvisual; i++) {
            System.out.println("\nDigite el nombre del estudiante " + (i + 1));
            nombreDvisual = lector.nextLine();

            System.out.println("Digite el documento del estudiante " + (i + 1));
            documentoDvisual = lector.nextLine();

            while (valido == false) {
                System.out.println("Digite (1) si el sexo del estudiante " + (i + 1) + " es masculino, sino marque (2)");
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
                System.out.println("Digite la letra que indique la causa de la ceguera del estudiante" + (i + 1));
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
                System.out.println("Digite el número que indique el nivel de ceguera del estudiante" + (i + 1));
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
                int HorarioDvisual = Integer.parseInt(lector.nextLine());
                if (HorarioDvisual == 1) {
                    codHorario = 1;
                    valido = true;
                } else if (HorarioDvisual == 2) {
                    codHorario = 2;
                    valido = true;
                } else {
                    System.err.println("*** Valor incorrecto ***");
                }
            }

            discpacidadVisual.inscribir();
            discapacidadVisual[i] = new EstudianteDiscapacidadVisual(nivelCeguera, nombreDvisual, causaCeguera, documentoDvisual, sexoDvisual, codHorario);
        }

        for (int i = 0; i < numeroEstudiantesDvisual; i++) {
            System.out.println("\nDocumento del estudiante " + (i + 1) + ": " + discapacidadVisual[i].documento);
            System.out.println("Nombre del estudiante " + (i + 1) + ": " + discapacidadVisual[i].nombre);
            System.out.println("Sexo del estudiante " + (i + 1) + ": " + discapacidadVisual[i].sexo);
            System.out.println("Causa de la ceguera del estudiante " + (i + 1) + ": " + discapacidadVisual[i].causaCeguera);
            System.out.println("nivel de ceguera del estudiante " + (i + 1) + ": " + discapacidadVisual[i].nivelCeguera);

            System.out.println("\nHorario asignado");
            if (discapacidadVisual[i].codHorario == 1) {
                discpacidadVisual.horario = 1;
            } else if (discapacidadVisual[i].codHorario == 2) {
                discpacidadVisual.horario = 2;
            }
            discpacidadVisual.seleccionarMateria();

        }

//----------------------------------------------------------------------
        System.out.println("\nDigite el número de estudiantes con discapacidad auditiva a registrar: ");
        int numeroEstudiantesDauditiva = Integer.parseInt(lector.nextLine());
        EstudianteDiscapacidadAuditiva[] estudianteDauditiva = new EstudianteDiscapacidadAuditiva[numeroEstudiantesDauditiva];
        EstudianteDiscapacidadAuditiva estudiantesDauditiva = new EstudianteDiscapacidadAuditiva("", "", "", "", "", 0);

        for (int i = 0; i < numeroEstudiantesDauditiva; i++) {
            System.out.println("Digite el nombre del estudiante: " + (i + 1));
            nombreDauditiva = lector.nextLine();

            System.out.println("Digite el documento del estudiante: ");
            documentoDauditiva = lector.nextLine();

            valido = false;

            while (valido == false) {
                System.out.println("Digite (1) si el sexo del estudiante " + (i + 1) + " es masculino, sino marque (2)");
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
                System.out.println("Digite la letra que indique la causa de la discapacidad del estudiante" + (i + 1));
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
                System.out.println("Digite el número que indique el nivel de ceguera del estudiante" + (i + 1));
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
                int HorarioDauditiva = Integer.parseInt(lector.nextLine());
                if (HorarioDauditiva == 1) {
                    codHorario = 1;
                    valido = true;
                } else if (HorarioDauditiva == 2) {
                    codHorario = 2;
                    valido = true;
                } else {
                    System.err.println("*** Valor incorrecto ***");
                }
            }
            estudiantesDauditiva.inscribir();
            estudianteDauditiva[i] = new EstudianteDiscapacidadAuditiva(documentoDauditiva, nombreDauditiva, sexoDauditiva, nivelDauditiva, causaDauditiva, codHorario);

        }

        for (int i = 0; i < numeroEstudiantesDauditiva; i++) {
            System.out.println("\nDocumento del estudiante " + (i + 1) + ": " + estudianteDauditiva[i].documento);
            System.out.println("Nombre del estudiante " + (i + 1) + ": " + estudianteDauditiva[i].nombre);
            System.out.println("Sexo del estudiante " + (i + 1) + ": " + estudianteDauditiva[i].sexo);
            System.out.println("Causa de la discpacidad del estudiante " + (i + 1) + ": " + estudianteDauditiva[i].causaDauditiva);
            System.out.println("nivel de discpacidad auditiva del estudiante " + (i + 1) + ": " + estudianteDauditiva[i].nivelDauditiva);

            System.out.println("\nHorario asignado");
            if (discapacidadVisual[i].codHorario == 1) {
                estudiantesDauditiva.horario = 1;
            } else if (discapacidadVisual[i].codHorario == 2) {
                estudiantesDauditiva.horario = 2;
            }
            estudiantesDauditiva.seleccionarMateria();

        }
//--------------------------------------------------------------------------------------

        System.out.println("\nDigite el número de maestros a registrar: ");
        int numeroMaestros = Integer.parseInt(lector.nextLine());
        Maestro[] maestro = new Maestro[numeroMaestros];
        Maestro maestro1 = new Maestro("", "", "", "", "");

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

            maestro1.registrar();
            maestro[i] = new Maestro(documentoDirectivo, nombreDirectivo, sexoDirectivo, especializacion, tipoContrato);
        }

        for (int i = 0; i < numeroMaestros; i++) {
            System.out.println("Documento del maestro " + (i + 1) + ": " + maestro[i].documentoDirectivo);
            System.out.println("Nombre del maestro " + (i + 1) + ": " + maestro[i].nombreDirectivo);
            System.out.println("Sexo del maestro " + (i + 1) + ": " + maestro[i].sexo);
            System.out.println("Especialización del maestro " + (i + 1) + ": " + maestro[i].especializacion);
            System.out.println("Tipo de contrato del maestro " + (i + 1) + ": " + maestro[i].tipoContrato);
        }
//---------------------------------------------------------------

        System.out.println("\nDigite el número de coordinadores a registrar");
        int numeroCoordinadores = Integer.parseInt(lector.nextLine());
        Coordinador[] coordinador = new Coordinador[numeroCoordinadores];
        Coordinador coordinador1 = new Coordinador("", "", "", "", "", "");

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

            coordinador1.registrar();
            coordinador[i] = new Coordinador(documentoDirectivo, nombreDirectivo, sexoDirectivo, tipoCargo, tipoContrato, especializacion);
        }
//-----------------------------------------------------------------------

        valido = false;
        while (valido == false) {
            System.out.println("\nDigite el documento del usuario que desea buscar: ");
            String busquedaDocumento = lector.nextLine();

            for (int i = 0; i < numeroEstudiantesDvisual; i++) {
                if (discapacidadVisual[i].documento.equals(busquedaDocumento)) {
                    System.out.println("¡Estudiante encontrado!");
                    System.out.println("Nombre: " + discapacidadVisual[i].nombre + "\nDocumento: " + discapacidadVisual[i].documento);
                    System.out.println("Sexo: " + discapacidadVisual[i].sexo + "\nCausa ceguera: " + discapacidadVisual[i].causaCeguera);
                    System.out.println("Nivel de ceguera: " + discapacidadVisual[i].nivelCeguera);

                } else if (maestro[i].documentoDirectivo.equals(busquedaDocumento)) {
                    System.out.println("¡Maestro encontrado!");
                    System.out.println("Nombre: " + maestro[i].nombreDirectivo + "\nDocumento: " + maestro[i].documentoDirectivo);
                    System.out.println("Sexo: " + maestro[i].sexo + "\nEspecialización: " + maestro[i].especializacion);
                    System.out.println("Tipo de contrato: " + maestro[i].tipoContrato);
                } else if (estudianteDauditiva[i].documento.equals(busquedaDocumento)) {
                    System.out.println("¡Estudiante encontrado!");
                    System.out.println("Nombre: " + estudianteDauditiva[i].nombre + "\nDocumento: " + estudianteDauditiva[i].documento);
                    System.out.println("Sexo: " + estudianteDauditiva[i].sexo + "\nCausa discapacidad: " + estudianteDauditiva[i].causaDauditiva);
                    System.out.println("Nivel de discapacidad auditiva: " + estudianteDauditiva[i].nivelDauditiva);
                    discpacidadVisual.seleccionarMateria();
                } else if (coordinador[i].documentoDirectivo.equals(busquedaDocumento)) {
                    System.out.println("Coordinador encontrado");
                    System.out.println("Nombre: " + coordinador[i].nombreDirectivo + "\nDocumento: " + coordinador[i].documentoDirectivo);
                    System.out.println("Sexo: " + coordinador[i].sexo + "\nEspecialización: " + coordinador[i].especializacion);
                    System.out.println("TipoCargo" + coordinador[i].tipoCargo + "\nTipo de contrato: " + maestro[i].tipoContrato);
                } else {
                    System.out.println("documento no encontrado");
                }

                System.out.println("digite (1) si desea terminar la busqueda");
                int busqueda = Integer.parseInt(lector.nextLine());
                if (busqueda == 1) {
                    valido = true;
                }
            }
        }
        
        valido = false;

        System.out.println("Bienvenido al buscador de horario");
        System.out.println("Digite (1) si está en clase de discapacidad visual");
        System.out.println("Digite (2) si está en clase de discapacidad auditiva");
        int buscadorClases = Integer.parseInt(lector.nextLine());
        while (valido == false) {

            if (buscadorClases == 1) {
                discpacidadVisual.busqueda();
                valido = true;
            } else if (buscadorClases == 2) {
                tipoContrato = "Temporal";
                estudiantesDauditiva.busqueda();
                valido = true;
            }
        }

    }
}
