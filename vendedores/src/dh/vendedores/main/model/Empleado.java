package dh.vendedores.main.model;

public class Empleado extends Vendedor{


    private Integer anioAntiguedad;
    private Integer cantAfiliados;


    public Empleado(String nombre, Integer anioAntiguedad, Integer cantAfiliados) {
        super(nombre);
        this.cantAfiliados = cantAfiliados;
        this.anioAntiguedad = anioAntiguedad;
    }

    public Integer conseguirAfiliado(Integer cantidad){

        return cantAfiliados += cantidad;
    }


    public Integer getAnioAntiguedad() {
        return anioAntiguedad;
    }

    public Integer getCantAfiliados() {
        return cantAfiliados;
    }
}
