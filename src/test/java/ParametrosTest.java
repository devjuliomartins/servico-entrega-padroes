import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarEmpresa() {
        Parametros.getInstance().setNomeEmpresa("AvaLanches");
        assertEquals("AvaLanches", Parametros.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarCnpjEmpresa() {
        Parametros.getInstance().setCnpj("00.000.000/0001-00");
        assertEquals("00.000.000/0001-00", Parametros.getInstance().getCnpj());
    }

}