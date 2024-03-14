package herencia;

public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("BMW", 4, 123);
        Avion av1 = new Avion("Boeing", 2, 1000);
        Pajaro p1 = new Pajaro();

        System.out.println("Soy un auto "+a1.getMarca()+", tengo "+a1.getCantRuedas()+" ruedas");
        a1.mover();
        System.out.println("Soy un avion "+av1.getMarca()+", tengo "+a1.getCantRuedas()+" ruedas");
        av1.mover();
        av1.volar();

        System.out.println("Soy un pajaro");
        p1.volar();
    }
}
