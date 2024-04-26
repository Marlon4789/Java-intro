public class CicloRepetitivo {
    public static void main(String[] args) {
        // While controlado por contador.

        int cont = 1;

        while (cont <= 10) {
            System.out.println("Estoy en la vuelta numero: " + cont);
            cont += 1;
        }

        // While controlado por centinela.

        boolean centinela = true;

        while (centinela == true) {
            System.out.println("El centinela es: " + centinela);

            centinela = false;
        }

    }
}
