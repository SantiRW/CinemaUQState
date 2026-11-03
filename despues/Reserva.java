package despues;

// PIEZA: Context (contexto). Delega en su estado actual.
public class Reserva {
    private EstadoReserva estado = new EstadoPendiente();
    private final String pelicula;

    public Reserva(String pelicula) { this.pelicula = pelicula; }

    public void setEstado(EstadoReserva nuevo) {
        System.out.println("   [" + estado.nombre() + " -> " + nuevo.nombre() + "]");
        this.estado = nuevo;
    }

    public String getPelicula() { return pelicula; }
    public String getEstado()   { return estado.nombre(); }

    public void pagar()    { estado.pagar(this); }
    public void usar()     { estado.usar(this); }
    public void cancelar() { estado.cancelar(this); }
    public void expirar()  { estado.expirar(this); }
}
