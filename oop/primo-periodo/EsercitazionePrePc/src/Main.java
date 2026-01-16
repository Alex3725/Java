import core.Pc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    // Costanti di errore
    public static final int ERROR_INT = -1;
    public static final String ERROR_STRING = "ERRORE";


    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        int input;
        if (!sc.hasNextInt()) {
            sc.nextLine(); // svuota buffer
            System.out.println("ERRORE: Inserisci un numero intero valido!");
            return ERROR_INT;
        }
        input = sc.nextInt();
        sc.nextLine(); // pulisci buffer
        return input;
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        String input;
        if (!sc.hasNextLine()) {
            System.out.println("ERRORE: Inserisci una stringa valida!");
            return ERROR_STRING;
        }
        input = sc.nextLine();
        if (input.isBlank()) {
            System.out.println("ERRORE: Campo vuoto non consentito!");
            return ERROR_STRING;
        }
        return input;
    }

    public static float inputFloat() {
        Scanner sc = new Scanner(System.in);
        float input;
        if (!sc.hasNextFloat()) {
            sc.nextLine(); // svuota buffer
            System.out.println("ERRORE: Inserisci un numero decimale valido!");
            return ERROR_INT;
        }
        input = sc.nextFloat();
        sc.nextLine(); // pulisci buffer
        return input;
    }
    public static void pausa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPremi INVIO per continuare...");
        sc.nextLine(); // attende input dell’utente
    }


    public static void stampaListaPC(ArrayList<Pc> listaPC) {
        if (listaPC.isEmpty()) {
            System.out.println("Nessun PC registrato.\n");
            return;
        }

        System.out.println("ELENCO PC:");

        // uso AtomicInteger perché il forEach non consente indice incrementale diretto
        //java.util.concurrent.atomic.AtomicInteger indice = new java.util.concurrent.atomic.AtomicInteger(1);

        int count = 0;
        listaPC.forEach(pc -> {
            count++;
            System.out.println(count + ") " + pc);
        });
        // chiedere al proff :(
        System.out.println(); // linea vuota finale
    }

    ///
    ///
    ///
    public static void main(String[] args) {

        ArrayList<Pc> listaPC = new ArrayList<>();
        int scelta;

        do {
            System.out.println("""
            ===== MENU Pc =====
            1. Crea nuovo Pc
            2. Mostra tutti i Pc
            3. Aggiorna un Pc
            4. Elimina un Pc
            0. Esci
            ===================
            Scegli un'opzione:
            """);

            scelta = inputInt();

            switch (scelta) {
                case 1 -> { // CREATE
                    Pc nuovo = new Pc();

                    System.out.print("Inserisci marca: ");
                    nuovo.trySetMarca(inputString());

                    System.out.print("Inserisci CPU: ");
                    nuovo.trySetCpu(inputString());

                    System.out.print("Inserisci RAM (GB): ");
                    int ram = inputInt();
                    if (ram != ERROR_INT) nuovo.trySetRamGB(ram);

                    System.out.print("Inserisci SSD (GB): ");
                    int ssd = inputInt();
                    if (ssd != ERROR_INT) nuovo.trySetSsdGB(ssd);

                    listaPC.add(nuovo);
                    System.out.println("Pc aggiunto con successo!\n");
                    pausa();
                }

                case 2 -> { // READ
                    if (listaPC.isEmpty()) {
                        System.out.println("Nessun Pc registrato.\n");
                    } else {
                        System.out.println("ELENCO Pc:");
                        for (int i = 0; i < listaPC.size(); i++) {
                            System.out.println((i + 1) + ") " + listaPC.get(i));
                        }
                        pausa();
                    }
                }

                case 3 -> { // UPDATE
                    if (listaPC.isEmpty()) {
                        System.out.println("Nessun Pc da modificare.\n");
                        break;
                    }

                    System.out.print("Inserisci numero Pc da modificare: ");
                    int idx = inputInt() - 1;
                    if (idx < 0 || idx >= listaPC.size()) {
                        System.out.println("Indice non valido!\n");
                        break;
                    }

                    Pc pc = listaPC.get(idx);

                    System.out.print("Nuova marca (lascia vuoto per non cambiare): ");
                    String nuovaMarca = inputString();
                    if (!nuovaMarca.equals(ERROR_STRING) && !nuovaMarca.isBlank())
                        pc.trySetMarca(nuovaMarca);

                    System.out.print("Nuova CPU (lascia vuoto per non cambiare): ");
                    String nuovaCpu = inputString();
                    if (!nuovaCpu.equals(ERROR_STRING) && !nuovaCpu.isBlank())
                        pc.trySetCpu(nuovaCpu);

                    System.out.print("Nuova RAM (0 per non cambiare): ");
                    int nuovaRam = inputInt();
                    if (nuovaRam > 0) pc.trySetRamGB(nuovaRam);

                    System.out.print("Nuovo SSD (0 per non cambiare): ");
                    int nuovoSsd = inputInt();
                    if (nuovoSsd > 0) pc.trySetSsdGB(nuovoSsd);

                    System.out.println("Pc aggiornato!\n");
                    pausa();
                }

                case 4 -> { // DELETE
                    if (listaPC.isEmpty()) {
                        System.out.println("Nessun Pc da eliminare.\n");
                        break;
                    }

                    System.out.print("Inserisci numero Pc da eliminare: ");
                    int idx = inputInt() - 1;

                    if (idx < 0 || idx >= listaPC.size()) {
                        System.out.println("Indice non valido!\n");
                        break;
                    }

                    listaPC.remove(idx);
                    System.out.println("Pc eliminato!\n");
                    pausa();
                }

                case 0 -> System.out.println("Uscita dal programma...");
                default ->{
                        System.out.println("Scelta non valida!\n");
                        pausa();
                }
            }

        } while (scelta != 0);
    }
}