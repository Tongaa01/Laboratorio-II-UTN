package relaciones;

public class Persona {
    private String nombre;
    private int edad;
    private Libro libro;
    private Domicilio domicilio;
    public Persona() {
    }

    public Persona(String nombre, int edad, String calle1, int numero1) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = new Domicilio(calle1, numero1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+", edad: "+edad);
        System.out.println("Domicilio: "+domicilio.getCalle()+" "+domicilio.getNumero());
        if (libro != null)
            System.out.println("Posee el libro '"+libro.getTitulo()+"'");
    }
    public void agregarLibro(Libro libro1){
        this.libro = libro1;
    }
}
