public class Ejercicio5_1 {

	public static void main(String[] args) {
		new Ejercicio5_1().contenido();
		//Programa que opera con la variable x y la variable y
	}
	public void contenido() {
		
		int x = 144;
		int y = 999;
		//Valor de las variables x e y
		
		int sumaxy;
		//Suma de x e y
		int restaxy;
		//Resta de x e y
		double divxy;
		//División de x e y
		int multxy;
		//Multiplicación de x e y
		
		sumaxy = x + y;
		restaxy = y - x;
		divxy = (double) y / (double) x;
		multxy = x * y;
		
		System.out.println("La variable x es " + x + " y la variable y es " + y);
		System.out.println("El resultado de la suma es " + sumaxy);
		System.out.println("El resultado de la resta es " + restaxy);
		System.out.println("El resultado de la división es " + divxy);
		System.out.println("El resultado de la multiplicación es " + multxy);
		
	}
	
}