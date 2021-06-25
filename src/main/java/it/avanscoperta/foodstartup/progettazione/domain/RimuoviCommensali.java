package it.avanscoperta.foodstartup.progettazione.domain;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class RimuoviCommensali {

    @TargetAggregateIdentifier
    private final CenaId cenaId;
    private final int commensali;

    public RimuoviCommensali(CenaId cenaId, int commensali) {
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
