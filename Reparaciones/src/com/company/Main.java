package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ReparacionFactory reparacionFactory = ReparacionFactory.getInstance();

        Reparacion reparacion = reparacionFactory.generarReparacion();
        System.out.println(reparacion);
        reparacion.darValorPresupuesto();
        reparacion.pasarAlSiguientePaso();
        reparacion.agregarRepuesto();
        reparacion.pasarAlSiguientePaso();
        reparacion.cambiarDireccion("Carrera 3 9-15");
        reparacion.pasarAlSiguientePaso();
        reparacion.pasarAlSiguientePaso();
        System.out.println(reparacion);


    }
}
