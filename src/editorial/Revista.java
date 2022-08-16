package editorial;

import java.util.List;

public class Revista {
    private String nombre;
    private String codigo;
    private Boolean periodicidad;
    private List<Edicion> ediciones;


    public Revista(String nombre, String codigo, Boolean periodicidad, List<Edicion> ediciones) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodicidad = periodicidad;
        this.ediciones = ediciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Boolean periodicidad) {
        this.periodicidad = periodicidad;
    }

    public List<Edicion> getEdiciones() {
        return ediciones;
    }

    public void setEdiciones(List<Edicion> ediciones) {
        this.ediciones = ediciones;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", periodicidad=" + periodicidad +
                ", ediciones=" + ediciones +
                '}';
    }
}

