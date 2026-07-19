package tarea3.metodose2;

/**
 *
 * @author Naomi Charlotte Leon Saavedra
 */
public class MetodosE2 {

    public static void main(String[] args) {
        pares();
    }
    
    public static void pares(){
        for(int i = 2; i < 101; i+=2){
            System.out.print(i + " ");
            
            if(i == 50){
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
}
