import java.util.ArrayList;
import java.util.Date;

public class Locacao {
    private int id;
    private int iddocliente;
    private Date dtlocacao;
    private Date dtdevolucacao;
    private ArrayList<Cliente> qtdlocacoescliente;

    public Locacao(int id, int iddocliente, Date dtlocacao, Date dtdevolucao) {
        this.id = id;
        this.iddocliente = iddocliente;
        this.dtlocacao = dtlocacao;
        this.dtdevolucacao = dtdevolucao;
        this.qtdlocacoescliente = new ArrayList<>();
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

}
