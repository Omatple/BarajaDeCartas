package org.iesalandalus.programacion.barajacartas;

import org.iesalandalus.programacion.barajacartas.modelo.Baraja;
import org.iesalandalus.programacion.barajacartas.vista.Consola;

public class Main {
    public static void main(String[] args) {
        Baraja baraja1 = new Baraja();
        System.out.println("-----------------------------------------------------------------------------------------\nAqui tiene su baraja ordenada: ");
        for (int i = 0; i < 48; i++) {
            System.out.println(baraja1.getCarta(i));
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        baraja1.barajar(Consola.leerVeces());
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < 48; i++) {
            System.out.println(baraja1.getCarta(i));
        }
        Consola.mostrarResultados(baraja1);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
//---- PROYECTO HECHO COMO LO HUBIERA REALIZADO EN UN EXAMEN, ESCRIBIENDO EL CODIGO ESENCIAL Y LO QUE PIDE EL PROFESOR, NI MAS NI MENOS ----

//PREGUNTAS DEL PROYECTO SIN VER RESOLUCION: ¿DONDE VERIFICO SI UNA CARTA ES NULA SIN AÑADIR NINGUN METODO QUE NO ESTE EN LOS DIAGRAMAS?
// ¿SIN AÑADIR NINGUN METODO QUE NO ESTE EN LOS DIAGRAMAS COMO HAGO EN CONSOLA PARA DARLE LA OPCION AL USURIO DE QUE SE LE MUESTRE LA BARAJA,
// YA QUE SINO NO HAY FORMA DE QUE EL USUARIO VEA SU BARAJA "DE MANERA SENCILLA"?¿UTILIZAR getCarta EN INTERCAMBIAR ES CONVENIENTE O NO, SE DEBE
// UTILIZAR O NO, Y SI ES ASI QUE PROBLEMAS ACARREA?¿NO SERIA MEJOR HACER UN METOD EN CONSOLA DE BARAJAR PARA ASI AHI PODER CAPTURAR CUALQUIER
// EXCEPCION NECESARIA UTILIZANDO EL TRY -- CATCH? *IDEAS QUIZA NO BUENAS: NO SE DEBERIA HACER CON UN ARRAY DE
// 2 DIMENSIONES DE DONDE EN UNA IRIA LOS NUMEROS DE CARTAS Y EN LA OTRA LOS DIFERENTES TIPOS DE PALOS PARA CADA UNO(TODO LO DICHO HA SIDO SIN
//  VER LA RESOLUCION DEL PROFESOR, PUEDE QUE MI OPONINION CAMBIE, ADEMAS DE LA CORRECCION DE POSIBLES ERRORES COMETIDOS)
