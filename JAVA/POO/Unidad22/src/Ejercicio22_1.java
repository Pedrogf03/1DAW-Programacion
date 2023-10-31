import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio22_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String palabra;
        Set<String> palabras = new HashSet<>();

        do{
            System.out.println("Opciones disponibles:\n" +
                    "1.-Introducir palabra.\n" +
                    "2.-Listar palabras.\n" +
                    "3.-Eliminar palabra.\n" +
                    "4.-Borrar todas\n" +
                    "5.-Mostrar tamaño.\n" +
                    "6.-Buscar\n" +
                    "7.-Salir");

            int option = Integer.parseInt(sc.nextLine());

            while(option < 1 || option > 7){
                System.out.println("Opción inválida.");
                option = Integer.parseInt(sc.nextLine());
            }

            switch (option){
                case 1:
                    System.out.println("Introduzca las palabras que desea añadir, para acabar pulse intro:");
                    palabra = sc.nextLine();
                    while(!palabra.equals("")){
                        palabras.add(palabra);
                        palabra = sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Palabras introducidas:");
                    for(String p: palabras){
                        System.out.print(p +" ");
                    }
                    System.out.println();
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Introduzca la palabra que desea eliminar:");
                    palabra = sc.nextLine();
                    palabras.remove(palabra);
                    System.out.println("La palabra \""+ palabra +"\" ha sido eliminada.");
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("¿Seguro que quiere eliminar todas las palabras?\nS | N");
                    palabra = sc.nextLine().toUpperCase();
                    if(palabra.equals("S")){
                        Set<String> eliminarPalabras = new HashSet<>();
                        eliminarPalabras = palabras;
                        palabras.removeAll(eliminarPalabras);
                    }
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("Actualmente hay "+ palabras.size() +" palabras.");
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("Introduzca la palabra que está buscando:");
                    palabra = sc.nextLine();
                    System.out.print("Su palabra ");
                    if(!palabras.contains(palabra)){
                        System.out.print("no ");
                    }
                    System.out.println("existe.");
                    sc.nextLine();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }

        } while (!salir);

    }

}
