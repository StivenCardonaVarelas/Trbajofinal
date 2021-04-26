/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

/**
 *
 * @author garci
 */
public class Maestro extends Directivo{ 
    
    public String especializacion = "";
    public String asignatura = "";
    
    public Maestro ( String documentoDirectivo, String nombreDirectivo,  String sexo, String especializacion, String tipoContrato){
        this.documentoDirectivo = documentoDirectivo;
        this.nombreDirectivo = nombreDirectivo;
        this.sexo = sexo;
        this.especializacion = especializacion;
        this.tipoContrato = tipoContrato;
    }
    
    public void registrar(){
        System.out.println("Directivo registrado");
    }
}
