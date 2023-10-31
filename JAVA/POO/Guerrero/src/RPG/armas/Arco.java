package RPG.armas;

public class Arco extends Arma{

    public Arco(int minDamage, int maxDamage, int minDestreza, int minFuerza) {
        super(minDamage, maxDamage, minDestreza, minFuerza);
    }

    @Override
    public int damageArma() {
        return ((int)(Math.random()*(this.maxDamage()-this.minDamage())+this.minDamage())) / 2;
    }

}
