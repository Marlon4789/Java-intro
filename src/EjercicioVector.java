import java.util.Scanner;

public class EjercicioVector {
    public static void main(String[] args) {
        // crear un programa para cargar 15 numeros en un vector, una ves
        // cargados el programa cuente cuantas veces se ha cargado el nuero 3

        int vector[] = new int[15];

        Scanner entrada = new Scanner(System.in);

        // cargar vector
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingresar un numero:");
            vector[i] = entrada.nextInt();
        }

        // recorrer y contar cuantas veces esta el 3.
        int contador = 0;
        for (int i = 0; i < 15; i++) {
            if (vector[i] == 3){
                contador += 1;
            }
        }

        System.out.println("La cantidad de nuemros 3 que existen son: " + contador);

    }
}
