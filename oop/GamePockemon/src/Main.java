import core.Attacco;
import core.Elemento;
import core.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon poke1 = new Pokemon("Pikachu", Elemento.ELETTRO,150);
        Pokemon poke2 = new Pokemon("Squirtle",Elemento.ACQUA,200);

        Pokemon poke3 = new Pokemon(poke1);

        System.out.println(Pokemon.getCountPoke());

        poke1.attacca(Attacco.LEGGERO,poke2);
        System.out.println(poke1.toString());

        poke1.attacca(Attacco.FINAL,poke1);
    }
}
