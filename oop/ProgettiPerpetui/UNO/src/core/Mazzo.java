package core;



import java.util.ArrayList;
import java.util.Arrays;

import java.util.Random;


public class Mazzo {
    private int nCarteMazzoIniziale;
    private int nCarteSingoloMazzo;
    private int nCarteMazzoAttuale;
    private ArrayList<Carta> listaCarte = new ArrayList<>();
    private int countPescata = 0;

    private Colori[] listColori = {Colori.ROSSO,Colori.VERDE,Colori.GIALLO,Colori.BLU};



    private int id;
    private static int countID;

    public Mazzo(int nCarteMazzo) throws Exception {
        if (nCarteMazzo != 40)throw new Exception ("ERROR: per ora implementato solo un mazzo da 40 carte");
        this.nCarteMazzoIniziale = nCarteMazzo;
        this.nCarteMazzoAttuale = nCarteMazzo;
        this.nCarteSingoloMazzo = nCarteMazzo/4;


        for (Colori colore: listColori) {
            creaMazzo(nCarteSingoloMazzo,colore);
        }

        countID++;
        this.id = countID;
    }


    public static int getCountID() {
        return countID;
    }

    public int getNumCarteSingoloMazzo() {
        return nCarteSingoloMazzo;
    }

    public int getNumCarteMazzo() {
        return nCarteMazzoIniziale;
    }

    public Colori[] getListColori() {
        return listColori;
    }

    public int getId() {
        return id;
    }

    public int getCountPescata() {
        return countPescata;
    }
    public Carta getCarta(int index){
        return listaCarte.get(index);
    }

    public void creaMazzo(int nCarteSingoloMazzo, Colori coloreMazzo){
        for (int i = 0; i < nCarteSingoloMazzo; i++) {
            Carta newCart = new Carta(coloreMazzo,i);
            this.listaCarte.add(newCart);
        }
    }


    public void shuffle(){
        Carta tmp;
        Random r = new Random();
        for (int i = 0; i < nCarteMazzoIniziale; i++){
            Carta cartaBase = listaCarte.get(i);
            tmp = listaCarte.set(r.nextInt(0, nCarteMazzoIniziale),cartaBase);
            listaCarte.set(i,tmp);
        }
    }

    public Carta draw() throws Exception {
        if (countPescata > nCarteMazzoAttuale)throw new Exception ("ERROR: hai pescato troppo non ci sono piu carte");
        countPescata++;
        nCarteMazzoAttuale--;
        return listaCarte.removeFirst();
    }

    public ArrayList<Carta> drawTanto(int numCarteDaPescare) throws Exception {

        if (numCarteDaPescare > nCarteMazzoAttuale) {
            numCarteDaPescare = nCarteMazzoAttuale;
            throw new Exception("ERROR: hai pescato troppo non ci sono piu carte Ti ho fatto pescare le carte fino al numero massimo"+numCarteDaPescare);
        }
        countPescata += numCarteDaPescare;
        nCarteMazzoAttuale -= numCarteDaPescare;

        // Ottengo la sotto-lista dei primi n elementi
        ArrayList<Carta> listTMP= new ArrayList<>(listaCarte.subList(0, numCarteDaPescare));

        // Rimuovo le carte pescate dal mazzo originale
        listaCarte.subList(0, numCarteDaPescare).clear();

        return listTMP;
    }



    public void printMazzo(){
        for (Carta carta : listaCarte){
            System.out.println(carta);
        }
    }

    @Override
    public String toString() {
        return "Mazzo{\n" +
                "nCarteMazzoIniziale=" + nCarteMazzoIniziale +
                ", nCarteSingoloMazzo=" + nCarteSingoloMazzo +
                ",\n listaCarte=" + listaCarte +
                ",\n listColori=" + Arrays.toString(listColori) +
                ", id=" + id +"\n"+
                '}';
    }
}


