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
public class Coordinador extends Directivo{
    
    public String tipoCargo = "";
    public String especializacion = "";
    
    public Coordinador( String documentoDirectivo, String nombreDirectivo,  String sexo, String especializacion, String tipoContrato, String tipoCargo){
        this.documentoDirectivo = documentoDirectivo;
        this.nombreDirectivo = nombreDirectivo;
        this.sexo = sexo;
        this.especializacion = especializacion;
        this.tipoContrato = tipoContrato;
        this.tipoCargo = tipoCargo;
    }
    
    public void registrar(){
        System.out.println("Directivo registrado");
    }
}
