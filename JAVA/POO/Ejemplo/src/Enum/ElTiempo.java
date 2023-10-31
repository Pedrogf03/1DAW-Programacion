package Enum;

public class ElTiempo {

    public enum Estacion{
        PRIMAVERA, VERANO, OTONHO, INVIERNO;
    }

    Estacion estacion;

    public ElTiempo(Estacion e){
        this.estacion = e;
    }

    String tiempo(){
        String resultado = "";
        switch(estacion){
            case PRIMAVERA:
                resultado = "En abril aguas mil.";
                break;
            case VERANO:
                resultado = "A la playa.";
                break;
            case INVIERNO:
                resultado = "Mucho frío.";
                break;
            case OTONHO:
                resultado = "Un poco de frío y hojas marrones.";
                break;
            default:
                resultado = "bobo";
        }
        return resultado;
    }

    public static void main(String[] args) {

        ElTiempo et = new ElTiempo(Estacion.VERANO);

        System.out.println(et.tiempo());

    }

}
