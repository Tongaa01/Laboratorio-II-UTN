package herencia;

public abstract class Vehiculo {

    protected String marca;
    protected int cantRuedas;

    public Vehiculo(){
    }

    public Vehiculo(String marca, int cantRuedas) {
        this.marca = marca;
        this.cantRuedas = cantRuedas;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }
    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    abstract void mover();
}
