import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private int id;
    private String nome;
    private Date dtnascimento;
    private String cpf;
    private int diasparadevolucao;
    private ArrayList<Locacao> qtdlocacoescliente;

    public static BancoDeDados<Cliente> clientes = new BancoDeDados<>();

    public Cliente(int id, String nome, Date dtnascimento, String cpf, int diasparadevolucao) {
        this.id = id;
        this.nome = nome;
        this.dtnascimento = dtnascimento;
        this.cpf = cpf;
        this.diasparadevolucao = diasparadevolucao;
        this.qtdlocacoescliente = new ArrayList<>();

        clientes.insertValue(this);

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDiasparadevolucao(int diasparadevolucao) {
        this.diasparadevolucao = diasparadevolucao;
    }

    public void setQtdlocacoescliente(Locacao qtdlocacoescliente) {
        this.qtdlocacoescliente.add(qtdlocacoescliente);
    }

    // Gets
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public String getCpt() {
        return cpf;
    }

    public int getDiasparadevolucao() {
        return diasparadevolucao;
    }

    public ArrayList<Locacao> getQtdlocacoescliente() {
        return this.qtdlocacoescliente;
    }

    @Override
    public String toString() {
        return "\nId do cliente:" + getId() + "\nNome do cliente:" + getNome() + "\nData de nascimento do cliente: "
                + getDtnascimento() + "\nCpf do cliente: " + getCpt()
                + "\nDias restantes para a devolução do veiculos: " + getDiasparadevolucao()
                + "\nQuantidade de locações do cliente: " + getQtdlocacoescliente();

    }

}
