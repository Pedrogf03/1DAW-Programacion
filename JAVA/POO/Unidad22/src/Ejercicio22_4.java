import java.util.*;

public class Ejercicio22_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Float> mercado = new HashMap<>();
        mercado.put("Avena", 2.21f);
        mercado.put("Garbanzos", 2.39f);
        mercado.put("Tomate", 1.59f);
        mercado.put("Jengibre", 3.13f);
        mercado.put("Quinoa", 4.50f);
        mercado.put("Guisantes", 1.60f);

        HashMap<String, Integer> carrito = new HashMap<>();

        boolean salir = false;
        do{
            System.out.println("""
                    Elija una opción:
                    1.- Productos disponibles.
                    2.- Añadir al carrito.
                    3.- Consultar carrito.
                    4.- Salir.""");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> {
                    Set<String> productos = mercado.keySet();
                    Collection<Float> precios =  mercado.values();
                    for(String s: productos){
                        Float precio = mercado.get(s);
                        System.out.println(s +": "+ precio +"€");
                    }
                }
                case 2 -> {
                    String producto;
                    do{
                        System.out.println("Producto:");
                        producto = sc.nextLine().toLowerCase();
                        producto = producto.substring(0, 1).toUpperCase() + producto.substring(1).toLowerCase();
                        if(mercado.containsKey(producto)){
                            System.out.println("Cantidad:");
                            int cantidad = Integer.parseInt(sc.nextLine());
                            carrito.put(producto, cantidad);
                        } else {
                            if(!producto.toLowerCase().equals("fin")){
                                System.out.println("Ese producto no existe.");
                            }
                        }
                    } while(!producto.toLowerCase().equals("fin"));
                }
                case 3 -> {
                    Set<String> productos = carrito.keySet();
                    Collection<Integer> precios =  carrito.values();
                    float total = 0;
                    System.out.printf("%-9s %-6s %-8s %-7s", "Productos", "Precio", "Cantidad", "Subtotal");
                    System.out.println();
                    System.out.println("---------------------------------");
                    for(String s: productos){
                        float subtotal = mercado.get(s) * carrito.get(s);
                        total += subtotal;
                        System.out.printf("%-9s %6.2f %-8d %-7.2f", s, mercado.get(s), carrito.get(s), subtotal);
                        System.out.println();
                    }
                    System.out.println("---------------------------------");
                    System.out.printf("Total: %.2f€", total);
                    System.out.println();
                }
                case 4 -> salir = true;
            }

        } while (!salir);

    }

}
