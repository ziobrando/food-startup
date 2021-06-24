package it.avanscoperta.foodstartup.progettazione.domain;

import java.time.Duration;
import java.util.List;

/*
 * Probabilmente un Value Object qua
 */
public class Ricetta {

    private final String nome;
    private final List<Ingrediente> ingredienti;
    private final String preparazione;
    private final Duration tempoPreparazione; // TODO Rivelare il segreto ma non subito.
    private final int calorie;

    public Ricetta(String nome, List<Ingrediente> ingredienti, String preparazione, Duration tempoPreparazione, int calorie) {
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.preparazione = preparazione;
        this.tempoPreparazione = tempoPreparazione;
        this.calorie = calorie;
    }

    public String getNome() {
        return nome;
    }

    public List<Ingrediente> getIngredienti() {
        return ingredienti;
    }

    public String getPreparazione() {
        return preparazione;
    }

    public Duration getTempoPreparazione() {
        return tempoPreparazione;
    }

    public int getCalorie() {
        return calorie;
    }
}
