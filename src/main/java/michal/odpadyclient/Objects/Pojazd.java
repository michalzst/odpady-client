package michal.odpadyclient.Objects;

public class Pojazd {
    private Long idPojazdu;
    private String nrRejestracyjny;
    private boolean aktywny;

    public Pojazd(){}

    public Long getIdPojazdu() {
        return idPojazdu;
    }

    public void setIdPojazdu(Long idPojazdu) {
        this.idPojazdu = idPojazdu;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public boolean isAktywny() {
        return aktywny;
    }

    public void setAktywny(boolean aktywny) {
        this.aktywny = aktywny;
    }
}
