import core.Automobile;
import core.Libro;
import core.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Libro libroUno = new Libro("banana1","Gianni",100);
        Menu menu = new Menu();
        boolean exit = false;

        menu.showTitoloMenu();
        while (!exit){
            menu.showMenu();
            if (!sca.hasNextInt()){
                sca.nextLine();
                System.out.println("ERROR: inserimento errato");
                continue;
            }
            int sent = sca.nextInt();

            switch (sent){
                case 1:
                    libroUno.sfoglia();
                    System.out.println("hai sfogliato una pagina");
                    break;
                case 2:
                    libroUno.tornaIndietro();
                    System.out.println("sei tornato indietro di una pagina");
                    break;
                case 3:
                    System.out.println("la pagina attuale è: "+libroUno.paginaAttuale());
                    break;
                case 4:
                    libroUno.stampaInformazioni();
                    break;
                case 5:
                    exit = true;
                    System.out.println("saionara continua a leggerci");
                    break;
                default:
                    System.out.println("Errore: di inserimento");
                    break;
            }

        }

    }
}
