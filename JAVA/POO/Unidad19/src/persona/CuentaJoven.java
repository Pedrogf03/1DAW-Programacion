package persona;

public class CuentaJoven extends Cuenta{

    private int bonificacion;

    public CuentaJoven(Persona titular, double cantidad, int bonificacion) {
        super(titular, cantidad);
        if(bonificacion > 100){
            bonificacion = 100;
        } else if(bonificacion < 0){
            bonificacion = 0;
        }
        this.bonificacion = bonificacion;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        if(bonificacion > 100){
            bonificacion = 100;
        } else if(bonificacion < 0){
            bonificacion = 0;
        }
        this.bonificacion = bonificacion;
    }

    public boolean esTitularValido(){
        return this.getTitular().esMayorDeEdad() && this.getTitular().getEdad() < 25;
    }

    @Override
    public void retirar(double cantidad){
        if(this.esTitularValido()){
            this.setCantidad(this.getCantidad() - cantidad);
            System.out.println("Se han retirado "+ cantidad +"€ de su cuenta.");
            if(this.getCantidad() < 0){
                System.out.println("Está en números rojos.");
            }
        } else {
            System.out.println("Lo siento, usted no es un titular válido.");
        }
    }

    @Override
    public String mostrar(){
        return super.mostrar()
                + "\nBonificación: "+ this.getBonificacion();
    }

}
