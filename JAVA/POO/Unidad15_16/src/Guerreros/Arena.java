package Guerreros;

public class Arena {

    public static void Combate(Guerrero g1, Guerrero g2){
        boolean turnog1 = true;
        while(g1.isVivo() && g2.isVivo()){
            if(turnog1){
                System.out.println("Turno de "+ g1.getNombre());
                g1.atacar(g2);
                System.out.println("Vida de "+ g2.getNombre() +" = "+ g2.getVida());
                turnog1 = false;
            } else if (!turnog1){
                System.out.println("Turno de "+ g2.getNombre());
                g2.atacar(g1);
                System.out.println("Vida de "+ g1.getNombre() +" = "+ g1.getVida());
                turnog1 = true;
            }
        }
    }

    public static void CombateDoble(GuerreroSanador g1, Guerrero g2, Guerrero g3){
        boolean turnog1 = true;
        while((g1.isVivo() || g2.isVivo()) && g3.isVivo()){
            if(turnog1){
                if(g1.isVivo()){
                    System.out.println("Turno de "+ g1.getNombre());
                    g1.sanar(g2);
                    System.out.println("Vida de "+ g2.getNombre() +" = "+ g2.getVida());
                }
                if(g2.isVivo()){
                    System.out.println("Turno de "+ g2.getNombre());
                    g2.atacar(g3);
                    System.out.println("Vida de "+ g3.getNombre() +" = "+ g3.getVida());
                }
                turnog1 = false;
            } else if (!turnog1){
                System.out.println("Turno de "+ g3.getNombre());
                int decide = (int)(Math.random()*2+1);
                if(decide == 1){
                    g3.atacar(g1);
                    System.out.println("Vida de "+ g1.getNombre() +" = "+ g1.getVida());
                } else if(decide == 2){
                    g3.atacar(g2);
                    System.out.println("Vida de "+ g2.getNombre() +" = "+ g2.getVida());
                }
                turnog1 = true;
            }
        }
    }

    public static void main(String[] args) {
        GuerreroSanador pedro = new GuerreroSanador("Pedro", "M");
        Guerrero borja = new Guerrero("Borja", "M");
        Guerrero manu = new Guerrero("Manuel", "M");

        CombateDoble(pedro, borja, manu);

    }

}
