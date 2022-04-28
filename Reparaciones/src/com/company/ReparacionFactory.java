package com.company;

public class ReparacionFactory {

    private static ReparacionFactory instance;

    public ReparacionFactory() {
    }

    public static ReparacionFactory getInstance(){
        if(instance== null){
            instance= new ReparacionFactory();

        }
        return instance;
    }

    public Reparacion generarReparacion(){
        return new Reparacion("batidora", "calle 5 7-28");
    }
}
