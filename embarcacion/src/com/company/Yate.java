package com.company;

public class Yate extends Embarcacion implements Comparable{

    private Integer cantCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    public Integer getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(Integer cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int compareTo(Object object) {
        Yate yateAComparar  = (Yate) object;

        if( this.cantCamarotes > yateAComparar.cantCamarotes){
            return 1;
           //System.out.println("El yate tiene mayor lujo, tiene " + (cantCamarotes - yateAComparar.cantCamarotes) + " camarotes más");
        }else if( this.cantCamarotes < yateAComparar.cantCamarotes){
            return -1;
           //System.out.println("El yate tiene menor lujo, tiene " + (yateAComparar.cantCamarotes - cantCamarotes) + " camarotes menos");
        }else{
            return 0;
        }

    }
}
