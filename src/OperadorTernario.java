import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // Para tomar deciciones simples o algo muy especifico.
        // Para saber si aprobo o no aprobo.

        double promedio;
        String resultadoFinal;

        System.out.println("Ingrese el promedio:");

        Scanner agregarNota = new Scanner(System.in);
        promedio = agregarNota.nextDouble();

        resultadoFinal = promedio >= 6 ? "Aprobado" : "No aprobo";

        System.out.println("Calificación final del alumno es: " + resultadoFinal);

    }
}
