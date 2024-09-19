package org.iesalandalus.programacion.barajacartas.modelo;

import java.util.Objects;

public record Carta(int numero, Palo palo) {

    static final int CARTAS_PALO = 12;
    private static final String[] NUMEROS_STR = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota", "Caballo", "Rey"};

    public Carta {
        validarNumero(numero);
        validarPalo(palo);
    }

    private void validarNumero(int numero) {
        if (!(numero > 0 && numero <= CARTAS_PALO)) {
            throw new IllegalArgumentException("EL numero de la carta no es valido.");
        }
    }

    private void validarPalo(Palo palo) {
        Objects.requireNonNull(palo, "El palo de la carta no puede ser nulo.");
        if (!(palo == Palo.BASTOS || palo == Palo.COPAS || palo == Palo.OROS || palo == Palo.ESPADAS)) {
            throw new IllegalArgumentException("El palo de la carta no es valido.");
        }
    }

    @Override
    public String toString() {
        return NUMEROS_STR[((numero) - 1)] + " de " + palo;
    }
}