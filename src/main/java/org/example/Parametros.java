package org.example;

public class Parametros {
    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String unidadeBanco;
    private String nomeGerente;

    public String getUnidadeBanco() {
        return unidadeBanco;
    }

    public void setUnidadeBanco(String unidadeBanco) {
        this.unidadeBanco = unidadeBanco;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }
}
