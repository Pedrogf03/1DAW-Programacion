package Ejercicio3;

import java.util.Scanner;

public class Ejecutar {

    public static final String nombres[] = {"Fernando", "Laura", "Pepe", "Eufrasio", "Carlos", "Jesús", "Paco", "Román", "Rachid", "Pedro"};

    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula("Spider-Man: No way Home", 150, 12, "Bad Bunny");


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de filas");
        int filas = sc.nextInt();

        System.out.println("Introduce el numero de columnas");
        int columnas = sc.nextInt();

        System.out.println("Introduce el precio de la entrada de cine");
        double precio = sc.nextDouble();

        Cine cine = new Cine(filas, columnas, precio, pelicula);
        cine.rellenaButacas();

        System.out.println("Introduce el numero de espectadores a crear");
        int numEspectadores = sc.nextInt();

        Espectador e;
        int fila;
        char letra;

        System.out.println("Espectadores generados: ");
        //Termino cuando no queden espectadores o no haya mas sitio en el cine
        for (int i = 0; i < numEspectadores && cine.haySitio(); i++) {

            //Generamos un espectador
            e = new Espectador(
                    nombres[generaNumeroEnteroAleatorio(0, nombres.length - 1)], //Nombre al azar
                    generaNumeroEnteroAleatorio(10, 30), //Generamos una edad entre 10 y 30
                    generaNumeroEnteroAleatorio(1, 10)); //Generamos el dinero entre 1 y 10 euros

            //Mostramos la informacion del espectador
            System.out.println(e);

            //Generamos una fila y letra
            //Si esta libre continua sino busca de nuevo
            do {

                fila = generaNumeroEnteroAleatorio(0, cine.getFilas() - 1);
                letra = (char) generaNumeroEnteroAleatorio('A', 'A' + (cine.getColumnas()-1));

            } while (cine.butacaOcupada(fila, letra));

            //Si el espectador cumple con las condiciones
            if (cine.sePuedeSentar(e)) {
                e.pagar(cine.getPrecio()); //El espectador paga el precio de la entrada
                cine.sentar(fila, letra, e); //El espectador se sienta
            }

        }

        System.out.println("");
        cine.mostrar();

        System.out.println("Fin");

    }

}
