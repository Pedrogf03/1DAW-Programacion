
public class Ejercicio10_4 {

	public static void main(String[] args) {
		new Ejercicio10_4().contenido();
		//Programa que muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. Muestra también el máximo, el mínimo y la media de esos números.

	}
	
	public void contenido() {
		
		int suma = 0;
		int num;
		int num2 = 200;
		int num3 = -1;
		int mayor = 0;
		int menor= 0;
		
		for(int i = 1; i <= 50; i++) {
			
			num = (int)(Math.random()*100+100);
			System.out.print(num + " ");
			
			suma += num;
			
			if(num < num2) {
				
				menor = num;
				num2 = num;
				
			} else if (num > num2) {
				
				menor = num2;

			}
			
			if(num > num3) {
				
				mayor = num;
				num3 = num;
				
			} else if (num < num3) {
				
				mayor = num3;

			}
			
		}
		
		System.out.println();
		System.out.println("La media es "+ suma/50 +", el menor es "+ menor +" y el mayor es "+ mayor);
		
	}

}
