import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class CadastroVeiculoLeve {
   
    public CadastroVeiculoLeve() {

        JLabel labelIdVeiculoLeve = new JLabel("Informe o id da Locação do Veiculo: ");
        JLabel labelCorVeiculoLeve = new JLabel("Informe a Cor do Veiculo: ");
        JLabel labelMarcaVeiculoLeve = new JLabel("Informe a marca do Veiculo: ");
        JLabel labelModeloVeiculoLeve= new JLabel("Informe o modelo do Veiculo: ");
        JLabel labelAnoVeiculoLeve = new JLabel("Informe o ano do Veiculo: ");
        JLabel labelValorLocacaoVeiculoLeve = new JLabel("Informe o valor para locação do Veiculo: ");
        
        JTextField textIdVeiculoLeve = new JTextField(25);
        JTextField textCorVeiculoLeve = new JTextField(25);
        JTextField textMarcaVeiculoLeve = new JTextField(25);
        JTextField textModeloVeiculoLeve = new JTextField(25);
        JTextField textAnoVeiculoLeve = new JTextField(25);
        JTextField textValorLocacaoVeiculoLeve = new JTextField(25);

        Container pane = this.getContentPane();
        
        pane.setLayout(new GridLayout(6,6));

        pane.add(labelIdVeiculoLeve);
        pane.add(textIdVeiculoLeve);

        pane.add(labelCorVeiculoLeve);
        pane.add(textCorVeiculoLeve);

        pane.add(labelMarcaVeiculoLeve);
        pane.add(textMarcaVeiculoLeve);

        pane.add(labelModeloVeiculoLeve);
        pane.add(textModeloVeiculoLeve);

        pane.add(labelAnoVeiculoLeve);
        pane.add(textAnoVeiculoLeve);


        pane.add(labelValorLocacaoVeiculoLeve);
        pane.add(textValorLocacaoVeiculoLeve);

       
        this.setSize(200, 220);
        this.setVisible(true);
}
}
