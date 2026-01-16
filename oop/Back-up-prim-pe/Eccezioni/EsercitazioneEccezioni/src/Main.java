import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;


            try {
                System.out.println("inserisci un numero: ");
                a = sc.nextInt();
                System.out.println("inserisci un numero: ");
                b = sc.nextInt();

                String risultato = Operazione.divisione(a,b).toString();
                //exception piu specifiche all inizio e quelle generiche alla fine
                System.out.println(ColoreTerminale.VIOLA.colora(risultato));
            }catch (InputMismatchException e){
                System.out.println(ColoreTerminale.ROSSO.colora("formato sbagliato"));
            }
            catch (ArithmeticException e){
                System.out.println(ColoreTerminale.ROSSO.colora("Divisione per 0"));
            }
            catch (Exception e) {
                System.out.println(ColoreTerminale.ROSSO.colora(e.getMessage()));
            }


    }
}


