package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Pizza> pizzas;

    public Pizzeria() {
        pizzas = new ArrayList<>();
    }

    public void agregarPizza(String codigoPizza){
        try {
            pizzas.add(PizzaFactory.getInstance().crearPizza(codigoPizza));
        }catch (PizzaFactoryException err){
            err.getMessage();
        }
    }

    public void mostrarPizzas(){
        System.out.println(   "    **** Listado de Pizzas  ****" + "\n");
        for (Pizza pizza : pizzas) {
            pizza.calcularPrecio();
            System.out.println(pizza);
        }

    }
}
