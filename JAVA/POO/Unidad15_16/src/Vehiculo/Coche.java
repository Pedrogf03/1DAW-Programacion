package Vehiculo;

public class Coche extends Vehiculo{

    public Coche(String modelo){
        super(modelo);
    }

    public void quemaRueda(){
        System.out.println("Has quemado rueda.");
    }

}
