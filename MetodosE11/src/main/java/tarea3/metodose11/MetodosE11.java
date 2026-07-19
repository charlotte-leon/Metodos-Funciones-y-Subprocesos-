package tarea3.metodose11;

/**
 *
 * @author Naomi Charlotte Leon Saavedra
 */
public class MetodosE11 {

    public static void main(String[] args) {
        int num = 24;
        
        boolean result = esPar(num);
        
        System.out.println("---- VERIFICACIÓN DE PARIDAD ----");
        System.out.println("Número evaluado: " + num);
        
        if (result) {
            System.out.println("El número ingresado es un número PAR.");
        } else {
            System.out.println("El número ingresado es un número IMPAR.");
        }
    }
    
    public static boolean esPar(int numero) {
        if (numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}