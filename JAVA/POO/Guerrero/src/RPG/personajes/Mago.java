package RPG.personajes;

import RPG.armas.*;
import RPG.hechizos.*;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personaje{

    private List<Hechizo> hechizosAprendidos = new ArrayList<>();

    public Mago(String nombre, String genero) {
        super(nombre, genero);
    }

    public List<Hechizo> getHechizosAprendidos() {
        return this.hechizosAprendidos;
    }

    @Override
    public void atacar(Personaje p) {
        if(this.getArmaActual() == null){
            System.out.println("¡No puedes atacar sin arma!");
        } else {
            int damage = this.getFuerza() / 2 - p.getDefensa() / 2;
            if(damage <= 0){
                damage = 1;
            }
            damage *= this.getArmaActual().damageArma();
            int probFallo = (int)(Math.random()*10+10);
            if(this.getDestreza() < probFallo){
                System.out.println("¡El ataque falló!");
            } else {
                System.out.println(this.getNombre() +" ha inflingido "+ damage +" de daño a "+ p.getNombre());
                p.setVida(p.getVida() - damage);
            }
        }
    }

    public void aprenderHechizo(Hechizo h){

        if(this.getHechizosAprendidos().contains(h)){
            System.out.println("Ya conoces ese hechizo");
        } else {
            this.getHechizosAprendidos().add(h);
        }

    }

    public void hechizar(Personaje p, Hechizo h) {
        if(this.getArmaActual() == null){
            System.out.println("¡No puedes atacar sin arma!");
        } else if (this.getArmaActual() instanceof Varita){
            if(this.getHechizosAprendidos().contains(h)){
                int damage = this.getFuerza() / 2 - p.getDefensa() / 2;
                if(damage <= 0){
                    damage = 1;
                }
                damage *= h.getMultiplicadorDamage();
                int probFallo = (int)(Math.random()*5+5);
                if(this.getDestreza() < probFallo){
                    System.out.println("¡El ataque falló!");
                } else {
                    System.out.println(this.getNombre() +" ha inflingido "+ damage +" de daño a "+ p.getNombre());
                    p.setVida(p.getVida() - damage);
                }
            } else {
                System.out.println("No tienes aprendido ese hechizo.");
            }
        } else {
            System.out.println("No puedes hechizar sin varita.");
        }
    }

}
