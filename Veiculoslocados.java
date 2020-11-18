public class Veiculoslocados {
    private int idlocacao;
    private int idveiculoleve;
    private int idveiculopesado;
    

    public static BancoDeDados<Veiculoslocados> veiclocados = new BancoDeDados<>();

    public Veiculoslocados(int idlocacao, int idveiculoleve, int idveiculopesado) {
        this.idlocacao = idlocacao;
        this.idveiculoleve = idveiculoleve;
        this.idveiculopesado = idveiculopesado;
     

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


    @Override
    public String toString() {
        return "\nId do Veiculo Locado:" + getIdlocacao() + "\nId se for veiculo categoria leve: " + getIdveiculoleve()
                + "\nId se for veiculo categoria pesadp: " + getIdveiculopesado();

    }
}
