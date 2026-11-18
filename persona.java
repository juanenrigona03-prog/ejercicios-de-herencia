public class persona {
    private String nombre;
    private int edad;
    private String sexo;

    //Constructor
    public persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }

    public void informacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
    }
}
  class Main {
    public static void main(String[] args) throws Exception {
        persona persona1 = new persona("Ana", 25, "Femenino");
        persona1.informacion();
    }
}