import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		new Ejercicio1().contenido();

	}

	public void contenido() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int base = 1;
		int linea = 0;
		int num2 = num;
		int altura;
		
		do {
			
			System.out.println("Introduzca la altura de la pirámide: ");
			altura = sc.nextInt();
			
		} while (altura < 0);
		sc.close();
		
		while (base <= altura) {
			
			System.out.print(num +" ");
			num += 3;
			num2 = num;
			
			for(int i = 1; i <= linea; i++) {
				
				num2 -=3;
				System.out.print((num2 - 3)+" ");	
				
			}
			
		System.out.println();
		linea++;
		base++;	
		
		}
		
	}
	
}
