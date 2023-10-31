package Almacen;

public class Agua extends Bebida{

    private String manantial;

    public Agua(int id, int cl, double precio, String marca, int unidades, String manantial) {
        super(id, cl, precio, marca, unidades);
        this.manantial = manantial;
    }

    public String getManantial() {
        return manantial;
    }
    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    @Override
    public String toString() {
        return "Agua{Id="+ this.getId() +", Tamaño(cL)="+ this.getCl() +", Precio="+ this.getPrecio()
                +", Marca="+ this.getMarca() +", Unidades="+ this.getUnidades() +", Manantial="+ this.manantial +"}";
    }

}
