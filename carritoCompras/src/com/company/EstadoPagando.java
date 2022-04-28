package com.company;

public class EstadoPagando implements Estado{
    @Override
    public Estado agregar() {
        return this;
    }

    @Override
    public Estado cancelar() {
        return new EstadoVacio();
    }

    @Override
    public Estado volver() {
        return new EstadoCargando();
    }

    @Override
    public Estado pasar() {
        return new EstadoCerrado();
    }
}
