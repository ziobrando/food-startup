package it.avanscoperta.foodstartup.progettazione.domain;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * Command per creare una cena a partire da una ricetta.
 */
public class ProgettaDaRicetta {

    @TargetAggregateIdentifier
    CenaId cenaId;
    private final Ricetta ricetta;
    private final int commensali;

    public ProgettaDaRicetta(CenaId cenaId, Ricetta ricetta, int commensali) {

        this.cenaId = cenaId;
        this.ricetta = ricetta;
        this.commensali = commensali;
    }

    public CenaId getCenaId() {
        return cenaId;
    }

    public Ricetta getRicetta() {
        return ricetta;
    }

    public int getCommensali() {
        return commensali;
    }
}
