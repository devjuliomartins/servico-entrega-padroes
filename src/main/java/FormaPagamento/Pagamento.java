package FormaPagamento;

public class Pagamento {
    private double valor;
    private FormaPagamento formaPagamento;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String realizarPagamento() {
        if (formaPagamento == null) {
            return "Nenhuma forma de pagamento selecionada!";
        } else {
            return formaPagamento.pagar(valor);
        }
    }
}

