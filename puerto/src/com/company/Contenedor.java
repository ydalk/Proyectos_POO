package com.company;

public class Contenedor implements Comparable<Contenedor>{
    private Integer numeroID;
    private String pais;
    private Boolean materialesPeligrosos;

    public Contenedor(Integer numeroID, String pais, Boolean materialesPeligrosos) {
        this.numeroID = numeroID;
        this.pais = pais;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        if( this.numeroID > contenedor.numeroID){
            return 1;
        }else if( this.numeroID < contenedor.numeroID){
            return -1;
        }else{
            return 0;
        }
    }

    public String getPais() {
        return pais;
    }
}
