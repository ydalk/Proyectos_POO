package com.company;

import java.util.ArrayList;
import java.util.List;

public class Informe {

    private List<Empaquetable> ofertas;

    public Informe() {
        ofertas = new ArrayList<>();
    }

    public void agregarOferta(Empaquetable empaquetable){

        ofertas.add(empaquetable);
    }

    public void generarInforme(){

        System.out.println("    **** Informe ****"  + "\n");

        for (Empaquetable oferta : ofertas) {
           oferta.calcularPrecio();
           System.out.println(oferta);
        }
        System.out.println();
        System.out.println("Nota: 'El precio del programa ya tiene incluido el descuento.'");
    }

}
