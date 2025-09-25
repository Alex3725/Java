package core.esercizi.es20250925;

import java.util.Arrays;
import java.util.Scanner;

public class Es20250925 {
    Scanner sca = new Scanner(System.in);
    public void es1(){
        int[] listaNum = new int[10];
        int cout = 0;
        int count_n = 0;
         while (listaNum[9] == 0){
             if (sca.hasNextInt()){
                 System.out.println("dammi un numero");
                 int sent = sca.nextInt();
                 sca.nextLine();
                 listaNum[cout] = sent;
                 cout++;
                 if(sent > 10){
                     count_n++;
                 }
             }
             System.out.println(count_n);
         }
    }
    public void es2(){
        int[] num =new int[3] ;
        int nMax = -99999999;
        int count = 0;
        while (count < 3){
            System.out.println("dammi un numero");
            if (!sca.hasNextInt()) continue;
            int numSent = sca.nextInt();
            sca.nextLine();
            num[count] = numSent;
            count ++;
        }
        if (num[0] < num[1] && num[2] > num[1] ){
            System.out.println("Numeri in ordine decrescente");
            n
        }else {
            System.out.println("Numeri non in ordine decrescente");
        }

    }
    public void es3(){
        int[] listNum = new int[6];
        boolean stato = false;
        int count = 0;
        while (count < 6){
            System.out.println("dammi numeri: ");
            if (!sca.hasNextInt()) System.out.println("ERRORE: ri inserire");continue;
            listNum[count] = sca.nextInt();
            sca.nextLine();
            count ++;
        }
        for (int num : listNum){
            if (Arrays.stream(listNum).anyMatch(n -> n == num)) break;
        }
        if (stato){
            System.out.println("numeri doppiati");
        }else {
            System.out.println("non sono doppiati");
        }
    }
}
