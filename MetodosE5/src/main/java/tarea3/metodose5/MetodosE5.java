package tarea3.metodose5;

/**
 *
 * @author Naomi Charlotte Leon Saavedra
 */
public class MetodosE5 {

    public static void main(String[] args) {
        operaciones(5,7);
    }
    public static void operaciones(double a, double b){
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Residuo: " + (a % b));
    }
}
