package it.avanscoperta.foodstartup.progettazione.domain;


import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.Arrays;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

/**
 * Il nostro aggregato per la cena che progettiamo.
 */
@Aggregate
public class Cena {

    @AggregateIdentifier
    private CenaId cenaId;
    private int commensali;

    private Cena() {}


    @CommandHandler
    public Cena(ProgettaDaRicetta command) {
        // Guard Conditions?

        apply(new CenaProgettata(
                command.getCenaId(),
                command.getRicetta(),
                command.getCommensali(),
                Arrays.asList(Piatto.fromRicetta(command.getRicetta(), command.getCommensali())),
                command.getRicetta().getTempoPreparazione(),
                command.getRicetta().getNome(),
                command.getRicetta().getCalorie()
        ));
    }

    @EventSourcingHandler
    public void handle(CenaProgettata event) {
        // Qui copio lo stato ricevuto e non faccio domande.
        this.cenaId = event.getCenaId();
        this.commensali = event.getCommensali();
    }

    @CommandHandler
    public void aggiungiPortata(AggiungiPortata command) {
        // Guards?

        apply(new PortataAggiunta(
                command.getCenaId(), command.getRicetta(), command.getPorzioni()
        ));

    }

    // FIXME: piccola trappolina di ES: il comportamento è testato solo se verifichiamo l'azione complementare.

    @CommandHandler
    public void aggiungiCommensali(AggiungiCommensali command) {
        // guards? ... c'è qualche limite che NON stiamo considerando?
        int totaleCommensali = this.commensali + command.getCommensali();
        apply(new CommensaliAggiunti(
                command.getCenaId(),
                command.getCommensali(),
                totaleCommensali
        ));
    }

    @EventSourcingHandler
    public void handle(CommensaliAggiunti event) {
        // TODO: di questa dobbiamo parlare.
        this.commensali = event.getTotaleCommensali();
    }



}
