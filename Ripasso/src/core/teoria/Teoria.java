package core.teoria;

import java.util.Scanner;

public class Teoria {
    Scanner scanner = new Scanner(System.in);

    public void inputOutput(){
        /* VARIABILI IN PYTHON
         * a = 5
         * s = "ciao"
         * s = 4
         * typeOf(s) -> integer
         * b = True
         * lista = []
         *
         * TIPI DI VARIABILI (primitivi):
         * int
         * long
         * short
         * float
         * boolean
         * double
         * char
         *
         * TIPI REFERENCE
         * String
         */
        String nomePersona;	//in Java si utilizza la notazione camelCase
        int etaPersona;

        //input("Inserisci un numero: ")
        Scanner scanner = new Scanner(System.in);	// scanner è un'istanza (oggetto) della classe Scanner contenuta in java.util.Scanner

        System.out.println("Quanti anni hai: ");

        etaPersona = scanner.nextInt();	// nextInt() è un metodo della classe Scanner che permette di acquisire in input un intero
        System.out.println("Come ti chiami: ");
        scanner.nextLine();
        nomePersona = scanner.nextLine();	//nextLine() è un metodo della classe Scanner che permette di acquisire in input una Stringa

        //sout
        //print(somma)
        System.out.println("Benvenuto "+nomePersona+" vedo che hai "+etaPersona+" anni.");
    }

    public void iterazioni() {
        //Iterazioni

        //ARRAY: Un array in Java è un contenitore che permette di gestire una sequenza di lunghezza fissa di elementi tutti del medesimo tipo.

        int[] numeri = new int[5];
        numeri[0] = 1;
        numeri[4] = 10;
        int[] votiInfo = {5,7,8,2,1};

        //int i = votiInfo.length; array.length -> La proprietà length restituisce la lunghezza di un array

        int cont1 = 0;

        //WHILE
        while(cont1 < votiInfo.length){
            System.out.println(votiInfo[cont1]);
            //cont+=1
            cont1++;
        }
        int cont2 = 0;
        //DO WHILE
        do{
            System.out.println(votiInfo[cont2]);
            //cont+=1
            cont2++;
        }while(cont2 < votiInfo.length);

        //FOR
        for(int i = 0; i<votiInfo.length; i++){
            System.out.println(votiInfo[i]);
        }

        //FOREACH
        for(int voto : votiInfo){
            System.out.println(voto);
        }

        //somma degli elementi di un array di double
        double[] numeri2 = {1.5, 2.3, 4.7, 3.2};
        double somma = 0;
        //Si legge: for numero in numeri (continua l'iterazione finchè ci sono numeri da assegnare nella variabile numero (shallow copy: copia del valore contenuto nell'indice di riferimento in numeri))
        for (double numero : numeri) {
            somma += numero;
        }
        System.out.println("La somma degli elementi dell'array è: " + somma);
    }
    public enum Giorni{ //costanti
        LUNEDI,
        MARTEDI,
        MERCOLEDI,
        GIOVEDI,
        VENERDI,
        SABATO,
        DOMENICA
    }

    public void esercizioSwitchExpression(){

        int s;

        System.out.print("inserisci un numero: ");
        s = scanner.nextInt();

        Giorni[] giorni = Giorni.values(); // ritorna un Array con tutti i giorni

        String risultato = switch (s){
            case 20,30,40,50 -> "hai indovinato";
            default -> "non hai indovinato";
        };
        System.out.println(risultato);
    }
}
