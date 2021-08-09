package trabajofinal.Lista;

import trabajofinal.EstudianteDiscapacidadVisual;
import trabajofinal.EstudianteDiscapacidadAuditiva;

public class ListaSimple {

    Nodo cabeza = null;

    public void insertarPrincipioNodoDV(String nivelCeguera, String nombreDvisual, String causaCeguera, String documentoDvisual, String sexoDvisual, int codHorario) {

        Nodo nodoNuevo = new Nodo(new EstudianteDiscapacidadVisual(nivelCeguera, nombreDvisual, causaCeguera, documentoDvisual, sexoDvisual, codHorario));

        if (cabeza == null) {
            cabeza = nodoNuevo;
        } else {
            nodoNuevo.siguiente = cabeza;
            cabeza = nodoNuevo;
        }
    }

    public void insertarFinalNodoDV(String nivelCeguera, String nombreDvisual, String causaCeguera, String documentoDvisual, String sexoDvisual, int codHorario) {

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
    }

    public void mostrarNodoDV() {

        if (cabeza == null) {
            System.out.println("no hay nodos");
        } else {
            Nodo apuntador = cabeza;

            while (apuntador.siguiente != null) {
                System.out.println(apuntador.dato.nombre);
                System.out.println(apuntador.dato.documento);
                apuntador = apuntador.siguiente;
            }
            System.out.println(apuntador.dato.nombre);
            System.out.println(apuntador.dato.documento);
        }
    }

    //-------------------------------------------------------------------------------------------------------
    public void insertarPrincipioNodoDA(String documentoDauditiva, String nombreDauditiva, String sexoDauditiva, String nivelDauditiva, String causaDauditiva, int codHorario) {

        Nodo nodoNuevo = new Nodo(new EstudianteDiscapacidadVisual(documentoDauditiva, nombreDauditiva, sexoDauditiva, nivelDauditiva, causaDauditiva, codHorario));

        if (cabeza == null) {
            cabeza = nodoNuevo;
        } else {
            nodoNuevo.siguiente = cabeza;
            cabeza = nodoNuevo;
        }
    }
    
    public void insertarFinalNodoDA(String documentoDauditiva, String nombreDauditiva, String sexoDauditiva, String nivelDauditiva, String causaDauditiva, int codHorario) {

        Nodo nodoNuevo = new Nodo(new EstudianteDiscapacidadVisual(documentoDauditiva, nombreDauditiva, sexoDauditiva, nivelDauditiva, causaDauditiva, codHorario));
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
    }
    
    public void mostrarNodoDA() {

        if (cabeza == null) {
            System.out.println("no hay nodos");
        } else {
            Nodo apuntador = cabeza;

            while (apuntador.siguiente != null) {
                System.out.println(apuntador.dato.nombre);
                System.out.println(apuntador.dato.documento);
                apuntador = apuntador.siguiente;
            }
            System.out.println(apuntador.dato.nombre);
            System.out.println(apuntador.dato.documento);
        }
    }
}
