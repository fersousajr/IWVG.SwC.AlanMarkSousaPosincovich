package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void setUp() throws Exception {
        fraction = new Fraction(2, 3);
    }

    @Test
    public final void testFractionIntInt() {
        assertEquals(2, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    public final void testFraction() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public final void testGetNumerator() {
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    public final void testGetDenominator() {
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    public final void testDecimal() {
        assertEquals(2.0/3, fraction.decimal(), 10e-5);
    }

}
