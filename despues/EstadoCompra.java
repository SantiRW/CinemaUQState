package despues;

// PIEZA: State (interfaz del estado)
public interface EstadoCompra {
    String nombre();

    default void pagar(Compra r)    { System.out.println("No permitido: pagar en estado " + nombre()); }
    default void usar(Compra r)     { System.out.println("No permitido: usar en estado " + nombre()); }
    default void cancelar(Compra r) { System.out.println("No permitido: cancelar en estado " + nombre()); }
    default void expirar(Compra r)  { System.out.println("No permitido: expirar en estado " + nombre()); }
}
