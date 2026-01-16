package core;

import javax.swing.*;

public class Bicicletta {
    private String marca;
    private String tipo;
    private int velocita;
    private int[] limite;
    private int marcia = 1;
    private int marcieMax;


    public Bicicletta(String marca, String tipo, int velocita, int marcieMax) {
        this.marca = marca;
        this.tipo = tipo;

        if (controlloMarcieMax(marcieMax))this.marcieMax = marcieMax;
        else System.out.println("errore: inserimento errato di velocità");



        if (controlloVelocita(velocita))this.velocita = velocita;
        else System.out.println("errore: inserimento errato di velocità");

        limite = new int[marcieMax];
        limite[0] = 5;
        for (int i = 1; i <= marcieMax; i++) {
            limite[i] = limite[i-1]+5;
        }
        for (int lim : limite) System.out.println(lim);


    }


    // get
    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelocita() {
        return velocita;
    }

    public int getMarcia() {
        return marcia;
    }

    public int getMarcieMax() {
        return marcieMax;
    }

    // Set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public void setMarcia(int marcia) {
        this.marcia = marcia;
    }

    private boolean controlloVelocita(int velocita){
        boolean tipo = true;
        if (velocita < 0 || velocita > 50)tipo =  false;
        return tipo;
    }
    private boolean controlloMarcieMax(int marciaMax){
        boolean tipo = true;
        if (marciaMax > 10 || marciaMax < 1)return false;
        return tipo;
    }


    public int pedala(){
        if (this.velocita > this.limite[this.marcia-1]){
                System.out.println("cambia marcia, o rallenta per aumentare la velocità");
                return -1;
            }else {
            this.velocita += 5;
            return 0;
        }
    }
    public int frena(){
        int velocita = this.velocita;
        if (velocita -5 < 0) {
            System.out.println("stai andando in retromarcia :)");
        }if (velocita - 5 == 0){
            System.out.println("sei fermo");
        }else {
            if (velocita -1 <= marcieMax -5){
                return -1;
            }else {
                this.velocita -= 1;
                return 0;
            }

        }

    }
    public void stampaStato(){
        System.out.println("La tua bici è una:["+this.tipo+"]\n Con marca:["+this.marca+"]\n Stai andando a:["+this.velocita+"km/h]\n Con marcia:["+this.marcia+"]\nSulla bici hai :["+this.marcieMax+"]");
    }
    public void incrementaMarcia(){
         int marcia = this.marcia;
        if (marcia + 1 > marcieMax){
            System.out.println("Errore: non hai piu marcie");
        }else this.marcia ++;
    }
    public void decrementaMarcia(){
        int marcia = this.marcia;
        if (marcia - 1 <= 0){
            System.out.println("Errore: non hai piu marcie");
        }else this.marcia --;
    }


}
