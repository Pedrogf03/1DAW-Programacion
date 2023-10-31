package Corredor;

public class Corredor {

    private int energia;
    private int entrenamientos = 0;

    public Corredor(int energia) throws IllegalArgumentException{
        if(energia < 0 || energia > 100){
            throw new IllegalArgumentException();
        } else {
            this.energia = energia;
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if(energia < 0 || energia > 100){
            throw new IllegalArgumentException();
        } else {
            this.energia = energia;
        }
    }

    public int getEntrenamientos() {
        return entrenamientos;
    }

    public void setEntrenamientos(int entrenamientos) {
        this.entrenamientos = entrenamientos;
    }

    public void recargarEnergia(int energia){
        if(energia < 0 || energia > 100){
            throw new IllegalArgumentException();
        } else {
            if(this.getEnergia() + energia >= 100){
                this.setEnergia(100);
            } else {
                this.setEnergia(this.getEnergia()+energia);
            }
        }
    }

    public void correr() throws AgotadoException{
        if(this.getEnergia() < 10){
            System.out.println("El corredor tenía "+ this.getEnergia() +" energía.");
            this.setEnergia(0);
            throw new AgotadoException();
        } else {
            this.setEnergia(this.getEnergia()-10);
            System.out.println("-10 energía.");
        }
    }

    public void entrenar(){
        if(this.getEntrenamientos() == 0){
            if(this.getEnergia()+50 > 100){
                this.setEnergia(100);
            } else {
                this.setEnergia(this.getEnergia()+50);
            }
            System.out.println("Energia recargada(+50)");
        } else if(this.getEntrenamientos() == 1){
            if(this.getEnergia()+30 > 100){
                this.setEnergia(100);
            } else {
                this.setEnergia(this.getEnergia()+30);
            }
            System.out.println("Energia recargada(+30)");
        } else if(this.getEntrenamientos() == 2){
            if(this.getEnergia()+10 > 100){
                this.setEnergia(100);
            } else {
                this.setEnergia(this.getEnergia()+10);
            }
            System.out.println("Energia recargada(+10)");
        }
        this.setEntrenamientos(this.getEntrenamientos()+1);
    }

}
