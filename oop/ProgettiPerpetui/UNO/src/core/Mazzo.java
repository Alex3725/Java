package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Mazzo {
    private int nCarteMazzo;
    private int nCarteSingoloMazzo;
    private ArrayList<Carta> listaCarte = new ArrayList<>();

    private Colori[] listColori = {Colori.ROSSO,Colori.VERDE,Colori.GIALLO,Colori.BLU};



    private int id;
    private static int countID;

    public Mazzo(int nCarteMazzo) throws Exception {
        if (nCarteMazzo != 40)throw new Exception ("ERROR: per ora implementato solo un mazzo da 40 carte");
        this.nCarteMazzo = nCarteMazzo;
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
        return nCarteMazzo;
    }

    public Colori[] getListColori() {
        return listColori;
    }

    public int getId() {
        return id;
    }

    public void creaMazzo(int nCarteSingoloMazzo, Colori coloreMazzo){
        ArrayList<Carta> list= new ArrayList<>();

        for (int i = 0; i < nCarteSingoloMazzo; i++) {
            Carta newCart = new Carta(coloreMazzo,i);
            this.listaCarte.add(newCart);
        }
    }


    public void shuffle(){
        Carta tmp;
        Random r = new Random();
        for (int i = 0; i < nCarteMazzo; i++){
            Carta cartaBase = listaCarte.get(i);
            tmp = listaCarte.set(r.nextInt(0,nCarteMazzo),cartaBase);
            listaCarte.set(i,tmp);
        }
    }

    public Carta draw(){
        Carta carta = listaCarte.getFirst();
        listaCarte.remove(carta);
        return carta;
    }

    public void printMazzo(){
        for (Carta carta : listaCarte){
            System.out.println(carta);
        }
    }

    @Override
    public String toString() {
        return "Mazzo{\n" +
                "nCarteMazzo=" + nCarteMazzo +
                ", nCarteSingoloMazzo=" + nCarteSingoloMazzo +
                ",\n listaCarte=" + listaCarte +
                ",\n listColori=" + Arrays.toString(listColori) +
                ", id=" + id +"\n"+
                '}';
    }

    //carte
    public class Carta {
        private Colori colore;
        private int numero;
        private boolean isSpecial = false;
        private Special tipoSpe;


        private int id;
        private static int countID;


        public Carta(Colori colore, int numero) {
            this.colore = colore;
            this.numero = numero;

            countID++;
            this.id = countID;
        }

        public Carta(Colori colore, int numero, boolean isSpecial, Special tipoSpe) {
            this(colore, numero);
            this.isSpecial = isSpecial;
            this.tipoSpe = tipoSpe;
        }

        @Override
        public String toString() {
            return "\nCarta|" +
                    "id=" + id +
                    "|colore=" + colore +
                    "|numero=" + numero +
                    (isSpecial ? ", tipoSpe=" + tipoSpe : "")+
                    '|';
        }
    }
}


