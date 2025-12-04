import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendario = new Calendar();
        int scelta;
        while (true) {
            try {
                System.out.println("""
                        1) visualizza evento
                        2) Aggiungi Evento
                        3) Azzera calendario
                        4) aggiorna Evento
                        5) Elimina Evento
                        0) Exit
                        """);
                scelta = sc.nextInt();


            }catch {
                System.out.println("Error di inserimento scelta");
            }
        }
    }
    public static LocalDate inpDate(){
        Scanner sc = new Scanner(System.in);
        LocalDate date;
        while (true){
            try {
                System.out.println("data evento (YYYY-MM-DD): ");
                date = LocalDate.parse(sc.nextLine());

            } catch (Exception e) {
                System.out.println("ERROR reinserire");
                continue;
            }
            return date;
        }
    }
}
