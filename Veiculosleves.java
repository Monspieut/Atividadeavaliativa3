import java.util.ArrayList;

public class Veiculosleves extends Veiculo {
    private int id;
    private String cor;
    private ArrayList<Veiculoslocados> veiculoslevesloc; // Utilizando o ArrayList para fazer o relacionamento com outra
                                                         // classe

    public static BancoDeDados<Veiculosleves> veicleves = new BancoDeDados<>();

    public Veiculosleves(int id, String cor, String marca, String modelo, int ano, double valorparalocacao) {
        super(marca, modelo, ano, valorparalocacao);
        this.id = id;
        this.cor = cor;
        this.veiculoslevesloc = new ArrayList<>();

        veicleves.insertValue(this);
    }

    // Sets
    public void setId(int id) { 
        this.id = id;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVeiculoslevesloc(Veiculoslocados veiculoslevesloc) {
        this.veiculoslevesloc.add(veiculoslevesloc);
    }

    // Gets
    public int getId() {
        return id;
    }

    public String getCor() {
        return cor;
    }

    public ArrayList<Veiculoslocados> getVeiculoslevesloc() {
        return this.veiculoslevesloc;
    }

    @Override
    public String toString() {
        return "\nId Veiculo categoria Leve:" + getId() + "\nCor de Veiculo: " + getCor();

    }

}
