package core;

/*
* ciao come va questa e la mia class dei pc
* una classe molto bella*/

public class Pc {

    private final String marca;
    private final String cpu;
    private Integer ramGB;
    private Integer ssdGB;
    private final int id;

    //Attributi Extra
    private float costo ;

    static int countID = 0;
    static final String SISTEMA_OPERATIVO_PREDEFINITO = "Windows 11";
    static final int TENSIONE_ALIMENTAZIONE = 220;


    public static int getCountID() {
        return countID;
    }

    public Pc(String marca, String cpu, int ramGB, int ssdGB) {
        this(marca, cpu,0);
        this.ramGB = ramGB;
        this.ssdGB = ssdGB;

    }
    public Pc(String marca, String cpu,float costo) {
        this.marca = marca;
        this.cpu = cpu;
        this.costo = costo;

        this.id = countID;
        countID++;
    }
    //costruttore copia
    public Pc(Pc pcCopia){
        this(pcCopia.marca,pcCopia.cpu,pcCopia.ramGB,pcCopia.ramGB);
    }

    //getter

    public String getMarca() {
        return this.marca;
    }

    public String getCpu() {
        return this.cpu;
    }

    public Integer getRamGB() {
        return this.ramGB;
    }

    public Integer getSsdGB() {
        return this.ssdGB;
    }

    public float getCosto() {
        return this.costo;
    }

    public int getId() {
        return this.id;
    }

    //setter


    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setSsdGB(Integer ssdGB) {
        this.ssdGB = ssdGB;
    }

    public void setRamGB(Integer ramGB) {
        this.ramGB = ramGB;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "marca='" + this.marca + '\'' +
                ", cpu='" + this.cpu + '\'' +
                ", ramGB=" + this.ramGB +
                ", ssdGB=" + this.ssdGB +
                ", id=" + this.id +
                ", costo=" + this.costo +
                ", Sistema Operativo=" + SISTEMA_OPERATIVO_PREDEFINITO +
                ", TENSIONE ALIMENTAZIONE=" + TENSIONE_ALIMENTAZIONE +
                '}';
    }
}
