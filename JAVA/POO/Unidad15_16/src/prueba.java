public class prueba {

    public static void main(String[] args) {

        int num1 = 250;
        int num2 = 500;

        while(mcd(num1, num2) > 1){
            int divisor = mcd(num1, num2);
            num1 = num1 / divisor;
            num2 = num2 / divisor;
        }

        System.out.println(num1 +" "+ num2);

    }

    public static int mcd(int num1, int num2){


        int i;
        if(num1 < num2){
            i = num1;
        } else {
            i = num2;
        }

        while(num1 % i != 0 || num2 % i != 0){
            i--;
        }

        return i;

    }

}
