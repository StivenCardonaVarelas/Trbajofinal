/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal.Lista;

import trabajofinal.EstudianteDiscapacidadVisual;

/**
 *
 * @author garci
 */
public class ListaSimple {

    Nodo cabeza = null;
    int tamaño = 0;    

    public void insertarPrincipioNodo(String nivelCeguera, String nombreDvisual, String causaCeguera, String documentoDvisual, String sexoDvisual, int codHorario) {

        Nodo nodoNuevo = new Nodo(new EstudianteDiscapacidadVisual(nivelCeguera, nombreDvisual, causaCeguera, documentoDvisual, sexoDvisual, codHorario));

        if (cabeza == null) {
            cabeza = nodoNuevo;
        } else {
            nodoNuevo.siguiente = cabeza;
            cabeza = nodoNuevo;
        }
        tamaño = tamaño + 1;
    }

    public void mostrarNodos() {

        if (cabeza == null) {
            System.out.println("no hay nodos");
        } else {
            Nodo apuntador = cabeza;

            while (apuntador.siguiente != null) {
                System.out.println("Documento del estudiante: " + apuntador.dato.documento);
                System.out.println("Nombre del estudiante: " + apuntador.dato.nombre);
                System.out.println("Sexo del estudiante: " + apuntador.dato.sexo);
                System.out.println("Causa de ceguera del estudiante: " + apuntador.dato.causaCeguera);
                System.out.println("Nivel de ceguera del estudiante: " + apuntador.dato.nivelCeguera);
                System.out.println("Horario del estudiante: " + apuntador.dato.codHorario);
                apuntador = apuntador.siguiente;
            }
            System.out.println("Documento del estudiante: " + apuntador.dato.documento);
            System.out.println("Nombre del estudiante: " + apuntador.dato.nombre);
            System.out.println("Sexo del estudiante: " + apuntador.dato.sexo);
            System.out.println("Causa de ceguera del estudiante: " + apuntador.dato.causaCeguera);
            System.out.println("Nivel de ceguera del estudiante: " + apuntador.dato.nivelCeguera);
            System.out.println("Horario del estudiante: " + apuntador.dato.codHorario);
        }
    }

    public void insertarFinalNodo(String nivelCeguera, String nombreDvisual, String causaCeguera, String documentoDvisual, String sexoDvisual, int codHorario) {

        Nodo nodoNuevo = new Nodo(new EstudianteDiscapacidadVisual(nivelCeguera, nombreDvisual, causaCeguera, documentoDvisual, sexoDvisual, codHorario));
        Nodo apuntador;

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

    public EstudianteDiscapacidadVisual obtenerEstudiante(int index) {
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
        return apuntador.dato;
    }

    public void destruirLista() {
        
        Nodo apuntador = null;        
        cabeza = null;       
    }
}
