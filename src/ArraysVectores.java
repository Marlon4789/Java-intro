import java.util.Scanner;

public class ArraysVectores {
    public static void main(String[] args) {
        // Arreglos unidimensionales => poseen unicamente filas y columnas como son los vectores.

        //Vectores

        // Declaración para indicar las posicion que tendra el vector.
        int vector[] = new int[4];

        /*
         Asignación manual
        vector[0] = 1;
        vector[1] = 5;
        vector[2] = 67;
        vector[3] = 125;
        */

        // Asignación por teclado.
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el indice:");
            vector[i] = teclado.nextInt();
        }

        // Recorriendo el array con for.
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado el " + vector[i]);
            System.out.println("-------------------------------");
        }
    }
}
