package editorial;

import java.util.List;

public class Editorial {
    private String razonSocial;
    private String telefono;
    private String idTributario;
    private List<Revista> revistas;


    public Editorial(String razonSocial, String telefono, String idTributario, List<Revista> revistas) {
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.idTributario = idTributario;
        this.revistas = revistas;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdTributario() {
        return idTributario;
    }

    public void setIdTributario(String idTributario) {
        this.idTributario = idTributario;
    }

    public List<Revista> getRevistas() {
        return revistas;
    }

    public void setRevistas(List<Revista> revistas) {
        this.revistas = revistas;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "razonSocial='" + razonSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", idTributario='" + idTributario + '\'' +
                ", revista=" + revistas +
                '}';
    }
}
