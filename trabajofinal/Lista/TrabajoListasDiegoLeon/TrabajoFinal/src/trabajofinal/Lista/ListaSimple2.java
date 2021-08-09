/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal.Lista;

import trabajofinal.EstudianteDiscapacidadAuditiva;

public class ListaSimple2 {

    Nodo cabeza = null;
    Nodo apuntador = null;
    int tamaño = 0;

    public void insertarPrincipioEstudiante(String documentoDauditiva, String nombreDauditiva, String sexoDauditiva, String nivelDauditiva, String causaDauditiva, int codHorario) {
        Nodo nodoNuevo = new Nodo(new EstudianteDiscapacidadAuditiva(documentoDauditiva, nombreDauditiva, sexoDauditiva, nivelDauditiva, causaDauditiva, codHorario));

        if (cabeza == null) {
            cabeza = nodoNuevo;
        } else {
            nodoNuevo.siguiente = cabeza;
            cabeza = nodoNuevo;
        }
        tamaño = tamaño + 1;
    }

    public void insertarFinalEstudiante(String documentoDauditiva, String nombreDauditiva, String sexoDauditiva, String nivelDauditiva, String causaDauditiva, int codHorario) {
        Nodo nodoNuevo = new Nodo(new EstudianteDiscapacidadAuditiva(documentoDauditiva, nombreDauditiva, sexoDauditiva, nivelDauditiva, causaDauditiva, codHorario));

        if (cabeza == null) {
            cabeza = nodoNuevo;
        } else {
            apuntador = cabeza;

            while (apuntador.siguiente != null) {
                apuntador = apuntador.siguiente;
            }
            apuntador.siguiente = nodoNuevo;
        }
        tamaño = tamaño + 1;
    }

    public void mostrarNodos() {

        if (cabeza == null) {
            System.out.println("no hay nodos");
        } else {
            Nodo apuntador = cabeza;

            while (apuntador.siguiente != null) {
                System.out.println("Documento del estudiante: " + apuntador.dato2.documento);
                System.out.println("Nombre del estudiante: " + apuntador.dato2.nombre);
                System.out.println("Sexo del estudiante: " + apuntador.dato2.sexo);
                System.out.println("Causa de discapacidad del estudiante: " + apuntador.dato2.causaDauditiva);
                System.out.println("Nivel de discapacidad del estudiante: " + apuntador.dato2.nivelDauditiva);
                System.out.println("Horario del estudiante: " + apuntador.dato2.codHorario);
                apuntador = apuntador.siguiente;
            }
            System.out.println("Documento del estudiante: " + apuntador.dato2.documento);
            System.out.println("Nombre del estudiante: " + apuntador.dato2.nombre);
            System.out.println("Sexo del estudiante: " + apuntador.dato2.sexo);
            System.out.println("Causa de discapacidad del estudiante: " + apuntador.dato2.causaDauditiva);
            System.out.println("Nivel de discapacidad del estudiante: " + apuntador.dato2.nivelDauditiva);
            System.out.println("Horario del estudiante: " + apuntador.dato2.codHorario);
        }
    }

    public EstudianteDiscapacidadAuditiva obtenerEstudiante(int index) {
        Nodo apuntador = null;

        if (cabeza != null) {
            int contador = 0;
            apuntador = cabeza;
            while (contador < index) {
                apuntador = apuntador.siguiente;
                contador++;
            }
        } else {
            System.out.println("No hay nodos");
        }
        return apuntador.dato2;
    }

    public void destruirLista() {

        Nodo apuntador = null;
        cabeza = null;
    }

}
