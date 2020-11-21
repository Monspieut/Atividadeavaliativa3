import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private int id;
    private String nome;
    private Date dtNascimento;
    private String cpf;
    private int diasParaDevolucao;
    private ArrayList<Locacao> qtdLocacoesCliente;

    public static BancoDeDados<Cliente> clientes = new BancoDeDados<>();

    public Cliente(int id, String nome, Date dtNascimento, String cpf, int diasParaDevolucao) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.diasParaDevolucao = diasParaDevolucao;
        this.qtdLocacoesCliente = new ArrayList<>();

        clientes.insertValue(this);

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtNascimento = dtnascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDiasparadevolucao(int diasparadevolucao) {
        this.diasParaDevolucao = diasparadevolucao;
    }

    public void setQtdlocacoescliente(Locacao qtdlocacoescliente) {
        this.qtdLocacoesCliente.add(qtdlocacoescliente);
    }

    // Gets
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDtnascimento() {
        return dtNascimento;
    }

    public String getCpt() {
        return cpf;
    }

    public int getDiasparadevolucao() {
        return diasParaDevolucao;
    }

    public ArrayList<Locacao> getQtdlocacoescliente() {
        return this.qtdLocacoesCliente;
    }

    @Override
    public String toString() {
        return "\nId do cliente:" + getId() + "\nNome do cliente:" + getNome() + "\nData de nascimento do cliente: "
                + getDtnascimento() + "\nCpf do cliente: " + getCpt()
                + "\nDias restantes para a devolução do veiculos: " + getDiasparadevolucao()
                + "\nQuantidade de locações do cliente: " + getQtdlocacoescliente();

    }

    public void QtdeVeiculosLocados() { // Método para apresentar a quantidade de veiculos Locados

        System.out.println("\nA quantidade de locações foi de" + this.qtdLocacoesCliente);
    }
}
