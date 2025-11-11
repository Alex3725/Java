public enum ColoreTerminale {
    RESET("\u001B[0m"),
    NERO("\u001B[30m"),
    ROSSO("\u001B[31m"),
    VERDE("\u001B[32m"),
    GIALLO("\u001B[33m"),
    BLU("\u001B[34m"),
    VIOLA("\u001B[35m"),
    CIANO("\u001B[36m"),
    BIANCO("\u001B[37m");

    private final String codice;

    ColoreTerminale(String codice) {
        this.codice = codice;
    }

    public String colora(String testo) {
        return codice + testo + RESET.codice;
    }
}
