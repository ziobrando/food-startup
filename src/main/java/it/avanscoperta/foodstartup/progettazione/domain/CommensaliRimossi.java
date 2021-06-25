package it.avanscoperta.foodstartup.progettazione.domain;

public class CommensaliRimossi {

    private final CenaId cenaId;
    private final int rimossi;
    private final int rimasti;

    public CommensaliRimossi(CenaId cenaId, int rimossi, int rimasti) {
        this.cenaId = cenaId;
        this.rimossi = rimossi;
        this.rimasti = rimasti;
    }

    public CenaId getCenaId() {
        return cenaId;
    }

    public int getRimossi() {
        return rimossi;
    }

    public int getRimasti() {
        return rimasti;
    }
}
