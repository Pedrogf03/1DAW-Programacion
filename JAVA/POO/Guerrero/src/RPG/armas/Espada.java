package RPG.armas;

public class Espada extends Arma{

    public Espada(int minDamage, int maxDamage, int minDestreza, int minFuerza) {
        super(minDamage, maxDamage, minDestreza, minFuerza);
    }

    public int damageArma(){
        return (int)(Math.random()*(this.maxDamage()-this.minDamage())+this.minDamage());
    }

}
