package RPG;

import RPG.hechizos.Hechizo;
import RPG.personajes.*;

import java.util.Scanner;

public class Arena {

    public static void Combate(Personaje p1, Personaje p2){
        boolean turno = true;
        boolean huir = false;
        Scanner sc = new Scanner(System.in);
        while(p1.isVivo() && p2.isVivo() && !huir){
            if(turno){
                int option;
                int clase = 2;
                if(p1 instanceof Necromante){
                    clase = 4;
                } else if (p1 instanceof Mago){
                    clase = 3;
                }
                do{
                    System.out.println("¿Que desea hacer?");
                    System.out.println("1.- Atacar");
                    System.out.println("2.- Huir");
                    if(p1 instanceof Mago){
                        System.out.println("3.- Hechizar");
                    }
                    if(p1 instanceof Necromante){
                        System.out.println("4.- Sanar");
                    }
                    option = Integer.parseInt(sc.nextLine());
                } while (option < 1 || option > clase);

                switch(option){
                    case 1:
                        p1.atacar(p2);
                        break;
                    case 2:
                        huir = true;
                        break;
                    case 3:
                        Mago m1 = (Mago)p1;
                        System.out.println("¿Que hechizo quiere usar?");
                        int i = 0;
                        for(Hechizo h: m1.getHechizosAprendidos()){
                            System.out.println(i +" - "+ h.getNombre());
                            i++;
                        }
                        int hechizoSeleccionado = Integer.parseInt(sc.nextLine());
                        while (hechizoSeleccionado < 0 || hechizoSeleccionado >= i){
                            System.out.println("Tienes que elegir un hechizo de los mostrados anteriormente");
                            hechizoSeleccionado = Integer.parseInt(sc.nextLine());
                        }
                        m1.hechizar(p2, m1.getHechizosAprendidos().get(hechizoSeleccionado));
                    case 4:
                        Necromante n1 = (Necromante) p1;
                        n1.sanar(n1);
                        break;
                }

            } else {
                System.out.println("Turno de "+ p2.getNombre());
                p2.atacar(p1);
                System.out.println("Vida de "+ p1.getNombre() +" = "+ p1.getVida());
                turno = true;
            }
        }
    }

    public static void CombateDoble(Necromante n1, Guerrero g1, Guerrero g2){
        boolean turnog1 = true;
        while((n1.isVivo() || g1.isVivo()) && g2.isVivo()){
            if(turnog1){
                if(n1.isVivo()){
                    System.out.println("Turno de "+ n1.getNombre());
                    n1.sanar(g1);
                    System.out.println("Vida de "+ g1.getNombre() +" = "+ g1.getVida());
                }
                if(g1.isVivo()){
                    System.out.println("Turno de "+ g1.getNombre());
                    g1.atacar(g2);
                    System.out.println("Vida de "+ g2.getNombre() +" = "+ g2.getVida());
                }
                turnog1 = false;
            } else {
                System.out.println("Turno de "+ g2.getNombre());
                int decide = (int)(Math.random()*2+1);
                if(decide == 1){
                    g2.atacar(n1);
                    System.out.println("Vida de "+ n1.getNombre() +" = "+ n1.getVida());
                } else if(decide == 2){
                    g2.atacar(g1);
                    System.out.println("Vida de "+ g1.getNombre() +" = "+ g1.getVida());
                }
                turnog1 = true;
            }
        }
    }

}
