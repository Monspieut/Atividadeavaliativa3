import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroVeiculo extends JFrame {
    public CadastroVeiculo() {

        JLabel introSistema = new JLabel(" Cadastramento de Veiculos ");
        JLabel labelTipoVeiculo = new JLabel("Informe o tipo de veiculo: ");
        JButton veiculoLeve = new JButton(" 1 - Veículo Leve   ");
        JButton veiculoPesado = new JButton(" 2 - Veiculo Pesado  ");

        ActionListener acaoCadastroLocacaoVeiculoLeve = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handlacaoCadastroLocVeicLeve(e);
            }
        };

        ActionListener acaoCadastroLocacaoVeiculoPesado = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleacaoCadastroLocaVeicPesado(e);
            }
        };

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        pane.add(introSistema);
        pane.add(labelTipoVeiculo);
        pane.add(veiculoLeve);
        pane.add(veiculoPesado);

        veiculoLeve.addActionListener(acaoCadastroLocacaoVeiculoLeve);
        veiculoPesado.addActionListener(acaoCadastroLocacaoVeiculoPesado);
        

        this.setSize(200, 220);
        this.setVisible(true);

        
    }

    private void handlacaoCadastroLocVeicLeve(ActionEvent e) {
        new CadastroVeiculoLeve();
    }

    private void handleacaoCadastroLocaVeicPesado(ActionEvent e) {
        new CadastroVeiculoPesado();
    }

    public static void main(String[] args) {
        CadastroVeiculo teste = new CadastroVeiculo();
    }
}
