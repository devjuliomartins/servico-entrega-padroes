import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private List<String> mensagensRecebidas = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable o, Object mensagem) {
        mensagensRecebidas.add((String) mensagem);
    }

    public List<String> getMensagensRecebidas() {
        return mensagensRecebidas;
    }

    public String getNome() {
        return nome;
    }
}
