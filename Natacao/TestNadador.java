

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste TestNadador.
 *
 * @author  Pedro Hennrique Fernandes Schmidt
 * @version 1.0
 * @since 2020-06-01 04:13PM
 */
public class TestNadador
{
    Nadador nadador = new Nadador();

    /**
     * 
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * 
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testVerificarCategoria1() {
        nadador.setIdade((byte)6);
        assertEquals("Não se enquadra em nenhuma categoria",
                     nadador.verificarCategoria());
    }
    
    @Test
    public void testVerificarCategoria2() {
        nadador.setIdade((byte)8);
        assertEquals("Infantil", nadador.verificarCategoria());
    }
    
    @Test
    public void testVerificarCategoria3() {
        nadador.setIdade((byte)12);
        assertEquals("Juvenil", nadador.verificarCategoria());
    }
    
    @Test
    public void testVerificarCategoria4() {
        nadador.setIdade((byte)27);
        assertEquals("Adulto", nadador.verificarCategoria());
    }
}
