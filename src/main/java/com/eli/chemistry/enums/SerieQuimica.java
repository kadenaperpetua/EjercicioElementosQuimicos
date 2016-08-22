package com.eli.chemistry.enums;

public enum SerieQuimica {
    METAL("Metal"),
    NOMETAL("No Metal"),
    METALOIDE("Metaloide"),
    TRANSICION("Metal de transición"),
    ALCALINO("Alcalino"),
    ALCALINOTERREO("Alcalinotérreo"),
    HALOGENO("Halógeno"),
    GAS("Gas noble");

    private String serie;

    SerieQuimica(String serie) {
        this.serie = serie;
    }
    public String getSerie() {
        return serie;
    }
}
