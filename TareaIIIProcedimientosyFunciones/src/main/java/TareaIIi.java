import java.util.Scanner;
import java.util.Arrays;

public class TareaIIi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántas notas desea ingresar?: ");
        int cantidadNotas = sc.nextInt();

        double[] notas = new double[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        mostrarResultado(nombre, notas);
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return Math.round((suma / notas.length) * 100.0) / 100.0;
    }

    public static char obtenerLiteral(double promedio) {
        if (promedio >= 90) return 'A';
        else if (promedio >= 80) return 'B';
        else if (promedio >= 70) return 'C';
        else if (promedio >= 60) return 'D';
        else return 'F';
    }

    public static boolean estaAprobado(char literal) {
        return literal == 'A' || literal == 'B' || literal == 'C';
    }

    public static void mostrarResultado(String nombre, double[] notas) {
        double promedio = calcularPromedio(notas);
        char literal = obtenerLiteral(promedio);
        boolean aprobado = estaAprobado(literal);

        System.out.println("\nEstudiante: " + nombre);
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Literal: " + literal);
        System.out.println("Resultado: " + (aprobado ? "Aprobado ✅" : "Reprobado ❌"));
    }
}

