package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Puerto puerto = new Puerto();

        puerto.agregarContenedor(new Contenedor(123, "China", false));
        puerto.agregarContenedor(new Contenedor(123, "EEUU", false));
        puerto.agregarContenedor(new Contenedor(123, "Brasil", false));
        puerto.agregarContenedor(new Contenedor(123, "Desconocido", true));
        puerto.agregarContenedor(new Contenedor(123, "Canada", false));
        puerto.agregarContenedor(new Contenedor(123, "Desconocido", true));
        puerto.agregarContenedor(new Contenedor(123, "Rusia", true));

        System.out.println("La cantidad de contenedores peligorsos es: " + puerto.cantContenedoresPeligrosos());
    }
}
