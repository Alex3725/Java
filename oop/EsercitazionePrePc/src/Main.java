import core.Pc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static final int ERROR_INT = -999999999;
    static final String ERROR_STRING = "";
    public static void main(String[] args) {
        int scelta;

        ArrayList<Pc> elencoPc = new ArrayList<>();

        do {
            System.out.println("""
                   1) Aggiungi nuovo Pc
                   2) Visualizza tutti Pc
                   3) Elimina un Pc
                   4) modifica caratteristiche Pc
                   0) Exit
                    """);
            scelta = inputInter();

            switch (scelta){
                case 0:
                    System.out.println("ci vediamo ");
                    break;
                case 1:
                     String marca;
                     String cpu;
                     Integer ramGB;
                     Integer ssdGB;

                     boolean error = false;
                    while (true){
                        marca = inputString();
                        cpu = inputString();
                        ramGB = inputInter();
                        ssdGB = inputInter();

                        if (marca.equals(ERROR_STRING)|| cpu.equals(ERROR_STRING)|| ramGB == ERROR_INT || ssdGB == ERROR_INT){
                            error = true;
                        }
                        if (!error){
                            break;
                        }

                    }
                    Pc pcNew = new Pc();
                    elencoPc.add(pcNew);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }


        }while(scelta != 0);
    }
    public static int inputInter(){
        Scanner sc = new Scanner(System.in);
        int input;
        if (!sc.hasNextInt()){
            sc.nextLine();
            System.out.println("ERRORE: nel inserimento");
            return ERROR_INT;
        }
        input = sc.nextInt();
        sc.nextLine();
        return input;
    }
    public static String inputString(){
        Scanner sc = new Scanner(System.in);
        String input;
        if (!sc.hasNextLine()){
            sc.nextLine();
            System.out.println("ERRORE: nel inserimento");
            return ERROR_STRING;
        }
        input = sc.nextLine();
        sc.nextLine();
        return input;
    }
    public static float inputFloat(){
        Scanner sc = new Scanner(System.in);
        float input;
        if (!sc.hasNextFloat()){
            sc.nextLine();
            System.out.println("ERRORE: nel inserimento");
            return ERROR_INT;
        }
        input = sc.nextFloat();
        sc.nextLine();
        return input;
    }
}
