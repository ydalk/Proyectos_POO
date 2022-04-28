package com.company;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<Pizza> pizzas;
    private Double precioTotal;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public void agregar(Pizza pizza){
        pizzas.add(pizza);
    }


    public Double calcularPrecio() {

        Double sumaPrecioPizzas = 0.0;

        for (Pizza pizza : pizzas) {
            sumaPrecioPizzas += pizza.calcularPrecio();
        }
        precioTotal = sumaPrecioPizzas / pizzas.size();

        return precioTotal;
    }

    @Override
    public String toString() {
        return "Pizza Combinada: ( " + getDescripcion() + " ), precio = $" + precioTotal + " pesos";
    }
}
