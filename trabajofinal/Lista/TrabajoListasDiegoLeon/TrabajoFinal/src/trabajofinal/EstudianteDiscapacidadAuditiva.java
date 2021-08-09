/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

/**
 *
 * @author u
 */
public class EstudianteDiscapacidadAuditiva extends Estudiante {

    ContenidoDauditiva contenido = new ContenidoDauditiva();

    public String nivelDauditiva = "";
    public String causaDauditiva = "";

    public EstudianteDiscapacidadAuditiva(String documentoDauditiva, String nombreDauditiva, String sexoDauditiva, String nivelDauditiva, String causaDauditiva, int codHorario) {
        this.documento = documentoDauditiva;
        this.nombre = nombreDauditiva;
        this.sexo = sexoDauditiva;
        this.nivelDauditiva = nivelDauditiva;
        this.causaDauditiva = causaDauditiva;
        this.codHorario = codHorario;
    }

    public void inscribir() {
        System.out.println("\nEl estudiante está inscrito");
    }

    public void seleccionarMateria() {
        if (codHorario == 1) {
            contenido.horario1();
        } else if (codHorario == 2) {
            contenido.horario2();
        }else{
            System.out.println("valor incorrecto");
        }
    }
    
    public void busqueda(){
        contenido.horario1();
        contenido.horario2();
        contenido.buscar();
    }
}
