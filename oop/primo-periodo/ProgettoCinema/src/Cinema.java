import java.util.ArrayList;

public class Cinema {
    ArrayList<Proiezione> proiezioni = new ArrayList<>();
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

    public ArrayList<Proiezione> getProiezioni() {
        return proiezioni;
    }

    public void aggiungiProiezione(Proiezione p){
        proiezioni.add(p);
    }
    public void rimuoviProiezione(int index){
        if (index >= proiezioni.size()|| index < 0)throw new IndexOutOfBoundsException("indice errato: "+ index);

        System.out.println("Hai rimosso con successo: "+ proiezioni.remove(index));
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "postiMax=" + postiMax +
                ", indirizzo='" + indirizzo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }


}
