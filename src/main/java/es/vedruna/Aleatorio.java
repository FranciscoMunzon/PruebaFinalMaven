package es.vedruna;

import java.util.List;
import java.util.Random;

public class Aleatorio {

    // Método para conseguir el número aleatorio con el rango proporcionado
    public int numeroAleatorio(int rango) {
        Random rand = new Random();
        if (validarRango(rango)) {
            int resultado = rand.nextInt(rango) + 1;
            System.out.print("El numero aleatorio es: ");
            return resultado;
        }
        System.out.print("El rango no es válido: ");
        return rango;
    }

    // Método para validar el rango para evitar que entren rangos inválidos
    public boolean validarRango(int rango) {
        if (rango <= 0) {
            return false;
        }
        return true;
    }
}
