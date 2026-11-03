package despues;

// PIEZA: ConcreteState
public class EstadoPagada implements EstadoReserva {
    public String nombre() { return "PAGADA"; }

    public void usar(Reserva r) {
        System.out.println("Ingreso permitido a " + r.getPelicula());
        r.setEstado(new EstadoUsada());
    }
    public void cancelar(Reserva r) {
        System.out.println("Reserva cancelada, se reembolsa el pago");
        r.setEstado(new EstadoCancelada());
    }
}
