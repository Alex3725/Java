package core;

public class Libro {
    public static final String RESET = "\u001B[0m";
    public static final String ROSSO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String GIALLO = "\u001B[33m";
    public static final String BLU = "\u001B[34m";

    private String titolo;
    private String autore;
    private int numeroPagine;
    private int paginaCorrente = 1;

    public Libro(String titolo, String autore, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;

    }

    public void sfoglia(){
        int paginaCorrent = this.paginaCorrente;
        System.out.println(this.paginaCorrente);
        if ((paginaCorrent + 1) <= this.numeroPagine){
            this.paginaCorrente++;
            System.out.println("La pagina corrente è"+VERDE+"["+this.paginaCorrente+"]"+RESET);
        }else{
            System.out.println(ROSSO+"ERRORE: hai superato le pagine"+RESET);
        }
    }
    public void tornaIndietro(){
        int paginaCorrent = this.paginaCorrente;
        if ((paginaCorrent - 1) >= 1){
            this.paginaCorrente--;
            System.out.println("La pagina corrente è["+this.paginaCorrente+"]");
        }else{
            System.out.println(ROSSO+"ERRORE: hai superato le pagine"+RESET);
        }
    }

    public void stampaInformazioni(){
        System.out.println("titolo: "+this.titolo+"\nautore:"+this.autore+"\npagina corrente:"+this.paginaCorrente);
    }
    public int paginaAttuale(){
        return this.paginaCorrente;
    }




}
