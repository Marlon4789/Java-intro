import java.util.Scanner;

public class EjercicioMatrices {
    public static void main(String[] args) {

        // Declaración.
        double matriz [][]= new double[4][4];
        Scanner entrada = new Scanner(System.in);
        double suma = 0.0;

        // for para cargar las filas.
        for (int f = 0; f < 4; f++) {

            // for para cargar las columnas.
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la calificacion del alumno Nº " + f);
                matriz[f][c] = entrada.nextDouble();

                // sumar calificación de las tres columnas.
                suma = suma + matriz[f][c];
            }

            // sacar promedio de las notas sumadas.
            matriz[f][3] = suma / 3;

            // volver a comenzar la suma en la siguiente fila
            suma = 0.0;
        }
        
        // for para recorrer
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno Nº " + f + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota Nº " + c + " " + matriz[f][c]);
            }
            System.out.println("El promedio las notas son: " + matriz[f][3]);
        }


    }
}
