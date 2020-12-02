import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CadastroVeiculoPesado extends JFrame {

    public CadastroVeiculoPesado() {

        JLabel introSistema = new JLabel(" Cadastramento de Veiculos Pesados ");
        JLabel labelIdVeiculo = new JLabel("Informe o id do veiculo: ");
        JLabel LabelMarcaVeiculo = new JLabel("Marca: ");
        JLabel labelModeloVeiculo = new JLabel("Modelo: ");
        JLabel labelAnoVeiculo = new JLabel("Ano do Veiculo: ");
        JLabel labelRestricoesVeiculo = new JLabel("Informe se o veiculo possui alguma restrição: ");
        JLabel labelValorLocacao = new JLabel("Insira o valor para locação do Veiculo: ");
        JButton confirmacao = new JButton(" Confirmar informações ");

        JTextField textIdVeiculo = new JTextField(25);
        JTextField textMarcaVeiculo = new JTextField(25);
        JTextField textRestricoesVeiculo = new JTextField(25);
        JTextField textModeloVeiculo = new JTextField(25);
        JTextField textAnoVeiculo = new JTextField(25);
        JTextField textValorLocacao = new JTextField(25);

        Container pane = this.getContentPane();

        ActionListener acaoconfirmacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleConfirmacao(e);
            }
        };

        pane.setLayout(new FlowLayout());

        pane.add(introSistema);

        pane.add(labelIdVeiculo);
        pane.add(textIdVeiculo);

        pane.add(LabelMarcaVeiculo);
        pane.add(textMarcaVeiculo);

        pane.add(labelModeloVeiculo);
        pane.add(textModeloVeiculo);

        pane.add(labelAnoVeiculo);
        pane.add(textAnoVeiculo);

        pane.add(labelValorLocacao);
        pane.add(textValorLocacao);

        pane.add(labelRestricoesVeiculo);
        pane.add(textRestricoesVeiculo);

        
        pane.add(confirmacao);

        this.setSize(200, 220);
        this.setVisible(true);
    }

    private void handleConfirmacao(ActionEvent e) {

        // Criar o Objeto de VeiculoPesado

    }
    public static void main(String[] args) {
        CadastroVeiculoPesado teste = new CadastroVeiculoPesado();
    }
}
