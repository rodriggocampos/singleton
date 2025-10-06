package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {
    @Test
    public void deveRetornarUnidadeBanco() {
        Parametros.getInstance().setUnidadeBanco("001");
        assertEquals("001", Parametros.getInstance().getUnidadeBanco());
    }

    @Test
    public void deveRetornarNomeGerente() {
        Parametros.getInstance().setNomeGerente("João da Silva");
        assertEquals("João da Silva", Parametros.getInstance().getNomeGerente());
    }
}