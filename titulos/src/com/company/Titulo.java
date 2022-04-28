package com.company;

public abstract class Titulo {

    private Persona persona;
    private Integer cantMaterias;
    private String fechaInicio;
    private String fechaFin;
    private Boolean selloMinisterio;
    private Boolean selloInstituto;

    public Titulo(Persona persona, Integer cantMaterias, String fechaInicio, String fechaFin, Boolean selloMinisterio, Boolean selloInstituto) {
        this.persona = persona;
        this.cantMaterias = cantMaterias;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.selloMinisterio = selloMinisterio;
        this.selloInstituto = selloInstituto;
    }

    public Boolean puedeEjercer(){
        if(selloInstituto && selloMinisterio == true){
            return true;
        }else{
            return false;
        }
    };
}
