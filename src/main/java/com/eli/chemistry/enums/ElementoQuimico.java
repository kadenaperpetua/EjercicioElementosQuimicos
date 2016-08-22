package com.eli.chemistry.enums;

public enum ElementoQuimico {
    HIDROGENO("hidrogeno", "H", 1, SerieQuimica.NOMETAL),
    HELIO("helio", "He", 2, SerieQuimica.GAS),
    LITIO("hitio", "Li", 3, SerieQuimica.ALCALINO),
    BERILIO("berilio", "Be", 4, SerieQuimica.ALCALINOTERREO),
    BORO("boro", "B", 5, SerieQuimica.METALOIDE),
    CARBONO("carbono", "C", 6, SerieQuimica.NOMETAL),
    NITROGENO("nitrogeno", "N", 7, SerieQuimica.NOMETAL),
    OXIGENO("oxigeno", "O", 8, SerieQuimica.NOMETAL),
    FLUOR("fluor", "F", 9, SerieQuimica.HALOGENO),
    ALUMINIO("Aluminio", "Al", 13, SerieQuimica.METAL),
    COBRE("Cobre", "C", 19, SerieQuimica.TRANSICION);

    private String nombre;
    private String simbolo;
    private int numeroAtomico;
    private SerieQuimica serieQuimica;


    ElementoQuimico(String nombre, String simbolo, int numeroAtomico, SerieQuimica serieQuimica) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.numeroAtomico = numeroAtomico;
        this.serieQuimica = serieQuimica;
    }

    public static String getSimbolo(String nombre) {
        nombre = nombre.toUpperCase();
        try {
            return ElementoQuimico.valueOf(nombre).simbolo;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("No se ha encontrado el elemento");
        }
    }
    
}
