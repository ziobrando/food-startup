package it.avanscoperta.foodstartup.progettazione.domain;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * Command per creare una cena a partire da una ricetta.
 */
public class ProgettaDaRicetta {

    @TargetAggregateIdentifier
    CenaId cenaId;
    private final Ricetta ricetta;

    public ProgettaDaRicetta(CenaId cenaId, Ricetta ricetta) {
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
