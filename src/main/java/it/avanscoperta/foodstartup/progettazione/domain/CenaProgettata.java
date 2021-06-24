package it.avanscoperta.foodstartup.progettazione.domain;

public class CenaProgettata {
    private final CenaId cenaId;
    private final Ricetta ricetta;

    public CenaProgettata(CenaId cenaId, Ricetta ricetta) {
        this.cenaId = cenaId;
        this.ricetta = ricetta;
    }

    public CenaId getCenaId() {
        return cenaId;
    }

    public Ricetta getRicetta() {
        return ricetta;
    }
}
