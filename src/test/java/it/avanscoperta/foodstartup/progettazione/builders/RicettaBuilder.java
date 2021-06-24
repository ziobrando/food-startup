package it.avanscoperta.foodstartup.progettazione.builders;

import it.avanscoperta.foodstartup.progettazione.domain.Ingrediente;
import it.avanscoperta.foodstartup.progettazione.domain.Ricetta;
import org.junit.jupiter.engine.execution.JupiterEngineExecutionContext;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test data builder with a twist
 */
public class RicettaBuilder {
    private String nome;
    private List<Ingrediente> ingredienti;
    private String preparazione;
    private Duration tempo;
    private int calorie;

    public RicettaBuilder cacioEPepe() {
        nome = "Cacio e pepe";
        ingredienti = Arrays.asList(
                new Ingrediente("Rigatoni", 100, "Grammi"),
                new Ingrediente("Pecorino Romano", 30, "Grammi"),
                new Ingrediente("Pepe nero", 10, "Grammi")
        );
        preparazione = "Sai tu come fare.";
        tempo = Duration.of(15, ChronoUnit.MINUTES);
        calorie = 560;
        return this;
    }

    public Ricetta build() {
        return new Ricetta(nome, ingredienti, preparazione, tempo, calorie);
    }
}
