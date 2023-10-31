package Guerreros;

public class Guerrero extends Personaje{

    public Guerrero(String nombre, boolean genero){
        super(nombre, genero);
    }

    @Override
    public Personaje atacar(Personaje p) {
        int damage = (this.getFuerza() - p.getDefensa());
        if(damage <= 0){
            damage = 1;
        }
        int multiplicador = (int)(Math.random()*9+2);
        damage *= multiplicador;
        int probFallo = (int)(Math.random()*50+1);
        if(this.getDestreza() * 2 > probFallo){
            System.out.println("¡El ataque falló!");
        } else {
            System.out.println(this.getNombre() +" ha inflingido "+ damage +" de daño a "+ p.getNombre());
            p.setVida(p.getVida() - damage);
            if(multiplicador >= 8){
                System.out.println("¡Golpe crítico!");
            }
        }
        return p;
    }
}
