package despues;

// PIEZA: Client
public class Main {
    public static void main(String[] args) {
        Reserva r = new Reserva("Dune 2");
        r.usar();      // no permitido (pendiente)
        r.pagar();
        r.usar();
        r.cancelar();  // no permitido (usada)

        System.out.println("\n--- Otra reserva que expira ---");
        Reserva r2 = new Reserva("Barbie");
        r2.expirar();
        r2.pagar();    // no permitido
        System.out.println("Estado final: " + r2.getEstado());
    }
}
