package com.company;

import java.util.ArrayList;
import java.util.List;

public class Programa extends OfertaAcademica implements Empaquetable{

    private List<Empaquetable> cursos;
    private Double descuento;
    private Double valorPrograma;

    public Programa(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento ;
        cursos = new ArrayList<>();
        valorPrograma = 0.0;
    }

    public void agregar(Empaquetable empaquetable){
        cursos.add(empaquetable);
    }

    @Override
    public Double calcularPrecio () {

        Double sumaPrograma = 0.0;
        for (Empaquetable curso : cursos) {
            sumaPrograma += curso.calcularPrecio();
        }
        valorPrograma = sumaPrograma-(sumaPrograma * descuento);
        return valorPrograma;
    }

    public String toString(){
        return "Programa: "+ getNombre() +", precio = " + valorPrograma + " pesos.";
    }
}
