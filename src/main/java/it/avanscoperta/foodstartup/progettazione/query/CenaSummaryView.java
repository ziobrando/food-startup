package it.avanscoperta.foodstartup.progettazione.query;

import it.avanscoperta.foodstartup.progettazione.domain.Piatto;
import org.springframework.data.annotation.Id;

import java.time.Duration;
import java.util.List;

/**
 * Questo mi serve sostanzialmente per decidere se procedere con l'acquisto o se aggiungere altre portate.
 * Siamo all'inizio del ciclo di progettazione.
 */
public class CenaSummaryView {

    @Id
    String cenaId; // Principalmente pigrizia, non ho opinioni fortissime in merito.
    String label;
    int commensali; // persone che si siedono a tavola.
    List<Piatto> portate;

    // bastardo futurista
    int caloriePerPersona;
    Duration tempoDiPreparazione;

    // TODO: chiarire se serve la data?

    /**
     * Qui si tratta solo di una struttura dati, l'utilità di avere un costruttore è un po' meno forte...
     * @param cenaId
     * @param label
     * @param commensali
     * @param portate
     * @param caloriePerPersona
     * @param tempoDiPreparazione
     */
    public CenaSummaryView(String cenaId, String label, int commensali, List<Piatto> portate, int caloriePerPersona, Duration tempoDiPreparazione) {
        this.cenaId = cenaId;
        this.label = label;
        this.commensali = commensali;
        this.portate = portate;
        this.caloriePerPersona = caloriePerPersona;
        this.tempoDiPreparazione = tempoDiPreparazione;
    }
}
