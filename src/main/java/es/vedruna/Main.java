package es.vedruna;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aleatorio prueba = new Aleatorio();
        System.out.print("¿Cuántos números quieres que haya en el aleatorizador?: ");
        int rango = scan.nextInt();
        System.out.print(prueba.numeroAleatorio(rango));
    }
}