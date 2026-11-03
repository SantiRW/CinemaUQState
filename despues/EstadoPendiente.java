package despues;

// PIEZA: ConcreteState
public class EstadoPendiente implements EstadoReserva {
    public String nombre() { return "PENDIENTE"; }

    public void pagar(Reserva r) {
        System.out.println("Pago recibido para " + r.getPelicula());
        r.setEstado(new EstadoPagada());
    }
    public void cancelar(Reserva r) {
        System.out.println("Reserva cancelada");
        r.setEstado(new EstadoCancelada());
    }
    public void expirar(Reserva r) {
        System.out.println("Reserva expirada (cancelada)");
        r.setEstado(new EstadoCancelada());
    }
}
