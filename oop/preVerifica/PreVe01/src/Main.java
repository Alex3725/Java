import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    //Const ERRor
    public static final int ERROR_INT= -1;
    public static final String ERROR_STRING= "";

    // metodi Static

    static int inputInt(){
        Scanner sc =new Scanner(System.in);
        int outPut;

        if (!sc.hasNextInt()){
            System.out.println("ERROR: errore inserimento");
            sc.nextLine();
            return ERROR_INT;
        }
        outPut = sc.nextInt();
        sc.nextLine();
        return outPut;
    }

    static String inputString(){
        Scanner sc =new Scanner(System.in);
        String outPut;

        if (!sc.hasNextLine()){
            System.out.println("ERROR: errore inserimento");
            sc.nextLine();
            return ERROR_STRING;
        }
        outPut = sc.nextLine();
        if (outPut.isBlank())
        {
            System.out.println("ERRORE: Campo vuoto non consentito!");
            return ERROR_STRING;
        }

        outPut = sc.nextLine();
        sc.nextLine();
        return outPut;
    }
    static boolean inputBoolean(){
        Scanner sc =new Scanner(System.in);
        String scelta;
        System.out.println("Y/N");
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
        switch (scelta){
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
            default -> {
                System.out.println("error: in automatico verra inpostata Eco");
                return modalitaFunzionamento.Eco;
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
                            while (!(inputString().isBlank())) {
                                System.out.println("error: ");
                            }
                            nome = inputString();
                            System.out.println("inserire come si sesidera la batteria se ce");
                            while (inputBoolean()) {
                                System.out.println("inserire il valore della batteria");
                                if (inputInt() < -1 || inputInt() > 120) {
                                    System.out.println("error inserimento batteria");
                                    continue;
                                }
                                livelloBatteria = inputInt();
                                break;
                            }
                            livelloBatteria = null;



                            SmartDevice scNew = new SmartDevice(nome,inputBoolean(),richiestaModalita(),livelloBatteria);
                            listSmart.add(scNew);
                            
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
}
