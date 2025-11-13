import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    // metodi Static

    static int inputInt(){
        Scanner sc =new Scanner(System.in);
        int outPut;

        while (!sc.hasNextInt()){
            System.out.println("ERROR: errore inserimento");
            sc.nextLine();
        }
        outPut = sc.nextInt();
        sc.nextLine();
        return outPut;
    }

    static String inputString(){
        Scanner sc =new Scanner(System.in);
        String outPut;
        while (true) {
            if (!sc.hasNextLine()) {
                System.out.println("ERROR: errore inserimento");
                sc.nextLine();
                continue;
            }
            outPut = sc.nextLine();
            if (outPut.isBlank()) {
                System.out.println("ERRORE: Campo vuoto non consentito!");
                continue;
            }

            System.out.print("hai inserito il[" +outPut+"] premere invio per continuare" );
            sc.nextLine();
            return outPut;
        }
    }
    static boolean inputBoolean(){
        Scanner sc =new Scanner(System.in);
        String scelta;
        System.out.println("scegli se si  o no Y/N");
        scelta = sc.nextLine();
        boolean outPut = switch (scelta.toLowerCase()){
            case "y" -> true;
            default -> false;
        };

        return outPut;
    }

    static modalitaFunzionamento richiestaModalita(){
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                1) Eco
                2) Performance
                3) Standby
                4) Manuale
                scelta:
                """);

        int scelta = sc.nextInt();
        while (true){
            switch (scelta) {
                case 1 -> {
                    return modalitaFunzionamento.Eco;
                }
                case 2 -> {
                    return modalitaFunzionamento.Performance;
                }
                case 3 -> {
                    return modalitaFunzionamento.Standby;
                }
                case 4 -> {
                    return modalitaFunzionamento.Manuale;
                }
                default -> System.out.println("error: :( ");

            }
        }
    }

    static void pausa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("premere per continuare");
        sc.nextLine();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SmartDevice> listSmart = new ArrayList<SmartDevice>();
        int scelta;
        do {
            System.out.println(
                    """
                    === Menu Smart ===
                    1) Create
                    2) Read
                    3) Update
                    4) Delete
                    -1)exit
                    
                    scelta:
                    """);

            scelta = sc.nextInt();
            switch (scelta){
                case 1->{
                    System.out.println("""
                            1) AGGIUNTA
                            2) COPIA
                            -1) exit
                            scelta:
                            """);
                    int sent = sc.nextInt();
                    switch (sent){
                        case 1-> {
                            String nome;
                            boolean statoAccesso;
                            Integer livelloBatteria;


                            System.out.println("inserire il nome");
                            nome = inputString();
                            System.out.println("inserire se si ha la batteria o no");
                            while (inputBoolean()) {
                                System.out.println("inserire il valore della batteria");
                                int lb = inputInt();
                                if (lb < -1 || lb > 120) {
                                    System.out.println("error inserimento batteria");
                                    continue;
                                } 
                                livelloBatteria = (Integer) lb;
                                break;
                            }
                            livelloBatteria = null;

                            SmartDevice scNew = new SmartDevice(nome,inputBoolean(),richiestaModalita(),livelloBatteria);
                            listSmart.add(scNew);
                        }
                        case 2 -> listPrint(listSmart);

                        case 3 -> {
                            int app = getSceltOg(listSmart);
                            SmartDevice appOg = listSmart.get(app);

                            System.out.println("modifica nome");
                            while (true){
                                String nomeApp = inputString();
                                if (!appOg.trySetNomeDispositivo(nomeApp)) continue;
                                break;
                            }
                            System.out.print("scegli la modalita dello smart");
                            modalitaFunzionamento m = richiestaModalita();

                            appOg.trySetModalita(m);
                        }
                        case 4->{
                            int app = getSceltOg(listSmart);
                            listSmart.remove(app);
                        }

                        case -1 ->{
                            System.out.println("ciao buona giornata");
                            pausa();
                        }
                        default -> System.out.println("error:");
                    }

                }

                case -1 -> {
                    System.out.println("ciao buona giornata");
                    pausa();
                }

                default -> System.out.println("Error: nella sentinella");
            }

        }while (scelta != -1);
    }

    private static int getSceltOg(ArrayList<SmartDevice> listSmart) {
        System.out.println("scegli un oggeto");
        listPrint(listSmart);
        int app = inputInt();
        while (app < 0 || app >= listSmart.size()){
            app = inputInt();
        }
        return app;
    }

    private static void listPrint(ArrayList<SmartDevice> listSmart) {
        for (int i = 0; i < listSmart.size(); i++) {
            System.out.println((i+1) + ")" + listSmart.get(i));
            pausa();
        }
    }
}
