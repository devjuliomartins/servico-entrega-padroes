import PedidoStatus.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

//  Pendente

    @Test
    public void naoDeveAceitarPedidoEmAndamento() {
        pedido.setEstado(PedidoEstadoEmAndamento.getInstance());
        assertFalse(pedido.pendente());
    }

    @Test
    public void deveEntregarPedidoEstadoEmAndamento() {
        pedido.setEstado(PedidoEstadoEmAndamento.getInstance());
        assertTrue(pedido.entregar());
        Assert.assertEquals(PedidoEstadoSaiuEntrega.getInstance(), pedido.getEstado());
    }

//  Saiu entrega

    @Test
    public void naoDeveFicarPendenteQuandoSaiuParaEntrega() {
        pedido.setEstado(PedidoEstadoSaiuEntrega.getInstance());
        assertFalse(pedido.pendente());
    }

    @Test
    public void deveConcluirPedidoSaiuEntrega() {
        pedido.setEstado(PedidoEstadoSaiuEntrega.getInstance());
        assertTrue(pedido.concluir());
        Assert.assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

//  Entregue

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());
    }

//  Cancelar

    @Test
    public void naoDeveConcluirPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

}