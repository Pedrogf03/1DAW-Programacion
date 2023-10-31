package Almacen;

public class Refresco extends Bebida{

    private int azucar;
    private boolean promocion;

    public Refresco(int id, int cl, double precio, String marca, int unidades, int azucar, boolean promocion) {
        super(id, cl, precio, marca, unidades);
        this.azucar = azucar;
        this.promocion = promocion;
    }

    public int getAzucar() {
        return azucar;
    }
    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public boolean hasPromocion() {
        return promocion;
    }
    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public String toString() {
        return "Refresco{Id="+ this.getId() +", Tamaño(cL)="+ this.getCl() +", Precio="+ this.getPrecio()
                +", Marca="+ this.getMarca() +", Unidades="+ this.getUnidades() +", Azucar(%)="+ this.azucar +", Promoción="+ this.promocion +"}";
    }
}
