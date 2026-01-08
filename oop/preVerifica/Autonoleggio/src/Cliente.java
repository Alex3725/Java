import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cognome;
    private String codiceFiscale;// (String max 16 caratteri)

    public Cliente(String nome, String cognome, String codiceFiscale) {
        isNotNullNomeCognomeCodiceFiscale(nome,cognome,codiceFiscale);
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale =  checkCodiceFiscale(codiceFiscale);
    }
    public Cliente(Cliente copy){
        this(copy.nome, copy.cognome, copy.codiceFiscale);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    private void isNotNullNomeCognomeCodiceFiscale(String nome, String cognome, String codiceFiscale){
        if (nome.isEmpty() || cognome.isEmpty() || codiceFiscale.isEmpty())throw new Inot
    }
    private String checkCodiceFiscale(String codiceFiscale){
        Scanner sc = new Scanner(System.in);
        while (true){
            if (codiceFiscale.length() == 16){
                System.out.println("codice fiscale non valido!!");
                codiceFiscale = sc.nextLine();
                continue;
            }
            return codiceFiscale;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';

    }
}
