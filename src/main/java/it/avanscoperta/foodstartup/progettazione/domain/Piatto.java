package it.avanscoperta.foodstartup.progettazione.domain;

import java.util.Objects;

/**
 * Value Object: Espone qualche comportamento interessante?
 */
public class Piatto {

    private final int porzioni; // TODO: Shoulde we make it a VO
    private final Ricetta ricetta; // Così o link?
    private final int calorie;
    private final String nome;

    public Piatto(String nome, Ricetta ricetta, int porzioni, int calorie) {
        this.nome = nome;
        this.ricetta = ricetta;
        this.porzioni = porzioni;
        this.calorie = calorie;
    }

    /**
     * Factory method che fa qualche piccola magia di superficie.
     * @param ricetta
     * @param porzioni
     * @return
     */
    public static Piatto fromRicetta(Ricetta ricetta, int porzioni) {
        return new Piatto(
                ricetta.getNome(),
                ricetta,
                porzioni,
                ricetta.getCalorie()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piatto piatto = (Piatto) o;
        return porzioni == piatto.porzioni && calorie == piatto.calorie && nome.equals(piatto.nome) && ricetta.equals(piatto.ricetta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, porzioni, ricetta, calorie);
    }
}
