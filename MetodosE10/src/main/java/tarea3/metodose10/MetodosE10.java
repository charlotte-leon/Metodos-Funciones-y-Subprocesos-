package tarea3.metodose10;

/**
 *
 * @author Naomi Charlotte Leon Saavedra
 */
public class MetodosE10 {

    public static void main(String[] args) {

        int n1 = 45;
        int n2 = 72;
        
        int numMayor = mayor(n1, n2);
        
        System.out.println("---- COMPARACIÓN DE NÚMEROS ----");
        System.out.println("Primer número: " + n1);
        System.out.println("Segundo número: " + n2);
        System.out.println("El número mayor es: " + numMayor);
    }
    
    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else { 
            return b;
        }
    }
}