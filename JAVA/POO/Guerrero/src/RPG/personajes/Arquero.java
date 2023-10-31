package RPG.personajes;

public class Arquero extends Personaje{

    public Arquero(String nombre, String genero) {
        super(nombre, genero);
    }

    @Override
    public void atacar(Personaje p) {
        if(this.getArmaActual() == null){
            System.out.println("¡No puedes atacar sin arma!");
        } else {
            int damage = this.getFuerza() - p.getDefensa();
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

}
