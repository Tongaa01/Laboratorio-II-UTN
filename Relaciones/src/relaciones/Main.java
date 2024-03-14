package relaciones;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("coco", 20, "Cervantes", 465);
        Libro l1 = new Libro("Java Statements");
        p1.agregarLibro(l1);
        p1.mostrarDatos();
    }
}
