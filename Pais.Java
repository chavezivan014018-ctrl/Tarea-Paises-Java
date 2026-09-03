// Creamos la clase Pais
public class Pais {

    // Atributo que almacena el nombre del país
    private String nombre;

    // Atributo que almacena la capital del país
    private String capital;

    // Atributo que almacena el continente del país
    private String continente;

    // Atributo que almacena la población del país
    private long poblacion;

    // Atributo que almacena el idioma principal del país
    private String idioma;

    // Atributo que almacena la moneda del país
    private String moneda;

    // Atributo que almacena la superficie del país en kilómetros cuadrados
    private double superficie;


    // Constructor de la clase Pais
    public Pais(String nombre, String capital, String continente,
                long poblacion, String idioma, String moneda,
                double superficie) {

        // Guardamos el nombre recibido en el atributo nombre
        this.nombre = nombre;

        // Guardamos la capital recibida en el atributo capital
        this.capital = capital;

        // Guardamos el continente recibido
        this.continente = continente;

        // Guardamos la población recibida
        this.poblacion = poblacion;

        // Guardamos el idioma recibido
        this.idioma = idioma;

        // Guardamos la moneda recibida
        this.moneda = moneda;

        // Guardamos la superficie recibida
        this.superficie = superficie;
    }


    // Método que permite obtener el nombre del país
    public String getNombre() {
        return nombre;
    }


    // Método que permite obtener la capital
    public String getCapital() {
        return capital;
    }


    // Método que permite obtener el continente
    public String getContinente() {
        return continente;
    }


    // Método que permite obtener la población
    public long getPoblacion() {
        return poblacion;
    }


    // Método que permite obtener el idioma
    public String getIdioma() {
        return idioma;
    }


    // Método que permite obtener la moneda
    public String getMoneda() {
        return moneda;
    }


    // Método que permite obtener la superficie
    public double getSuperficie() {
        return superficie;
    }


    // Acción 1: muestra información básica del país
    public void mostrarInformacion() {
        System.out.println("País: " + nombre);
        System.out.println("Capital: " + capital);
        System.out.println("Continente: " + continente);
    }


    // Acción 2: muestra la población del país
    public void mostrarPoblacion() {
        System.out.println(nombre + " tiene una población de " + poblacion + " habitantes.");
    }


    // Acción 3: muestra el idioma del país
    public void mostrarIdioma() {
        System.out.println("El idioma principal de " + nombre + " es " + idioma + ".");
    }


    // Acción 4: muestra la moneda utilizada
    public void mostrarMoneda() {
        System.out.println("La moneda de " + nombre + " es " + moneda + ".");
    }


    // Acción 5: muestra la superficie del país
    public void mostrarSuperficie() {
        System.out.println(nombre + " tiene una superficie de " + superficie + " km².");
    }
}