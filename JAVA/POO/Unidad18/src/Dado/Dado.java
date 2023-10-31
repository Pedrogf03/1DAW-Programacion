package Dado;

public class Dado {

    private int numCaras = 6;
    private int caraSuperior;

    public Dado(){
        this.caraSuperior = (int)(Math.random()*6+1);
    }

    public Dado(int caraSuperior){
        this.caraSuperior = caraSuperior;
    }

    public Dado(int caraSuperior, int caras){
        this.caraSuperior = caraSuperior;
        this.numCaras = caras;
    }

    public int getNumCaras() {
        return numCaras;
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }

    public Dado roll(){
        this.caraSuperior = (int)(Math.random()*this.numCaras+1);
        return this;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "numCaras=" + numCaras +
                ", caraSuperior=" + caraSuperior +
                '}';
    }

}
