import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class ListarCliente extends JFrame {

    public ListarCliente() {

        JLabel introSistema = new JLabel(" Listagem de Clientes Cadastrados ");
        JLabel labelListagemCliente = new JLabel("Clientes:");

        JTextArea textlabelListagemCliente = new JTextArea(10, 30);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        pane.add(introSistema);

        pane.add(labelListagemCliente);
        pane.add(textlabelListagemCliente);

        this.setSize(200, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ListarCliente teste = new ListarCliente();
    }

}
