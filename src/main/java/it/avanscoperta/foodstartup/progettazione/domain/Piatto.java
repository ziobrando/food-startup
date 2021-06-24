package it.avanscoperta.foodstartup.progettazione.domain;

import java.util.Objects;

/**
 * Value Object: Espone qualche comportamento interessante?
 */
public class Piatto {

    private final String intestazione;
    private final int porzioni; // TODO: Shoulde we make it a VO
    private final Ricetta ricetta; // Così o link?
    private final int calorie;

    public Piatto(Ricetta ricetta, int porzioni) {
        this.intestazione = ricetta.getNome();
        this.ricetta = ricetta;
        this.porzioni = porzioni;
        this.calorie = ricetta.getCalorie();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piatto piatto = (Piatto) o;
        return porzioni == piatto.porzioni && calorie == piatto.calorie && intestazione.equals(piatto.intestazione) && ricetta.equals(piatto.ricetta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intestazione, porzioni, ricetta, calorie);
    }
}
