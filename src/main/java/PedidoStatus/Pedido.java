package PedidoStatus;

import java.util.Observable;

public class Pedido extends Observable {

    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoEmAndamento.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;

        setChanged();
        notifyObservers("Pedido mudou para: " + estado.getClass().getSimpleName());
    }

    public boolean pendente() {
        boolean result = estado.pendente(this);
        return result;
    }

    public boolean entregar() {
        boolean result = estado.entregar(this);
        return result;
    }

    public boolean cancelar() {
        boolean result = estado.cancelar(this);
        return result;
    }

    public boolean concluir() {
        boolean result = estado.concluir(this);
        return result;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}
