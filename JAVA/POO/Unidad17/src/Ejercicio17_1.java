import java.util.Scanner;

public class Ejercicio17_1 {

    public static void main(String[] args) {
        new Ejercicio17_1().contenido();
        //Programa que dice el horóscopo a partir del día y mes de nacimiento

    }

    public static String signoZodiaco(int dia, int mes){
        String signo = "";
        if(mes > 12 || mes < 1){
            throw new IllegalArgumentException();
        }
        if(dia < 1 || dia > 31){
            throw new IllegalArgumentException();
        }
        switch(mes) {
            case 1:
                if (dia <= 19) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
                break;
            case 2:
                if (dia <= 18) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                } if (dia > 29){
                    throw new IllegalArgumentException();
            }
                break;
            case 3:
                if (dia <= 20) {
                    signo = "Piscis";
                } else {
                    signo = "Aries";
                }
                break;
            case 4:
                if (dia <= 19) {
                    signo = "Aries";
                } else {
                    signo = "Tauro";
                }
                break;
            case 5:
                if (dia <= 20) {
                    signo = "Tauro";
                } else {
                    signo = "Géminis";
                }
                break;
            case 6:
                if (dia <= 20) {
                    signo = "Géminis";
                } else {
                    signo = "Cáncer";
                }
                break;
            case 7:
                if (dia <= 22) {
                    signo = "Cáncer";
                } else {
                    signo = "Leo";
                }
                break;
            case 8:
                if (dia <= 22) {
                    signo = "Leo";
                } else {
                    signo = "Virgo";
                }
                break;
            case 9:
                if (dia <= 22) {
                    signo = "Virgo";
                } else {
                    signo = "Libra";
                }
                break;
            case 10:
                if (dia <= 22) {
                    signo = "Libra";
                } else {
                    signo = "Escorpio";
                }
                break;
            case 11:
                if (dia <= 21) {
                    signo = "Escorpio";
                } else {
                    signo = "Sagitario";
                }
                break;
            case 12:
                if (dia <= 21) {
                    signo = "Sagitario";
                } else {
                    signo = "Capicornio";
                }
                break;
        }
        return signo;
    }

    public void contenido() {

        Scanner sc = new Scanner(System.in);

        boolean fallo;
        do{
            try{
                System.out.println("Introduza el día que nació:");
                int dia = Integer.parseInt(sc.nextLine());
                System.out.println("Introduzca el mes en que nació (número):");
                int mes = Integer.parseInt(sc.nextLine());
                System.out.println(signoZodiaco(dia, mes));
                fallo = false;
            } catch (IllegalArgumentException e){
                System.out.println("Los valores introducidos son inválidos.");
                fallo = true;
            }
        } while (fallo);
        sc.close();

    }
}
