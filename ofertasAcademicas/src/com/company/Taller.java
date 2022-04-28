package com.company;

public class Taller extends OfertaAcademica implements Empaquetable{

    private Integer cantTrabajoPractico;
    private Double valorTrabajoPractico;
    private Double precioTaller;

    public Taller(String nombre, String descripcion, Integer cantTrabajoPractico, Double valorTrabajoPractico) {
        super(nombre, descripcion);
        this.cantTrabajoPractico = cantTrabajoPractico;
        this.valorTrabajoPractico = valorTrabajoPractico;
    }

    @Override

    public Double calcularPrecio() {

        precioTaller = cantTrabajoPractico * valorTrabajoPractico;
        return precioTaller;
    }

    public String toString(){
        return "Taller: " + getNombre() + ", precio =  " + precioTaller + " pesos.";
    }
}
