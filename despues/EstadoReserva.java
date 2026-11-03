package despues;

// PIEZA: State (interfaz del estado)
public interface EstadoReserva {
    String nombre();

    default void pagar(Reserva r)    { System.out.println("No permitido: pagar en estado " + nombre()); }
    default void usar(Reserva r)     { System.out.println("No permitido: usar en estado " + nombre()); }
    default void cancelar(Reserva r) { System.out.println("No permitido: cancelar en estado " + nombre()); }
    default void expirar(Reserva r)  { System.out.println("No permitido: expirar en estado " + nombre()); }
}
