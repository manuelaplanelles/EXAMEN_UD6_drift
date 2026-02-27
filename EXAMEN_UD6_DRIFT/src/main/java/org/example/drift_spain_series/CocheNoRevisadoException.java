package org.example.drift_spain_series;

public class CocheNoRevisadoException extends RuntimeException {
    public CocheNoRevisadoException() {
        super("El coche del piloto no esta en estado REVISADO");
    }
}
