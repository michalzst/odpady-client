package michal.odpadyclient.Objects;

public class Wydruk {
    private Long id;
    private String data;
    private Pojazd nrRejestracyjnyPojazdu;
    private KodyOdpadow kodOpadu;
    private int masa;
    private StaraNowaWaga staraNowaWaga;
    private KontrahentNaWydruku kontrahentNaWydruku;
    private Posiadacz posiadacz;
    private String dodatkoweInformacje;

    public Wydruk(){}

    public String getKontrahentDoGrida(){
        return kontrahentNaWydruku.getNazwaKontrahenta();
    }

    public String getPosiadaczDoGrida(){
        return posiadacz.getNazwa();
    }

    public String getKodDoGrida(){
        return kodOpadu.getKodOdpadu();
    }

    public String getNrRejDoGrida(){
        return nrRejestracyjnyPojazdu.getNrRejestracyjny();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pojazd getNrRejestracyjnyPojazdu() {
        return nrRejestracyjnyPojazdu;
    }

    public void setNrRejestracyjnyPojazdu(Pojazd nrRejestracyjnyPojazdu) {
        this.nrRejestracyjnyPojazdu = nrRejestracyjnyPojazdu;
    }

    public KodyOdpadow getKodOpadu() {
        return kodOpadu;
    }

    public void setKodOpadu(KodyOdpadow kodOpadu) {
        this.kodOpadu = kodOpadu;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public StaraNowaWaga getStaraNowaWaga() {
        return staraNowaWaga;
    }

    public void setStaraNowaWaga(StaraNowaWaga staraNowaWaga) {
        this.staraNowaWaga = staraNowaWaga;
    }

    public KontrahentNaWydruku getKontrahentNaWydruku() {
        return kontrahentNaWydruku;
    }

    public void setKontrahentNaWydruku(KontrahentNaWydruku kontrahentNaWydruku) {
        this.kontrahentNaWydruku = kontrahentNaWydruku;
    }

    public Posiadacz getPosiadacz() {
        return posiadacz;
    }

    public void setPosiadacz(Posiadacz posiadacz) {
        this.posiadacz = posiadacz;
    }

    public String getDodatkoweInformacje() {
        return dodatkoweInformacje;
    }

    public void setDodatkoweInformacje(String dodatkoweInformacje) {
        this.dodatkoweInformacje = dodatkoweInformacje;
    }
}
