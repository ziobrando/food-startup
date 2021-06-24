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
    private final Duration tempiDiPreparazione; // TODO Rivelare il segreto ma non subito.
    private final int calorie;

    public Ricetta(String nome, List<Ingrediente> ingredienti, String preparazione, Duration tempiDiPreparazione, int calorie) {
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.preparazione = preparazione;
        this.tempiDiPreparazione = tempiDiPreparazione;
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

    public Duration getTempiDiPreparazione() {
        return tempiDiPreparazione;
    }

    public int getCalorie() {
        return calorie;
    }
}
