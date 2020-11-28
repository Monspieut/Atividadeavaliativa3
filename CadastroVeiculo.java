import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class CadastroVeiculo extends JFrame {
    public CadastroVeiculo() {

        JLabel introSistema = new JLabel(" Cadastramento de Veiculos ");
        JLabel labelTipoVeiculo = new JLabel("Informe se o veiculo cadastrado é Leve ou Pesado: ");

        JTextField textlabelTipoVeiculo = new JTextField(25);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        pane.add(introSistema);
        pane.add(labelTipoVeiculo);
        pane.add(textlabelTipoVeiculo);

        this.setSize(200, 220);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        CadastroVeiculo teste = new CadastroVeiculo();
    }
}
