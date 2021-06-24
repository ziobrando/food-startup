package it.avanscoperta.foodstartup.progettazione.query;

import it.avanscoperta.foodstartup.progettazione.domain.CenaProgettata;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CenaProjection {

    @Autowired
    private CenaSummaryRepository repository;

    @EventHandler
    public void on(CenaProgettata event) {
        CenaSummaryView view = new CenaSummaryView(
                event.getCenaId().toString(),
                event.getLabel(),
                event.getCommensali(),
                event.getPortate(),
                event.getCaloriePerPersona(),
                event.getTempoDiPreparazione()
        );
        repository.save(view);
    }

}
