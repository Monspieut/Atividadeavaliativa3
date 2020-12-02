import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente extends JFrame {
    public CadastroCliente() {

        JLabel introSistema = new JLabel(" Cadastramento de Cliente ");
        JLabel labelId = new JLabel("Informe o id do cliente: ");
        JLabel labelNomeCliente = new JLabel("Nome completo: ");
        JLabel labelDtNascimento = new JLabel("Data de nascimento: ");
        JLabel labelCpfCliente = new JLabel("Cpf: ");
        JLabel labelDtDevolucao = new JLabel("Informe a data para devolução do veiculo: ");
        JButton confirmacao = new JButton(" Confirmar informações ");

        JTextField textId = new JTextField(25);
        JTextField textNomeCliente = new JTextField(25);
        JTextField textDtNascimento = new JTextField(25);
        JTextField textCpfCliente = new JTextField(25);
        JTextField textDtDevolucao = new JTextField(25);

        Container pane = this.getContentPane();

        ActionListener acaoconfirmacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleConfirmacao(e);
            }
        };

        pane.setLayout(new FlowLayout());

        confirmacao.addActionListener(acaoconfirmacao);

        pane.add(introSistema);
        pane.add(labelId);
        pane.add(textId);

        pane.add(labelNomeCliente);
        pane.add(textNomeCliente);

        pane.add(labelDtNascimento);
        pane.add(textDtNascimento);

        pane.add(labelCpfCliente);
        pane.add(textCpfCliente);

        pane.add(labelDtDevolucao);
        pane.add(textDtDevolucao);
        pane.add(confirmacao);

        this.setSize(200, 220);
        this.setVisible(true);

    }

    private void handleConfirmacao(ActionEvent e) {
     
    //Criar o Objeto de cliente
     
    }

    public static void main(String[] args) {
        CadastroCliente teste = new CadastroCliente();
    }

}
