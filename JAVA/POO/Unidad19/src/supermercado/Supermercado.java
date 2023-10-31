package supermercado;

public class Supermercado {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Pedro", "González", "Fernández", "12345678A", "1", "123456789", "A1");
        Dependiente d1 = new Dependiente("Borja", "Fernández", "Correa", "12345678B", "2", "234567891", "123456789", 1200, Personal.Turno.M, Dependiente.Especialidad.CAJA);
        Dependiente d2 = new Dependiente("Manuel", "Gómez", "Lora", "12345678C", "3", "345678912", "234567891", 1150, Personal.Turno.N, Dependiente.Especialidad.PESCADERIA);

        System.out.println(c1);
        for(int i = 0; i < 99; i++){
            c1.comprar();
        }
        System.out.println(c1);
        c1.comprar();
        System.out.println(c1);

        System.out.println(d1);
        System.out.println(d2);

    }

}
