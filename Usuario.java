public class Usuario extends persona {
 


    private String correo;
    private String contrasena;

    // Constructor
    public Usuario(String nombre, int edad, String sexo,
                   String correo, String contrasena) {

        super(nombre, edad, sexo);

        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Metodo setCorreo
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Metodo getCorreo
    public String getCorreo() {
        return correo;
    }

    // Metodo setContrasena
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Metodo getContrasena
    public String getContrasena() {
        return contrasena;
    }

    // Metodo para mostrar informacion
    public void informacionUsuario() {

        System.out.println("INFORMACION DEL USUARIO");

        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Correo: " + correo);
        System.out.println("Contrasena: " + contrasena);
    }

    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario("Ana", 25, "Femenino", "ana@example.com", "password123");
        usuario1.informacionUsuario();
    }
}