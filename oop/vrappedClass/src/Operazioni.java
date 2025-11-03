public enum Operazioni {

    SOMMA {
        @Override
        public int esegui(int a, int b) {
            return a + b;
        }
    },
    SOTTRAZIONE {
        @Override
        public int esegui(int a, int b) {
            return a - b;
        }
    },
    MOLTIPLICAZIONE {
        @Override
        public int esegui(int a, int b) {
            return a * b;
        }
    };

    public enum StatoOrdine {
        IN_ATTESA("Ordine ricevuto, in attesa di elaborazione"),
        IN_LAVORAZIONE("Ordine in lavorazione"),
        SPEDITO("Ordine spedito"),
        CONSEGNATO("Ordine consegnato");

        private final String descrizione;

        StatoOrdine(String descrizione) {
            this.descrizione = descrizione;
        }

        public String getDescrizione() {
            return descrizione;
        }
    }
    // Metodo astratto che ogni costante deve implementare
    public abstract int esegui(int a, int b);

}
