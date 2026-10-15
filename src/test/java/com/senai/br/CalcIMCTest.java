package com.senai.br;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcIMCTest {

    @Test
    public void deveCalcularIMC() {
        CalcIMC calculadora = new CalcIMC();

        double resultado = calculadora.calcularIMC(70.0, 1.75);

        assertEquals(22.86, resultado, 0.01);
    }
}