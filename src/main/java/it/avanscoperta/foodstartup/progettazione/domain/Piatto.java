package it.avanscoperta.foodstartup.progettazione.domain;

import it.avanscoperta.foodstartup.progettazione.domain.Ricetta;

public class Piatto {

    String intestazione;
    int porzioni; // TODO make it a VO
    Ricetta ricetta; // Così o link?
    int calorie;

    public Piatto(Ricetta ricetta, int porzioni) {
        this.intestazione = ricetta.getNome();
        this.ricetta = ricetta;
        this.porzioni = porzioni;
        this.calorie = ricetta.getCalorie();
    }
}
