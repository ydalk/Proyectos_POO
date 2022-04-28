package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Reserva reserva = new Reserva(123, new Recorrido("Buenos Aries", "Mercedes"), 5);

        System.out.println(reserva.calcularPrecio());
        System.out.println(reserva);
    }
}
