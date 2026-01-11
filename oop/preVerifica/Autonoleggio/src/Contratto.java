import java.util.ArrayList;

public class Contratto {
    private Auto veicolo;
    private Cliente contraente;
    private int giorniNoleggio;//int, max 30)
    private boolean isDisdetto;
    private static int numeroContratti;

    public Contratto(Auto veicolo, Cliente contraente, int giorniNoleggio, boolean isDisdetto) {
        this.veicolo = veicolo;
        this.contraente = contraente;
        this.giorniNoleggio = giorniNoleggio;
        this.isDisdetto = isDisdetto;
        numeroContratti++;
    }


    public Contratto(Contratto copy){
        this(copy.veicolo, copy.contraente, copy.giorniNoleggio, copy.isDisdetto);
    }

    public static int getNumeroContratti() {
        return numeroContratti;
    }


    public Auto getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Auto veicolo) {
        this.veicolo = veicolo;
    }

    public Cliente getContraente() {
        return contraente;
    }

    public void setContraente(Cliente contraente) {
        this.contraente = contraente;
    }

    public int getGiorniNoleggio() {
        return giorniNoleggio;
    }

    public void setGiorniNoleggio(int giorniNoleggio) {
        this.giorniNoleggio = giorniNoleggio;
    }

    public boolean isDisdetto() {
        return isDisdetto;
    }

    public void setDisdetto(boolean disdetto) {
        isDisdetto = disdetto;
    }




    public float calcolaCostoTotale(){
        int costo = 0;
        if (isDisdetto) return costo;
        return veicolo.getCostoGiornaliero()*giorniNoleggio;
    }

    public Auto stampaPerTarga(ArrayList<Contratto> contratti, String targa){
        for (Contratto contr : contratti){
            if (!contr.getVeicolo().getTarga().equals(targa))continue;
            return contr.getVeicolo();
        }
        throw new NullPointerException("Non ci sono Auto");
    }
    @Override
    public String toString() {
        return "Contratto{" +
                "veicolo=" + veicolo +
                ", contraente=" + contraente +
                ", giorniNoleggio=" + giorniNoleggio +
                ", isDisdetto=" + isDisdetto +
                ", numeroContratti=" + numeroContratti +
                '}';
    }
}
