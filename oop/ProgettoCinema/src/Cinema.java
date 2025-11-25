import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Cinema {
    ArrayList<Proiezione> proieziones = new ArrayList<>();
    private final int postiMax;
    private final String indirizzo;

    private String nome;

    public Cinema(String indirizzo, int postiMax, String nome) {
        this.indirizzo = indirizzo;
        this.postiMax = postiMax;
        this.nome = nome;
    }

    public int getPostiMax() {
        return postiMax;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Proiezione> getProieziones() {
        return proieziones;
    }

    public void aggiungiProiezione(Proiezione p){
        proieziones.add(p);
    }
    public void rimuoviProiezione(int index){
        if (index >= proieziones.size()|| index < 0)throw new IndexOutOfBoundsException("indice errato: "+ index);

        System.out.println("Hai rimosso con successo: "+ proieziones.remove(index));
    }
}
