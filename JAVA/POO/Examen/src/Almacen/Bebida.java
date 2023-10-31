package Almacen;

import java.util.Objects;

public class Bebida {

    private int id;
    private int cl;
    private double precio;
    private String marca;
    private int unidades;

    public Bebida(int id, int cl, double precio, String marca, int unidades) {
        this.id = id;
        this.cl = cl;
        this.precio = precio;
        this.marca = marca;
        this.unidades = unidades;
    }

    public int getId() {
        return id;
    }

    public int getCl() {
        return cl;
    }
    public void setCl(int cl) {
        this.cl = cl;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getUnidades() {
        return unidades;
    }
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bebida bebida = (Bebida) o;
        return id == bebida.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
