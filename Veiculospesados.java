import java.util.ArrayList;

public class Veiculospesados extends Veiculo {
    private int id;
    private String restricoes;
    private ArrayList<Veiculoslocados> veiculospesadosloc;

    public static BancoDeDados<Veiculospesados> veicpesados = new BancoDeDados<>();

    public Veiculospesados(int id, String restricoes, String marca, String modelo, int ano, double valorparalocacao) {
        super(marca, modelo, ano, valorparalocacao);
        this.id = id;
        this.restricoes = restricoes;
        this.veiculospesadosloc = new ArrayList<>();

        veicpesados.insertValue(this);

    }

    // Sets
    public void setId(int id) {
        this.id = id;
    }

    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }

    public void setVeiculospesadosloc(Veiculoslocados veiculospesadosloc) {
        this.veiculospesadosloc.add(veiculospesadosloc);
    }

    // Gets
    public int getId() {
        return id;
    }

    public String getRestricoes() {
        return restricoes;
    }

    public ArrayList<Veiculoslocados> getVeiculospesadosloc() {
        return this.veiculospesadosloc;
    }

    @Override
    public String toString() {
        return "\nId do Veiculo Pesado:" + getId() + "\nPossiveis Restrições: " + getRestricoes();

    }
}
