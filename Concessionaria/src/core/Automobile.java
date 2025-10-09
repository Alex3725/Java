package core;

public class Automobile {
    //Attributi

    private String modello;
    private String marca;
    private int cilindrata;
    private int numeroPortieri;
    private int kmh; // attuale
    private int kilometri;
    private int velocitaMax;

    public Automobile(String modello, String marca){
        this.modello = modello;
        this.marca = marca;
    }
    public Automobile(String modello, String marca,int velocitaMax){
        this(modello, marca);// associa i costruttori
        this.velocitaMax = velocitaMax;
    }

    public Automobile(String modello, String marca, int cilindrata, int numeroPortieri, int kmh, int kilometri, int velocitaMax) {
        this(modello, marca, velocitaMax);// associa i costruttori
        this.cilindrata = cilindrata;
        this.numeroPortieri = numeroPortieri;
        this.kmh = kmh;
        this.kilometri = kilometri;
        this.velocitaMax = velocitaMax;
    }

    //restiturire marca
    String getMarca(){
        return this.marca;
    }


    public int getVelocitaMax() {
        return velocitaMax;
    }

    public void setAccellerareKmh(int kmh) {
        if ((this.kmh += kmh) >= this.velocitaMax){
            System.out.println(this.kmh);
            System.out.println(this.kmh += kmh);// associa i costruttori);
            System.out.println("ERRORE: stai accelerando troppo stai superando il limite di["+((this.kmh+kmh)-this.velocitaMax)+"]");
        }else {
            this.kmh += kmh;
        }
    }

    public void setVelocitaMax(int velocitaMax) {
        this.velocitaMax = velocitaMax;
    }

    @Override
    public String toString(){
        return "la marca è " +marca+ " modello "+modello;
    }
}
