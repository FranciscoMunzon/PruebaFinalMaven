package es.vedruna;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aleatorio prueba = new Aleatorio();
        Scanner scan = new Scanner(System.in);

        System.out.print("Escriba el rango en el que número aleaotorio tiene que estar: ");
        System.out.println(prueba.numeroAleatorio(scan.nextInt()));
    }
}