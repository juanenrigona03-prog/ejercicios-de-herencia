public class LibroDigital extends Libro {
    private String formato;
    private double tamanioMB;
    private int anio;

    public LibroDigital(String titulo, String autor, int anio, String formato, double tamanioMB) {
        super(titulo, autor, anio);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
        this.anio = anio;
    }

    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("INFORMACION DEL LIBRO DIGITAL");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio: " + anio);
        System.out.println("Formato: " + formato);
        System.out.println("Tamanio: " + tamanioMB + " MB");
    }

    public static void main(String[] args) {
        LibroDigital libroDigital1 = new LibroDigital("Cien Años de Soledad", "Gabriel García Márquez", 1967, "PDF", 5.2);
        libroDigital1.mostrarInformacion();
    }
}
