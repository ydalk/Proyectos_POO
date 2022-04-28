package com.company;

public class EstadoCerrado implements Estado{
    @Override
    public Estado agregar() {
        return this;
    }

    @Override
    public Estado cancelar() {
        return this;
    }

    @Override
    public Estado volver() {
        return this;
    }

    @Override
    public Estado pasar() {
        return new EstadoVacio();
    }
}
