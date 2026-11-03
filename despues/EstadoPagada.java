package despues;

// PIEZA: ConcreteState
public class EstadoPagada implements EstadoCompra {
    public String nombre() { return "PAGADA"; }

    public void usar(Compra r) {
        System.out.println("Ingreso permitido a " + r.getPelicula());
        r.setEstado(new EstadoFinalizada());
    }
    public void cancelar(Compra c) {
        System.out.println("Compra cancelada, se reembolsa el pago");
        c.setEstado(new EstadoReembolsada());   // antes: new EstadoCancelada()
    }
}
