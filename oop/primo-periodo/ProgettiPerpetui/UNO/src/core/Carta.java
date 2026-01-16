package core;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return numero == carta.numero && isSpecial == carta.isSpecial && id == carta.id && colore == carta.colore && tipoSpe == carta.tipoSpe;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colore, numero, isSpecial, tipoSpe, id);
    }
}