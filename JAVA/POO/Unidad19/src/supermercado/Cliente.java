package supermercado;

public class Cliente extends Persona{

    private String cod_cliente;
    private int compras = 0;
    private int descuento = 0;

    public Cliente(String nombre, String apellido1, String apellido2, String DNI, String direccion, String telefono, String cod_cliente){
        super(nombre, apellido1, apellido2, DNI, direccion, telefono);
        this.cod_cliente = cod_cliente;
    }

    public Cliente(String nombre, String apellido1, String apellido2, String DNI, String direccion, String telefono) {
        super(nombre, apellido1, apellido2, DNI, direccion, telefono);
    }

    public String getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(String cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void comprar(){
        this.setCompras(this.getCompras()+1);
        if(this.getCompras() >= 100){
            this.setDescuento(this.getDescuento()+1);
            this.setCompras(0);
        }
    }

    @Override
    public String toString() {
        return super.toString() +" Cliente{" +
                "cod_cliente='" + cod_cliente + '\'' +
                ", compras=" + compras +
                ", descuento=" + descuento +
                '}';
    }
}
