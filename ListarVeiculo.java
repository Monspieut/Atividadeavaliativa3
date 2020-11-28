import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class ListarVeiculo extends JFrame {

    public ListarVeiculo() {

        JLabel introSistema = new JLabel(" Listagem de Veiculos Cadastrados ");
        JLabel labelListagemVeiculos = new JLabel("Veiculos:");

        JTextArea textlabelListagemVeiculos = new JTextArea(10, 30);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        pane.add(introSistema);

        pane.add(labelListagemVeiculos);
        pane.add(textlabelListagemVeiculos);

        this.setSize(200, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ListarVeiculo teste = new ListarVeiculo();
    }

}
