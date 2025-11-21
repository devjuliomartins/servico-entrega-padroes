package FormaPagamento;

public class FormaPagamentoCartao implements FormaPagamento {

    public String pagar(double valor) {
        return "Pagamento de R$" + valor + " realizado no Cartão.";
    }

}
