import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PrenotazioneAula> listaPrenotazioni = new ArrayList<PrenotazioneAula>();
        int scelta01;
        do {
            System.out.println("""
                    1. Create
                    2. Read
                    3. Update
                    4. Delete
                    
                    0 exit
                    
                    """);

            scelta01 = inputInt();
            switch (scelta01) {

                case 1 -> {
                    int scelta02;
                    do {


                        System.out.println("""
                                Scegliere tra: 
                                1. Creazione
                                2. copia
                                0 exit
                                """);
                        scelta02 = inputInt();
                        switch (scelta02) {
                            case 1 -> {
                                String nomeRichiedente;
                                Integer numeroOrePrenotate;
                                String tipoAttvita;
                                boolean prenotazioneConfermata;

                                System.out.println("creazione");
                                System.out.println("inserirre il nome");
                                nomeRichiedente = inputString();

                                System.out.println("inserirre il numero ore prenotate");
                                numeroOrePrenotate = inputInt();
                                while (numeroOrePrenotate < 0) {
                                    numeroOrePrenotate = inputInt();
                                }

                                System.out.println("inserire tipo attivita");
                                tipoAttvita = inputAttivita();

                                System.out.println("inserire tipo se e stata Prenotata y/n");
                                String appScelt = inputString().toLowerCase();
                                while (!appScelt.equals("y") && !appScelt.equals("n")) {
                                    appScelt = inputString().toLowerCase();
                                }
                                if (appScelt.equals("y")) {
                                    prenotazioneConfermata = true;
                                } else {
                                    prenotazioneConfermata = false;
                                }


                                PrenotazioneAula newPre = new PrenotazioneAula(nomeRichiedente, numeroOrePrenotate, tipoAttvita, prenotazioneConfermata);
                                listaPrenotazioni.add(newPre);

                            }

                            case 2 -> {
                                if (listaPrenotazioni.isEmpty()) {
                                    System.out.println("non ci sono elementi da coppiare");
                                    break;
                                }
                                System.out.println("scegliere elemento:");
                                for (int i = 0; i < listaPrenotazioni.size(); i++) {
                                    System.out.println((i + 1) + ")" + listaPrenotazioni.get(i));
                                }

                                int sceltaOg = inputInt() - 1;
                                while (sceltaOg < 0 || sceltaOg > listaPrenotazioni.size()) {
                                    System.out.println("ERRORE : inserimento numero non contenente nella lista riprovare");
                                    sceltaOg = inputInt() - 1;
                                }

                                PrenotazioneAula newPre = new PrenotazioneAula(listaPrenotazioni.get(sceltaOg));
                                System.out.println("Ecco la oggetto creato:\n" + newPre);
                                listaPrenotazioni.add(newPre);
                            }

                            default -> {
                                System.out.println("Errore: inserimento");
                                System.out.println("premere per continuare");
                                sc.nextLine();
                            }

                        }

                    } while (scelta02 != 0);
                }
                case 2->{
                    for (int i = 0; i < listaPrenotazioni.size(); i++) {
                        System.out.println((i+1)+ ")" + listaPrenotazioni.get(i));
                    }
                }
                case 3->{
                    System.out.println("quale elemento si vuole modificare:");
                    for (int i = 0; i < listaPrenotazioni.size(); i++) {
                        System.out.println((i+1)+ ")" + listaPrenotazioni.get(i));
                    }

                    int sceltaOg = inputInt() -1 ;
                    while (sceltaOg < 0 || sceltaOg > listaPrenotazioni.size()){
                        System.out.println("ERRORE : inserimento numero non contenente nella lista riprovare");
                        sceltaOg = inputInt() -1 ;
                    }
                    PrenotazioneAula appOgg = listaPrenotazioni.get(sceltaOg);
                    int scelta02;
                    do {
                        System.out.println("""
                            scegliere cosa modificare tra:
                           1. modifica attivita
                           2. modifica stato
                           0. exit
                           
                            """);

                        scelta02 = inputInt();
                        switch (scelta02) {
                            case 1->{
                                System.out.println("inserire attivita da modificare");
                                appOgg.setTpoAttvita(inputAttivita());
                            }
                            case 2->{
                                boolean prenotazioneConfermata;
                                System.out.println("inserire tipo se e stata Prenotata y/n");
                                String appScelt = inputString().toLowerCase();
                                while (!appScelt.equals("y") && !appScelt.equals("n")) {
                                    appScelt = inputString().toLowerCase();
                                }
                                if (appScelt.equals("y")) {
                                    prenotazioneConfermata = true;
                                } else {
                                    prenotazioneConfermata = false;
                                }
                                appOgg.setPrenotazioneConfermata(prenotazioneConfermata);
                            }
                            default -> {
                                System.out.println("Errore: inserimento");
                                System.out.println("premere per continuare");
                                sc.nextLine();
                            }
                        }

                    }while (scelta02!= 0);

                }
                case 4->{
                    System.out.println("scegliere elemnto da eliminare:");
                    System.out.println("quale elemento si vuole modificare:");
                    for (int i = 0; i < listaPrenotazioni.size(); i++) {
                        System.out.println((i+1)+ ")" + listaPrenotazioni.get(i));
                    }

                    int sceltaOg = inputInt() -1 ;
                    while (sceltaOg < 0 || sceltaOg > listaPrenotazioni.size()){
                        System.out.println("ERRORE : inserimento numero non contenente nella lista riprovare");
                        sceltaOg = inputInt() -1 ;
                    }
                    System.out.println("hai eliminato \n"+listaPrenotazioni.get(sceltaOg));
                    listaPrenotazioni.remove(sceltaOg);
                }
                default -> {
                    System.out.println("Errore: inserimento");
                    System.out.println("premere per continuare");
                    sc.nextLine();
                }
            }
        }while (scelta01 != 0);
    }


    ///
    public static int inputInt(){
        System.out.println("inserire qui sotto: ");
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()){
            System.out.println("ERROR: inserimento errato del numero");
            sc.nextLine();
        }

        int outPut = sc.nextInt();
        sc.nextLine();
        return outPut;
    }

    public static String inputString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("inserire qui sotto: ");
        String outPut = sc.nextLine();
        sc.nextLine();
        while (outPut.isBlank()){
            System.out.println("ERROR : inserimento vuoto senza contenuto inserire cont");
            outPut = sc.nextLine();
            sc.nextLine();
        }
        return outPut;
    }
    public static String inputAttivita(){
        String[] app = PrenotazioneAula.getATTIVITA_DISP();
        for (int i = 0; i < app.length; i++) {
            System.out.println((i+1)+ ")" + app[i]);
        }
        System.out.println("scegliere attività");
        int appInt = inputInt() -1 ;
        while (appInt < 0 || appInt > app.length){
            System.out.println("ERRORE : inserimento numero non contenente nella lista riprovare");
            appInt = inputInt() -1 ;
        }
        return app[appInt];
    }
}
