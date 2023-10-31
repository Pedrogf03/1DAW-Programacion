package persona;

public class Cuenta implements Mostrable{

    private Persona titular;
    private double cantidad;

    public Cuenta(Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String mostrar(){
        return "CUENTA: "
                + " \nTitular:\n"+ this.titular.mostrar()
                + "\nDinero en la cuenta: "+ this.cantidad +"€";
    }

    public String mostrarDinero(){
        return this.titular.getNombre() + " tiene " + this.getCantidad() +"€ en su cuenta.";
    }

    public void ingresar(double cantidad){
        if(cantidad > 0) {
            this.setCantidad(this.getCantidad() + cantidad);
            System.out.println("Se han ingresado "+ cantidad +"€ en la cuenta de "+ this.getTitular().getNombre());
        }
    }

    public void retirar(double cantidad){
        this.setCantidad(this.getCantidad() - cantidad);
        System.out.println("Se han retirado "+ cantidad +"€ de su cuenta.");
        if(this.getCantidad() < 0){
            System.out.println("Está en números rojos.");
        }
    }

}
