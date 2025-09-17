package core.esercizi;

import java.util.Scanner;

public class Esercizi {

    String[] TITOLI = {
            "Il signore degli anelli",
            "1984",
            "Orgoglio e pregiudizio",
            "Il nome della rosa",
            "Harry Potter e la pietra filosofale",
            "Moby Dick",
            "Don Chisciotte",
            "Il piccolo principe",
            "Cime tempestose",
            "La coscienza di Zeno"
    };

    String[] TRAME = {
            "Un giovane hobbit intraprende un viaggio epico per distruggere un anello maledetto.",
            "Un futuro distopico dove il Grande Fratello controlla ogni aspetto della vita.",
            "La storia di Elizabeth Bennet e Mr. Darcy tra amore, ironia e convenzioni sociali.",
            "Un monaco francescano indaga su misteriosi omicidi in un'abbazia medievale.",
            "Un giovane mago scopre la sua identità e affronta le prime sfide a Hogwarts.",
            "Il capitano Achab ossessionato dalla caccia alla balena bianca.",
            "Le avventure tragicomiche di un cavaliere idealista e del suo fedele scudiero.",
            "Un aviatore incontra un misterioso bambino proveniente da un altro pianeta.",
            "Un romanzo gotico che esplora passioni oscure e vendette senza tempo.",
            "Il racconto ironico e introspettivo della vita di Zeno Cosini."
    };
    double[] PREZZI = {
            19.90,
            12.50,
            9.99,
            14.80,
            11.20,
            16.50,
            13.70,
            7.50,
            10.40,
            9.30
    };

    Scanner scanner = new Scanner(System.in);

    public void readIt(){

        int sentinella;
        double somma = 0;

        String[] lista;



        while (true){
            System.out.println("Scegli uno libro tra questi: ");
            System.out.println();
            int count = 0;
            for (String titolo : TITOLI){
                count++;
                System.out.println(count+")\t"+titolo+ "\t\t\t\t\t\t Euro: " + PREZZI[count-1]);

            }
            System.out.print("->");
            sentinella = scanner.nextInt();

            if (sentinella == 1){
                somma += PREZZI[0];

            }else if (sentinella == 2){
                somma += PREZZI[1];

            }else if (sentinella == 3){
                somma += PREZZI[2];

            }else if (sentinella == 4){
                somma += PREZZI[3];
            }else if (sentinella == 5){
                somma += PREZZI[4];
            }else if (sentinella == 6){
                somma += PREZZI[5];
            }else if (sentinella == 7){
                somma += PREZZI[6];
            }else if (sentinella == 8){
                somma += PREZZI[7];
            }else if (sentinella == 9){
                somma += PREZZI[8];

            }else if (sentinella == 10) {
                somma += PREZZI[9];
            };
            System.out.println("Il tuo saldo e di: "+ somma+"€");

            if (somma >= 50){
                System.out.println("e hai in regalo Harry potter");
            }else if (somma > 40){
                System.out.println("e hai in regalo I promessi sposi");
            }

            System.out.println("vuoi continuare a comprare yes Y/N");
            scanner.nextLine();
            String sentYN = scanner.nextLine();

            if (sentYN == "N" || sentYN == "n" ){
                System.out.println("grazie di averci scelto");
                break;
            }

        }

    }

}
