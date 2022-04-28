package com.company;

public class Test {

    public static void main(String[] args) {

    Pizzeria pizzeria = new Pizzeria();
    PizzaFactory factory = PizzaFactory.getInstance();

    pizzeria.agregarPizza(PizzaFactory.MUZZARELLA);
    pizzeria.agregarPizza(PizzaFactory.ESPECIAL);
    pizzeria.agregarPizza(PizzaFactory.ANANA);
    pizzeria.agregarPizza(PizzaFactory.COMBINADA);
    pizzeria.agregarPizza(PizzaFactory.TROPICAL);

    pizzeria.mostrarPizzas();
    }
}
