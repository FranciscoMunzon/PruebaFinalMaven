package es.vedruna;

import java.util.List;
import java.util.Random;

public class Aleatorio {

    // Para conseguir el número aleatorio con el rango proporcionado
    public int numeroAleatorio(int rango) {
        Random rand = new Random();
        if (validarRango(rango)) {
            int resultado = rand.nextInt(rango) + 1;
            System.out.println("El numero aleatorio es: ");
            return resultado;
        }
        System.out.print("El rango no es válido: ");
        return rango;
    }

    // EXTRA: Si el usuario quiere puede añadir valores para que cuando se elija un número aleatorio te devuelva el valor en vez de un número.
//    public List listaValores(List<String> valores) {
//.
//    }

    // Validador para evitar que entren rangos inválidos
    public boolean validarRango(int rango) {
        if (rango <= 0) {
            return false;
        }
        return true;
    }
}
