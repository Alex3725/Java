package core;

public class Studente {
    private String nome;
    private String cognome;
    private int annoNascita;
    private enum materie{
        Informatica,
        Matematica,
        Italiano,
        Storia,
        Telecomunicazioni,
        TPS
    }
    private int[][] voti;
    private int[] votiMax;

    public Studente(String nome, String cognome, int annoNascita, int[] votiMax) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
        this.votiMax = votiMax;
    }


}
