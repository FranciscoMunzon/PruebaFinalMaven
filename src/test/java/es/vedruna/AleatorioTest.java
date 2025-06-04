package es.vedruna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AleatorioTest {

    @Test
    void numeroAleatorio() {
        int rango = 5;
        int resultado = 0;
        Aleatorio instance = new Aleatorio();
        resultado = instance.numeroAleatorio(rango);
        if (resultado > rango || resultado <= 0) {
            resultado = -1;
        } else {
            resultado = 0;
        }
        assertEquals(0, resultado);



    }

    @Test
    void validarRango() {
        int rango = 0;
        Aleatorio instance = new Aleatorio();
        boolean valido = instance.validarRango(rango);
        assertFalse(valido);
    }
}