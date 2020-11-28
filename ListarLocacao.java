import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class ListarLocacao extends JFrame {

    public ListarLocacao() {

        JLabel introSistema = new JLabel(" Listagem de Locações Cadastradas ");
        JLabel labelListagemLocacoes = new JLabel("Locações:");

        JTextArea textlabelListagemLocacoes = new JTextArea(10, 30);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        pane.add(introSistema);

        pane.add(labelListagemLocacoes);
        pane.add(textlabelListagemLocacoes);

        this.setSize(200, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ListarLocacao teste = new ListarLocacao();
    }

}
