import java.util.ArrayList;
import  java.time.LocalDate;

public class Calendario {
    private ArrayList<Evento> events;

    public Calendario() {
        this.events = new ArrayList<>();
    }

    public LocalDate dataOggi(){
        return LocalDate.now();
    }

    public void createEvent(Evento event){
        events.add(event);
        System.out.println("Evento creato: "+event);
    }

    public void updateEvent(int index, String tito, LocalDate date, boolean ricorrente){
        if (index < 0 || index >= events.size())throw new IndexOutOfBoundsException("indice non valido");
        try {
            events.get(index).setTitolo(tito);
            events.get(index).setDate(date);
            events.get(index).setRicorrente(ricorrente);
        } catch (Exception e) {
            System.out.println("ERRORE nell aggiornamento dell evento");
        }
    }

    public void removeEvent(int index){
        if (index < 0 || index >= events.size())throw new IndexOutOfBoundsException("indice non valido");
        System.out.println("Hai rimosso"+events.remove(index));
    }

    public ArrayList<Evento> getEvents(){
        return events;
    }
}