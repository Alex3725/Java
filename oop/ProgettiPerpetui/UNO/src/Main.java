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
            pausa(sc);
            sc.close();
        }

    }

    private static void pausa(Scanner sc) {
        System.out.println("Premere per continuare");
        sc.next();
    }
}
