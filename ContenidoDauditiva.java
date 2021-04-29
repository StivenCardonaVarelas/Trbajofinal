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
public class ContenidoDauditiva{
    
    Scanner lector = new Scanner(System.in);
    
    public int codigo1 = 0234;
    public String materia1 = "Lenguaje de señas";    
    public int codigo2 = 3224;
    public String materia2 = "matemática";
    
    public int codigo3 = 7543;
    public String materia3 = "sociales";    
    public int codigo4 = 1231;
    public String materia4 = "artística";

    public void horario1() {
        
        System.out.println("------Menú------");
        System.out.println("--Codigo:" +codigo1+ "--");
        System.out.println("--Materia:" +materia1+ "--");
        System.out.println("");
        System.out.println("--Codigo:" +codigo2+ "--");
        System.out.println("--Materia:" +materia2+ "--");
        System.out.println("");
        
    }
    
    public void horario2(){
        System.out.println("------Menú------");
        System.out.println("--Codigo:" +codigo3+ "--");
        System.out.println("--Materia:" +materia3+ "--");
        System.out.println("");
        System.out.println("--Codigo:" +codigo4+ "--");
        System.out.println("--Materia:" +materia4+ "--");
    }
    
    public void buscar() {
        boolean valor = false;
        while (valor == false) {

            System.out.println("Digite el código de la materia: ");
            int busqueda = Integer.parseInt(lector.nextLine());
            if (busqueda == codigo1) {               
                System.out.println("¡Materia encontrada!");
                System.out.println("La materia elejida es: " + materia1);
                System.out.println("");
                System.out.println("------Temario----");
                System.out.println("contenido 1");
                System.out.println("");
                System.out.println("contenido 2");
                System.out.println("");
                System.out.println("contenido 3");
                System.out.println("");
                System.out.println("Digita el nùmero del tema que deseas ver");
                int tema = lector.nextInt();

                if (tema == 1) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");

                } else if (tema == 2) {

                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                } else if (tema == 3) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                }
                
                valor = true;
                
            } else if (busqueda == codigo2) {
                System.out.println("¡Materia encontrada!");
                System.out.println("La materia elejida es: " + materia2);
                System.out.println("");
                System.out.println("------Temario----");
                System.out.println("contenido 1");
                System.out.println("");
                System.out.println("contenido 2");
                System.out.println("");
                System.out.println("contenido 3");
                System.out.println("");
                System.out.println("Digita el nùmero del tema que deseas ver");
                int tema = lector.nextInt();

                if (tema == 1) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");

                } else if (tema == 2) {

                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                } else if (tema == 3) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                }
                valor = true;
            }else if(busqueda == codigo3){
                System.out.println("¡Materia encontrada!");
                System.out.println("La materia elejida es: " + materia3);
                System.out.println("");
                System.out.println("------Temario----");
                System.out.println("contenido 1");
                System.out.println("");
                System.out.println("contenido 2");
                System.out.println("");
                System.out.println("contenido 3");
                System.out.println("");
                System.out.println("Digita el nùmero del tema que deseas ver");
                int tema = lector.nextInt();
                
                if (tema == 1) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");

                } else if (tema == 2) {

                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                } else if (tema == 3) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                }
                valor = true;
            }else if(busqueda == codigo4){
                System.out.println("¡Materia encontrada!");
                System.out.println("La materia elejida es: " + materia4);
                System.out.println("");
                System.out.println("------Temario----");
                System.out.println("contenido 1");
                System.out.println("");
                System.out.println("contenido 2");
                System.out.println("");
                System.out.println("contenido 3");
                System.out.println("");
                System.out.println("Digita el nùmero del tema que deseas ver");
                int tema = lector.nextInt();
                
                if (tema == 1) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");

                } else if (tema == 2) {

                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                } else if (tema == 3) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                }
                valor = true;
            }
        }
    }

}
