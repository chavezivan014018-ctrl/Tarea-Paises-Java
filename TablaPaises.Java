// Clase encargada de organizar los países dentro de una tabla
public class TablaPaises {

    // Creamos un arreglo que almacenará objetos de tipo Pais
    private Pais[] paises;


    // Método que recibe los 10 objetos y los guarda en un arreglo
    public void guardarPaises(
            Pais pais1,
            Pais pais2,
            Pais pais3,
            Pais pais4,
            Pais pais5,
            Pais pais6,
            Pais pais7,
            Pais pais8,
            Pais pais9,
            Pais pais10) {

        // Creamos una tabla o arreglo con espacio para 10 países
        paises = new Pais[10];

        // Guardamos el primer país en la posición 0
        paises[0] = pais1;

        // Guardamos el segundo país en la posición 1
        paises[1] = pais2;

        // Guardamos el tercer país
        paises[2] = pais3;

        // Guardamos el cuarto país
        paises[3] = pais4;

        // Guardamos el quinto país
        paises[4] = pais5;

        // Guardamos el sexto país
        paises[5] = pais6;

        // Guardamos el séptimo país
        paises[6] = pais7;

        // Guardamos el octavo país
        paises[7] = pais8;

        // Guardamos el noveno país
        paises[8] = pais9;

        // Guardamos el décimo país
        paises[9] = pais10;
    }


    // Método encargado de imprimir la tabla en la consola
    public void imprimirTabla() {

        // Imprimimos una línea decorativa
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        // Imprimimos los encabezados de la tabla
        System.out.printf(
                "%-15s %-20s %-12s %-15s %-20s %-20s %-15s%n",
                "PAÍS",
                "CAPITAL",
                "CONTINENTE",
                "POBLACIÓN",
                "IDIOMA",
                "MONEDA",
                "SUPERFICIE"
        );

        // Imprimimos otra línea decorativa
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");


        // Recorremos todos los países guardados en el arreglo
        for (Pais pais : paises) {

            // Imprimimos los datos de cada país en una fila
            System.out.printf(
                    "%-15s %-20s %-12s %-15d %-20s %-20s %-15.0f%n",
                    pais.getNombre(),
                    pais.getCapital(),
                    pais.getContinente(),
                    pais.getPoblacion(),
                    pais.getIdioma(),
                    pais.getMoneda(),
                    pais.getSuperficie()
            );
        }


        // Imprimimos una línea al terminar la tabla
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    }
}