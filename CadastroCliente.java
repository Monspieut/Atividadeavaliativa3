import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;


public class CadastroCliente extends JFrame {
    public CadastroCliente(){

         
        JLabel labelId = new JLabel("Informe o id do cliente: ")  ;
        JLabel labelNomeCliente = new JLabel("Informe o nome do cliente: ");
        JLabel labelDtNascimento = new JLabel("Informe a data de nascimento do cliente: ");
        JLabel labelCpfCliente = new JLabel("Informe o cpf do cliente: ");
        JLabel labelDtDevolucao = new JLabel("Informe a data para devolução do veiculo: ");
        
      

        JTextField textId = new JTextField(25);
        JTextField textNomeCliente = new JTextField(25);
        JTextField textDtNascimento = new JTextField(25);
        JTextField textCpfCliente = new JTextField(25);
        JTextField textDtDevolucao = new JTextField(25);



        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(2,2));

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



       
        this.setSize(200,220);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        CadastroCliente batata = new CadastroCliente();
    }

}
