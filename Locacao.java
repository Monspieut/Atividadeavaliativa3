import java.util.ArrayList;
import java.util.Date;

public class Locacao {
    private int id;
    private int iddocliente;
    private Date dtlocacao;
    private Date dtdevolucacao;
    private ArrayList<Cliente> qtdlocacoescliente;

    public static BancoDeDados<Locacao> locacoes = new BancoDeDados<>();

    public Locacao(int id, int iddocliente, Date dtlocacao, Date dtdevolucao) {
        this.id = id;
        this.iddocliente = iddocliente;
        this.dtlocacao = dtlocacao;
        this.dtdevolucacao = dtdevolucao;
        this.qtdlocacoescliente = new ArrayList<>();

        locacoes.insertValue(this);
    }

    // Sets
    public void set(int id) {
        this.id = id;
    }

    public void setIddocliente(int iddocliente) {
        this.iddocliente = iddocliente;
    }

    public void setDtlocacao(Date dtlocacao) {
        this.dtlocacao = dtlocacao;
    }

    public void setDtdevolucacao(Date dtdevolucao) {
        this.dtdevolucacao = dtdevolucao;
    }

    public void setQtdlocacoescliente(Cliente qtdlocacoescliente) {
        this.qtdlocacoescliente.add(qtdlocacoescliente);
    }

    // Gets
    public int getId() {
        return id;
    }

    public int getIddocliente() {
        return iddocliente;
    }

    public Date getDtlocacao() {
        return dtlocacao;
    }

    public Date getDtdevolucao() {
        return dtdevolucacao;
    }

    public ArrayList<Cliente> getQtdlocacoescliente() {
        return this.qtdlocacoescliente;
    }

    @Override
    public String toString() {
        return "\nId Locação: " + getId() + "\nId do cliente: " + getIddocliente() + "\nData de Locação: "
                + getDtlocacao() + "\nData de Devolução: " + getDtdevolucao() + "\nQuantidade de locações do cliente: "
                + getQtdlocacoescliente();

    }

    public void QtdeVeiculosLocados() {
        System.out.println( // Método que Lista a quantidade de veiculos locados
                "\nA quantidade de veiculos locados foi " + this.qtdlocacoescliente.size());

    }

}
