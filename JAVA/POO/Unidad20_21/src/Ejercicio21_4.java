import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio21_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena de ([<>]) para verificarla:");
        String verificar = sc.nextLine();

        LinkedList<String> cadena = new LinkedList<>();

        int i = 0;
        while(i < verificar.length()){
            String caracter = verificar.substring(i,i+1);
            switch (caracter) {
                case "(":
                    cadena.addLast(caracter);
                    break;
                case "[":
                    cadena.addLast(caracter);
                    break;
                case "<":
                    cadena.addLast(caracter);
                    break;
                case ")":
                    if (cadena.getLast().equals("(")) {
                        cadena.removeLast();
                    }
                    break;
                case "]":
                    if (cadena.getLast().equals("[")) {
                        cadena.removeLast();
                    }
                    break;
                case ">":
                    if (cadena.getLast().equals("<")) {
                        cadena.removeLast();
                    }
                    break;
            }
            i++;
        }

        if(cadena.isEmpty()){
            System.out.println("Cadena correcta.");
        } else {
            System.out.println("Cadena incorrecta.");
        }

    }

}
