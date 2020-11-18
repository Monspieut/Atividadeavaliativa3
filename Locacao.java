import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Locacao {
    private int id;
    private int iddocliente;
    private Date dtlocacao;
    private Date dtdevolucacao;
    private ArrayList<Veiculoslocados> qtdVeiculosLocados;

    public static BancoDeDados<Locacao> locacoes = new BancoDeDados<>();

    public Locacao(int id, int iddocliente, Date dtlocacao, Date dtdevolucao) {
        this.id = id;
        this.iddocliente = iddocliente;
        this.dtlocacao = dtlocacao;
        this.dtdevolucacao = dtdevolucao;
        this.qtdVeiculosLocados = new ArrayList<>();

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

    public void setqtdVeiculosLocados(Veiculoslocados qtdVeiculosLocados) {
        this.qtdVeiculosLocados.add(qtdVeiculosLocados);
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

    public ArrayList<Veiculoslocados> getqtdVeiculosLocados() {
        return this.qtdVeiculosLocados;
    }

    @Override
    public String toString() {
        return "\nId Locação: " + getId() + "\nId do cliente: " + getIddocliente() + "\nData de Locação: "
                + getDtlocacao() + "\nData de Devolução: " + getDtdevolucao() + "\nQuantidade de locações do cliente: "
                + getqtdVeiculosLocados();

    }

    public void QtdeVeiculosLocados() {
        System.out.println( // Método que Lista a quantidade de veiculos locados
                "\nA quantidade de veiculos locados foi " + this.qtdVeiculosLocados.size());

    }

    public double valortotal() { // Aqui será o método para calcular o total da locação

        double soma = 0.0;

        for (Veiculoslocados veiculoslocados : qtdVeiculosLocados) {
            soma += veiculoslocados.getIdveiculoleve() + veiculoslocados.getIdveiculopesado();
        }
        return this.valortotal();
    }

    public Date CalcularDataLocacao() { // Aqui será o método para calcular por dias de locação -- INCOMPLETO

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(this.getDtlocacao());
        calendario.add(Calendar.DATE, 0);
        return calendario.getTime();

    }

}
