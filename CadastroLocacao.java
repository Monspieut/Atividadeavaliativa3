import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class CadastroLocacao extends JFrame {

    public CadastroLocacao() {
        JLabel introSistema = new JLabel(" Cadastramento de Locações ");
        JLabel labelIdLocacao = new JLabel("Informe o id da Locação: ");
        JLabel labelIdCliente = new JLabel("Informe o id do cliente: ");
        JLabel labelDtLocacao = new JLabel("Data de locação do veiculo: ");
        JLabel labelDtDevolucao = new JLabel("Data para devolução do Veiculo: ");

        JTextField textIdLocacao = new JTextField(25);
        JTextField textIdCliente = new JTextField(25);
        JTextField textDtLocacao = new JTextField(25);
        JTextField textDtDevolucao = new JTextField(25);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        pane.add(introSistema);
        pane.add(labelIdLocacao);
        pane.add(textIdLocacao);

        pane.add(labelIdCliente);
        pane.add(textIdCliente);

        pane.add(labelDtLocacao);
        pane.add(textDtLocacao);

        pane.add(labelDtDevolucao);
        pane.add(textDtDevolucao);

        this.setSize(200, 220);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        CadastroLocacao teste = new CadastroLocacao();
    }
}
