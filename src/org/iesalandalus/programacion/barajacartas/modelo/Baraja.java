package org.iesalandalus.programacion.barajacartas.modelo;

import java.util.Random;

public class Baraja {
    private Carta[] mazo = new Carta[NUM_CARTAS];
    public static final int NUM_CARTAS = (Carta.CARTAS_PALO * 4);
    Random generador = new Random();

    public Baraja() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < Carta.CARTAS_PALO; j++) {
                switch (i) {
                    case 0:
                        mazo[j] = new Carta((j + 1), Palo.OROS);
                        break;
                    case 1:
                        mazo[j + (Carta.CARTAS_PALO * i)] = new Carta((j + 1), Palo.COPAS);
                        break;
                    case 2:
                        mazo[j + (Carta.CARTAS_PALO * i)] = new Carta((j + 1), Palo.ESPADAS);
                        break;
                    case 3:
                        mazo[j + (Carta.CARTAS_PALO * i)] = new Carta((j + 1), Palo.BASTOS);
                        break;
                }
            }
        }
    }

    public Carta getCarta(int posicion) {
        comprobarPosicion(posicion);
        return mazo[posicion];
    }

    private void comprobarPosicion(int posicion) {
        if (!(posicion >= 0 && posicion < (NUM_CARTAS))) {
            throw new IllegalArgumentException("Posicion de carta no validad(1-48).");
        }
    }

    private void intercambiar(int posicion1, int posicion2) {
        comprobarPosicion(posicion1);
        comprobarPosicion(posicion2);
        Carta aux = getCarta(posicion1);
        mazo[posicion1] = getCarta(posicion2);
        mazo[posicion2] = aux;
    }

    public void barajar(int veces) {
        if (veces < 1) {
            throw new IllegalArgumentException("La cantidad de veces a barajar debe ser superior a 0. ");
        }
        for (int i = 0; i < veces; i++) {
            int numeroAleatorio1 = generador.nextInt(NUM_CARTAS - 1);
            int numeroAleatorio2 = generador.nextInt(NUM_CARTAS - 1);
            intercambiar(numeroAleatorio1, numeroAleatorio2);
        }
    }
}
