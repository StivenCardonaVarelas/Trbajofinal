/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal.Lista;

import trabajofinal.EstudianteDiscapacidadVisual;
import trabajofinal.EstudianteDiscapacidadAuditiva;

/**
 *
 * @author garci
 */
public class Nodo {
    public Nodo siguiente = null;
    public EstudianteDiscapacidadVisual dato;
    public EstudianteDiscapacidadAuditiva dato2;

    public Nodo() {
    }

    public Nodo(EstudianteDiscapacidadVisual dato) {
        this.dato = dato;
    }
}
