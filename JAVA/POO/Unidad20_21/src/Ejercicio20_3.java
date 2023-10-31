import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio20_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Introduzca 10 números.");
        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(sc.nextLine());
            numeros.add(num);
        }

        Collections.sort(numeros);

        System.out.println("Ordenados:");
        for(int num: numeros){
            System.out.println(num);
        }

    }

}
