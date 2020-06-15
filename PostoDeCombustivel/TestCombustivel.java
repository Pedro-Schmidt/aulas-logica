

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste TestCombustivel.
 *
 * @author  Pedro Hennrique Fernandes Schmidt
 * @version 1.0
 * @since 2020-06-01 03:31PM
 */
public class TestCombustivel
{
    
    Combustivel combustivel = new Combustivel();
    
    /**
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
    }

    /**
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCalcularValorAPagarGasolina() {
        assertEquals(44.9, combustivel.calcularValorAPagar((byte)1, 10),0.001);
    }
    
    @Test
    public void testCalcularValorAPagarAlcool() {
        assertEquals(36.8, combustivel.calcularValorAPagar((byte)2, 10),0.001);
    }
    
    @Test
    public void testCalcularValorAPagarDiesel() {
        assertEquals(37.1, combustivel.calcularValorAPagar((byte)3, 10),0.001);
    }
}
