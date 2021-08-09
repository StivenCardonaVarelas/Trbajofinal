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
public class EstudianteDiscapacidadVisual extends Estudiante{
    
    ContenidoDvisual contenido = new ContenidoDvisual();
    
    public String nivelCeguera = "";
    public String causaCeguera = "";
    
    public EstudianteDiscapacidadVisual(String nivelCeguera, String nombreDvisual, String causaCeguera,String documentoDvisual, String sexoDvisual, int codHorario){ 
        this.nivelCeguera = nivelCeguera;
        this.nombre = nombreDvisual;
        this.causaCeguera = causaCeguera;
        this.documento = documentoDvisual;
        this.sexo = sexoDvisual;
        this.codHorario = codHorario;
    }
    
    public void inscribir(){
        System.out.println("\nEl estudiante está inscrito");
    }
    
    public void seleccionarMateria(){
        if(codHorario == 1){
            contenido.horario1();
        }else if(codHorario == 2){
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

