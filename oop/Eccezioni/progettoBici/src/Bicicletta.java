public class Bicicletta {
    private String modello;
    private int velocita;

    public Bicicletta(String modello) {
        this.modello = modello;
        this.velocita = 0;
    }

    public void accelera(int incremento) {
        if (incremento > 0) velocita += incremento;
    }

    public void frena(int decremento) {
        if (decremento > 0) {
            velocita -= decremento;
            if (velocita < 0) velocita = 0;
        }
    }

    @Override
    public String toString() {
        return Colori.CIANO.colora("Modello: " + modello + "\nVelocità attuale: " + velocita + " km/h");
    }
}
