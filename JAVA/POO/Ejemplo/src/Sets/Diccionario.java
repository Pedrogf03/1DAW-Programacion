package Sets;

import java.util.*;

public class Diccionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, String> alumnos = new HashMap<>();

        alumnos.put(1, "Manuel");
        alumnos.put(2, "Celia");
        alumnos.put(3, "Pedro");
        alumnos.put(4, "Sulaiman");
        alumnos.put(5, "Manuel");

        System.out.println("Introduzca el nº exp:");
        int exp = Integer.parseInt(sc.nextLine());

        String nombre = alumnos.get(exp);

        System.out.println(nombre);

        Set<Integer> expedientes = alumnos.keySet();
        Collection<String> nombres = alumnos.values();

        System.out.println(expedientes);
        System.out.println(nombres);

    }

}
