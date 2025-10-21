import core.Pockemon;
import core.Elemento;

public class Main {
    public static void main(String[] args) {
        Pockemon pkm = new Pockemon("bulbasaur", Elemento.ERBA);
        Pockemon pkm2 = new Pockemon("bulbasaur", Elemento.FUOCO);



        System.out.println(pkm.getId());
        System.out.println(pkm2.getId());

        System.out.println(Pockemon.QuantitaPokemonCreati());//richiamato dalla classe non dall oggetto

        pkm.attacco(pkm2);

        System.out.println("pkm"+pkm.getSalute());
        System.out.println("pkm2"+pkm2.getSalute());
    }
}
