import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio22_3 {

    public static void main(String[] args) {

        HashMap<String, String> Capitales = new HashMap<>();
        Capitales.put("España", "Madrid");
        Capitales.put("Francia", "París");
        Capitales.put("Portugal", "Lisboa");

        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        do{

            System.out.println("""
                    Elija una opción:
                    1.- Paises disponibles
                    2.- Consultar capital
                    3.- Introducir nuevo país
                    4.- Salir""");
            int option = Integer.parseInt(sc.nextLine());
            String pais;
            switch (option) {
                case 1 -> {
                    Set<String> paises = Capitales.keySet();
                    System.out.println(paises);
                }
                case 2 -> {
                    System.out.println("Introduzca el país:");
                    pais = sc.nextLine();
                    System.out.println(Capitales.getOrDefault(pais, "Ese país no existe en la BBDD"));
                }
                case 3 -> {
                    System.out.println("Introduzca el nombre del país que quiere añadir:");
                    pais = sc.nextLine();
                    System.out.println("Introduzaca la capital de ese país:");
                    String capital = sc.nextLine();
                    Capitales.put(pais, capital);
                }
                case 4 -> salir = true;
            }

        } while (!salir);

    }

}
