package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3), "2 + 3 deve ser 5");
    }

    @Test
    void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrair(3, 2), "3 - 2 deve ser 1");
    }

    @Test
    void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3), "2 * 3 deve ser 6");
    }

    @Test
    void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3), "6 / 3 deve ser 2");
    }

    @Test
    void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(1, 0);
        }, "Dividir por zero deve lançar IllegalArgumentException");
    }
}
