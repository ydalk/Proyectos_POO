package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Capitan capitan = new Capitan("Pepe", "perez", 12345);
        Capitan capitan2 = new Capitan("Leo", "Rojas", 56789);

        Yate embarcacion = new Yate(capitan, 5200.0, 500.0, 1990, 120.5, 15);
        Yate embarcaion2 = new Yate(capitan2, 8400.0, 642.0, 2001, 324.0, 28);

        Velero embarcacion1 = new Velero(capitan2, 4700.0, 630.0, 2021, 315.0, 2);

        System.out.println("El precio del alquiler es de: " + embarcacion.calcularMOntoAlquiler());
        System.out.println(embarcacion.compareTo(embarcaion2));

        System.out.println("El precio del alquiler es de: " + embarcacion1.calcularMOntoAlquiler());
        embarcacion1.evaluar();

    }
}
