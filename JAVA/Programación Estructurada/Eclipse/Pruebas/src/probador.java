import java.util.Scanner;
public class probador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número:");
		int num = sc.nextInt();
		while(num < 0 || num > 100) {
			System.out.println("El número tiene que estar entre 0 y 100.");
			num = sc.nextInt();
		}
		sc.close();
		for(int i = num; i >= 1; i--) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		
	}
}
