package core;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner s = new Scanner(System.in);

    public void gui(){
        ArrayList<Film> listaFilm = new ArrayList<>();
        boolean uscita = false;

        while (!uscita) {
            mostraMenu();
            int scelta = leggiIntero("Scegli un'opzione: ");

            switch (scelta) {
                case 1:
                    inserisciFilm();
                    break;
                case 2:
                    visualizzaSchedaFilm();
                    break;
                case 3:
                    valutaFilm();
                    break;
                case 4:
                    modificaValutazione();
                    break;
                case 5:
                    visualizzaTuttiFilm();
                    break;
                case 6:
                    visualizzaFilmConsigliati();
                    break;
                case 7:
                    visualizzaFilmClassici();
                    break;
                case 8:
                    visualizzaFilmNuovi();
                    break;
                case 9:
                    confrontaDueFilm();
                    break;
                case 0:
                    uscita = true;
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida, riprova.");
            }
            System.out.println();

    }



    }
    private void mostraMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Inserire un nuovo film");
        System.out.println("2. Visualizzare la scheda di un film");
        System.out.println("3. Valutare se il film è consigliato");
        System.out.println("4. Modificare la valutazione in stelle");
        System.out.println("5. Visualizzare tutti i film");
        System.out.println("6. Visualizzare solo i film consigliati");
        System.out.println("7. Visualizzare i film classici");
        System.out.println("8. Visualizzare i film nuovi");
        System.out.println("9. Confrontare due film");
        System.out.println("0. Uscire dal programma");
    }
    private void inserisciFilm(){
        System.out.println("Inserisci i dati del nuovo film:");
        System.out.print("Titolo: ");
        String titolo = s.nextLine();

        System.out.print("Regista: ");
        String regista = s.nextLine();

        System.out.print("Genere: ");
        String genere = s.nextLine();

        int annoUscita = leggiIntero("Anno di uscita: ");

        int stelle = leggiIntero("Valutazione in stelle (0-5): ");
        while (stelle < 0 || stelle > 5) {
            System.out.println("Valutazione non valida, inserisci un valore tra 0 e 5.");
            stelle = leggiIntero("Valutazione in stelle (0-5): ");
        }
    }


    private int leggiIntero(String messaggio){
        if (!s.hasNextInt()){
            s.nextLine();
            return -1;
        }
        int appoggioInt = s.nextInt();
        s.nextLine();
        if (appoggioInt <= -1){
            return -1;
        }
        return appoggioInt;
    }
}
