package Corredor;

import java.util.Scanner;

public class Pista {

    public static void main(String[] args) {

        Corredor c = null;
        int energia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Energía de su corredor:");
        energia = Integer.parseInt(sc.nextLine());

        boolean valid;
        do{
            try{
                c = new Corredor(energia);
                valid = true;
            } catch (IllegalArgumentException e){
                System.out.println("La cantidad de energía está fuera de los parámetros. Inténtelo otra vez.");
                energia = Integer.parseInt(sc.nextLine());
                valid = false;
            }
        } while(!valid);

        try{
            for(int i = 0; i < 5; i++){
                c.correr();
            }
        } catch (AgotadoException e){
            System.out.println("El corredor está agotado.");
        }

        c.entrenar();
        c.entrenar();
        c.entrenar();

        try{
            for(int i = 0; i < 10; i++){
                c.correr();
            }
        } catch (AgotadoException e){
            System.out.println("El corredor está agotado.");
        }

    }

}
