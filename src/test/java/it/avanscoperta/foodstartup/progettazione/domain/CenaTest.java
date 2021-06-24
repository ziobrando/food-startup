package it.avanscoperta.foodstartup.progettazione.domain;

import it.avanscoperta.foodstartup.progettazione.builders.RicettaBuilder;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CenaTest {

    FixtureConfiguration<Cena> fixture = new AggregateTestFixture<Cena>(Cena.class);

    Ricetta ricetta, cacioEPepe, carbonara;
    private CenaId cenaId;
    private int commensali;
    private List<Piatto> portate;

    @BeforeEach
    public void setUp() {
        ricetta = new RicettaBuilder().cacioEPepe().build();
        cacioEPepe = new RicettaBuilder().cacioEPepe().build();
        carbonara = new RicettaBuilder().carbonara().build();
        cenaId = CenaId.generate();
        commensali = 2;
    }


    @Test
    @DisplayName("Cena monopiatto")
    void posso_creare_una_cena_da_una_ricetta() {

        portate = Arrays.asList(Piatto.fromRicetta(ricetta, commensali));
        String label = "cacio e pepe";

        ProgettaDaRicetta progettaDaRicetta = new ProgettaDaRicetta(cenaId, ricetta, commensali);
        CenaProgettata cenaProgettata = new CenaProgettata(cenaId, ricetta, commensali, portate, ricetta.getTempoPreparazione(), ricetta.getNome(), ricetta.getCalorie());

        fixture.givenNoPriorActivity()
                .when(progettaDaRicetta)
                .expectEvents(cenaProgettata);
    }

    @Test
    void posso_aggiungere_portate() {

        CenaProgettata cenaProgettata = new CenaProgettata(cenaId, cacioEPepe, commensali, portate, ricetta.getTempoPreparazione(), ricetta.getNome(), ricetta.getCalorie());
        int porzioni = 4;
        AggiungiPortata aggiungiPortata = new AggiungiPortata(cenaId, carbonara, porzioni);
        PortataAggiunta portataAggiunta = new PortataAggiunta(cenaId, carbonara, porzioni);

        fixture.given(cenaProgettata)
                .when(aggiungiPortata)
                .expectEvents(portataAggiunta);
    }






}
