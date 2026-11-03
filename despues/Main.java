package despues;

import despues.Compra;

// PIEZA: Client
public class Main {
    public static void main(String[] args) {
        Compra c = new Compra("Dune 2");
        c.usar();      // no permitido (pendiente)
        c.pagar();
        c.usar();      // PAGADA -> FINALIZADA
        c.cancelar();  // no permitido (finalizada)

        System.out.println("\n--- Otra compra que expira ---");
        Compra c2 = new Compra("Barbie");
        c2.expirar();
        c2.pagar();    // no permitido
        System.out.println("Estado final: " + c2.getEstado());

        System.out.println("\n--- Compra pagada y luego reembolsada ---");
        Compra c3 = new Compra("Oppenheimer");
        c3.pagar();
        c3.cancelar();   // PAGADA -> REEMBOLSADA
        c3.usar();       // no permitido
        c3.cancelar();   // ya reembolsada
        System.out.println("Estado final: " + c3.getEstado());
    }
}