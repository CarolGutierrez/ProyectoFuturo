/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofuturo;

/**
 *
 * @author Neylin
 */
public class ProyectoFuturo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Carolina Gutiérrez Camargo
        System.out.println("Estudiante: "+args[0]);
        System.out.println(veredicto(args[1], args[2]));
    }
    static String veredicto(String valor1, String valor2){
         if(valor1.equals(valor2)){
             return "El dedicar 1 hora puede ser insuficiente";
         }
         if(Integer.valueOf(valor1)> Integer.valueOf(valor2) ){
             return "deberás dedicar mas horas si quieres aprobar";
         }
    return "Ideal trabaja los contenidos en casa";
    }
    
}
