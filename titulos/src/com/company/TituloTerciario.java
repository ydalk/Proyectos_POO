package com.company;

public class TituloTerciario extends Titulo {

    private String validacion;

    public TituloTerciario(Persona persona, Integer cantMaterias, String fechaInicio, String fechaFin, Boolean selloMinisterio, Boolean selloInstituto, String validacion) {
        super(persona, cantMaterias, fechaInicio, fechaFin, selloMinisterio, selloInstituto);
        this.validacion = validacion;
    }

    public String validar(){
        String mensaje;
        if( validacion == "Nacional"){
            mensaje = "titulo valido a nivel " + validacion;
        }else{
            mensaje = "titulo valido a nivel " + validacion;
        }
        return mensaje;
    }

}