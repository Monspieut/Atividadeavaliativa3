import java.util.ArrayList;

public class Veiculosleves extends Veiculo {
    private int idVeiculoLeve;
    private String cor;
    private ArrayList<Veiculoslocados> locacaoVeiculosLeves; // Utilizando o ArrayList para fazer o relacionamento com outra
                                                         // classe

    public static BancoDeDados<Veiculosleves> bdVeicLeves = new BancoDeDados<>();

    public Veiculosleves(int idVeiculoLeve, String cor, String marca, String modelo, int ano, double valorParaLocacao) {
        super(marca, modelo, ano, valorParaLocacao);
        this.idVeiculoLeve = idVeiculoLeve;
        this.cor = cor;
        this.locacaoVeiculosLeves = new ArrayList<>();

        bdVeicLeves.insertValue(this);
    }

    // Sets
    public void setIdVeiculoLeve(int idVeiculoLeve) { 
        this.idVeiculoLeve = idVeiculoLeve;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLocacaoVeiculosLeves(Veiculoslocados locacaoVeiculosLeves) {
        this.locacaoVeiculosLeves.add(locacaoVeiculosLeves);
    }

    // Gets
    public int getIdVeiculoLeve() {
        return idVeiculoLeve;
    }

    public String getCor() {
        return cor;
    }

    public ArrayList<Veiculoslocados> getLocacaoVeiculosLeves() {
        return this.locacaoVeiculosLeves;
    }
    public static Veiculosleves getVeiculo(int id) throws Exception{
       return bdVeicLeves.getValor(id);
    }

    @Override
    public String toString() {
        return "\nId Veiculo categoria Leve:" + getIdVeiculoLeve() + "\nCor de Veiculo: " + getCor();

    }

}
