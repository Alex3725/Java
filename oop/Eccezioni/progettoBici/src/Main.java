import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bicicletta bici = null;
        boolean running = true;

        System.out.println(Colori.VIOLA.colora("=== GESTIONE BICICLETTA ==="));

        while (running) {
            try {
                System.out.println(Colori.GIALLO.colora("\n--- MENU ---"));
                System.out.println("""
                1. Crea bicicletta
                2. Accelera
                3. Frena
                4. Mostra dati
                0. Esci""");
                System.out.print(Colori.BLU.colora("Scelta: "));

                int scelta = sc.nextInt();
                sc.nextLine();

                switch (scelta) {
                    case 1:
                        System.out.print(Colori.BLU.colora("Inserisci il modello della bicicletta: "));
                        String modello = sc.nextLine();
                        bici = new Bicicletta(modello);
                        System.out.println(Colori.VERDE.colora("Bicicletta creata con successo!"));
                        break;

                    case 2:
                        if (bici == null) {
                            System.out.println(Colori.ROSSO.colora("Crea prima una bicicletta!"));
                            break;
                        }
                        System.out.print(Colori.GIALLO.colora("Inserisci incremento di velocità: "));
                        int inc = sc.nextInt();
                        if (inc < 0) {
                            System.out.println(Colori.ROSSO.colora("Errore: incremento non può essere negativo!"));
                            break;
                        }
                        bici.accelera(inc);
                        System.out.println(Colori.VERDE.colora("Hai accelerato di " + inc + " km/h"));
                        break;

                    case 3:
                        if (bici == null) {
                            System.out.println(Colori.ROSSO.colora("Crea prima una bicicletta!"));
                            break;
                        }
                        System.out.print(Colori.GIALLO.colora("Inserisci decremento (frenata): "));
                        int dec = sc.nextInt();
                        if (dec < 0) {
                            System.out.println(Colori.ROSSO.colora("Errore: valore negativo non ammesso!"));
                            break;
                        }
                        bici.frena(dec);
                        System.out.println(Colori.VERDE.colora("Hai frenato di " + dec + " km/h"));
                        break;

                    case 4:
                        if (bici != null)
                            System.out.println("\n" + bici);
                        else
                            System.out.println(Colori.ROSSO.colora("Nessuna bicicletta creata!"));
                        break;

                    case 0:
                        running = false;
                        System.out.println(Colori.VIOLA.colora("Uscita dal programma..."));
                        break;

                    default:
                        System.out.println(Colori.ROSSO.colora("Scelta non valida!"));
                }

            } catch (InputMismatchException e) {
                System.out.println(Colori.ROSSO.colora("Errore: devi inserire un numero intero!"));
                sc.nextLine(); // pulizia buffer in caso di errore
            } catch (NullPointerException e) {
                System.out.println(Colori.ROSSO.colora("Errore: bicicletta non inizializzata!"));
            } catch (Exception e) {
                System.out.println(Colori.ROSSO.colora("Errore generico: " + e.getMessage()));
            } finally {
                System.out.println("premere pulsante");
                sc.nextInt();
                sc.close();
            }
        }


    }
}
