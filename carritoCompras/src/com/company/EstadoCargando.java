package com.company;

public class EstadoCargando implements Estado{
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
        return new EstadoVacio();
    }

    @Override
    public Estado pasar() {
        return new EstadoPagando();
    }
}
