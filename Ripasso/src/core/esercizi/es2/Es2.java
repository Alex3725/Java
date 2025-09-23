package core.esercizi.es2;

import java.util.*;

public class Es2 {
    Scanner scanner = new Scanner(System.in);
    Random r = new Random();

    public void esercizio(){
        int n1,n2;
        int result;

        System.out.println("inserisci un numero: ");
        n1 = scanner.nextInt();
        System.out.println("inserisci il secondo numero: ");
        n2 = scanner.nextInt();

        System.out.println(Math.max(n1,n2));
    }
    public void esercizio2(){
        int[] numCa = new int[3];
        for (int i = 0 ; i < 3; i++) {
            numCa[i] = r.nextInt(100);
        }

        OptionalInt numMax = Arrays.stream(numCa).max();
        OptionalInt numMin = Arrays.stream(numCa).min();
        
        OptionalDouble radice = Arrays.stream(numCa).average();

        System.out.println("num Max: "+ numMax + "\n num Min: "+numMin+ "\n num radice: " +radice);



    }
    public void esercizio3(){
        String[] giorniSettimana = {"LUNEDI", "MARTEDI", "MERCOLEDI","GIOVEDI","VENERDI","SABATO","DOMENICA"};
    }
}
