import javax.imageio.spi.ServiceRegistry;

public class SmartDevice {
    private String nomeDispositivo;
    private int codiceIdentificativo;
    private boolean statoAcceso;
    private modalitaFunzionamento funz;
    private String modalita;

    private Integer livelloBatteria;


    private static int contatoreDispositivi;

    private final int MAX_BATTERIA = 100;

    public SmartDevice(String nomeDispositivo, boolean statoAcceso, modalitaFunzionamento modalita, Integer livelloBateria) {
        this.nomeDispositivo = nomeDispositivo;
        this.statoAcceso = statoAcceso;
        this.livelloBatteria = livelloBateria;
        this.funz = modalita;
        trySetModalita(modalita);

        this.codiceIdentificativo = contatoreDispositivi;
        contatoreDispositivi++;
    }

    /**
     *
     * livelloBatteria = null
     *
     * @param nomeDispositivo
     * @param statoAcceso
     *
     *
     *
     *
     */
    public SmartDevice(String nomeDispositivo, boolean statoAcceso, modalitaFunzionamento modalita){
        this(nomeDispositivo,statoAcceso,modalita,null);
    }
    //costructor copia
    public SmartDevice(SmartDevice copia){
        this(copia.nomeDispositivo, copia.statoAcceso,copia.funz,copia.livelloBatteria);
    }



    //try sett

    public boolean trySetNomeDispositivo(String nomeDispositivo){
        if (nomeDispositivo.isBlank()){
            System.out.println("il nome è vuoto");
            return false;
        }
        setNomeDispositivo(nomeDispositivo);
        return true;
    }
    public boolean trySetModalita(modalitaFunzionamento modalita){
        switch (modalita){
            case modalitaFunzionamento.Eco ->{
                setModalita("modalita basso consumo");
                return true;
            }
            case modalitaFunzionamento.Performance -> {
                setModalita("massima potenza");
                return true;
            }
            case modalitaFunzionamento.Standby -> {
                setModalita("dispositivo acceso ma inattivo");
                return true;
            }
            case modalitaFunzionamento.Manuale -> {
                setModalita("controllato direttamente dall’utente");
                return true;
            }

            default -> {
                return false;
            }


        }
    }
    //sett


    private void setNomeDispositivo(String nomeDispositivo) {
        this.nomeDispositivo = nomeDispositivo;
    }

    private void setCodiceIdentificativo(int codiceIdentificativo) {
        this.codiceIdentificativo = codiceIdentificativo;
    }

    private void setStatoAcceso(boolean statoAcceso) {
        this.statoAcceso = statoAcceso;
    }

    private void setLivelloBatteria(Integer livelloBateria) {
        this.livelloBatteria = livelloBateria;
    }

    private void setModalita(String modalita) {
        this.modalita = modalita;
    }

    //gett
    public String getNomeDispositivo() {
        return nomeDispositivo;
    }

    public int getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public boolean isStatoAcceso() {
        return statoAcceso;
    }

    public Integer getLivelloBatteria() {
        return livelloBatteria;
    }


    public static int getContatoreDispositivi() {
        return contatoreDispositivi;
    }

    public int getMAX_BATTERIA() {
        return MAX_BATTERIA;
    }

    public String getModalita() {
        return modalita;
    }

    private boolean isNotCollegata(){
        return this.livelloBatteria != null;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "nomeDispositivo='" + nomeDispositivo + '\'' +
                ", codiceIdentificativo=" + codiceIdentificativo +
                ", statoAcceso=" + statoAcceso +
                ", modalita='" + modalita + '\'' +
                ", livelloBatteria=" + (isNotCollegata() ? this.livelloBatteria : "Il dispositivo e collegato") +
                ", MAX_BATTERIA=" + MAX_BATTERIA +
                '}';
    }
}
