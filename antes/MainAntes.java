package antes;

public class MainAntes {
    public static void main(String[] args) {
        ReservaAntes r = new ReservaAntes("Dune 2");
        r.usar();     // primero debe pagar
        r.pagar();
        r.usar();
        r.cancelar(); // no se puede
    }
}
