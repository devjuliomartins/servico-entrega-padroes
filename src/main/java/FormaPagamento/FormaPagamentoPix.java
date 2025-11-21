package FormaPagamento;

public class FormaPagamentoPix implements FormaPagamento {

    public String pagar(double valor) {
        return "Pagamento de R$" + valor + " realizado com PIX.";
    }

}
