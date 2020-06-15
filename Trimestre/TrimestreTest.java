

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste TrimestreTest.
 *
 * @author  PedroSchmidt
 * @version 1.0
 * @since 2020-06-01 14:02PM
 */
public class TrimestreTest {
    /**
     * Construtor default para a classe de teste TrimestreTest
     */
    public TrimestreTest() {
    }

    /**
     * 
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
    }

    /**
     * 
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    }
    
    /**
     * Testa o método usado para calcular qual é o trimestre do nascimento
     */
    @Test
    public void testCalcularTrimestreDoNascimento() {
        Trimestre trimestre = new Trimestre();
        trimestre.setMesDeNascimento((byte)5);
        assertEquals(2,trimestre.calcularTrimestreDoNascimento());
        
        trimestre.setMesDeNascimento((byte)2);
        assertEquals(1,trimestre.calcularTrimestreDoNascimento());
        
        trimestre.setMesDeNascimento((byte)7);
        assertEquals(3,trimestre.calcularTrimestreDoNascimento());
        
        trimestre.setMesDeNascimento((byte)10);
        assertEquals(4,trimestre.calcularTrimestreDoNascimento());
    }
}
