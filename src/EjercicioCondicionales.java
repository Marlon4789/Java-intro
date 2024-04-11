import java.util.Scanner;

public class EjercicioCondicionales {

    public static void main(String[] args) {
        // Ejercicio de calcular tasa de intereses por inversion, mensual, semestral, anual.

        double invertir = 0;
        int categoria;
        double inversionTotal = 0;
        double comisionDelMonto = 0.005;

        System.out.println("Escoja la categoria de la inversión: ");
        System.out.println("1.Mensual 1%");
        System.out.println("2.Semestral 2%");
        System.out.println("3.Anual 2.8");

        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();

        System.out.println("¿Cuánto dinero desea invertir? ");

        Scanner agregarCantidad = new Scanner(System.in);
        invertir = agregarCantidad.nextDouble();


        if (categoria == 1) {
            inversionTotal = invertir - (invertir * comisionDelMonto);
            inversionTotal = inversionTotal + (inversionTotal * 0.01);
        }

        System.out.println("Comisión por inversión 0.5% sobre el capital invertido.");
        System.out.println("Toal fondo a desenbolar en un mes es: " + inversionTotal);


    }
}
