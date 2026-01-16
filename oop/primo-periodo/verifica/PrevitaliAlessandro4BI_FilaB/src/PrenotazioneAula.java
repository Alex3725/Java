import java.util.Arrays;

public class PrenotazioneAula {
    private String nomeRichiedente;
    private int idPrenotazione;
    private Integer numeroOrePrenotate;
    private String tpoAttvita;
    private boolean prenotazioneConfermata;
    //sattic
    private static int contatorePrenotazioni;
    public static int getNumeroPrenotazioniEffetuate() {
        return contatorePrenotazioni;
    }

    private static final String[] ATTIVITA_DISP = {"Lezione", "Recupero", "Corso FSL", "Esame"};
    public static String[] getATTIVITA_DISP() {
        return ATTIVITA_DISP;
    }


    private final int MAX_ORE = 8;

    public PrenotazioneAula(String nomeRichiedente, Integer numeroOrePrenotate, String tpoAttvita, boolean prenotazioneConfermata) {
        this.nomeRichiedente = nomeRichiedente;
        this.numeroOrePrenotate = numeroOrePrenotate;
        this.tpoAttvita = tpoAttvita;
        this.prenotazioneConfermata = prenotazioneConfermata;

        this.idPrenotazione = contatorePrenotazioni;
        contatorePrenotazioni++;
    }
    public PrenotazioneAula(PrenotazioneAula copia) {
        this(copia.nomeRichiedente, copia.numeroOrePrenotate, copia.tpoAttvita, copia.prenotazioneConfermata);

    }


    //Getter
    public String getNomeRichiedente() {
        return nomeRichiedente;
    }

    public int getIdPrenotazione() {
        return idPrenotazione;
    }

    public Integer getNumeroOrePrenotate() {
        return numeroOrePrenotate;
    }

    public String getTpoAttvita() {
        return tpoAttvita;
    }

    public boolean isPrenotazioneConfermata() {
        return prenotazioneConfermata;
    }





    public int getMAX_ORE() {
        return MAX_ORE;
    }
    //Setter


    public void setTpoAttvita(String tpoAttvita) {
        this.tpoAttvita = tpoAttvita;
    }

    public void setPrenotazioneConfermata(boolean prenotazioneConfermata) {
        this.prenotazioneConfermata = prenotazioneConfermata;
    }

    public boolean isPrenotazioneEstesa() {
        return this.numeroOrePrenotate > 6;
    }

    public boolean isNullNumeroOrePrenotate(){
        return this.numeroOrePrenotate == null;
    }
    @Override
    public String toString() {
        return "- Prenotazione:"+ contatorePrenotazioni+" | Richiedente:"+ this.nomeRichiedente +"|"+this.idPrenotazione+"| Attività:"+ this.tpoAttvita+ "| Confermata:"+ this.prenotazioneConfermata+" | Ore:"+ (isNullNumeroOrePrenotate() ? "Durata non ancora specificata" : this.numeroOrePrenotate);
    }
}

