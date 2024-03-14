package herencia;

public class Auto extends Vehiculo{
    private int matricula;

    public Auto(int matricula) {
        this.matricula = matricula;
    }

    public Auto(String marca, int cantRuedas, int matricula) {
        super(marca, cantRuedas);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    void mover() {
        System.out.println("Me estoy moviendo como auto");
    }
}
