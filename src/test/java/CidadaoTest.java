import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CidadaoTest {

    Cidadao cidadao;

    @BeforeEach
    void setUp(){
        cidadao = new Cidadao();
    }

    @Test
    void naoDeveSetarEstadoVazio(){
        cidadao.setEstadoCivil(null);
        assertEquals(EstadoCivilSolteiro.getInstance(), cidadao.getEstadoCivil());
    }

    // Cidadao solteiro

    @Test
    void naoDeveSepararCidadaoSolteiro(){
        assertFalse(cidadao.separar());
    }

    @Test
    void naoDeveDivorciarCidadaoSolteiro(){
        assertFalse(cidadao.divorciar());
    }

    @Test
    void naoDeveEnviuvarCidadaoSolteiro(){
        assertFalse(cidadao.enviuvar());
    }

    @Test
    void deveCasarCidadaoSolteiro(){
        assertTrue(cidadao.casar());
        assertEquals(EstadoCivilCasado.getInstance(), cidadao.getEstadoCivil());
    }

    // Cidadao casado

    @Test
    void naoDeveCasarCidadaoCasado(){
        cidadao.casar();
        assertFalse(cidadao.casar());
    }

    @Test
    void deveSepararCidadaoCasado(){
        cidadao.casar();
        assertTrue(cidadao.separar());
        assertEquals(EstadoCivilSeparado.getInstance(), cidadao.getEstadoCivil());
    }

    @Test
    void deveDivorciarCidadaoCasado(){
        cidadao.casar();
        assertTrue(cidadao.divorciar());
        assertEquals(EstadoCivilDivorciado.getInstance(), cidadao.getEstadoCivil());
    }

    @Test
    void deveEnviuvarCidadaoCasado(){
        cidadao.casar();
        assertTrue(cidadao.enviuvar());
        assertEquals(EstadoCivilViuvo.getInstance(), cidadao.getEstadoCivil());
    }

    // Cidadao Separado


    @Test
    void naoDeveSepararCidadaoSeparado(){
        cidadao.setEstadoCivil(EstadoCivilSeparado.getInstance());
        assertFalse(cidadao.separar());
    }

    @Test
    void naoDeveCasarCidadaoSeparado(){
        cidadao.setEstadoCivil(EstadoCivilSeparado.getInstance());
        assertFalse(cidadao.casar());
    }

    @Test
    void naoDeveEnviuvarCidadaoSeparado(){
        cidadao.setEstadoCivil(EstadoCivilSeparado.getInstance());
        assertFalse(cidadao.enviuvar());
    }

    @Test
    void deveDivorciarCidadaoSeparado(){
        cidadao.setEstadoCivil(EstadoCivilSeparado.getInstance());
        assertTrue(cidadao.divorciar());
        assertEquals(EstadoCivilDivorciado.getInstance(), cidadao.getEstadoCivil());
    }

    // Cidadao divorciado

    @Test
    void naoDeveDivorciarCidadaoDivorciado(){
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        assertFalse(cidadao.divorciar());
    }

    @Test
    void naoDeveSepararCidadaoDivorciado(){
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        assertFalse(cidadao.separar());
    }

    @Test
    void naoDeveEnviuvarCidadaoDivorciado(){
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        assertFalse(cidadao.enviuvar());
    }

    @Test
    void deveCasarCidadaoDivorciado(){
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        assertTrue(cidadao.casar());
        assertEquals(EstadoCivilCasado.getInstance(), cidadao.getEstadoCivil());
    }

    // Cidadao viuvo

    @Test
    void naoDeveEnviuvarCidadaoViuvo(){
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        assertFalse(cidadao.enviuvar());
    }

    @Test
    void naoDeveSepararCidadaoViuvo(){
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        assertFalse(cidadao.separar());
    }

    @Test
    void naoDeveDivorciarCidadaoViuvo(){
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        assertFalse(cidadao.divorciar());
    }

    @Test
    void deveCasarCidadaoViuvo(){
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        assertTrue(cidadao.casar());
        assertEquals(EstadoCivilCasado.getInstance(), cidadao.getEstadoCivil());
    }
}
