import java.util.ArrayList;

public class Veiculosleves extends Veiculo {
    private int id;
    private String cor;
    private ArrayList<Veiculoslocados> locacaoVeiculosLeves; // Utilizando o ArrayList para fazer o relacionamento com outra
                                                         // classe

    public static BancoDeDados<Veiculosleves> bdVeicLeves = new BancoDeDados<>();

    public Veiculosleves(int id, String cor, String marca, String modelo, int ano, double valorparalocacao) {
        super(marca, modelo, ano, valorparalocacao);
        this.id = id;
        this.cor = cor;
        this.locacaoVeiculosLeves = new ArrayList<>();

        bdVeicLeves.insertValue(this);
    }

    // Sets
    public void setId(int id) { 
        this.id = id;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLocacaoVeiculosLeves(Veiculoslocados locacaoVeiculosLeves) {
        this.locacaoVeiculosLeves.add(locacaoVeiculosLeves);
    }

    // Gets
    public int getId() {
        return id;
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
        return "\nId Veiculo categoria Leve:" + getId() + "\nCor de Veiculo: " + getCor();

    }

}
