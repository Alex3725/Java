package core;

import java.util.ArrayList;
import java.util.Scanner;

public class Temperatura {

        // Attributi privati
        private Double valore;
        private static int contatore = 0;

        // Costruttore parametrico con controllo
        public Temperatura(Double valore) {
            if (valore == null || valore < -273.15) {
                System.out.println("Valore non valido! Imposto a 0.0°C.");
                this.valore = 0.0;
            } else {
                this.valore = valore;
            }
            contatore++;
        }

        // Costruttore di copia
        public Temperatura(Temperatura altra) {
            if (altra == null) {
                System.out.println("Temperatura nulla! Imposto a 0.0°C.");
                this.valore = 0.0;
            } else {
                this.valore = altra.valore;
            }
            contatore++;
        }

        // Getter e Setter
        public Double getValore() {
            return valore;
        }

        public void setValore(Double valore) {
            if (valore == null || valore < -273.15) {
                System.out.println("Valore non valido! Nessuna modifica effettuata.");
                return;
            }
            this.valore = valore;
        }

        // Metodo statico per ottenere numero di istanze create
        public static int getNumeroIstanze() {
            return contatore;
        }

        // Metodo di confronto
        public boolean isMaggioreDi(Temperatura altra) {
            if (altra == null) {
                System.out.println("Confronto non valido: temperatura nulla.");
                return false;
            }
            return Double.compare(this.valore, altra.valore) > 0;
        }

        // Metodo toString()
        @Override
        public String toString() {
            return String.format("%.2f °C", valore);
        }

        // MAIN con menu CRUD e switch

    }

