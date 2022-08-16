package editorial;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Articulo articulo = new Articulo("juan","fulbo","fronty","tomorrowland");
        Edicion edicion = new Edicion(123,"2022", 10.0, List.of(articulo));
        Revista revista = new Revista("Pride","123123",true,List.of
                (edicion));
        Editorial editorial = new Editorial("esclavo", "4202020", "007", List.of
                (revista));

        System.out.println(editorial.getTelefono());
        System.out.println(edicion.getArticulos());
    }

}



