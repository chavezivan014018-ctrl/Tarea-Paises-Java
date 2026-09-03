// Clase principal del programa
public class Main {

    // Método principal donde comienza el programa
    public static void main(String[] args) {

        Pais pais1 = new Pais(
                "México",
                "Ciudad de México",
                "América",
                130000000,
                "Español",
                "Peso mexicano",
                1964375
        );

        Pais pais2 = new Pais(
                "Canadá",
                "Ottawa",
                "América",
                40000000,
                "Inglés y francés",
                "Dólar canadiense",
                9984670
        );

        Pais pais3 = new Pais(
                "Brasil",
                "Brasilia",
                "América",
                203000000,
                "Portugués",
                "Real brasileño",
                8515767
        );

        Pais pais4 = new Pais(
                "España",
                "Madrid",
                "Europa",
                48000000,
                "Español",
                "Euro",
                505990
        );

        Pais pais5 = new Pais(
                "Francia",
                "París",
                "Europa",
                68000000,
                "Francés",
                "Euro",
                551695
        );

        Pais pais6 = new Pais(
                "Alemania",
                "Berlín",
                "Europa",
                84000000,
                "Alemán",
                "Euro",
                357022
        );

        Pais pais7 = new Pais(
                "Japón",
                "Tokio",
                "Asia",
                124000000,
                "Japonés",
                "Yen",
                377975
        );

        Pais pais8 = new Pais(
                "China",
                "Pekín",
                "Asia",
                1400000000,
                "Mandarín",
                "Yuan",
                9596961
        );

        Pais pais9 = new Pais(
                "Australia",
                "Canberra",
                "Oceanía",
                27000000,
                "Inglés",
                "Dólar australiano",
                7692024
        );

        Pais pais10 = new Pais(
                "Argentina",
                "Buenos Aires",
                "América",
                46000000,
                "Español",
                "Peso argentino",
                2780400
        );


        // Creamos un objeto para administrar la tabla
        TablaPaises tabla = new TablaPaises();


        // Guardamos los 10 objetos dentro de la tabla
        tabla.guardarPaises(
                pais1,
                pais2,
                pais3,
                pais4,
                pais5,
                pais6,
                pais7,
                pais8,
                pais9,
                pais10
        );


        // Imprimimos la tabla de países en la consola
        tabla.imprimirTabla();
    }
}