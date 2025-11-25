import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;

public class Proiezione {
    private String titolo;
    private Date durata;
    private ArrayList<String> posti = new ArrayList<>();

    public Proiezione(String titolo, Date durata) {
        this.titolo = titolo;
        this.durata = durata;

    }

    public String getTitolo() {
        return titolo;
    }

    public Date getDurata() {
        return durata;
    }

    public ArrayList<String> getPosti() {
        return posti;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDurata(Date durata) {
        this.durata = durata;
    }

    public void prenotoPosto(String p){
        posti.add(p);
    }
    public void annullaPosto(String p){
        if (!posti.contains(p))throw new NoSuchElementException("Posto non trovato: "+p);
        
    }
}
