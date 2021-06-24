package it.avanscoperta.foodstartup.progettazione.domain;

import java.time.Duration;
import java.util.List;

public class CenaProgettata {
    private CenaId cenaId;
    private Ricetta ricetta;
    private int commensali;
    private List<Piatto> portate;
    private Duration tempoDiPreparazione;
    private String label;
    private int caloriePerPersona;

    public CenaProgettata(CenaId cenaId, Ricetta ricetta, int commensali, List<Piatto> portate, Duration tempoDiPreparazione, String label, int caloriePerPersona) {
        this.cenaId = cenaId;
        this.ricetta = ricetta;
        this.commensali = commensali;
        this.portate = portate;
        this.tempoDiPreparazione = tempoDiPreparazione;
        this.label = label;
        this.caloriePerPersona = caloriePerPersona;
    }


    public CenaId getCenaId() {
        return cenaId;
    }

    public Ricetta getRicetta() {
        return ricetta;
    }

    public String getLabel() {
        return label;
    }

    public int getCommensali() {
        return commensali;
    }

    public List<Piatto> getPortate() {
        return portate;
    }

    public int getCaloriePerPersona() {
        return this.caloriePerPersona;
    }

    public Duration getTempoDiPreparazione() {
        return this.tempoDiPreparazione;
    }
}
