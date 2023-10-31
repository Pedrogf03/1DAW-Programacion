import java.util.Scanner;
public class DecToBin {

    public static void main(String[] args) {
        new DecToBin().contenido();
        //Programa que pase de decimal a binario.
    }

    public void contenido(){

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Introduzca un número decimal:");
            int num = sc.nextInt();
            System.out.println(binarioString(num));
        }

    }

    static public String binarioString(int num){

        String binInv = "";

        while(num >= 2){
            binInv += "" + (num % 2);
            if ((num / 2) < 2){
                binInv += "" + (num / 2);
            }
            num /= 2;
        }

        String bin = "";
        for (int i = binInv.length()-1; i >= 0; i--){
            bin += binInv.charAt(i);
        }

        return bin;

    }

}
