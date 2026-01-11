import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contratto> elencoCont= new ArrayList<>();
        boolean balzSent = false;
        int sent = -111111111;
        while(sent != 0) {
            try {
                if (!balzSent) {
                    System.out.println("""
                            1) Aggiungi Cliente
                            2) Aggiungi contratto
                            3) Aggiungi auto
                            """);
                    sent = sc.nextInt();
                }
                switch (sent){
                    case 1 ->{
                        try {
                            System.out.println("inserire parametri");
                            System.out.println("nome");
                            String nome = sc.nextLine();
                            private String cognome;
                            private String codiceFiscale;
                            balzSent = false;
                        }catch (Exception e){
                            throw new IllegalArgumentException("mancato inserimento");
                            balzSent = true;
                        }
                    }
                    default -> {
                        System.out.println("Premi per continuare");
                        sc.nextLine();
                    }
                }


            } catch (NullPointerException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("Premi per continuare");
                sc.nextLine();
            }



        }

    }
}
