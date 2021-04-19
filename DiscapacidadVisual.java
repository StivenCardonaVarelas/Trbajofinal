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
public class DiscapacidadVisual extends Estudiante{
    
    ContenidoDvisual contenido = new ContenidoDvisual();
    
    public String nivelCeguera = "";
    public String causaCeguera = "";
    
    public DiscapacidadVisual(String nivelCeguera, String nombre, String causaCeguera,String documento, String sexo){ 
        this.nivelCeguera = nivelCeguera;
        this.nombre = nombre;
        this.causaCeguera = causaCeguera;
        this.documento = documento;
        this.sexo = sexo;
    }
    
//    public DiscapacidadVisual(String causaCeguera){
//        this.causaCeguera = causaCeguera;
//    }
    
    public void inscribir(){
        System.out.println("\n El estudiante está inscrito");
    }
    
    public void recibirContenido(){
       contenido.Asignar();
       System.out.println(" El contenido ya ha sido asignado al estudiante");
     }
}

