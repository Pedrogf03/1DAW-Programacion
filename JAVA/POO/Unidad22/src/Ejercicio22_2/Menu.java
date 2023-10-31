package Ejercicio22_2;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String nombre;
        double sueldo;
        Empleado borrar;
        Set<Empleado> empleados = new HashSet<>();

        do{
            System.out.println("""
                    Opciones disponibles:
                    1.-Introducir empleado.
                    2.-Listar empleados.
                    3.-Eliminar empleado.
                    4.-Borrar todos.
                    5.-Mostrar nº de empleados.
                    6.-Buscar
                    7.-Salir""");

            int option = Integer.parseInt(sc.nextLine());

            while(option < 1 || option > 7){
                System.out.println("Opción inválida.");
                option = Integer.parseInt(sc.nextLine());
            }

            switch (option) {
                case 1 -> {
                    System.out.println("Introduzca el nombre del empleado:");
                    nombre = sc.nextLine();
                    System.out.println("Introduzca el sueldo del empleado:");
                    sueldo = Double.parseDouble(sc.nextLine());
                    empleados.add(new Empleado(nombre, sueldo));
                }
                case 2 -> {
                    System.out.println("Empleados:");
                    for (Empleado e : empleados) {
                        System.out.println(e);
                    }
                    System.out.println();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Introduzca el nombre del empleado que desea eliminar:");
                    nombre = sc.nextLine();
                    borrar = new Empleado(nombre, 0);
                    empleados.remove(borrar);
                    System.out.println("El empleado \"" + nombre + "\" ha sido eliminado.");
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("¿Seguro que quiere eliminar todos los empleados?\nS | N");
                    nombre = sc.nextLine().toUpperCase();
                    if (nombre.equals("S")) {
                        empleados.removeAll(empleados);
                    }
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("Actualmente hay " + empleados.size() + " empleados.");
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("Introduzca el nombre del empleado que está buscando:");
                    nombre = sc.nextLine().toLowerCase();
                    nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
                    borrar = new Empleado(nombre, 0);
                    if(!empleados.contains(borrar)){
                        System.out.println("No existe un empleado con ese nombre.");
                    } else {
                        for(Empleado e: empleados){
                            if(e.equals(borrar)){
                                System.out.println(e);
                            }
                        }
                    }
                    System.out.println();
                }
                case 7 -> {
                    System.out.println("Saliendo...");
                    salir = true;
                }
            }

        } while (!salir);

    }

}
