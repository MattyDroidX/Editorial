package editorial;

import java.util.List;

public class Edicion {
    private int numero;
    private String fecha;
    private Double precio;
    private List<Articulo> articulos;

    public Edicion(int numero, String fecha, Double precio, List<Articulo> articulos) {
        this.numero = numero;
        this.fecha = fecha;
        this.precio = precio;
        this.articulos = articulos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Edicion{" +
                "numero=" + numero +
                ", fecha='" + fecha + '\'' +
                ", precio=" + precio +
                ", articulo=" + articulos +
                '}';
    }
}
