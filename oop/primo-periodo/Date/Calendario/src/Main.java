import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        int scelta = -1;
        Scanner scanner = new Scanner(System.in);
        String newTitolo, sceltaRicorrenza;
        LocalDate newData;
        int scelta2;

        do {
            System.out.println("""
                    1) aggiungi evento
                    2) rimuovi evento
                    3) modifica evento
                    4) visualizza eventi
                    0) exit
                    """);
            scelta = controlloInt(scanner);

            switch (scelta) {
                case 1:
                    newTitolo = nuovoTitolo(scanner);
                    newData = nuovaData(scanner);
                    sceltaRicorrenza = nuovaRicorrenza(scanner);

                    Evento evento1;
                    if (sceltaRicorrenza.equalsIgnoreCase("y")) {
                        evento1 = new Evento(newTitolo, newData, true);
                    } else {
                        evento1 = new Evento(newTitolo, newData);
                    }
                    calendario.createEvent(evento1);
                    break;

                case 2:
                    if (calendario.getEvents().isEmpty()) {
                        System.out.println("Nessun evento da rimuovere");
                        break;
                    }
                    stampaEventi(calendario.getEvents());
                    System.out.println("Seleziona l'indice dell'evento da rimuovere:");
                    scelta2 = controlloInt(scanner);
                    try {
                        calendario.removeEvent(scelta2);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indice non valido");
                    }
                    break;

                case 3:
                    if (calendario.getEvents().isEmpty()) {
                        System.out.println("Nessun evento da modificare");
                        break;
                    }
                    stampaEventi(calendario.getEvents());
                    System.out.println("Seleziona l'indice dell'evento da modificare:");
                    scelta2 = controlloInt(scanner);
                    newTitolo = nuovoTitolo(scanner);
                    newData = nuovaData(scanner);
                    sceltaRicorrenza = nuovaRicorrenza(scanner);
                    try {
                        calendario.updateEvent(scelta2, newTitolo, newData,
                                sceltaRicorrenza.equalsIgnoreCase("y"));
                        System.out.println("Evento modificato con successo!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indice non valido");
                    }
                    break;

                case 4:
                    if (calendario.getEvents().isEmpty()) {
                        System.out.println("Nessun evento in calendario");
                    } else {
                        stampaEventi(calendario.getEvents());
                    }
                    break;

                case 0:
                    System.out.println("Uscita dal programma...");
                    break;

                default:
                    System.out.println("Scelta non valida, riprova");
                    break;
            }

        } while (scelta != 0);

        scanner.close();
    }

    public static void stampaEventi(ArrayList<Evento> listaEventi) {
        int count = 0;
        for (Evento e : listaEventi) {
            System.out.println(count + ") " + e);
            count++;
        }
    }

    public static int controlloInt(Scanner scanner) {
        int n = 0;
        while (true) {
            try {
                n = scanner.nextInt();
                scanner.nextLine(); // Consuma il newline
                return n;
            } catch (InputMismatchException e) {
                System.out.println("Errore! Inserisci un numero intero valido:");
                scanner.nextLine(); // Pulisce il buffer
            }
        }
    }

    public static String nuovoTitolo(Scanner scanner) {
        System.out.println("Inserisci il titolo:");
        return scanner.nextLine();
    }

    public static LocalDate nuovaData(Scanner scanner) {
        LocalDate newData;
        System.out.println("Data evento (YYYY-MM-DD):");
        while (true) {
            try {
                newData = LocalDate.parse(scanner.nextLine());
                return newData;
            } catch (DateTimeParseException e) {
                System.out.println("Formato data non valido! Usa il formato YYYY-MM-DD:");
            }
        }
    }

    public static String nuovaRicorrenza(Scanner scanner) {
        System.out.println("L'evento è ricorrente? (y/n):");
        String sceltaRicorrenza = scanner.nextLine().toLowerCase();
        while (!sceltaRicorrenza.equals("y") && !sceltaRicorrenza.equals("n")) {
            System.out.println("Scelta non valida, inserisci y o n:");
            sceltaRicorrenza = scanner.nextLine().toLowerCase();
        }
        return sceltaRicorrenza;
    }
}