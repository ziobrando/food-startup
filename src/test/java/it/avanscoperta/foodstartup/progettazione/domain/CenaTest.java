package it.avanscoperta.foodstartup.progettazione.domain;

import it.avanscoperta.foodstartup.progettazione.builders.RicettaBuilder;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CenaTest {

    FixtureConfiguration<Cena> fixture = new AggregateTestFixture<Cena>(Cena.class);

    @Test
    void posso_creare_una_cena_da_una_ricetta() {

        Ricetta ricetta = new RicettaBuilder().cacioEPepe().build();
        Duration tempo = ricetta.getTempiDiPreparazione();
        CenaId cenaId = CenaId.generate();
        int commensali = 2;
        List<Piatto> portate = new ArrayList<Piatto>();
        portate.add(Piatto.fromRicetta(ricetta, commensali));
        String label = "cacio e pepe";

        ProgettaDaRicetta progettaDaRicetta = new ProgettaDaRicetta(cenaId, ricetta, commensali);
        CenaProgettata cenaProgettata = new CenaProgettata(cenaId, ricetta, commensali, portate, tempo, ricetta.getNome(), ricetta.getCalorie());

        fixture.givenNoPriorActivity()
                .when(progettaDaRicetta)
                .expectEvents(cenaProgettata);

    }




}
