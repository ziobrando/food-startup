package it.avanscoperta.foodstartup.progettazione.query;


import it.avanscoperta.foodstartup.progettazione.builders.RicettaBuilder;
import it.avanscoperta.foodstartup.progettazione.domain.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Test su quello che mi serve vedere del read model della cena che sto progettando.
 */
@SpringBootTest
class TestCenaProjection {

    @Autowired
    CenaProjection projection = new CenaProjection();

    @Autowired
    CenaSummaryRepository repository;

    @Test
    void ho_un_riassunto_su_cena_progettata() {
        // Given
        ArrayList<Ingrediente> ingredienti = new ArrayList<>();
        ingredienti.add(new Ingrediente("Rigatoni", 100, "Grammi" ));
        ingredienti.add(new Ingrediente("Pecorino Romano", 30, "Grammi"));
        ingredienti.add(new Ingrediente("Pepe nero", 10, "Grammi"));
        // TODO QB <-- sarà bellissimo rileggerlo fra 2 anni.
        String preparazione = "Sai tu come fare.";
        Duration tempo = Duration.of(15, ChronoUnit.MINUTES);
        int calorie = 560;
        int commensali = 2;
        //Ricetta ricetta = new Ricetta("Cacio e Pepe", ingredienti, preparazione, tempo, calorie);
        Ricetta ricetta = new RicettaBuilder().cacioEPepe().build();

        List<Piatto> portate = Arrays.asList(Piatto.fromRicetta(ricetta, commensali));

        CenaId cenaId = CenaId.generate();
        CenaProgettata cenaProgettata = new CenaProgettata(cenaId, ricetta, commensali, portate,tempo, "Cacio e Pepe", calorie );

        // When
        projection.on(cenaProgettata);

        // Then
        CenaSummaryView found = repository.findById(cenaId.toString()).get();

        assertEquals("Cacio e Pepe", found.label);

    }






}
