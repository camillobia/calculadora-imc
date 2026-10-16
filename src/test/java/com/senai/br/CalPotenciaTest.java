package com.senai.br;

import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
 
class CalcPotenciaTest {
 
    @Test
    void calculaPotenciaComTensaoECorrenteInformadas() {
        CalcPotencia calculadora = new CalcPotencia();
 
        assertEquals(1100.0, calculadora.calcularPotencia(220.0, 5.0), 0.0);
    }
}