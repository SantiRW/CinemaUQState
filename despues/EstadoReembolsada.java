package despues;

import despues.Compra;
import despues.EstadoCompra;

// PIEZA: ConcreteState (estado final)
public class EstadoReembolsada implements EstadoCompra {
    public String nombre() { return "REEMBOLSADA"; }

    @Override
    public void cancelar(Compra c) {
        System.out.println("Ya fue reembolsada, no hay nada que cancelar");
    }
}