import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Locacao {
    private int idDaLocacao;
    private int idCliente;
    private Date dtLocacao;
    private Date dtDevolucao;
    private ArrayList<Veiculoslocados> veiculosLocados;

    public static BancoDeDados<Locacao> bdLocacoes = new BancoDeDados<>();

    public Locacao(int idDaLocacao, int idDocliente, Date dtLocacao, Date dtDevolucao) {
        this.idDaLocacao = idDaLocacao;
        this.idCliente = idDocliente;
        this.dtLocacao = dtLocacao;
        this.dtDevolucao = dtDevolucao;
        this.veiculosLocados = new ArrayList<>();

        bdLocacoes.insertValue(this);
    }

    // Sets
    public void setidDaLocacao(int idDaLocacao) {
        this.idDaLocacao = idDaLocacao;
    }

    public void setIddocliente(int idCliente) {
        this.idCliente = idCliente;
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
    // public void setLocacoes(Cliente cliente) {
    // this.cliente.add(cliente); Tem que passar como ligação com locação setando
    // cliente aqui
    // }

    // Gets
    public int getidDaLocacao() {
        return idDaLocacao;
    }

    public int getIddocliente() {
        return idCliente;
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
        return "\nId Locação: " + getidDaLocacao() + "\nId do cliente: " + getIddocliente() + "\nData de Locação: "
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

    public static Date CalcularDataLocacao(Date date, int qtdDeDias) { // Método para calcular por dias de locação --
        // INCOMPLETO
       
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(date); 
        calendario.add(Calendar.DATE, qtdDeDias);
        return calendario.getTime();
    }

}
