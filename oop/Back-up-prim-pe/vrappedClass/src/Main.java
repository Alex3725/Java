public class Main {
    public static void main(String[] args) {


        System.out.println(Operazioni.SOMMA.esegui(3,2));

        String nome1 = "Paolo";
        String nome2 = "paolo";

        if (nome1.equalsIgnoreCase(nome2))//anche se ci sono lettere con maiuscola ritornera true
            System.out.println("uguali");
        else System.out.println("diversi");

        System.out.println(Operazioni.StatoOrdine.SPEDITO.getDescrizione());

    }
}
