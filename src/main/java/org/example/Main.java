package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcancia = 0;
        int valor;
        int moneda20 = 0;
        int moneda50 = 0;
        int moneda100 = 0;
        int moneda200 = 0;
        int moneda500 = 0;


        do {
            System.out.println("Ingresa un valor para meter en la alcancía: ");
            System.out.println("1: 20 pesos ");
            System.out.println("2: 50 pesos ");
            System.out.println("3: 100 pesos ");
            System.out.println("4: 200 pesos ");
            System.out.println("5: 500 pesos ");
            System.out.println("6: total de monedas por denominación ");
            System.out.println("7: ver ahorro total ");
            System.out.println("8: romper alcancia ");

            valor = scanner.nextInt();

            switch (valor) {
                case 1:
                    alcancia = alcancia + 20;
                    System.out.println("Has añadido 20 pesos.");
                    moneda20 = moneda20+1;
                    break;
                case 2:
                    alcancia = alcancia + 50;
                    System.out.println("Has añadido 50 pesos.");
                    moneda50 = moneda50+1;
                    break;
                case 3:
                    alcancia = alcancia + 100;
                    System.out.println("Has añadido 100 pesos.");
                    moneda100 = moneda100+1;
                    break;
                case 4:
                    alcancia = alcancia + 200;
                    System.out.println("Has añadido 200 pesos.");
                    moneda200 = moneda200+1;
                    break;
                case 5:
                    alcancia = alcancia + 500;
                    System.out.println("Has añadido 500 pesos.");
                    moneda500 = moneda500+1;
                    break;
                case 6:
                    System.out.println("Usted tiene en total: " + moneda20 + " monedas de 20.");
                    System.out.println("Usted tiene en total: " + moneda50 + " monedas de 50.");
                    System.out.println("Usted tiene en total: " + moneda100 + " monedas de 100.");
                    System.out.println("Usted tiene en total: " + moneda200 + " monedas de 200.");
                    System.out.println("Usted tiene en total: " + moneda500 + " monedas de 500.");

                    break;
                case 7:
                    System.out.println("Usted tiene: " + alcancia + " pesos ahorrados.");
                    break;
                case 8:
                    System.out.println("¡Ha roto su alcancía! En total ahorró: " + alcancia + " pesos.");
                    break;
                default:
                    System.out.println("Ingrese un valor válido entre 1 y 8.");
                    break;
            }
        } while (valor != 8);


        scanner.close();
    }
}