package com.company;

public class Velero extends Embarcacion{

    private Integer cantMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantMastiles = cantMastiles;
    }

    public void evaluar(){

        if( cantMastiles > 4){
            System.out.println("Es un velero grande, tiene mas de 4 mastiles");
        }else{
            System.out.println("Es un velero pequeño, tiene menos de 4 mastiles");
        }
    };

}
