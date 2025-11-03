package core;

/*
* ciao come va questa e la mia class dei pc
* una classe molto bella*/

public class Pc {


    public static final String SISTEMA_OPERATIVO_PREDEFINITO = "Windows 10";
    public static final int TENSIONE_ALIMENTAZIONE = 220;


    private String marca;
    private String cpu;
    private int ramGB;
    private int ssdGB;


    public Pc() {
        this.marca = "Sconosciuta";
        this.cpu = "Non specificata";
        this.ramGB = 0;
        this.ssdGB = 0;
    }


    public boolean trySetMarca(String marca) {
        if (marca != null && !marca.isBlank()) {
            setMarca(marca);
            return true;
        }
        System.out.println("Marca non valida!");
        return false;
    }

    public boolean trySetCpu(String cpu) {
        if (cpu != null && !cpu.isBlank()) {
            setCpu(cpu);
            return true;
        }
        System.out.println("CPU non valida!");
        return false;
    }

    public boolean trySetRamGB(int ram) {
        if (ram > 0 && ram <= 256) {
            setRamGB(ram);
            return true;
        }
        System.out.println("RAM non valida!");
        return false;
    }

    public boolean trySetSsdGB(int ssd) {
        if (ssd > 0 && ssd <= 4096) {
            setSsdGB(ssd);
            return true;
        }
        System.out.println("SSD non valido!");
        return false;
    }

    // sett
    private void setMarca(String marca) { this.marca = marca; }
    private void setCpu(String cpu) { this.cpu = cpu; }
    private void setRamGB(int ramGB) { this.ramGB = ramGB; }
    private void setSsdGB(int ssdGB) { this.ssdGB = ssdGB; }


    @Override
    public String toString() {
        return "Pc [" +
                "Marca='" + marca + '\'' +
                ", CPU='" + cpu + '\'' +
                ", RAM=" + ramGB + " GB" +
                ", SSD=" + ssdGB + " GB" +
                ", Sistema Operativo='" + SISTEMA_OPERATIVO_PREDEFINITO + '\'' +
                ", Tensione=" + TENSIONE_ALIMENTAZIONE + "V" +
                ']';
    }
}
