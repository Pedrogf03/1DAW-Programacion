package Excepciones;
import java.util.Scanner;
public class DivisionEntera {

    static public int preguntaEntero(String mensaje){
        Scanner sc = new Scanner(System.in);
        boolean haFallado;
        int num = 0;
        System.out.print(mensaje);
        do {
            try {
                if (sc.hasNextLine()) {
                    num = Integer.parseInt(sc.nextLine());
                }
                haFallado = false;
            } catch (NumberFormatException e) {
                System.out.print("No es un número entero. ");
                System.out.print(mensaje);
                haFallado = true;
            }
        } while (haFallado);
        return num;
    }

    static public double preguntaDouble(String mensaje){
        Scanner sc = new Scanner(System.in);
        boolean haFallado;
        double num = 0;
        System.out.print(mensaje);
        do {
            try {
                if (sc.hasNextLine()) {
                    num = Integer.parseInt(sc.nextLine());
                }
                haFallado = false;
            } catch (NumberFormatException e) {
                System.out.print("No es un número entero. ");
                System.out.print(mensaje);
                haFallado = true;
            }
        } while (haFallado);
        return num;
    }

    public static void main(String[] args) {

        int a = preguntaEntero("Introduzca un número: ");
        int b = preguntaEntero("Introduzca otro número: ");
        int resultado = a/b;
        System.out.println(resultado);

        double c = preguntaDouble("Introduzca un número: ");
        double d = preguntaDouble("Introduzca otro número: ");
        double resultadoD = c/d;
        System.out.println(resultadoD);

    }

}
