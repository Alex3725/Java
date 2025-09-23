package core.teoria;

import java.util.Objects;
import java.util.Scanner;

public class RipassoMetod {
    Scanner scanner = new Scanner(System.in);// ogni volta che si richiama new si crea una istanza

    public void ripassoIf() {
        int num;

        System.out.println("inserisci un numero: ");

        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("il numero è divisibile per due");

            if (num > 20) {
                System.out.println(num / 2);
            }
        } else if (num % 3 == 0) {
            System.out.println("il numero" + num + " è dispari e divisibile per 3");
        } else {
            System.out.println("il numero " + num + " è dispari");
        }

    }

    public void ripassoIpOtV() {
        // bella il commento
        int num1;
        int num2;
        int eta;
        float fl = 2.29f;
        String nome;

        /*
        tipi di Variabili
        int
        long
        short
        float
        boolean
        double
        char

        Tipi Reference
        String

        cast esplicito
        //libreria per input int

        /*
        System.out.println("inserisci un numero intero: ");
        num1 = scanner.nextInt();

        System.out.println("inserisci il secondo numero intero: ");
        num2 = scanner.nextInt();
        */

        //  input string

        eta = scanner.nextInt();
        scanner.nextLine();
        nome = scanner.nextLine();

        /*
        //Inizializzazione
        int somma = num2 + num1;
        */
        //print
        //System.out.println("La somma di " + num1 + " e " + num2 + " e uguale a " + somma);

        System.out.println("ciao sei tu " + nome + " con anni " + eta + " yes or no");

        String yesNo = scanner.next();

        if (Objects.equals(yesNo, "yes")) {
            System.out.println("ciao benvenuto");
        } else {
            System.out.println("addio");
        }
    }

    public void ripassoCicliListeArray() {
        //iterazioni

        //Array
        int[] numeri = new int[5];
        int[] votiIf = {5, 6, 5, 4, 3, 232};

        //int i = votiIf.length;
        //System.out.println(i);

        int count = 0;
        //while
//        while (count < votiIf.length){
//            System.out.println(votiIf[count]);
//            count ++;
//        }


        //Dowhile
//        do {
//            System.out.println(votiIf[count]);
//            count ++;
//        }while (count < votiIf.length);

        //for
        for (int i = 0; i < votiIf.length; i++) {
            System.out.println(votiIf[i]);
        }
        //Foreach
        for (int voto : votiIf) {
            System.out.println("voto: " + voto);
        }


    }
    public void swichStatema(){
        // non posso stampare non posso modificare non posso assegnare

    }


}
