public interface BaseVeiculo {
    public int Qtdlocacoesrealizadas();

    public default String Seloempresa() {
        return "Compra certa no lugar certo!";
    }

}
