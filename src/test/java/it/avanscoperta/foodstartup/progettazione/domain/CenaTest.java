package it.avanscoperta.foodstartup.progettazione.domain;

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

        // TODO mettiamo una factory o ad un builder

        ArrayList<Ingrediente> ingredienti = new ArrayList<>();
                ingredienti.add(new Ingrediente("Rigatoni", 100, "Grammi" ));
                ingredienti.add(new Ingrediente("Pecorino Romano", 30, "Grammi"));
                ingredienti.add(new Ingrediente("Pepe nero", 10, "Grammi"));
                // TODO QB <-- sarà bellissimo rileggerlo fra 2 anni.
        String preparazione = "Sai tu come fare.";
        Duration tempo = Duration.of(15, ChronoUnit.MINUTES);
        int calorie = 560;
        Ricetta ricetta = new Ricetta("cacio e pepe", ingredienti, preparazione, tempo, calorie);
        CenaId cenaId = CenaId.generate();
        int commensali = 2;
        List<Piatto> portate = new ArrayList<Piatto>();
        portate.add(new Piatto(ricetta, commensali));
        String label = "cacio e pepe";

        ProgettaDaRicetta progettaDaRicetta = new ProgettaDaRicetta(cenaId, ricetta, commensali);
        CenaProgettata cenaProgettata = new CenaProgettata(cenaId, ricetta, commensali, portate, tempo, label, calorie);

        fixture.givenNoPriorActivity()
                .when(progettaDaRicetta)
                .expectEvents(cenaProgettata);

    }




}
