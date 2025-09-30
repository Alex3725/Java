package core;

import java.util.Random;
import java.util.Scanner;

public class Esercizi {
    Scanner sca = new Scanner(System.in);
    Random random = new Random();
    public void es1(){
        System.out.println("inserire nome e cognome in questo formato (Nome eta)");
        String nome = sca.next();
        if (!sca.hasNextInt()) {
            System.out.println("errore gravissimo ");
        }else {
            int eta = sca.nextInt();
            sca.nextLine();
            if (eta > 0){
                System.out.println("Ciao " +nome +", hai "+eta+" anni");
            }else {
                System.out.println("non sei natoooooooooooooooooooooo");
            }
        }
    }
    public void es2(){
        int count = 1;
        int count2 = 0;
        System.out.println("inserisci 10 numeri interi: ");
        while (count < 11){
            System.out.println("inserisci il numero "+ count+"): ");
            if (!sca.hasNextInt()) continue;
            int numero = sca.nextInt();
            if (numero % 3 == 0) count2++;

            count++;
        }
        System.out.println("i numeri che sono multipli di 3 sono: " +count2);
    }
    public void es3(){
        final float Dollaro = 1.10f;
        final float Sterline = 0.85f;

        while (true){
            System.out.println("1) Euro -> Dollari\n2) Euro -> Sterline\n0) Uscita\n");
            if (!sca.hasNextInt()){
                System.out.println("ERRORE: re inserire un valore valido");
                continue;
            }
            int sent = sca.nextInt();
            if (sent == 0) break;
            System.out.print("inserire il numero da convertire: ");
            if (!sca.hasNextFloat()){
                System.out.println("ERRORE: re inserire un valore valido");
                continue;
            }
            float numeroDaConvertire = sca.nextFloat();
            float numeroConvertito = -1;
            switch (sent){
                case 1:
                    numeroConvertito = numeroDaConvertire*Dollaro;
                    break;
                case 2:
                    numeroConvertito = numeroDaConvertire*Sterline;
                    break;
                case 3:
                    System.out.println("Errore: sentinella sbagliat re inserire");
                    break;
            }
            if (numeroConvertito == -1)continue;
            System.out.println("il tuo risultato convertito e: "+ numeroConvertito);
        }

    }
    public void es4(){
        while (true){
            System.out.println("Benvenuto su sasso carta forbice\nscegli tra:\n1) sasso\n2) forbice\n3) carta\n0) Exit");

            if (!sca.hasNextInt()) {
                System.out.println("ERRORE: re inserire un valore valido");
                continue;
            }

            int sent = sca.nextInt();
            if (sent == 0)break;

            String risultato = switch (sent){
                case 1 -> "Sasso";
                case 2 -> "Forbice";
                case 3 -> "carta";
                default -> "-1";
            };
            if (risultato.equals("-1")) {
                System.out.println("errore nella scelta ripetere");
                continue;
            }
            int numeroRandom = random.nextInt(1,4);
            String risultatoRandom = switch (numeroRandom){
                case 1 -> "Sasso";
                case 2 -> "Forbice";
                case 3 -> "carta";
                default -> "suuuu";
            };
            System.out.println(risultato +" Vs "+ risultatoRandom);

            if (sent == numeroRandom) {
                System.out.println("pareggio");
                continue;
            }
            if (numeroRandom == 1 && sent == 2 || numeroRandom == 2 && sent == 3 || numeroRandom == 3 && sent == 1){
                System.out.println("hai perso");
            }
            else {
                System.out.println("hai vinto");
            }
        }

    }
}
