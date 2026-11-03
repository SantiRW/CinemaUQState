package despues;

// PIEZA: ConcreteState
public class EstadoPendiente implements EstadoCompra {
    public String nombre() { return "PENDIENTE"; }

    public void pagar(Compra r) {
        System.out.println("Pago recibido para " + r.getPelicula());
        r.setEstado(new EstadoPagada());
    }
    public void cancelar(Compra r) {
        System.out.println("Reserva cancelada");
        r.setEstado(new EstadoCancelada());
    }
    public void expirar(Compra r) {
        System.out.println("Reserva expirada (cancelada)");
        r.setEstado(new EstadoCancelada());
    }
}
