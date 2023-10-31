package MiJuego;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Scanner;

public class Personaje {

    //Atributos
    private String nombre;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int precision;
    private int evasion;
    private int vida;
    private int vida_max;

    //Constructor
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.ataque = (int)(Math.random()*2+2);
        this.defensa = (int)(Math.random()*2+2);
        this.velocidad = (int)(Math.random()*2+2);
        this.precision = (int)(Math.random()*2+2);
        this.evasion = (int)(Math.random()*2+2);
        this.vida_max = (int)(Math.random()*5+15);
        this.vida = this.vida_max;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPrecision() {
        return precision;
    }
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getEvasion() {
        return evasion;
    }
    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getVida_max() {
        return vida_max;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
        if(this.vida < 0) {
            this.vida = 0;
        }
        if(this.vida > this.vida_max) {
            this.vida = this.vida_max;
        }
    }

    //Metodos
    public Personaje atacar(Personaje p){
        int multiplicador = (int)(Math.random()*4+2);
        int damage = this.ataque - p.getDefensa();
        if(damage <= 0){
            damage = 1;
        }
        damage *= multiplicador;
        int probFallo = (int)(Math.random()*p.getEvasion()+1);
        if(this.precision + 1 < probFallo){
            System.out.println("¡El ataque falló!");
        } else {
            p.setVida(p.getVida() - damage);
            System.out.println(this.nombre + " ha inflingido " + damage + " de daño a " + p.getNombre());
            if (multiplicador >= 5) {
                System.out.println("¡Golpe crítico!");
            }
        }

        System.out.println("Vida de "+ p.getNombre() +" = "+ p.getVida() +"/"+ p.getVida_max());

        return p;
    }

    public boolean isVivo(){
        return this.vida > 0;
    }

    public static void curar(Personaje p) {
        System.out.println(p.getNombre() +" ha usado una poción.");
        p.setVida(p.getVida() + 8);
        System.out.println("Vida de "+ p.getNombre() +" = "+ p.getVida() +"/"+ p.getVida_max());
    }

    public static void combate(Personaje p1, Personaje p2){

        Scanner sc = new Scanner(System.in);

        System.out.println("¡"+ p1.getNombre() +" y "+ p2.getNombre() +" han cruzado miradas!");
        sc.nextLine();
        System.out.println(p1);
        System.out.println(p2);
        sc.nextLine();

        boolean turnoP1 = true;
        if(p1.getVelocidad() < p2.getVelocidad()){
            turnoP1 = false;
        }

        int eleccion;
        boolean huir = false;

        while((p1.isVivo() && p2.isVivo()) && !huir){
            if(turnoP1){
                System.out.println("Turno de "+ p1.getNombre());
                System.out.println("¿Qué desea hacer?");
                System.out.println("1- Atacar. 2- Curar. 3- Huir.");
                eleccion = sc.nextInt();
                while(eleccion < 1 || eleccion > 3){
                    System.out.println("Opción inválida, elija una de las 3");
                    eleccion = sc.nextInt();
                }
                switch(eleccion){
                    case 1:
                        p1.atacar(p2);
                        break;
                    case 2:
                        curar(p1);
                        break;
                    case 3:
                        if((int)(Math.random()*5+1) != 1) {
                            huir = true;
                            System.out.println("Escapas sin problemas");
                        }
                        break;
                }
                turnoP1 = false;
                sc.nextLine();
            } else {
                System.out.println("Turno de "+ p2.getNombre());
                if(p2.getVida() < p2.getVida_max() / 2){
                    eleccion = (int)(Math.random()*50+1);
                    if(eleccion == (int)(Math.random()*50+1)){
                        curar(p2);
                    } else {
                        p2.atacar(p1);
                    }
                } else {
                    p2.atacar(p1);
                }
                turnoP1 = true;
            }
            sc.nextLine();
        }

        if(p1.isVivo() && !p2.isVivo()){
            System.out.println("¡"+ p2.getNombre() +" ha muerto!");
            System.out.println(p1.getNombre() +" ha ganado.");
        } else if(p2.isVivo() && !p1.isVivo()){
            System.out.println("¡"+ p1.getNombre() +" ha muerto!");
            System.out.println(p2.getNombre() +" ha ganado.");
        }

    }

    //toString
    @Override
    public String toString() {
        return nombre + " -> Ataque=" + ataque +", Defensa=" + defensa +", Velocidad=" + velocidad +", Precision=" + precision +", Evasion=" + evasion +", Vida=" + vida;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        String nombre = sc.nextLine();

        Personaje p1 = new Personaje(nombre);
        System.out.println("Ha nacido "+ p1.getNombre());

        Personaje p2 = new Personaje("Borja");

        sc.nextLine();

        combate(p1, p2);

    }

}
