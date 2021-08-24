import java.util.Scanner;

public class MetodoBiseccion {

    private static void biseccion(double a, double b, double e) {
        // Este método calcula la raiz aproximada de la funcion utilizando.
        // El método de Bisección.

        double r;

        // Debe cumplir con el teorema de bolzano.
        if (funcion(a) * funcion(b) < 0) {
            do {
                r = ((a + b) / 2);
                if (funcion(a) * funcion(r) < 0) {
                    b = r;
                } else {
                    a = r;
                }
            } while (Math.abs(funcion(r)) <= e);

            System.out.println("Raiz Aproximada: " + r);

        } else {

            System.out.println("No cumple con la condición inicial funcion(a)*funcion(b) < 0.");
        }
    }

    private static double funcion(double x) {
        // Aqui se ingresa la función a evaluar
        double resultado;

        resultado = (Math.pow(x, 3)) - (2 * x) - 1;

        return resultado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese E: ");
        double e = sc.nextDouble();

        // Llamado al método Biseccion
        biseccion(a, b, e);

        sc.close();
    }

}