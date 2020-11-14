import java.util.ArrayList;

public class Veiculoslocados {
    private int idlocacao;
    private int idveiculoleve;
    private int idveiculopesado;
    private ArrayList<Locacao> qtdveiculoslocacao;

    public static BancoDeDados<Veiculoslocados> veiclocados = new BancoDeDados<>();

    public Veiculoslocados(int idlocacao, int idveiculoleve, int idveiculopesado) {
        this.idlocacao = idlocacao;
        this.idveiculoleve = idveiculoleve;
        this.idveiculopesado = idveiculopesado;
        this.qtdveiculoslocacao = new ArrayList<>();

        veiclocados.insertValue(this);

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

    @Override
    public String toString() {
        return "\nId do Veiculo Locado:" + getIdlocacao() + "\nId se for veiculo categoria leve: " + getIdveiculoleve()
                + "\nId se for veiculo categoria pesadp: " + getIdveiculopesado();

    }
}
