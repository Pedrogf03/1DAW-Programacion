package funciones;

public class Funciones {

	public static int voltea(int num) {
		int volteado = 0;
		while(num > 0) {
			volteado = (volteado * 10) + (num % 10);
			num /= 10;
		}
		return volteado;	
	}
	
	public static boolean esCapicua(int num) {
		boolean capicua = false;
		if(voltea(num) == num) {
			capicua = true;
		}
		return capicua;
	}
	
}
