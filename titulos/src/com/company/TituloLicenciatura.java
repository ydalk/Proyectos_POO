package com.company;

public class TituloLicenciatura extends Titulo implements Comparable{

    private String temaTesis;
    private String fechaEntrega;
    private Integer cantInvestigaciones;

    public TituloLicenciatura(Persona persona, Integer cantMaterias, String fechaInicio, String fechaFin, Boolean selloMinisterio, Boolean selloInstituto, String temaTesis, String fechaEntrega, Integer cantInvestigaciones) {
        super(persona, cantMaterias, fechaInicio, fechaFin, selloMinisterio, selloInstituto);
        this.temaTesis = temaTesis;
        this.fechaEntrega = fechaEntrega;
        this.cantInvestigaciones = cantInvestigaciones;
    }

    @Override
    public int compareTo(Object object) {
        TituloLicenciatura tituloComparar = (TituloLicenciatura) object;

        if(this.cantInvestigaciones > tituloComparar.cantInvestigaciones){
            return 1;
        }else if(this.cantInvestigaciones < tituloComparar.cantInvestigaciones){
            return -1;
        }else{
            return 0;
        }

    }


}
