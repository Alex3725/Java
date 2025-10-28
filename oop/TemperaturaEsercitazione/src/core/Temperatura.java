package core;

public class Temperatura {
    private Double temperatura;
    private int id;

    private static int countInst;

    public static int getCountInst() {
        return countInst;
    }

    public Temperatura(Double temperatura){
        if (notTempCorrect(temperatura)){
            System.out.println("ERROR: data errata");
            return;
        }

        this.temperatura = temperatura;
        this.id = countInst;
        countInst++;
    }

    public Temperatura(Temperatura tmp){
        this(tmp.temperatura);
    }



    public boolean isMaggioreDi(Temperatura altra) {
        return Double.compare(this.temperatura, altra.temperatura) > 0;
    }


    // Getter e Setter
    public Double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(Double temperatura) {
        
        this.temperatura = temperatura;
    }

    private boolean notTempCorrect(Double tmp){
        return !(tmp == null || tmp < -273.15);
    }


    // Override toString
    @Override
    public String toString() {
        return this.temperatura + " °C";
    }




}
