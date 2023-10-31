import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio20_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();

        System.out.println("Introduzca 10 palabras.");
        for(int i = 0; i < 10; i++){
            String palabra = sc.next();
            palabras.add(palabra);
        }

        Collections.sort(palabras);

        System.out.println("Ordenadas:");
        for(String palabra: palabras){
            System.out.println(palabra);
        }

    }

}
