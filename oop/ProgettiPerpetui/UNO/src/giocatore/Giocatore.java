package giocatore;

import core.Carta;

import java.util.ArrayList;
import java.util.Scanner;


public class Giocatore {
    private String nomeGiocatore;
    private ArrayList<Carta> manoDaGiocare;
    private int id;

    static int countId;

    public Giocatore(String nomeGiocatore, ArrayList<Carta> manoDaGiocare) {
        this.nomeGiocatore = nomeGiocatore;
        this.manoDaGiocare = manoDaGiocare;

        this.id = countId;
        countId++;
    }

    public void printMano(ArrayList<Carta> mazzo){
        for (int i = 0; i < mazzo.size(); i++) {
            System.out.println((i+1)+")"+mazzo.get(i));
        }
    }

    public Carta sceltaCartaMazzo(Carta cartaBanco){
        Scanner sc = new Scanner(System.in);
        ArrayList<Carta> giocabili =
        int scelta;

        while (true){
            try {
                printMano(giocabili);
                scelta = sc.nextInt();
                if (scelta < 1 || scelta > giocabili.size())throw new 

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }

    private ArrayList<Carta> isPlayable(){

    }
}
