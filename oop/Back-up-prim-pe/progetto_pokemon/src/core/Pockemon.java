package core;

public class Pockemon {

    //ATTRIBUTI
    private String nome;
    private Elemento elemento;
    private int puntiVita;
    private int salute;
    private int attacco;

    private int id;

    //ATTRIBUTI STATIC
    private static int counterID = 0;//salvato nella struttura dati metaspace
    // quindi questo parametro vengono visti da tutte le istanze di quell oggetto
    // utilizzato soprattutto da un id

    //METODI STATIC
    // metodi richiamabili senza istanzazione di un oggetto essendo generali
    public static int QuantitaPokemonCreati(){
        return counterID;
    }

    //COSTRUTTORE
    public Pockemon(String nome, Elemento elemento) {
        this(nome, elemento,100);
    }

    public Pockemon(String nome, Elemento elemento, int attacco) {
        this(nome, elemento,100,attacco);// per richiamare costruttore sotto
    }

    public Pockemon(String nome, Elemento elemento, int puntiVita, int attacco) {

        this.id = counterID++;
        this.nome = nome;
        this.elemento = elemento;
        this.attacco = attacco;
        this.puntiVita = puntiVita;
        this.salute = puntiVita;
    }


    //GETTER
    public int getPuntiVita() {
        return puntiVita;
    }

    public int getId() {
        return id;
    }

    public int getattacco() {
        return attacco;
    }

    public int getSalute() {
        return salute;
    }
    //SETTER




    // implementare metodo Attacco(Pockemon pkm)
    /*
    * il metodo prende il valore di attacco del pokemo che lo ha invocato e toglie quell valore ai pochemon passato come parametro
    * aggiungere get set allo sviluppo
    *
    *successivamente se il pockemon passato come parametro è in vita


    */

    protected void subisciDanno(int danno){
        if (this.salute<danno) this.salute = 0;
        else this.salute -= danno;
    }



    public void attacco(Pockemon pkm){
        if (this.salute == 0) return;
        int mioAtt= this.attacco;
        pkm.subisciDanno(mioAtt);
        if (pkm.getSalute()>0){
            this.subisciDanno(pkm.getattacco());
        }
    }
}
