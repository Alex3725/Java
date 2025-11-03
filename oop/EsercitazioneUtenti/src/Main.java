import core.Utente;

public class Main {
    static void main() {
        // Creazione di almeno 3 utenti
        Utente u1 = new Utente("Marco");
        Utente u2 = new Utente("Anna");
        Utente u3 = new Utente("");  // nome vuoto → verrà gestito come "Sconosciuto"

        // Mostra i dati degli utenti
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        // Mostra anche tramite metodo mostraDati()
        System.out.println("\n--- Dati Utenti ---");
        u1.mostraDati();
        u2.mostraDati();
        u3.mostraDati();

        // Mostra il numero totale di utenti creati
        System.out.println("\nNumero totale di utenti creati: " + Utente.getNumeroUtentiCreati());
    }

}
