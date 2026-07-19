package tarea3.metodoe4;

import java.util.Scanner;

/**
 *
 * @author Naomi Charlotte Leon Saavedra
 */
public class MetodoE4 {

    public static void main(String[] args) {
          
        mostrarDatos("Charlotte", 21);
    }
    public static void mostrarDatos(String nombre, int edad){
       System.out.println("Nombre: " + nombre);
       System.out.println("Edad: " + edad);
       
       if(edad >= 18){
           System.out.println("Es mayor de edad");
       } else {
           System.out.println("Es menor de edad");
       }
        
    }
}
