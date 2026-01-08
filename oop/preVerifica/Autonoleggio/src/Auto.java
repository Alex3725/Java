public class Auto {
    private String marca;
    private String modello;
    private String targa;
    private float costoGiornaliero;


    public Auto(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public Auto(String marca, String modello, String targa, float costoGiornaliero) {
        this(marca,modello);
        this.targa = targa;
        this.costoGiornaliero = costoGiornaliero;
    }

    public Auto(Auto copy) {
        this(copy.marca, copy.modello, copy.targa, copy.costoGiornaliero);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public float getCostoGiornaliero() {
        return costoGiornaliero;
    }

    public void setCostoGiornaliero(float costoGiornaliero) {
        this.costoGiornaliero = costoGiornaliero;
    }

    public boolean isEconomica(){
        return costoGiornaliero > 50 && costoGiornaliero < 70;
    }



    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", costoGiornaliero=" + costoGiornaliero +
                '}';
    }


}
