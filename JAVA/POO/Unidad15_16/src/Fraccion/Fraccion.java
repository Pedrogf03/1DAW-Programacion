package Fraccion;
import java.util.Scanner;
public class Fraccion {

    private int numerador;
    private int denominador;

    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void invertir(){
        int aux = this.getDenominador();
        this.setDenominador(this.getNumerador());
        this.setNumerador(aux);
    }

    public int MCD(int num1, int num2){

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

    public void simplificar(){
        while(MCD(this.getNumerador(), this.getDenominador()) > 1){
            int divisor = MCD(this.getNumerador(), this.getDenominador());
            this.setNumerador(this.getNumerador() / divisor);
            this.setDenominador(this.getDenominador() / divisor);
        }
    }

    @Override
    public String toString() {
        return "Fracción => "+ this.numerador +"/"+ this.denominador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numerador:");
        int numerador = sc.nextInt();
        System.out.println("Introduzca el denominador:");
        int denominador = sc.nextInt();
        Fraccion f = new Fraccion(numerador, denominador);
        System.out.println(f);
        f.invertir();
        System.out.println(f);
        f.invertir();
        f.simplificar();
        System.out.println(f);
    }

}
