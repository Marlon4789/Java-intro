import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class EjercicioCondicionales {

    public static void main(String[] args) {
        // Ejercicio de calcular tasa de intereses por inversion, mensual, semestral, anual.

        int categoria;
        double invertir = 0;
        double inversionTotal = 0;
        double comisionDelMonto = 0.005;

        System.out.println("*************************************");
        System.out.println("Bienvenido al fonde de inversión Mu-Banck");
        System.out.println("*************************************");
        System.out.println("Escoja la categoria de la inversión: ");
        System.out.println("1.Mensual 1%");
        System.out.println("2.Semestral 2%");
        System.out.println("3.Anual 2.8");

        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();

        System.out.println("¿Cuánto dinero desea invertir? ");

        Scanner agregarCantidad = new Scanner(System.in);
        invertir = agregarCantidad.nextDouble();

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#,##0.00", symbols);


        if (categoria == 1) {
            inversionTotal = invertir + (invertir * 0.01);
            inversionTotal = inversionTotal - (inversionTotal * comisionDelMonto);

            System.out.println("Comisión por inversión 0.5% sobre el capital invertido.");
            System.out.println("Total fondo a desenbolsar en un mes es: " + df.format(inversionTotal));

        } else if (categoria == 2) {
            inversionTotal = invertir + (6 * (invertir * 0.02));
            inversionTotal = inversionTotal - (6 * (inversionTotal * comisionDelMonto));

            System.out.println("Comisión por inversión 0.5% sobre el capital invertido.");
            System.out.println("Total fondo a desenbolsar en un semestre es: " + df.format(inversionTotal));
        } else if (categoria == 3) {
            inversionTotal = invertir + (12 * (invertir * 0.028));
            inversionTotal = inversionTotal - (12 * (inversionTotal * comisionDelMonto));

            System.out.println("Comisión por inversión 0.5% sobre el capital invertido.");
            System.out.println("Total fondo a desenbolsar en un año: " + df.format(inversionTotal));
        }
    }
}
