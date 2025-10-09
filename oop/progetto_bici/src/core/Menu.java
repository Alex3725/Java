package core;

import java.util.Scanner;

public class Menu {
    Scanner s = new Scanner(System.in);

    Bicicletta bici01 = new Bicicletta("MRXc","vosvagen", 3,10);

    boolean exit = true;

    public void menu(){
        while (exit){
            System.out.println("Sei sulla bici\n1) Visualizzare lo stato della bicicletta\n2) Pedalare\n3) Frenare\n4) Modificare la marca o il tipo\n0) Uscire dal programma");

            if (s.hasNextInt()){
                s.nextLine();
                System.out.println("ERRORE: nel inserimento della sentinella");
                break;
            }
            switch ()
        }
    }


}
