package tarea3.metodose8;

/**
 *
 * @author Naomi Charlotte Leon Saavedra
 */
public class MetodosE8 {

    public static void main(String[] args) {
        
        double b = 5.5;
        double a = 10.0;
        
        double area = calcularArea(b, a);
        
        System.out.println("---- CÁLCULO DE ÁREA ----");
        System.out.println("Base: " + b);
        System.out.println("Altura: " + a);
        System.out.println("El área calculada es: " + area);
    }
    
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
}