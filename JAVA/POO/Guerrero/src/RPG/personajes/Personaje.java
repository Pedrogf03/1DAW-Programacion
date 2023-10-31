package RPG.personajes;

import RPG.armas.*;

import java.util.Scanner;

public abstract class Personaje {

    static final int MAX_VIDA = 100;

    private final String nombre;
    private int fuerza;
    private int defensa;
    private int destreza;
    private int vida;
    private String genero;
    private Arma armaActual = null;

    public Personaje (String nombre, String genero){
        this.nombre = nombre;
        this.fuerza = (int)(Math.random()*6+5);
        this.defensa = (int)(Math.random()*6+5);
        this.destreza = (int)(Math.random()*6+5);
        this.vida = MAX_VIDA;
        this.genero = genero;
        Scanner sc = new Scanner(System.in);
        while(!this.genero.equals("M") && !this.genero.equals("F")) {
            System.out.println("Error. el género debe ser M (Masculino) o F (Femenino). Introduzca de nuevo:");
            this.genero = sc.next();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDestreza() {
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
        if (this.vida < 0){
            this.vida = 0;
        } else if (this.vida > MAX_VIDA){
            this.vida = MAX_VIDA;
        }
    }

    public String getGenero() {
        return genero;
    }

    public Arma getArmaActual() {
        return armaActual;
    }
    public boolean portarArma(Arma armaActual) {
        if(armaActual instanceof Varita){
            if(this instanceof Mago || this instanceof Necromante){
                if(this.getDestreza() >= armaActual.getMinDestreza() && this. getFuerza() >= armaActual.getMinFuerza()){
                    this.armaActual = armaActual;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else if (armaActual instanceof Arco){
            if(this instanceof Arquero){
                if(this.getDestreza() >= armaActual.getMinDestreza() && this. getFuerza() >= armaActual.getMinFuerza()){
                    this.armaActual = armaActual;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            if(this.getDestreza() >= armaActual.getMinDestreza() && this. getFuerza() >= armaActual.getMinFuerza()){
                this.armaActual = armaActual;
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean isVivo(){
        return this.getVida() > 0;
    }

    public abstract void atacar(Personaje p);

    @Override
    public String toString() {
        return "Guerrero.Guerrero{" +
                "nombre='" + this.nombre + '\'' +
                ", fuerza=" + this.fuerza +
                ", defensa=" + this.defensa +
                ", destreza=" + this.destreza +
                ", vida=" + this.vida +
                ", genero='" + this.genero + '\'' +
                '}';
    }

}
