public enum Colori {
    RESET("\u001B[0m"),
    ROSSO("\u001B[31m"),
    VERDE("\u001B[32m"),
    GIALLO("\u001B[33m"),
    BLU("\u001B[34m"),
    CIANO("\u001B[36m"),
    VIOLA("\u001B[35m");

    private final String codice;

    Colori(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }


    public String colora(String testo) {
        return codice + testo + RESET.codice;
    }
}
