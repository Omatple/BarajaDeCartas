package org.iesalandalus.programacion.barajacartas.vista;

import org.iesalandalus.programacion.barajacartas.modelo.Baraja;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola() {
    }

    public static int leerVeces() {
        int cantidad;
        do {
            System.out.print("Escriba la cantidad de veces que desee intercambiar cartas de la baraja: ");
            cantidad = Entrada.entero();
        } while (cantidad < 0);
        return cantidad;
    }

    public static void mostrarResultados(Baraja barajaBarajada) {
        Baraja barajaOrdenada = new Baraja();
        int contadorNoCambiadas = 0;
        for (int i = 0; i < Baraja.NUM_CARTAS; i++) {
            if (barajaOrdenada.getCarta(i).equals(barajaBarajada.getCarta(i))) {
                contadorNoCambiadas++;
            }
        }
        System.out.println(contadorNoCambiadas + " cartas del mazo no han sido cambiadas de posicion al barajar.\n" + (Baraja.NUM_CARTAS - (contadorNoCambiadas)) + " cartas del mazo si han sido cambiadas de posicion al barajar.");
        }
    }
