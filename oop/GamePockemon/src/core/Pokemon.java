package core;

public class Pokemon {
    private String nome;
    private Elemento elemento;
    private int livello = 1;
    private int puntiVita;//vita max
    private int salute;// vita che decrementa quando subisce attacco
    private int dannoSubito;
    private Attacco attacco;
    private static int countPoke;
    private int id;


    //costruttore

    public Pokemon(String nome, Elemento elemento, int puntiVita) {
        this(nome,elemento);
        this.puntiVita = puntiVita;
        this.salute = puntiVita;
    }

    public Pokemon(String nome, Elemento elemento) {
        this(nome);
        this.elemento = elemento;
    }
    public Pokemon(String nome) {
        this.nome = nome;
        this.livello = 1;
        countPoke++;
        this.id = countPoke;
    }

    //costruttore di copia
    public Pokemon(Pokemon p){
        this(p.nome, p.elemento,p.puntiVita);
        this.dannoSubito = p.dannoSubito;
        this.attacco = p.attacco;
    }

    //GETTER
    public String getNome() {
        return nome;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public int getLivello() {
        return livello;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public int getSalute() {
        return salute;
    }

    public int getDannoSubito() {
        return dannoSubito;
    }

    public Attacco getAttacco() {
        return attacco;
    }

    public static int getCountPoke() {
        return countPoke;
    }

    public int getId() {
        return id;
    }
    //SETTER

    private void setLivello(int livello) {
        this.livello = livello;
    }
    private void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }
    private void setSalute(int salute) {
        this.salute = salute;
    }
    private void setDannoSubito(int dannoSubito) {
        this.dannoSubito = dannoSubito;
        if (salute > dannoSubito) this.salute -= dannoSubito;
        else this.salute = 0;
    }

    private void setAttacco(Attacco attacco) {
        this.attacco = attacco;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Abilità e comp del Pokemon

    public void attacca(Attacco attacco, Pokemon nemico){
        if(nemico == this){
            System.out.println("Stai attaccando te stesso! Ash Aiuuuuuuuuuuuuuutooooooooooooooo");
            return;
        }
        if (Attacco.LEGGERO == attacco){
            nemico.setDannoSubito(25);

        }else if(Attacco.PESANTE == attacco){
            nemico.setDannoSubito(50);

        }else{
            nemico.setDannoSubito(100);
        }
        System.out.println("HO attacato "+nemico.getNome()+" con un attacco "+attacco);

    }

    @Override
    public String toString() {
        return "Pokemon ---> " +
                "nome='" + this.nome + '\'' +
                ", elemento=" + this.elemento +
                ", livello=" + this.livello +
                ", puntiVita=" + this.puntiVita +
                ", salute=" + this.salute +
                ", dannoSubito=" + this.dannoSubito +
                //", attacco=" + this.attacco +
                ", id=" + this.id +
                ".";
    }

}
