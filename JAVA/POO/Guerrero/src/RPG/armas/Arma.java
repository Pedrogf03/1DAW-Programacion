package RPG.armas;

public abstract class Arma {

    private int minDamage;
    private int maxDamage;
    private int minDestreza;
    private int minFuerza;

    public Arma(int minDamage, int maxDamage, int minDestreza, int minFuerza){
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.minDestreza = minDestreza;
        this.minFuerza = minFuerza;
    }

    public int minDamage() {
        return minDamage;
    }
    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int maxDamage() {
        return maxDamage;
    }
    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMinDestreza() {
        return minDestreza;
    }
    public void setMinDestreza(int minDestreza) {
        this.minDestreza = minDestreza;
    }

    public int getMinFuerza() {
        return minFuerza;
    }
    public void setMinFuerza(int minFuerza) {
        this.minFuerza = minFuerza;
    }

    public abstract int damageArma();

    @Override
    public String toString() {
        return "Arma{" +
                "minDamage=" + minDamage +
                ", maxDamage=" + maxDamage +
                ", minDestreza=" + minDestreza +
                ", minFuerza=" + minFuerza +
                '}';
    }

}
