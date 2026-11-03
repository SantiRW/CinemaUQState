package despues;

public class OperacionNoPermitiaExcepcion extends RuntimeException {
    public OperacionNoPermitiaExcepcion(String message) {
        super(message);
    }
}
