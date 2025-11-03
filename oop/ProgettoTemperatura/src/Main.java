import core.Temperatura;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Temperatura> lista = new ArrayList<>();
        int scelta;

        do {
            System.out.println("""
                    
                    ================================
                           MENU TEMPERATURA
                    ================================
                    1. Crea nuova temperatura
                    2. Visualizza tutte le temperature
                    3. Modifica una temperatura
                    4. Elimina una temperatura
                    5. Confronta due temperature
                    6. Duplica una temperatura (costruttore di copia)
                    7. Mostra numero totale istanze create
                    0. Esci
                    -------------------------------
                    """);
            System.out.print("Scelta: ");
            scelta = sc.nextInt();
            sc.hasNextLine();

            switch (scelta) {
                case 1 -> {
                    System.out.print("Inserisci valore temperatura (°C): ");
                    Double val = sc.nextDouble();
                    Temperatura t = new Temperatura(val);
                    lista.add(t);
                    System.out.println("Temperatura aggiunta: " + t);
                }

                case 2 -> {
                    System.out.println("\n--- Elenco Temperature ---");
                    if (lista.isEmpty()) {
                        System.out.println("Nessuna temperatura presente.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ") " + lista.get(i));
                        }
                    }
                }

                case 3 -> {
                    if (lista.isEmpty()) {
                        System.out.println("Nessuna temperatura da modificare.");
                        break;
                    }
                    System.out.print("Indice temperatura da modificare: ");
                    int idx = sc.nextInt() - 1;
                    sc.nextLine();
                    if (idx < 0 || idx >= lista.size()) {
                        System.out.println("Indice non valido.");
                        break;
                    }
                    System.out.print("Nuovo valore (°C): ");
                    Double nuovoVal = sc.nextDouble();
                    lista.get(idx).setValore(nuovoVal);
                    System.out.println("Temperatura aggiornata: " + lista.get(idx));
                }

                case 4 -> {
                    if (lista.isEmpty()) {
                        System.out.println("Nessuna temperatura da eliminare.");
                        break;
                    }
                    System.out.print("Indice temperatura da eliminare: ");
                    int idx = sc.nextInt() - 1;
                    if (idx < 0 || idx >= lista.size()) {
                        System.out.println("Indice non valido.");
                        break;
                    }
                    lista.remove(idx);
                    System.out.println("Temperatura rimossa.");
                }

                case 5 -> {
                    if (lista.size() < 2) {
                        System.out.println("Servono almeno due temperature per il confronto.");
                        break;
                    }
                    System.out.print("Indice prima temperatura: ");
                    int i1 = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.print("Indice seconda temperatura: ");
                    int i2 = sc.nextInt() - 1;
                    sc.hasNextLine();

                    if (i1 < 0 || i1 >= lista.size() || i2 < 0 || i2 >= lista.size()) {
                        System.out.println("Indice non valido.");
                        break;
                    }

                    Temperatura t1 = lista.get(i1);
                    Temperatura t2 = lista.get(i2);
                    if (t1.isMaggioreDi(t2)) {
                        System.out.println(t1 + " è maggiore di " + t2);
                    } else {
                        System.out.println(t1 + " non è maggiore di " + t2);
                    }
                }

                case 6 -> {
                    if (lista.isEmpty()) {
                        System.out.println("Nessuna temperatura da duplicare.");
                        break;
                    }
                    System.out.print("Indice temperatura da duplicare: ");
                    int idx = sc.nextInt() - 1;
                    sc.hasNextLine();
                    if (idx < 0 || idx >= lista.size()) {
                        System.out.println("Indice non valido.");
                        break;
                    }
                    Temperatura copia = new Temperatura(lista.get(idx));
                    lista.add(copia);
                    System.out.println("Temperatura duplicata: " + copia);
                }

                case 7 -> System.out.println("Numero totale di istanze create: " + Temperatura.getNumeroIstanze());

                case 0 -> System.out.println("Uscita dal programma...");

                default -> System.out.println("Scelta non valida!");
            }

        } while (scelta != 0);


    }
}
