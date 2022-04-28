package com.company;

public class EstadoVacio implements Estado{
    @Override
    public Estado agregar() {
        return new EstadoCargando();
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
        return new EstadoCargando();
    }
}
