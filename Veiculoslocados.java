import java.util.ArrayList;

public class Veiculoslocados {
    private int idlocacao;
    private int idveiculoleve;
    private int idveiculopesado;
    private ArrayList<Locacao> qtdveiculoslocacao;

    public Veiculoslocados(int idlocacao, int idveiculoleve, int idveiculopesado) {
        this.idlocacao = idlocacao;
        this.idveiculoleve = idveiculoleve;
        this.idveiculopesado = idveiculopesado;
        this.qtdveiculoslocacao = new ArrayList<>();

    }

    // Sets
    public void setIdlocacao(int idlocacao) {
        this.idlocacao = idlocacao;
    }

    public void setIdveiculoleve(int idveiculoleve) {
        this.idveiculoleve = idveiculoleve;
    }

    public void setIdveiculopesado(int idveiculopesado) {
        this.idveiculopesado = idveiculopesado;
    }

    public void setQtdveiculoslocados(Locacao qtdveiculoslocacao) {
        this.qtdveiculoslocacao.add(qtdveiculoslocacao);
    }

    // Gets
    public int getIdlocacao() {
        return idlocacao;
    }

    public int getIdveiculoleve() {
        return idveiculoleve;
    }

    public int getIdveiculopesado() {
        return idveiculopesado;
    }

    public ArrayList<Locacao> getQtdveiculoslocados() {
        return this.qtdveiculoslocacao;
    }
}
