package org.yourcompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
@Test
public void test1() {
assertEquals(3, Calculadora.nombreDigits(100));
}
@Test
public void test2() {
    assertEquals(6, Calculadora.sumaPrimersNumeros(3));
}
@Test
public void test3() {
    assertEquals(120, Calculadora.calcularFactorial(5));
}
@Test
public void test4() {
    assertEquals(14, Calculadora.sumaQuadrats(3));
}
@Test
public void test5() {
    assertEquals(8, Calculadora.calcularPotencia(2, 3));
}
@Test
public void test6() {
    assertEquals(1, Calculadora.nombreDigits(0));
}
}