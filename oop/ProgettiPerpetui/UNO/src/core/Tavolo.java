package core;

import giocatore.Giocatore;

import java.util.ArrayList;
import java.util.List;

public class Tavolo {
    private ArrayList<Carta> listaCarteGiocate = new ArrayList<>();
    private Mazzo mazzo;
    private int numeroGiocatori;
    private ArrayList<Giocatore> giocatori;
    private ArrayList<String> nomeGiocatori;



    public Tavolo(Mazzo mazzo, int numeroGiocatori, ArrayList<String> nomeGiocatori) {
        this.mazzo = mazzo;
        this.numeroGiocatori = numeroGiocatori;
        this.nomeGiocatori = nomeGiocatori;
        try {
            this.giocatori =  createMani(mazzo,numeroGiocatori);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private ArrayList<Giocatore> createMani(Mazzo mazzo, int numeroGiocatori) throws Exception {
        ArrayList<Giocatore> listManTMP = new ArrayList<>();
        try {

            if (this.numeroGiocatori < 2) throw new Exception("ERROR: non si puo giocare uno da soli");

            for (int i = 0; i < numeroGiocatori; i++) {
                listManTMP.add(new Giocatore(nomeGiocatori.get(i),mazzo.drawTanto(7)));
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        return listManTMP;
    }

    public Carta getFirstCardMazzoCarteGiocate(){
        return listaCarteGiocate.getFirst();
    }



}
