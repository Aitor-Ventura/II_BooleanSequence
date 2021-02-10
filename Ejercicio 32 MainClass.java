import java.util.Scanner;
/** ... */
public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Crea vector1 leyendo sus elementos
        int[] vector1 = Internal.loadIntArray(input); 

        // Crea vector2 leyendo sus elementos
        int[] vector2 = Internal.loadIntArray(input); 
        
        // Se obtiene la posición de comienzo
        System.out.print("Posición de comienzo: ");
        int n = input.nextInt();

        // Proceso y muestra del resultado
        boolean result = Excercise.matchInPos(vector1, vector2, n);
        System.out.print("El resultado es: ");
        System.out.println(result);
    }
}