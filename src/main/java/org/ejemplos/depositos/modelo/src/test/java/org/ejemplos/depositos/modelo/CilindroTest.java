package org.ejemplos.depositos.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CilindroTest {
    private static final double DELTA = 0.0001;
    private Cilindro cil;

    @BeforeEach
    void setup() {
        cil = new Cilindro(1.0, 3.0);
    }

    @Test
    void constructorVacio() {
        Cilindro vacio = new Cilindro();
        assertEquals(0.0, vacio.getRadio(), DELTA);
        assertEquals(0.0, vacio.getAltura(), DELTA);
        assertEquals(0.0, vacio.getArea(), DELTA);
        assertEquals(0.0, vacio.getVolumen(), DELTA);
    }

    @Test
    void constructorConParametros() {
        assertEquals(1.0, cil.getRadio(), DELTA);
        assertEquals(3.0, cil.getAltura(), DELTA);
    }

    @Test
    void getRadio() { assertEquals(1.0, cil.getRadio(), DELTA); }

    @Test
    void setRadio() {
        cil.setRadio(2.0);
        assertEquals(2.0, cil.getRadio(), DELTA);
        assertEquals(2 * Math.PI * 2.0 * (2.0 + 3.0), cil.getArea(), DELTA);
        assertEquals(Math.PI * 2.0 * 2.0 * 3.0, cil.getVolumen(), DELTA);
    }

    @Test
    void getAltura() { assertEquals(3.0, cil.getAltura(), DELTA); }

    @Test
    void setAltura() {
        cil.setAltura(5.0);
        assertEquals(5.0, cil.getAltura(), DELTA);
        assertEquals(2 * Math.PI * 1.0 * (1.0 + 5.0), cil.getArea(), DELTA);
        assertEquals(Math.PI * 1.0 * 1.0 * 5.0, cil.getVolumen(), DELTA);
    }

    @Test
    void calcularArea() { assertEquals(25.1327, cil.calcularArea(), DELTA); }

    @Test
    void calcularVolumen() { assertEquals(9.4248, cil.calcularVolumen(), DELTA); }

    @Test
    void getArea() { assertEquals(2 * Math.PI * 1.0 * (1.0 + 3.0), cil.getArea(), DELTA); }

    @Test
    void getVolumen() { assertEquals(Math.PI * Math.pow(1.0, 2) * 3.0, cil.getVolumen(), DELTA); }

    @Test
    void casoDiametro6Altura4() {
        Cilindro deposito = new Cilindro(6.0 / 2, 4.0);
        assertEquals(131.9469, deposito.getArea(), DELTA);
        assertEquals(113.0973, deposito.getVolumen(), DELTA);
    }
}
