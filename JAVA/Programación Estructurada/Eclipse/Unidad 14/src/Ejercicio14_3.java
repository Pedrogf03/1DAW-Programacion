import java.util.Scanner;
public class Ejercicio14_3 {

	public static void main(String[] args) {
		new Ejercicio14_3().contenido();
		//Convierte en función el ejercicio 9.12

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int num = sc.nextInt();
		sc.close();
		
		System.out.print(num);	
		if (!primo(num)){
			System.out.print(" no");
		}	
		System.out.println(" es primo");
		
	}
	
	static public boolean primo(int num) {
		
		boolean primo = false;
		int div = 0;
		int contador = 0;
		
		for(int i = 1; i <= num; i++) {		
			div = num % i;
			if(div == 0) {				
				contador++;
			}
		}
		
		if(contador <= 2) {			
			primo = true;
		}
		
		return primo;
		
	}
}
