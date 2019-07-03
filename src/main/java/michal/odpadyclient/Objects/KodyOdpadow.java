package michal.odpadyclient.Objects;

public class KodyOdpadow {
    private Long id;
    private String kodOdpadu;
    private String nazwaOdpadu;
    private boolean aktywny;

    public KodyOdpadow() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodOdpadu() {
        return kodOdpadu;
    }

    public void setKodOdpadu(String kodOdpadu) {
        this.kodOdpadu = kodOdpadu;
    }

    public String getNazwaOdpadu() {
        return nazwaOdpadu;
    }

    public void setNazwaOdpadu(String nazwaOdpadu) {
        this.nazwaOdpadu = nazwaOdpadu;
    }

    public boolean isAktywny() {
        return aktywny;
    }

    public void setAktywny(boolean aktywny) {
        this.aktywny = aktywny;
    }
}
