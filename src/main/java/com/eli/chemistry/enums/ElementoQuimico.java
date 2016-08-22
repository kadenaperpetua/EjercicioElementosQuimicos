package com.eli.chemistry.enums;

public enum ElementoQuimico {
    HIDROGENO("Hidrógeno","H",1,SerieQuimica.NOMETAL),
    HELIO("Helio","He",2, SerieQuimica.GAS),
    LITIO("Litio","Li",3, SerieQuimica.ALCALINO),
    BERILIO("Berilio","Be",4,SerieQuimica.ALCALINOTERREO),
    BORO("Boro","B",5,SerieQuimica.METALOIDE),
    CARBONO("Carbono","C",6,SerieQuimica.NOMETAL),
    NITROGENO("Nitrógeno","N",7,SerieQuimica.NOMETAL),
    OXIGENO("Oxígeno","O",8, SerieQuimica.NOMETAL),
    FLUOR("Flúor","F",9, SerieQuimica.HALOGENO),
    ALUMINIO("Aluminio","Al",13, SerieQuimica.METAL),
    COBRE("Cobre","C",19,SerieQuimica.TRANSICION);

    private String nombre;
    private String simbolo;
    private int numeroAtomico;
    private SerieQuimica serieQuimica;

    ElementoQuimico(String nombre, String simbolo, int numeroAtomico, SerieQuimica serieQuimica) {
        this.nombre=nombre;
        this.simbolo=simbolo;
        this.numeroAtomico=numeroAtomico;
        this.serieQuimica=serieQuimica;
    }

    
}
