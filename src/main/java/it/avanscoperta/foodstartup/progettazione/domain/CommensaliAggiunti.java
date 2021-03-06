package it.avanscoperta.foodstartup.progettazione.domain;

/**
 * Concetto un po' 'discutibile' in questo caso: l'evento è più ricco di informazione rispetto al comando
 */
public class CommensaliAggiunti {
    private final CenaId cenaId;
    private final int aggiunti;
    private final int totaleCommensali;

    /**
     *
     * @param cenaId la cena a cui aggiungere commensali
     * @param aggiunti il n° di commensali aggiunti
     * @param totaleCommensali il totale di commensali risultanti.
     */
    public CommensaliAggiunti(CenaId cenaId, int aggiunti, int totaleCommensali) {
        this.cenaId = cenaId;
        this.aggiunti = aggiunti;
        this.totaleCommensali = totaleCommensali;
    }

    public CenaId getCenaId() {
        return cenaId;
    }

    public int getAggiunti() {
        return aggiunti;
    }

    public int getTotaleCommensali() {
        return totaleCommensali;
    }


}
