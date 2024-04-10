public class ejercicios {
    public static void main(String[] args) {

        // asignar dos numeros a dos variables y al ejecutar imprima el valor de las varibles de forma inversa.

        int num1 = 35;
        int num2 = 20;
        int unx;

        System.out.println("-----valor al inicio-------");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        unx = num2;

        num2 = num1;
        num1 = unx;

        System.out.println("-----valor final-------");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }
}
