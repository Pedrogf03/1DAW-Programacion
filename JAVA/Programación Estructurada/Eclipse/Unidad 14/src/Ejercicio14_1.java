import java.util.Scanner;
public class Ejercicio14_1 {

	public static void main(String[] args) {
		new Ejercicio14_1().contenido();
		//Convierte en función el ejercicio 8.5

	}

	public void contenido() {

		Scanner sc = new Scanner(System.in);

		int diasMes;

		System.out.println("Introduzca su mes de nacimiento (número):");
		int mes = sc.nextInt();
		while(mes < 1 || mes > 12) {
			System.out.println("Error, introduzca de nuevo:");
			mes = sc.nextInt();
		}

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			diasMes = 31;
		} else if (mes == 2) {
			diasMes = 29;
		} else {
			diasMes = 30;
		}

		System.out.println("Introduzca su dia de nacimiento:");
		int dia = sc.nextInt();		
		while (dia < 1 || dia > diasMes) {
			System.out.println("Error, introduzca de nuevo:");
			dia = sc.nextInt();
		}	

		sc.close();
		
		System.out.println(signo(dia, mes));

	}

	static public String signo(int dia, int mes) {

		String signo = "";

		switch(mes) {	
		case 1:
			if (dia <= 19) {
				signo = "Capricornio";
			} else {
				signo = "Acuario";
			}
			break;
		case 2:
			if (dia <= 18) {
				signo = "Acuario";
			} else {
				signo = "Piscis";
			}
			break;
		case 3:
			if (dia <= 20) {
				signo = "Piscis";
			} else {
				signo = "Aries";
			}
			break;
		case 4:
			if (dia <= 19) {
				signo = "Aries";
			} else {
				signo = "Tauro";
			}
			break;
		case 5:
			if (dia <= 20) {
				signo = "Tauro";
			} else {
				signo = "Géminis";
			}
			break;
		case 6:
			if (dia <= 20) {
				signo = "Géminis";
			} else {
				signo = "Cáncer";
			}
			break;
		case 7:
			if (dia <= 22) {
				signo = "Cáncer";
			} else {
				signo = "Leo";
			}
			break;
		case 8:
			if (dia <= 22) {
				signo = "Leo";
			} else {
				signo = "Virgo";
			}
			break;
		case 9:
			if (dia <= 22) {
				signo = "Virgo";
			} else {
				signo = "Libra";
			}
			break;
		case 10:
			if (dia <= 22) {
				signo = "Libra";
			} else {
				signo = "Escorpio";
			}
			break;
		case 11:
			if (dia <= 21) {
				signo = "Escorpio";
			} else {
				signo = "Sagitario";
			}
			break;
		case 12:
			if (dia <= 21) {
				signo = "Sagitario";
			} else {
				signo = "Capicornio";
			}
			break;
		}
		
		return signo;

	}
}

