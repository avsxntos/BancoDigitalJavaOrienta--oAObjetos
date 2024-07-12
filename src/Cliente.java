import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }
}