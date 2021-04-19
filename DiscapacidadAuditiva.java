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
public class DiscapacidadAuditiva extends Estudiante{
    
    ContenidoDauditiva contenido = new ContenidoDauditiva();
    
    public String nivelEscucha = "";
    public String causaDiscapacidad = "";
    
    public DiscapacidadAuditiva(String nivelEscucha, String causaDiscapacidad){
        this.nivelEscucha = nivelEscucha;
        this.causaDiscapacidad = causaDiscapacidad;
    }
    
     public void inscribir(){
        System.out.println("el estudiante está inscrito");
    }
     
     public void recibirContenido(){
       contenido.Asignar();
       System.out.println("el contenido ya ha sido asignado al estudiante");
     } 
     
}
