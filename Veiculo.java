public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double valorparalocacao;

    public Veiculo(String marca, String modelo, int ano, double valorparalocacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorparalocacao = valorparalocacao;
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

}
