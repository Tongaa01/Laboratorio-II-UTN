package herencia;

public class Avion extends Vehiculo implements Volador{
    private int velocidadMaxima;

    public Avion(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Avion(String marca, int cantRuedas, int velocidadMaxima) {
        super(marca, cantRuedas);
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    void mover() {
        System.out.println("Me estoy moviendo como avión");
    }

    @Override
    public void volar() {
        System.out.println("Yo vuelo como avión");
    }
}
