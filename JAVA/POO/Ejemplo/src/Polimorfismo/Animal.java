package Polimorfismo;

public abstract class Animal {

    public abstract String ruido();

    public String pisar(Animal a){
        return a.ruido()+" "+a.ruido()+" "+a.ruido();
    }

    public String pisarDoble(Animal a1, Animal a2){
        return this.pisar(a1)+" "+this.pisar(a2);
    }

    static public void hacerRuido(Animal[] a){

        for(Animal b:a){
            System.out.println(b.ruido());
        }

    }

}
