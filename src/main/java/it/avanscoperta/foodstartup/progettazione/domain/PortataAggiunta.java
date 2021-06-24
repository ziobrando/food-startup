package it.avanscoperta.foodstartup.progettazione.domain;

public class PortataAggiunta {
    private final CenaId cenaId;
    private final Ricetta carbonara;
    private final int porzioni;

    public PortataAggiunta(CenaId cenaId, Ricetta carbonara, int porzioni) {
        this.cenaId = cenaId;
        this.carbonara = carbonara;
        this.porzioni = porzioni;
    }

    public CenaId getCenaId() {
        return cenaId;
    }

    public Ricetta getCarbonara() {
        return carbonara;
    }

    public int getPorzioni() {
        return porzioni;
    }
}
