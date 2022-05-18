package dh.vendedores.main.model;

public abstract class Vendedor {

    private String nombre;
    private Integer cantVentas = 0;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public Integer vender() {
        return cantVentas += 1;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantVentas() {
        return cantVentas;
    }
}
