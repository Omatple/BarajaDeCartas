package org.iesalandalus.programacion.barajacartas.modelo;

public enum Palo {
    OROS("Oros"),
    COPAS("Copas"),
    ESPADAS("Espadas"),
    BASTOS("Bastos");

    private String nombre;

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
