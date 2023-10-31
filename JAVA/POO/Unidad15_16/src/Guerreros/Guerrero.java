package Guerreros;

import java.util.Scanner;
public class Guerrero {

    static final int MAX_VIDA = 100;

    private String nombre;
    private int fuerza;
    private int defensa;
    private int destreza;
    private int vida;
    private String genero;

    public Guerrero (String nombre, String genero){
        this.nombre = nombre;
        this.fuerza = (int)(Math.random()*5+6);
        this.defensa = (int)(Math.random()*5+6);
        this.destreza = (int)(Math.random()*5+6);
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

    public boolean isVivo(){
        return this.getVida() > 0;
    }

    public Guerrero atacar(Guerrero g){
        int damage = (this.fuerza - g.getDefensa());
        if(damage <= 0){
            damage = 1;
        }
        int multiplicador = (int)(Math.random()*9+2);
        damage *= multiplicador;
        int probFallo = (int)(Math.random()*50+1);
        if(this.destreza * 2 > probFallo){
            System.out.println("¡El ataque falló!");
        } else {
            System.out.println(this.nombre +" ha inflingido "+ damage +" de daño a "+ g.getNombre());
            g.setVida(g.getVida() - damage);
            if(multiplicador >= 8){
                System.out.println("¡Golpe crítico!");
            }
        }
        return g;
    }

    @Override
    public String toString() {
        return "Guerreros.Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", defensa=" + defensa +
                ", destreza=" + destreza +
                ", vida=" + vida +
                ", genero='" + genero + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Guerrero pedro = new Guerrero("Pedro", "M");
        Guerrero rocio = new Guerrero("Rocío", "F");

        System.out.println(pedro);
        System.out.println(rocio);

    }

}
