package Vehiculo;

import static java.lang.Thread.sleep;

public class Vehiculo {

    public static int kmTotal;
    private String modelo;
    private int kmRecorridos;

    public Vehiculo(String modelo){
        this.modelo = modelo;
        this.kmRecorridos = kmRecorridos;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKmTotal() {
        return kmTotal;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }
    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void andar(){
        int tiempo = (int)(Math.random()*100+1);
        int km = 0;
        for(int i = 0; i <= tiempo; i++){
            km++;
        }
        this.setKmRecorridos(this.getKmRecorridos()+km);
        System.out.println("Has recorrido "+ km +" km en tu "+ this.getModelo());
        kmTotal+=km;
    }

    public void verKm(){
        System.out.println("En total has recorrido "+ this.getKmRecorridos() +" km con tu "+ this.getModelo());
    }

    static public void verKmTotal(){
        System.out.println("En total los vehículos han recorrido "+ kmTotal +" kilómetros.");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", kmRecorridos=" + kmRecorridos +
                '}';
    }
}
