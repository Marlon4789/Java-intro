//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String name = "Toby";
        int age= 28;
        System.out.println("My names is " + name + " and I'm " + age + " years old.");

        // tipos de datos numericos

        // byte: 1 byte short: 2 bytes int: 4 bytes double : 4 bytes long: 8 bytes

        int n = 1234567890;
        long mL = 123456789014L;

        float nF = 12.56F;
        double nD = 4545.78787878;

        // condicional if

        int age2 = 12;

        if (age2 >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (age2 <= 14) {
            System.out.println("Eres un adolecente");
        } else {
            System.out.println("Eres menor de edad");
        }

        // condicional switch

        int dia = 3;
        String nombreDia;

        switch (dia) {
            case 1:nombreDia="lunes";
                break;
            case 2:nombreDia="martes";
                break;
            case 3:nombreDia="miercoles";
                break;
            case 4:nombreDia="jueves";
                break;
            case 5:nombreDia="viernes";
                break;
            case 6:nombreDia="sabado";
                break;
            case 7:nombreDia="domingo";
                break;
            default: nombreDia="invalido";
        }

        System.out.println("el dia de la semana es: " + nombreDia);
    }
}