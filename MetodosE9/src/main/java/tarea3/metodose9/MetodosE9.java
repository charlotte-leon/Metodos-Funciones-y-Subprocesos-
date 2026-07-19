package tarea3.metodose9;

/**
 *
 * @author Naomi Charlotte Leon Saavedra
 */
public class MetodosE9 {

    public static void main(String[] args) {

        double nota1 = 8.7;
        double nota2 = 6.9;
        double nota3 = 7.3;
        
        double promFinal = calcularPromedio(nota1, nota2, nota3);
        
        System.out.println("---- REPORTE DE NOTAS ----");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Promedio Final: " + promFinal);
        
        if (promFinal >= 7) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
    
    public static double calcularPromedio(double n1, double n2, double n3) {
        double prom = (n1 + n2 + n3) / 3;
        
        return prom;
    }
}