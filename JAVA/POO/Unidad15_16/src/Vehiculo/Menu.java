package Vehiculo;
import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bicicleta bici = new Bicicleta("BMX");
        Coche coche = new Coche("Audi");

        int opcion;

        do{
            System.out.println("Vehículos\n"+
                    "---------\n"+
                    "1. Andar con la bicicleta.\n"+
                    "2. Hacer el caballito con la bicicleta.\n"+
                    "3. Andar con el coche.\n"+
                    "4. Quemar rueda con el coche.\n"+
                    "5. Ver kilometraje de la bicicleta.\n"+
                    "6. Ver kilometraje del coche.\n"+
                    "7. Ver kilometraje total.\n"+
                    "8. Salir");

            opcion = sc.nextInt();
            while(opcion < 1 || opcion > 8){
                System.out.println("Opción inválida, elija una opción del menú.");
            }

            switch(opcion){
                case 1:
                    bici.andar();
                    break;
                case 2:
                    bici.caballito();
                    break;
                case 3:
                    coche.andar();
                    break;
                case 4:
                    coche.quemaRueda();
                    break;
                case 5:
                    bici.verKm();
                    break;
                case 6:
                    coche.verKm();
                    break;
                case 7:
                    Vehiculo.verKmTotal();
                    break;
                default:
                    break;
            }

            sc.nextLine();
            sc.nextLine();

        } while (opcion != 8);

    }

}
