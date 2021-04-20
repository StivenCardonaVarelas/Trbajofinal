/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import java.util.Scanner;

/**
 *
 * @author stive
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int salir = 0;
        int materia = 0;
        int tema = 0;
        System.out.println("------Menú------");
        System.out.println("------Codigo:" + "-------");
        System.out.println("-------Materia:" + "------");
        System.out.println("");
        System.out.println("------Codigo:" + "-------");
        System.out.println("-------Materia:" + "------");
        System.out.println("");
        System.out.println("------Codigo:" + "-------");
        System.out.println("-------Materia:" + "------");
        System.out.println("");
        System.out.println("------Para salir precione 1----");
        System.out.println("------Para elejir precione 2----");
        salir = lector.nextInt();
        if (salir == 1) {
            System.out.println("El programa se a cerrado exitosamente");

        } else {
            System.out.println("Ingrese el codigo de la materia a presentar");
            materia = lector.nextInt();
            if (materia == 1) { // para elegir la materia

                System.out.println(materia + " La materia elejida es:");
                System.out.println("");
                System.out.println("------Temario----");
                System.out.println("----------");
                System.out.println("");
                System.out.println("----------");
                System.out.println("");
                System.out.println("----------");
                System.out.println("");
                System.out.println("Elige el tema a ver");
                tema = lector.nextInt();
                if (tema == 1) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");

                } else if (tema == 2) {

                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                } else if (tema == 3) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                }

            } else if (materia == 2) {// para elegir la materia
                System.out.println(materia + " La materia elejida es:");
                System.out.println("------Temario----");
                System.out.println("----------");
                System.out.println("");
                System.out.println("----------");
                System.out.println("");
                System.out.println("----------");
                System.out.println("Elige el tema a ver");
                tema = lector.nextInt();
                if (tema == 1) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");

                } else if (tema == 2) {

                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                } else if (tema == 3) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                }

            } else if (materia == 3) {// para elegir la materia 

                System.out.println(materia + " La materia elejida es:");
                System.out.println("------Temario----");
                System.out.println("----------");
                System.out.println("");
                System.out.println("----------");
                System.out.println("");
                System.out.println("----------");
                System.out.println("Elige el tema a ver");
                tema = lector.nextInt();
                if (tema == 1) {//para elegir el tema a ver 
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");

                } else if (tema == 2) {

                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                } else if (tema == 3) {
                    System.out.println("https://www.youtube.com/watch?v=YMHFk7Yh_jE&list=TLPQMTkwNDIwMjGW-79GOWXfBQ&index=3");
                }
            } else {
                System.out.println("Materia no encontrada porfavor reiniciar el programa");
            }

        }

    }
}
