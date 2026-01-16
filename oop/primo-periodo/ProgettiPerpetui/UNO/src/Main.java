import core.Mazzo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            Mazzo mazzo1 = new Mazzo(40);
            System.out.println(mazzo1);

            mazzo1.shuffle();
            System.out.println(mazzo1);


        } catch (Exception e) {
            System.out.println(e);
        }finally {
            pausa();
        }

    }

    public static void pausa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPremi INVIO per continuare...");
        sc.nextLine(); // attende input dell’utente
    }
}
