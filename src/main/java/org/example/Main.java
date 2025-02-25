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
                case 1-> {
                    alcancia = alcancia + 20;
                    System.out.println("Has añadido 20 pesos.");
                    moneda20 = moneda20+1;
                }
                case 2-> {
                    alcancia = alcancia + 50;
                    System.out.println("Has añadido 50 pesos.");
                    moneda50 = moneda50+1;
                }
                case 3-> {
                    alcancia = alcancia + 100;
                    System.out.println("Has añadido 100 pesos.");
                    moneda100 = moneda100 + 1;
                }
                case 4-> {
                    alcancia = alcancia + 200;
                    System.out.println("Has añadido 200 pesos.");
                    moneda200 = moneda200 + 1;
                }
                case 5-> {
                    alcancia = alcancia + 500;
                    System.out.println("Has añadido 500 pesos.");
                    moneda500 = moneda500 + 1;
                }
                case 6-> {
                    System.out.println("Usted tiene en total: " + moneda20 + " monedas de 20.");
                    System.out.println("Usted tiene en total: " + moneda50 + " monedas de 50.");
                    System.out.println("Usted tiene en total: " + moneda100 + " monedas de 100.");
                    System.out.println("Usted tiene en total: " + moneda200 + " monedas de 200.");
                    System.out.println("Usted tiene en total: " + moneda500 + " monedas de 500.");
                }
                case 7-> {
                    System.out.println("Usted tiene: " + alcancia + " pesos ahorrados.");
                }
                case 8-> {
                    System.out.println("¡Ha roto su alcancía! En total ahorró: " + alcancia + " pesos.");
                }
                default ->     System.out.println("Ingrese un valor válido entre 1 y 8.");
            };
        } while (valor != 8);


        scanner.close();
    }
}

    class lanzamientos {
    public static void main(String[] args) {
        int tiradas = 0;
        int resultado1, resultado2;
        int sumaTotal = 0;
        int sumaTirada1 = 0;
        int sumaTirada2 = 0;
        int numTiradas = (int) (Math.random() * 100) + 1;

        System.out.println("Número de tiradas: " + numTiradas);

        for (int i = 1; i <= numTiradas; i++) {
            resultado1 = (int) (Math.random() * 6) + 1;
            resultado2 = (int) (Math.random() * 6) + 1;
            tiradas++;
            sumaTirada1 += resultado1;
            sumaTirada2 += resultado2;
            System.out.println("Tirada " + tiradas + ": Resultado 1 = " + resultado1 + ", Resultado 2 = " + resultado2);
        }
        System.out.println("El total 1 es: " + sumaTirada1);
        System.out.println("El total 2 es: " + sumaTirada2);
        if (sumaTirada1 > sumaTirada2){
            System.out.println("El ganador es 1 ");
        }else
            System.out.println("El ganador es 2 ");
    }
}
    class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int victoriasJugador = 0;
        int victoriasPc = 0;

        while (victoriasJugador < 2 && victoriasPc < 2) {
            System.out.println("Elige: 1. Piedra, 2. Papel, 3. Tijera");
            int eleccionJugador = scanner.nextInt() - 1;
            if (eleccionJugador < 0 || eleccionJugador > 2) {
                System.out.println("Elección no válida. Por favor elige entre 1, 2 o 3.");
                continue;
            }
            int eleccionComputadora = (int) (Math.random() * 3);

            String eleccionJugadorTexto = eleccionJugador == 0 ? "Piedra" : (eleccionJugador == 1 ? "Papel" : "Tijera");
            String eleccionComputadoraTexto = eleccionComputadora == 0 ? "Piedra" : (eleccionComputadora == 1 ? "Papel" : "Tijera");

            System.out.println("Tu elección: " + eleccionJugadorTexto);
            System.out.println("Elección de la pc: " + eleccionComputadoraTexto);

            if (eleccionJugador == eleccionComputadora) {
                System.out.println("Nadie gana :(");
            } else if ((eleccionJugador == 0 && eleccionComputadora == 2) ||
                    (eleccionJugador == 1 && eleccionComputadora == 0) ||
                    (eleccionJugador == 2 && eleccionComputadora == 1)) {
                victoriasJugador++;
                System.out.println("Haz ganado!!");
            } else {
                victoriasPc++;
                System.out.println("Perdiste esta ronda");
            }
            System.out.println("Puntaje: Tú " + victoriasJugador + " - Pc " + victoriasPc);
            System.out.println("--------------------------");
        }
        if (victoriasJugador == 2) {
            System.out.println("Ganaste el juego.");
        } else {
            System.out.println("La Pc ganó el juego");
        }
    }
}
    class CandidatoPremium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;

        int costoInternet = 700000;
        int costoRadio = 200000;
        int costoTelevision = 600000;

        int votosInternetC1 = 0, votosRadioC1 = 0, votosTelevisionC1 = 0;
        int votosInternetC2 = 0, votosRadioC2 = 0, votosTelevisionC2 = 0;
        int votosInternetC3 = 0, votosRadioC3 = 0, votosTelevisionC3 = 0;

        int opcion;
        int totalVotos = 0;

        do {
            System.out.println("Sistema de votación del municipio Premier");
            System.out.println("1. Votar por un candidato");
            System.out.println("2. Calcular el costo de campaña");
            System.out.println("3. Vaciar todas las urnas");
            System.out.println("4. Ver número total de votos");
            System.out.println("5. Ver porcentaje de votos de cada candidato");
            System.out.println("6. Costo promedio de campaña");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1-> {
                    System.out.println("Seleccione un candidato (1, 2, 3): ");
                    int candidato = scanner.nextInt();
                    System.out.println("Seleccione el medio publicitario que lo incentivo (1. Internet, 2. Radio, 3. Televisión): ");
                    int medio = scanner.nextInt();
                    if (candidato == 1) {
                        votosCandidato1++;
                        if (medio == 1) votosInternetC1++;
                        else if (medio == 2) votosRadioC1++;
                        else if (medio == 3) votosTelevisionC1++;
                    } else if (candidato == 2) {
                        votosCandidato2++;
                        if (medio == 1) votosInternetC2++;
                        else if (medio == 2) votosRadioC2++;
                        else if (medio == 3) votosTelevisionC2++;
                    } else if (candidato == 3) {
                        votosCandidato3++;
                        if (medio == 1) votosInternetC3++;
                        else if (medio == 2) votosRadioC3++;
                        else if (medio == 3) votosTelevisionC3++;
                    }
                    totalVotos++;
                }
                case 2-> {
                    long costoC1 = votosInternetC1 * costoInternet + votosRadioC1 * costoRadio + votosTelevisionC1 * costoTelevision;
                    long costoC2 = votosInternetC2 * costoInternet + votosRadioC2 * costoRadio + votosTelevisionC2 * costoTelevision;
                    long costoC3 = votosInternetC3 * costoInternet + votosRadioC3 * costoRadio + votosTelevisionC3 * costoTelevision;
                    System.out.println("Costo de campaña Candidato 1: " + costoC1);
                    System.out.println("Costo de campaña Candidato 2: " + costoC2);
                    System.out.println("Costo de campaña Candidato 3: " + costoC3);
                }
                case 3-> {
                    votosCandidato1 = votosCandidato2 = votosCandidato3 = 0;
                    votosInternetC1 = votosRadioC1 = votosTelevisionC1 = 0;
                    votosInternetC2 = votosRadioC2 = votosTelevisionC2 = 0;
                    votosInternetC3 = votosRadioC3 = votosTelevisionC3 = 0;
                    totalVotos=0;
                    System.out.println("Las urnas han sido vaciadas.");
                }
                case 4-> {
                    System.out.println("Número total de votos: " + totalVotos);
                }
                case 5-> {
                    if (totalVotos == 0) {
                        System.out.println("No hay votos registrados.");
                    } else {
                        double porcentajeC1 = (double) votosCandidato1 / totalVotos * 100;
                        double porcentajeC2 = (double) votosCandidato2 / totalVotos * 100;
                        double porcentajeC3 = (double) votosCandidato3 / totalVotos * 100;

                        System.out.println("Porcentaje de votos Candidato 1: " + porcentajeC1 + "%");
                        System.out.println("Porcentaje de votos Candidato 2: " + porcentajeC2 + "%");
                        System.out.println("Porcentaje de votos Candidato 3: " + porcentajeC3 + "%");
                    }
                }
                case 6-> {
                    long costoTotalCampana = (votosInternetC1 * costoInternet + votosRadioC1 * costoRadio + votosTelevisionC1 * costoTelevision)
                            + (votosInternetC2 * costoInternet + votosRadioC2 * costoRadio + votosTelevisionC2 * costoTelevision)
                            + (votosInternetC3 * costoInternet + votosRadioC3 * costoRadio + votosTelevisionC3 * costoTelevision);
                    if (totalVotos == 0) {
                        System.out.println("No hay votos registrados.");
                    } else {
                        double costoPromedio = (double) costoTotalCampana / totalVotos;
                        System.out.println("Costo promedio de campaña por voto: " + costoPromedio);
                    }
                }
                case 7-> {
                    System.out.println("saliendo...");
                }
                default -> {
                    System.out.println("Ingrese un valor valido entre 1 y 7");
                }
            }
        }while (opcion!=7);
        scanner.close();
    }
}