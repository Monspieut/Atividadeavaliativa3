import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Locacao {
    private int id;
    private int idDoCliente;
    private Date dtLocacao;
    private Date dtDevolucao;
    private ArrayList<Veiculoslocados> veiculosLocados;

    public static BancoDeDados<Locacao> bdLocacoes = new BancoDeDados<>();

    public Locacao(int id, int idDocliente, Date dtLocacao, Date dtDevolucao) {
        this.id = id;
        this.idDoCliente = idDocliente;
        this.dtLocacao = dtLocacao;
        this.dtDevolucao = dtDevolucao;
        this.veiculosLocados = new ArrayList<>();

        bdLocacoes.insertValue(this);
    }

    // Sets
    public void set(int id) {
        this.id = id;
    }

    public void setIddocliente(int idDoCliente) {
        this.idDoCliente = idDoCliente;
    }

    public void setDtlocacao(Date dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    public void setDtdevolucacao(Date dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public void setqtdVeiculosLocados(Veiculoslocados qtdVeiculosLocados) {
        this.veiculosLocados.add(qtdVeiculosLocados);
    }

    // Gets
    public int getId() {
        return id;
    }

    public int getIddocliente() {
        return idDoCliente;
    }

    public Date getDtlocacao() {
        return dtLocacao;
    }

    public Date getDtdevolucao() {
        return dtDevolucao;
    }

    public ArrayList<Veiculoslocados> getqtdVeiculosLocados() {
        return this.veiculosLocados;
    }

    @Override
    public String toString() {
        return "\nId Locação: " + getId() + "\nId do cliente: " + getIddocliente() + "\nData de Locação: "
                + getDtlocacao() + "\nData de Devolução: " + getDtdevolucao() + "\nQuantidade de locações do cliente: "
                + getqtdVeiculosLocados();

    }

    public void QtdeVeiculosLocados() {
        System.out.println( // Método que Lista a quantidade de veiculos locados
                "\nA quantidade de veiculos locados foi " + this.veiculosLocados.size() * 2);

    }

    public double valorTotal() { // Método para calcular o total da locação

        double soma = 0.0;

        for (Veiculoslocados veiculoslocados : veiculosLocados) {

            try {
                soma += Veiculosleves.getVeiculo(veiculoslocados.getIdVeiculoLeve()).getValorParaLocacao();
            } catch (Exception e) {
                soma += 0;
            }
            try {
                soma += Veiculospesados.getVeiculo(veiculoslocados.getIdVeiculoPesado()).getValorParaLocacao();
            } catch (Exception e) {
                soma += 0;
            }
        }
        return soma;
    }

    public Date CalcularDataLocacao(int qtddedias) { // Aqui será o método para calcular por dias de locação -- INCOMPLETO

    
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(getDtdevolucao());
        calendario.add(Calendar.DATE, qtddedias);
        return calendario.getTime();

    }

}
