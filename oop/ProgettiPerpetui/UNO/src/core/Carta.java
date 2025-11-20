package core;

//carte
public class Carta {
    private Colori colore;
    private int numero;
    private boolean isSpecial = false;
    private Special tipoSpe;


    private int id;
    private static int countID;


    public Carta(Colori colore, int numero) {
        this.colore = colore;
        this.numero = numero;

        countID++;
        this.id = countID;
    }

    public Carta(Colori colore, int numero, boolean isSpecial, Special tipoSpe) {
        this(colore, numero);
        this.isSpecial = isSpecial;
        this.tipoSpe = tipoSpe;
    }



    @Override
    public String toString() {
        return "\nCarta|" +
                "id=" + id +
                "|colore=" + colore +
                "|numero=" + numero +
                (isSpecial ? ", tipoSpe=" + tipoSpe : "")+
                '|';
    }
}