package antes;

// SIN PATRON: cada operacion repite un if/else sobre el estado.
public class ReservaAntes {
    private String estado = "PENDIENTE";
    private final String pelicula;

    public ReservaAntes(String pelicula) { this.pelicula = pelicula; }

    public void pagar() {
        if (estado.equals("PENDIENTE")) {
            estado = "PAGADA";
            System.out.println("Pago recibido para " + pelicula);
        } else if (estado.equals("PAGADA")) {
            System.out.println("Ya está pagada");
        } else if (estado.equals("USADA")) {
            System.out.println("Ya fue usada");
        } else if (estado.equals("CANCELADA")) {
            System.out.println("Está cancelada");
        }
    }

    public void usar() {
        if (estado.equals("PAGADA")) {
            estado = "USADA";
            System.out.println("Ingreso permitido a " + pelicula);
        } else if (estado.equals("PENDIENTE")) {
            System.out.println("Primero debe pagar");
        } else if (estado.equals("USADA")) {
            System.out.println("Ya fue usada");
        } else if (estado.equals("CANCELADA")) {
            System.out.println("Está cancelada");
        }
    }

    public void cancelar() {
        if (estado.equals("PENDIENTE")) {
            estado = "CANCELADA";
            System.out.println("Reserva cancelada");
        } else if (estado.equals("PAGADA")) {
            estado = "CANCELADA";
            System.out.println("Reserva cancelada, se reembolsa el pago");
        } else if (estado.equals("USADA")) {
            System.out.println("No se puede cancelar: ya fue usada");
        } else if (estado.equals("CANCELADA")) {
            System.out.println("Ya estaba cancelada");
        }
    }

    public void expirar() {
        if (estado.equals("PENDIENTE")) {
            estado = "CANCELADA";
            System.out.println("Reserva expirada (cancelada)");
        } else {
            System.out.println("Expirar no aplica en estado " + estado);
        }
    }
}
