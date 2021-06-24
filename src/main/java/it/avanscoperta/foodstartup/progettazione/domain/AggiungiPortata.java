package it.avanscoperta.foodstartup.progettazione.domain;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * Command.
 */
public class AggiungiPortata {
    @TargetAggregateIdentifier
    CenaId cenaId;
    private final Ricetta ricetta;
    private final int porzioni;

    public AggiungiPortata(CenaId cenaId, Ricetta ricetta, int porzioni) {
        this.cenaId = cenaId;
        this.ricetta = ricetta;
        this.porzioni = porzioni;
    }

    public CenaId getCenaId() {
        return cenaId;
    }

    public Ricetta getRicetta() {
        return ricetta;
    }

    public int getPorzioni() {
        return porzioni;
    }
}
