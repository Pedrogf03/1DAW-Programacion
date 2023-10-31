import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio20_2 {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<>();

        int index = (int)(Math.random()*10+10);

        for(int i = 0; i < index; i++){
            numeros.add((int)(Math.random()*101));
        }

        int num1 = numeros.iterator().next();
        int suma = 0;
        int media;
        int max = num1;
        int min = num1;

        for(int num: numeros){
            if(num > max){
                    max = num;
            } else if (num < min){
                    min = num;
            }
            suma += num;
            System.out.print(num +" ");
        }

        System.out.println();
        System.out.println("Suma: "+ suma);
        media = suma / index;
        System.out.println("Media: "+ media);
        System.out.println("Mínimo: "+ min);
        System.out.println("Máximo: "+ max);

    }

}
