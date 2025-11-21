package PedidoStatus;

public class PedidoEstadoSaiuEntrega extends PedidoEstado {

    private PedidoEstadoSaiuEntrega() {};
    private static PedidoEstadoSaiuEntrega instance = new PedidoEstadoSaiuEntrega();
    public static PedidoEstadoSaiuEntrega getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Saiu para Entrega";
    }

    public boolean concluir(Pedido conta) {
        conta.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }

}

