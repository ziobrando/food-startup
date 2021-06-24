package it.avanscoperta.foodstartup.progettazione.domain;

import java.util.UUID;

public class CenaId {

    private final String id;

    public CenaId(String id) {
        this.id = id;
    }

    public static CenaId generate() {
        return new CenaId(UUID.randomUUID().toString());
    }

    public String toString() {
        return id;
    }
}
