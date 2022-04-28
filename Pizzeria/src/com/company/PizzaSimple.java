package com.company;

public class PizzaSimple extends Pizza {

    private Double precioBase;
    private Boolean esGrande;
    private Double precioTotal;

    public PizzaSimple(String nombre, String descripcion, Boolean esGrande, Double precioBase) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esGrande = esGrande;
    }

    @Override
    public Double calcularPrecio(){
        if(esGrande){
            precioTotal = precioBase * 2;
        }else{
            precioTotal = precioBase;
        }
        return precioTotal;
    }


    @Override
    public String toString() {
        return "Pizza " + getNombre() + ", precio = $" + precioTotal + " pesos";
    }



}
