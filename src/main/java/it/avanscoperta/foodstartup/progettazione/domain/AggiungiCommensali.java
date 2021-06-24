package it.avanscoperta.foodstartup.progettazione.domain;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class AggiungiCommensali {
    @TargetAggregateIdentifier
    private final CenaId cenaId;
    private final int commensali;

    public AggiungiCommensali(CenaId cenaId, int commensali) {
        this.cenaId = cenaId;
        this.commensali = commensali;
    }

    public CenaId getCenaId() {
        return cenaId;
    }

    public int getCommensali() {
        return commensali;
    }
}
