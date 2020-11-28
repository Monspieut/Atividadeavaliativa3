import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class CadastroVeiculo extends JFrame {
    public CadastroVeiculo() {

        JLabel labelTipoVeiculo = new JLabel("Informe se o Veiculo é Leve ou Pesado: ");

        JTextField textlabelTipoVeiculo = new JTextField(25);

        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(1, 2));

        pane.add(labelTipoVeiculo);
        pane.add(textlabelTipoVeiculo);

        this.setSize(200, 220);
        this.setVisible(true);
    }
}
