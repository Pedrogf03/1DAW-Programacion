package RPG.armas;

public class Varita extends Arma{

    public Varita(int minDamage, int maxDamage, int minDestreza, int minFuerza) {
        super(minDamage, maxDamage, minDestreza, minFuerza);
    }

    @Override
    public int damageArma() {
        return (int)(Math.random()*(this.maxDamage()-this.minDamage())+this.minDamage());
    }

}
