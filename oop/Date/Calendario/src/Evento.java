import java.time.LocalDate;

public class Evento {

    private String titolo;
    private LocalDate date;
    private boolean ricorrente;

    public Evento(String titolo, LocalDate date) {
        this.titolo = titolo;
        this.date = date;
        this.ricorrente = false;
    }

    public Evento(String titolo, LocalDate date, boolean ricorrente) {
        this(titolo, date);
        this.ricorrente = ricorrente;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isRicorrente() {
        return ricorrente;
    }

    public void setRicorrente(boolean ricorrente) {
        this.ricorrente = ricorrente;
    }

    @Override
    public String toString() {
        return "Event{" +
                "Titolo:'" + this.titolo + '\'' +
                ", | date:" + this.date +
                ", | ricorrente:" + (this.ricorrente? "Si": "No") +
                '}';
    }
}

