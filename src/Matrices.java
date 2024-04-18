import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        // Las matrices son bidimencionales, osea mas de una, va a tener filas y va atener columnas.

        // Declaración.
        int matriz [][]= new int[3][3];

        // Asignación manual.
        /*
        matriz [0][0] = 5;
        matriz [0][1] = 41;
        matriz [0][2] = 65;

        matriz [1][0] = 5;
        matriz [1][1] = 41;
        matriz [1][2] = 65;

        matriz [2][0] = 5;
        matriz [2][1] = 41;
        matriz [2][2] = 65;
        */

        Scanner teclado = new Scanner(System.in);
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Ingrese el valor de la fila " + fila + " y de la columna " + columna);
                matriz[fila][columna] = teclado.nextInt();
            }
        }

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("El valor de la fila es " + fila + " y de la columna es " + columna);
                System.out.println("Es de: " + matriz[fila][columna]);
            }
        }
        
    }
}
