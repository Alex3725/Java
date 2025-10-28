import core.Temperatura;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Temperatura> lista = new ArrayList<>();
            boolean continua = true;

            while (continua) {
                System.out.println("\n--- MENU TEMPERATURA ---");
                System.out.println("1. Crea nuova temperatura");
                System.out.println("2. Visualizza tutte le temperature");
                System.out.println("3. Modifica una temperatura");
                System.out.println("4. Elimina una temperatura");
                System.out.println("5. Confronta due temperature");
                System.out.println("6. Conteggio istanze");
                System.out.println("0. Esci");
                System.out.print("Scelta: ");
                int scelta = scanner.nextInt();

                switch (scelta) {
                    case 1 -> {
                        System.out.print("Inserisci valore in °C (>= -273.15): ");
                        double valore = scanner.nextDouble();
                        if (valore >= -273.15) {
                            Temperatura t = new Temperatura(valore);
                            lista.add(t);
                            System.out.println("Temperatura creata: " + t);
                        } else {
                            System.out.println("Valore non valido.");
                        }
                    }
                    case 2 -> {
                        if (lista.isEmpty()) {
                            System.out.println("Nessuna temperatura registrata.");
                        } else {
                            for (int i = 0; i < lista.size(); i++) {
                                System.out.println(i + ": " + lista.get(i));
                            }
                        }
                    }
                    case 3 -> {
                        System.out.print("Indice da modificare: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < lista.size()) {
                            System.out.print("Nuovo valore in °C (>= -273.15): ");
                            double nuovoValore = scanner.nextDouble();
                            if (nuovoValore >= -273.15) {
                                lista.get(index).setValore(nuovoValore);
                                System.out.println("Temperatura aggiornata.");
                            } else {
                                System.out.println("Valore non valido.");
                            }
                        } else {
                            System.out.println("Indice non valido.");
                        }
                    }
                    case 4 -> {
                        System.out.print("Indice da eliminare: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < lista.size()) {
                            lista.remove(index);
                            System.out.println("Temperatura rimossa.");
                        } else {
                            System.out.println("Indice non valido.");
                        }
                    }
                    case 5 -> {
                        System.out.print("Indice prima temperatura: ");
                        int i1 = scanner.nextInt();
                        System.out.print("Indice seconda temperatura: ");
                        int i2 = scanner.nextInt();
                        if (i1 >= 0 && i1 < lista.size() && i2 >= 0 && i2 < lista.size()) {
                            boolean maggiore = lista.get(i1).isMaggioreDi(lista.get(i2));
                            System.out.println("La temperatura " + lista.get(i1) +
                                    (maggiore ? " è maggiore di " : " NON è maggiore di ") + lista.get(i2));
                        } else {
                            System.out.println("Indici non validi.");
                        }
                    }
                    case 6 -> System.out.println("Istanze create: " + Temperatura.getCountInst());
                    case 0 -> {
                        continua = false;
                        System.out.println("Uscita dal programma.");
                    }
                    default -> System.out.println("Scelta non valida.");
                }
            }

            scanner.close();
        }
    }