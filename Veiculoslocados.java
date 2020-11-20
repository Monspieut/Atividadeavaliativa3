public class Veiculoslocados {
    private int idLocacao;
    private int idVeiculoLeve;
    private int idVeiculoPesado;

    public static BancoDeDados<Veiculoslocados> bdVeicLocados = new BancoDeDados<>();

    public Veiculoslocados(int idLocacao, int idVeiculoLeve, int idVeiculoPesado) {
        this.idLocacao = idLocacao;
        this.idVeiculoLeve = idVeiculoLeve;
        this.idVeiculoPesado = idVeiculoPesado;

        bdVeicLocados.insertValue(this);

    }

    // Sets
    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public void setIdVeiculoLeve(int idVeiculoLeve) {
        this.idVeiculoLeve = idVeiculoLeve;
    }

    public void setIdVeiculoPesado(int idVeiculoPesado) {
        this.idVeiculoPesado = idVeiculoPesado;
    }

    // Gets
    public int getIdLocacao() {
        return idLocacao;
    }

    public int getIdVeiculoLeve() {
        return idVeiculoLeve;
    }

    public int getIdVeiculoPesado() {
        return idVeiculoPesado;
    }

    @Override
    public String toString() {
        return "\nId do Veiculo Locado:" + getIdLocacao() + "\nId se for veiculo categoria leve: " + getIdVeiculoLeve()
                + "\nId se for veiculo categoria pesadp: " + getIdVeiculoPesado();

    }
}
