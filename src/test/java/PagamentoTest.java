import org.junit.jupiter.api.Test;
import FormaPagamento.FormaPagamentoCartao;
import FormaPagamento.FormaPagamentoPix;
import FormaPagamento.Pagamento;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    @Test
    void deveRealizarPagamentoComCartao() {
        Pagamento pagamento = new Pagamento(100.0);
        pagamento.setFormaPagamento(new FormaPagamentoCartao());
        String resultado = pagamento.realizarPagamento();
        assertEquals("Pagamento de R$100.0 realizado no Cartão.", resultado);
    }

    @Test
    void deveRealizarPagamentoComPix() {
        Pagamento pagamento = new Pagamento(100.0);
        pagamento.setFormaPagamento(new FormaPagamentoPix());
        String resultado = pagamento.realizarPagamento();
        assertEquals("Pagamento de R$100.0 realizado com PIX.", resultado);
    }

    @Test
    void deveRetornarErroQuandoFormaPagamentoNaoSelecionada() {
        Pagamento pagamento = new Pagamento(50.0);
        String resultado = pagamento.realizarPagamento();
        assertEquals("Nenhuma forma de pagamento selecionada!", resultado);
    }
}
