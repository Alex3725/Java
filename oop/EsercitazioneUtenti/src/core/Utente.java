package core;

public class Utente {

        // Attributi privati
        private int id;
        private String nome;

        // Variabile statica per contare gli ID
        private static int contatoreID = 0;

        // Costruttore
        public Utente(String nome) {

            if (nome == null || nome.trim().isEmpty()) {
                this.nome = "Sconosciuto";  // valore di default
            } else {
                this.nome = nome.trim();
            }

            contatoreID++;
            this.id = contatoreID;
        }

        // Metodo per mostrare i dati
        public void mostraDati() {
            System.out.println("ID: " + id + ", Nome: " + nome);
        }

        // Metodo statico per restituire il numero di utenti creati
        public static int getNumeroUtentiCreati() {
            return contatoreID;
        }

        // Metodo toString per stampare i dati in formato leggibile
        @Override
        public String toString() {
            return "Utente [ID=" + id + ", Nome=" + nome + "]";
        }


    }


