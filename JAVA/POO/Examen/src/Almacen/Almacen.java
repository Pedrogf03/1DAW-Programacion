package Almacen;

import java.util.ArrayList;

public class Almacen {

    private ArrayList<Bebida> bebidas;

    public Almacen() {
        this.bebidas = new ArrayList<Bebida>();
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    // Agregar producto
    public void addBebida(Bebida b){
        boolean esta = false;
        for (int i = 0; i < this.getBebidas().size(); i++){
            if(b.equals(this.getBebidas().get(i))){
                esta = true;
                this.getBebidas().get(i).setUnidades(this.getBebidas().get(i).getUnidades() + b.getUnidades());
            }
        }
        if(!esta) {
            this.bebidas.add(b);
        }
    }

    //Eliminar producto
    public void removeBebida(int id){
        /*for(int i = 0; i < this.getBebidas().size(); i++){
            if(this.getBebidas().get(i).getId() == id){
                this.getBebidas().remove(i);
            }
        }*/
        int i = 0;
        while(this.getBebidas().get(i).getId() != id && i < this.getBebidas().size()) {
            i++;
        }
        this.getBebidas().remove(i);
    }

    //Mostrar información
    public void mostrarInfo(int id) throws ProductoNoEncontradoException{
        int i = 0;
        while(this.getBebidas().get(i).getId() != id && i < this.getBebidas().size() - 1) {
            i++;
        }
        if (this.getBebidas().get(i).getId() == id) {
            System.out.println(this.getBebidas().get(i));
        } else {
            throw new ProductoNoEncontradoException();
        }

    }

    //Calcular precio de todas las bebidas
    public double precioTotal(){
        double precio_total = 0;
        double precio = 0;
        for(int i = 0; i < this.getBebidas().size(); i++){
            precio = this.getBebidas().get(i).getPrecio() * this.getBebidas().get(i).getUnidades();
            if(this.getBebidas().get(i) instanceof Refresco){
                Refresco r = (Refresco)this.getBebidas().get(i);
                if(r.hasPromocion()){
                    precio = precio - (precio * 0.05);
                }
            }
            precio_total += precio;
        }
        return Math.round(precio_total * 100.0)/100.0;
    }

    //Calcular precio total de una marca
    public double precioMarca(String marca){
        double precio_total = 0;
        double precio = 0;
        for(int i = 0; i < this.getBebidas().size(); i++){
            if (this.getBebidas().get(i).getMarca().equals(marca)){
                precio = this.getBebidas().get(i).getPrecio() * this.getBebidas().get(i).getUnidades();
                if(this.getBebidas().get(i) instanceof Refresco){
                    Refresco r = (Refresco)this.getBebidas().get(i);
                    if(r.hasPromocion()){
                        precio = precio - (precio * 0.05);
                    }
                }
                precio_total += precio;
            }
        }
        return Math.round(precio_total * 100.0)/100.0;
    }

    public static void main(String[] args) {

        Agua a1 = new Agua(1, 100, 0.50, "Fontbella", 2, "Girona");
        Refresco r1 = new Refresco(2, 50, 1.80, "Coca-Cola", 3, 12, true);

        Almacen almacen = new Almacen();

        almacen.addBebida(a1);
        almacen.addBebida(r1);

        System.out.println(almacen.getBebidas());

        Agua a2 = new Agua(1, 100, 0.50, "Fontbella", 3, "Girona");
        almacen.addBebida(a2);

        Refresco r2 = new Refresco(2, 50, 1.80, "Coca-Cola", 5, 12, true);
        almacen.addBebida(r2);

        System.out.println(almacen.getBebidas());

        almacen.removeBebida(2);

        System.out.println(almacen.getBebidas());

        try{
            almacen.mostrarInfo(1);
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Lo sentimos, no se ha encontrado la bebida que busca.");
        }
        try{
            almacen.mostrarInfo(2);
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Lo sentimos, no se ha encontrado la bebida que busca.");
        }

        almacen.addBebida(r1);
        almacen.addBebida(r2);
        System.out.println(almacen.getBebidas());

        System.out.println("Precio de todas las bebidas: "+ almacen.precioTotal());
        System.out.println("Precio de todas las Coca-Colas: "+ almacen.precioMarca("Coca-Cola"));
        Refresco r3 = new Refresco(3, 100, 2.50, "Coca-Cola", 2, 20, false);
        almacen.addBebida(r3);
        System.out.println(almacen.getBebidas());
        System.out.println("Precio de todas las Coca-Colas: "+ almacen.precioMarca("Coca-Cola"));
        System.out.println("Precio de todas las bebidas: "+ almacen.precioTotal());

    }

}
