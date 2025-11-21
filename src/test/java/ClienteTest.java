
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Observable;

import static org.junit.Assert.*;


class ClienteTest {

    Cliente cliente;
    Observable pedido;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Julio");
        pedido = new Observable();
    }

    @Test
    void deveReceberUmaMensagem() {
        cliente.update(pedido, "Pedido aceito");

        assertEquals(1, cliente.getMensagensRecebidas().size());
        assertEquals("Pedido aceito", cliente.getMensagensRecebidas().get(0));
    }

    @Test
    void deveArmazenarVariasMensagens() {
        cliente.update(pedido, "Pedido aceito");
        cliente.update(pedido, "Saiu para entrega");
        cliente.update(pedido, "Pedido entregue");

        assertEquals(3, cliente.getMensagensRecebidas().size());
        assertEquals("Pedido entregue", cliente.getMensagensRecebidas().get(2));
    }

    @Test
    void deveReceberMensagemMesmoComObservableNulo() {
        cliente.update(null, "Mensagem teste");

        assertEquals(1, cliente.getMensagensRecebidas().size());
        assertEquals("Mensagem teste", cliente.getMensagensRecebidas().get(0));
    }
}