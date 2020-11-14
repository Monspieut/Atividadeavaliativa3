public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double valorparalocacao;

    public static BancoDeDados<Veiculo> veiculos = new BancoDeDados<>(); // Utilizando Generic para a conexão com o
                                                                         // banco de dados

    public Veiculo(String marca, String modelo, int ano, double valorparalocacao) { // Criando os construtores
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorparalocacao = valorparalocacao;

        veiculos.insertValue(this);
    }

    // Sets
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValorparalocacao(double valorparalocacao) {
        this.valorparalocacao = valorparalocacao;
    }

    // Gets
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValorparalocacao() {
        return valorparalocacao;
    }

    @Override
    public String toString() {
        return "\nMarca do Veiculo:" + getMarca() + "\nModelo do Veiculo: " + getModelo() + "\nAno do Veiculo: "
                + getAno() + "\nValor para locação do Veiculo: " + getValorparalocacao();

    }
}
