package it.avanscoperta.foodstartup.progettazione.domain;

import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.jupiter.api.Test;

public class CenaTest {

    FixtureConfiguration<Cena> fixture = new AggregateTestFixture<Cena>(Cena.class);

    @Test
    void posso_creare_una_cena_da_una_ricetta() {

        // TODO mettiamo una factory o ad un builder
        Ricetta ricetta = new Ricetta("cacio e pepe");
        CenaId cenaId = CenaId.generate();


        ProgettaDaRicetta progettaDaRicetta = new ProgettaDaRicetta(cenaId, ricetta);
        CenaProgettata cenaProgettata = new CenaProgettata(cenaId, ricetta);

        fixture.givenNoPriorActivity()
                .when(progettaDaRicetta)
                .expectEvents(cenaProgettata);

    }




}
