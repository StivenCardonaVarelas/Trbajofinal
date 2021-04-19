/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import java.util.Scanner;

/**
 *
 * @author u
 */
public class Main {

   
    public static void main(String[] args) {
        
        String nivelCeguera = "";
        String causaCeguera = "";
        String nombre = "";
        String documento = "";
        String sexo = "";
        Scanner lector = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        //DiscapacidadVisual discapacidadVisual= new DiscapacidadVisual("leve","accidente");
        
        System.out.println("Digite el número de estudiantes con discpacidad visual a registrar: ");
        int numeroEstudiantes = Integer.parseInt(lector.nextLine());
        DiscapacidadVisual[] discapacidadVisual = new DiscapacidadVisual[numeroEstudiantes];
        DiscapacidadVisual discpacidadVisual = new DiscapacidadVisual("","","","","");
        
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Digite el nombre del estudiante "+(i+1));
            nombre = lector.nextLine();
            System.out.println("Digite el documento del estudiante "+(i+1));
            documento = lector.nextLine();                        
            System.out.println("Digite (1) si el sexo del estudiante " +(i+1)+ " es masculino, sino marque (2)");              
            int Sexo = Integer.parseInt(lector.nextLine());
            if(Sexo == 1){
                sexo = "Masculino";
            }else if(Sexo == 2){
                sexo = "femenino";
            }//else{
//                System.err.println("*** Valor incorrecto ****");
//            }    
            
            System.out.println("Digite la letra que indique la causa de la ceguera del estudiante"+(i+1));
            System.out.println("1) nacimiento \n2) accidente \n3) enfermedad");
            int CausaCeguera = Integer.parseInt(lector.nextLine());
            if(CausaCeguera == 1){
                causaCeguera = "nacimiento";
            }else if(CausaCeguera == 2){
                causaCeguera = "accidente";
            }else if(CausaCeguera == 3){
                causaCeguera = "enfermedad";
            }//else{
//                System.err.println("*** Valor incorrecto ***");
//            }
                        
            System.out.println("Digite la letra que indique la causa de la ceguera del estudiante"+(i+1));
            System.out.println("1) leve \n2) grave \n3) agudo");
            int NivelCeguera = Integer.parseInt(lector.nextLine());
            if(NivelCeguera == 1){  
                nivelCeguera = "Leve";
            }else if(CausaCeguera == 2){
                nivelCeguera = "Severo";
            }else if(CausaCeguera == 3){
                nivelCeguera = "Grave";
            }//else{
//                System.err.println("*** Valor incorrecto ***");
//            }
            
            discapacidadVisual[i] = new DiscapacidadVisual(nivelCeguera, nombre, causaCeguera, documento, sexo);
            
            discpacidadVisual.inscribir();
            discpacidadVisual.recibirContenido();
        }
        
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("\nDocumento del estudiante " +(i+1)+ ": "+ discapacidadVisual[i].documento);
            System.out.println("Nombre del estudiante " +(i+1)+ ": "+ discapacidadVisual[i].nombre);
            System.out.println("Género del estudiante " +(i+1)+ ": "+ discapacidadVisual[i].sexo);
            System.out.println("Causa de la ceguera del estudiante " +(i+1)+ ": "+ discapacidadVisual[i].causaCeguera);
            System.out.println("nivel de ceguera del estudiante " +(i+1)+ ": "+ discapacidadVisual[i].nivelCeguera);
        }
        
        
        
//        discapacidadVisual.nombre = "luis";
//        discapacidadVisual.edad = 12;
//        discapacidadVisual.documento = "1000414818";
//        discapacidadVisual.sexo = "masculino";
//        
//        System.out.println("nombre: "+discapacidadVisual.nombre);
//        System.out.println("edad: "+discapacidadVisual.edad);
//        System.out.println("nivel de ceguera: "+discapacidadVisual.nivelCeguera);
//        System.out.println("causa ceguera: "+discapacidadVisual.causaCeguera);
//        
//        discapacidadVisual.inscribir();
//        discapacidadVisual.recibirContenido();
    }
    
}
