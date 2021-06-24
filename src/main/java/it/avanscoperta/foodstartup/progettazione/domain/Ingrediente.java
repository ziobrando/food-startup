package it.avanscoperta.foodstartup.progettazione.domain;

public class Ingrediente {
    private final String rigatoni;
    private final int quantitaPerPersona;
    private final String grammi;
    String nome;

    public Ingrediente(String rigatoni, int quantitaPerPersona, String grammi) {
        this.rigatoni = rigatoni;
        this.quantitaPerPersona = quantitaPerPersona;
        this.grammi = grammi;
    }
    //TODO il resto della trappola.

}
