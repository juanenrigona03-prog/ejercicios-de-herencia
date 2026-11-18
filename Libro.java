public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Metodo para mostrar la informacion del libro
    public void informacionLibro() {
        System.out.println("INFORMACION DEL LIBRO");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicacion: " + anioPublicacion);
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        libro1.informacionLibro();
    }
}
