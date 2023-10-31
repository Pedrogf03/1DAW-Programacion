import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio20_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Introduzca números por teclado.\n" +
                "Para acabar introduzca \"-99\".");
        int num = 0;
        do{
            try{
                num = Integer.parseInt(sc.nextLine());
                if(num != -99){
                    numeros.add(num);
                }
            }catch(NumberFormatException e){
                System.out.println("Número inválido.");
            }
        }while(num != -99);

        System.out.println("Se han leído "+ numeros.size() +" números.");
        int suma = 0;
        for(int nums: numeros) {
            suma += nums;
        }
        System.out.println("La suma de todos los valores es "+ suma);
        double media = (double)suma / numeros.size();
        media = Math.round(media * 100.0) / 100.0;
        System.out.println("La media de todos los valores es "+ media);
        System.out.println("Números mayores que la media:");
        for(int nums: numeros){
            if(nums > media){
                System.out.print(nums +" ");
            }
        }

    }

}
