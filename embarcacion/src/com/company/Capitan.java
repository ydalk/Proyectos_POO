package com.company;

public class Capitan {

    private String nombre;
    private String apellido;
    private Integer matriculaNavegacion;

    public Capitan(String nombre, String apellido, Integer matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

    public void setMatriculaNavegacion(Integer matriculaNavegacion) {
        this.matriculaNavegacion = matriculaNavegacion;
    }
}
