package core.esercizi.eserciziTeoriaClasse;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class EserciziTeoriaClasse {
    Scanner sca = new Scanner(System.in);
    public void es1(){
        int somma = 0;

        int[] listaNum = new int[10];

        for (int i = 1;i<11; i++){
            System.out.println("inserisci il " + i + "numero: ");

            int num = sca.nextInt();

            listaNum[i-1] = num;

            if (num % 2 == 0) somma += num;

            System.out.println("il tuo risultato ora è: "+ somma);
        }
        System.out.println("La somma totale è di: "+ somma);
    }
    public void es2(){
        int numero;
        int count = 0;
        System.out.println("inserisci il numero di numeri che vuoi inserire: ");

        numero = sca.nextInt();
        int[] listaNum = new int[numero];


        for (int i = 0; i < numero; i++){
            System.out.println("inserisci il " + i + "numero: ");
            int num = sca.nextInt();
            listaNum[i] = num;

            if (num % 2 == 0) count++;


        }
        System.out.println("i tuoi numeri pari sono: "+count+" su una lista di: " +listaNum.length);

    }
    public void es3(){

        //final int N = 3; constanti numeriche
        int count = 0;

        int somma = 0;


        int sent = 0;
        while (sent != -1){

            System.out.println("inserire un numero da 1 a 10 per i voti e premere -1 per uscire: ");

            sent = sca.nextInt();
            sca.nextLine();
            System.out.println(sent+"suuuuu");
            if (sent < 1 ||  sent>10){
                continue;
            }

            somma += sent;
            count++;
            System.out.println(somma+"suuuuu");

        }
        float media = somma / count;

        System.out.println("la media è di "+ media);
    }
    public void es4(){
        int[] lista= new int[5];
        int numMax2 = -999999999;
        for (int i = 0; i < 5; i++){
            System.out.println("inserisci il " + i + "numero: ");
            int num = sca.nextInt();
            //lista[i] = num;
            if(num >= numMax2){
                numMax2 = num;
            }
        }
        OptionalInt numMax = Arrays.stream(lista).max();
        System.out.println("il numero max é = " + numMax+ "num max2: "+numMax2);
    }
    public void es5(){
        enum Giorni{
            LUNEDI,
            MARTEDI,
            MERCOLEDI,
            GIOVEDI,
            VENERDI,
            SABATO,
            DOMENICA
        }
        System.out.println("inserire un numero da 1 a 7: ");
        int num = sca.nextInt();
        if (num < 1 || num > 7){
            System.out.println("reinserire");
        }else {
            String risultato = String.valueOf(switch (num){
                case 1 -> Giorni.LUNEDI;
                case 2 -> Giorni.MARTEDI;
                case 3 -> Giorni.MERCOLEDI;
                case 4 -> Giorni.GIOVEDI;
                case 5 -> Giorni.VENERDI;
                case 6 -> Giorni.SABATO;
                case 7 -> Giorni.DOMENICA;

                default -> "riinserire";
            });
            System.out.println(risultato);
        }


    }
    public void es6(){
        System.out.println("inserisci due numeri con l'operatore seguire esempio per inserimento(n + n2)");

        int num1 = sca.nextInt();
        String operando = sca.next();
        int num2 = sca.nextInt();
        sca.nextLine();

        System.out.println(num1+operando+num2);

        float risultato = switch (operando){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*","x","X" -> num1 * num2;
            case "/","%" -> num1 / num2;


            default -> 0;
        };
        if (risultato == 0){
            System.out.println("mannaggia");
        }
        System.out.println(risultato);
    }
    public void es7() {
        System.out.println("inserire un numero da 1 a 10: ");
        float sent = 0;
        while ((sent <= 0 || sent > 10)) {
            if (sca.hasNextFloat()) {
                sent = sca.nextFloat();
            }else {
                System.out.println("ERRORE: voto non valido");
                sent = 0;
                sca.nextLine();
            }
        }
        String finale = "";
        switch ((int) sent) {
            case 1, 2, 3, 4 :
                finale = "insufficiente";
                break;
            case 5 :
                finale = "mediocre";
                break;
            case 6 :
                finale = "sufficiente";
                break;
            case 7, 8 :
                finale = "buono";
                break;

            case 9 :
                finale = "distinto";
                break;
            case 10 :
                finale = "ottimo";
                break;
            default :
                finale = "ERRORE: voto fuori range";

                break;
        };
        System.out.println(finale);
    }

    public void prova(){
        String ciao = "2";

    }
}
