package core;

import java.util.Scanner;

public class Menu {
    Scanner s = new Scanner(System.in);

    Bicicletta bici01 = new Bicicletta("MRXc","vosvagen", 3,10);

    boolean exit = true;

    public void gui(){
        while (exit){
            System.out.println("Sei sulla bici\n1) Visualizzare lo stato della bicicletta\n2) Pedalare\n3) Frenare\n4) Modificare la marca o il tipo\n0) Uscire dal programma");

            if (s.hasNextInt()){
                s.nextLine();
                System.out.println("ERRORE: nel inserimento della sentinella");
                continue;
            }
            if (exit) {
                System.out.println("hai finito :) come e andato il giro");
                break;
            }
            boolean exit = false;
            int error = 0;
            switch (s.nextInt()){
                case 1:
                    bici01.stampaStato();
                    break;
                case 2:
                    error = bici01.pedala();
                    if (error == -1){
                        System.out.println("cambio la marcia");
                        bici01.incrementaMarcia();
                    }
                    break;
                case 3:
                     error = bici01.frena();
                    if (error == -1){
                        System.out.println("cambio la marcia");
                        bici01.decrementaMarcia();
                    }
                    break;
                case 4:
                    boolean exitt = false;
                    System.out.println("cosa modifichi?\n1)tipo\n2)marca\n0) exit");
                    if (s.hasNextInt()){
                        s.nextLine();
                        System.out.println("ERRORE: nel inserimento della sentinella");
                        continue;
                    }
                    switch (s.nextInt()){
                        case 0:
                            exitt = true;
                            break;
                        case 1:

                            if (s.hasNextLine()){
                                s.nextLine();
                                System.out.println("ERRORE: nel inserimento della sentinella");
                                continue;
                            }
                            String tipo = s.next();
                            s.nextLine();
                            bici01.setTipo(tipo);
                            break;
                        case 2:
                            if (s.hasNextLine()){
                                s.nextLine();
                                System.out.println("ERRORE: nel inserimento della sentinella");
                                continue;
                            }
                            String marca = s.next();
                            s.nextLine();
                            bici01.setTipo(marca);
                            break;
                    }
                    if (exitt) break;
                case 0:
                    exit = true;
                    break;

            }
        }
    }


}
