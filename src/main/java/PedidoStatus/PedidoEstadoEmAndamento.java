package PedidoStatus;

public class PedidoEstadoEmAndamento extends PedidoEstado {

    private PedidoEstadoEmAndamento() {};
    private static PedidoEstadoEmAndamento instance = new PedidoEstadoEmAndamento();
    public static PedidoEstadoEmAndamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em andamento";
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

    public boolean entregar(Pedido conta) {
        conta.setEstado(PedidoEstadoSaiuEntrega.getInstance());
        return true;
    }

}
