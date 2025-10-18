package core;

public class Film {
    private String titolo;
    private String regista;
    private String genere;
    private int annoUscita;
    private int stelle; //valutazione del film

    //costruttore
    public Film(String titolo, String regista, int annoUscita, String genere, int stelle) {
        this.titolo = titolo;
        this.regista = regista;
        this.annoUscita = annoUscita;
        this.genere = genere;
        this.stelle = stelle;
    }

    //getter
    public String getTitolo() {
        return titolo;
    }

    public String getRegista() {
        return regista;
    }

    public String getGenere() {
        return genere;
    }

    public int getAnnoUscita() {
        return annoUscita;
    }

    public int getStelle() {
        return stelle;
    }

    //setter
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setAnnoUscita(int annoUscita) {
        this.annoUscita = annoUscita;
    }

    public void setStelle(int stelle) {
        if (stelle >= 0 && stelle <= 5){
            this.stelle = stelle;
        }else System.out.println("le stelle devono essere comprese tra '0 e 5");

    }

    //metodi
    public void stampaFilm(){
        System.out.println("titolo: " + this.titolo + "\nregista: " + this.regista + "\ngenere: " + this.genere + "\nanno uscita: " +this.annoUscita + "\nstelle: " + this.stelle);
    }

    public void valutaFilm(){
        if (this.stelle >= 3){
            System.out.println("Il film è consigliato");
        }else System.out.println("il film non è consigliato");
    }

    public boolean isClassico() {
        final int ANNOCORRENTE = 2000;
        if (this.annoUscita < ANNOCORRENTE){
            return true;
        }
        return false;
    }

    public boolean isNuovo(){
        final int ANNOCORRENTE = 2025;
        if (this.annoUscita >= 2025 -2 ){
            return true;
        }
        return false;
    }
    //e solo per test

    public boolean isBestThen(int altroFilm){
        if (this.stelle >= altroFilm){
            return true;
        }else return false;
    }








}

