import java.util.Scanner;

public class calculadora{
	
    public static void main(String[] args) {
        new calculadora().contenido();
        
    }
    
    public void contenido(){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int opcion;
    	
    	System.out.println("Opciones disponibles: \n 1.- Sumar \n 2.- Restar \n 3.- Multiplicar \n 4.- Dividir \n 5.- Potencias \n 6.- Raíz cuadrada \n ¿Qué quiere hacer?");
    	opcion = sc.nextInt();
    	
    	switch(opcion) {
    	
    	case 1: 
    		
    		double sumando1;
    		double sumando2;
    		
    		System.out.println("Primer sumando:");
    		sumando1 = sc.nextInt();
    		
    		System.out.println("Segundo sumando:");
    		sumando2 = sc.nextInt();
    		
    		double suma = sumando1 + sumando2;
    		
    		System.out.println( sumando1 +" + "+ sumando2 +" = "+ suma);
    	
    		break;
    		
    	case 2:
    		
    		double minuendo;
    		double sustraendo;
    		
    		System.out.println("Minuendo:");
    		minuendo = sc.nextInt();
    		
    		System.out.println("Sustraendo:");
    		sustraendo = sc.nextInt();
    		
    		double resta = minuendo - sustraendo;
    		
    		System.out.println(minuendo +"-"+ sustraendo +"="+ resta);
    		
    		break;
    		
    	case 3:
    		
    		double factor1;
    		double factor2;
    		
    		System.out.println("Primer factor:");
    		factor1 = sc.nextInt();
    		
    		System.out.println("Segundo factor:");
    		factor2 = sc.nextInt();
    		
    		double mult = factor1 * factor2;
    		
    		System.out.println(factor1 +" x "+ factor2 +"="+ mult);
    		
    		break;
    		
    	case 4:
    		
    		double dividendo;
    		double divisor;
    		
    		System.out.println("Dividendo:");
    		dividendo = sc.nextInt();
    		
    		System.out.println("Divisor");
    		divisor = sc.nextInt();
    		
    		double div = dividendo / divisor;
    		double resto = dividendo % divisor;
    		
    		System.out.println(dividendo +" / "+ divisor +" = "+ div +" Resto = "+ resto);
    		
    		break;
    		
    	case 5:
    		
    		double base;
    		double exponente;
    		
    		System.out.println("Base:");
    		base = sc.nextInt();
    		
    		System.out.println("Exponente");
    		exponente = sc.nextInt();
    		
    		double potencia = Math.pow(base, exponente);
    		
    		System.out.println(base +" ^ "+ exponente +" = "+ potencia);
    		
    		break;
    		
    	case 6:
    		
    		double radicando;
    		
    		System.out.println("Radicando:");
    		radicando = sc.nextInt();
   
    		double raiz = Math.sqrt(radicando);
    		
    		System.out.println("√"+ radicando +" = "+ raiz);
    		
    		break;
    		
    	}
    	
    	sc.close();
    	
    }
    
}