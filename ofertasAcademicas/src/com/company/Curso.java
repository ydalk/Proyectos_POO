package com.company;

public class Curso extends OfertaAcademica implements Empaquetable{

    private Integer cargaHoraria;
    private Integer cantMeses;
    private Double valorHora;
    private Double precioTotal;

    public Curso(String nombre, String descripcion, Integer cargaHoraria, Integer cantMeses, Double valorHora) {
        super(nombre, descripcion);
        this.cargaHoraria = cargaHoraria;
        this.cantMeses = cantMeses;
        this.valorHora = valorHora;
        this.precioTotal = 0.0;
    }

    @Override
    public Double calcularPrecio() {
        precioTotal = cargaHoraria * cantMeses * valorHora;
        return precioTotal;
    }


    public String toString(){
        return "Curso: " + getNombre() + ", precio =  " + precioTotal + " pesos.";
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
}
