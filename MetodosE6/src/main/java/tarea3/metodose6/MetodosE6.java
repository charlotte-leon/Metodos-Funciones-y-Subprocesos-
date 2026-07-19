    package tarea3.metodose6;

    /**
     *
     * @author Naomi Charlotte Leon Saavedra
     */
    public class MetodosE6 {
        public static void main(String[] args) {

            int num = obtenerNumero();

            System.out.println("---- RESULTADO ----");
            System.out.println("El número obtenido es: " + num);

        }
        public static int obtenerNumero() {

            int numAleatorio = (int) (Math.random() * 100) + 1;

            return numAleatorio;
        }
    }