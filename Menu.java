import java.util.Scanner;
import javax.swing.JFrame;
import java.util.Date;
import java.util.Calendar;
import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    public Menu(){

        JLabel labelSistemaLocacao = new JLabel("    Sistema de Locação de Veiculos ");
        JLabel labelCadastrarCliente = new JLabel(" 1 - Cadastrar Cliente ");
        JLabel labelCadastrarVeiculo = new JLabel(" 2 - Cadastrar Veículo");
        JLabel labelCadastrarLocacao = new JLabel(" 3 - Cadastrar Locação");
        JLabel labelListarClientes = new JLabel("   4 - Listar Clientes  .");
        JLabel labelListarVeiculos = new JLabel("   5 - Listar Veículos   .");
        JLabel labelListarLocacao = new JLabel("    6 - Listar Locações  .");
        JLabel labelSair = new JLabel("             0 - Sair  .");
        JLabel labelOpcao = new JLabel("            Digite sua opção:  ");

        JTextField textSistemaLocacao = new JTextField(0);
        JTextField textCadastrarCliente = new JTextField(25);
        JTextField textCadastrarVeiculo = new JTextField(25);
        JTextField textCadastrarLocacao = new JTextField(25);
        JTextField textListarClientes = new JTextField(25);
        JTextField textListarVeiculos = new JTextField(25);
        JTextField textListarLocacao = new JTextField(25);
        JTextField textSair = new JTextField(1);
        JTextField textOpcao = new JTextField(1);
        


        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(5,30));

        pane.add(labelSistemaLocacao);
        pane.add(textSistemaLocacao) ;

        pane.add(labelCadastrarCliente);
        pane.add(textCadastrarCliente)  ;

        pane.add(labelCadastrarVeiculo);
        pane.add(textCadastrarVeiculo);

        pane.add(labelCadastrarLocacao);
        pane.add(textCadastrarLocacao);

        pane.add(labelListarClientes);
        pane.add(textListarClientes);

        pane.add(labelListarVeiculos);
        pane.add(textListarVeiculos);
        
        pane.add(labelListarLocacao);
        pane.add(textListarLocacao);

        pane.add(labelSair);
        pane.add(textSair);

        pane.add(labelOpcao);
        pane.add(textOpcao);

        
        this.setSize(400,200);
        this.setVisible(true);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            Menu main = new Menu(); 

            System.out.println("\n\n            Sistema de Locação de Veiculos ");
            System.out.println("\n                 =========================");
            System.out.println("                      1 - Cadastrar Cliente         ");
            System.out.println("                      2 - Cadastrar Veículo     ");
            System.out.println("                      3 - Cadastrar Locação       ");
            System.out.println("                      4 - Listar Clientes      ");
            System.out.println("                      5 - Listar Veículos    ");
            System.out.println("                      6 - Listar Locações   ");
            System.out.println("                      0 - Sair          ");
            System.out.println("                   ========================\n");
            System.out.println("                          Digite sua opção: \n");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(" CADASTRAR CLIENTE: ");

                    System.out.println("Informe o ID do cliente: ");
                    int idCliente = scanner.nextInt();

                    System.out.println("Informe o nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.println("Informe o C.P.F. do cliente: ");
                    String cpf = scanner.nextLine();

                    boolean dateOK = false;
                    Date dtnascimento = new Date();
                    do {
                        System.out.println("Informe a data de nascimento do cliente (dd/mm/aaaa): ");
                        String stringDate = scanner.nextLine();
                        try {

                            dateOK = true;
                        } catch (Exception e) {
                            System.out.println("Data em formato inválido, informe novamente.");
                        }
                    } while (!dateOK);

                    System.out.println("Informe o dia para devolução do veiculo: ");
                    int diasparadevolucao = scanner.nextInt();

                    break;

                case 2:

                    System.out.println(" CADASTRAR VEICULO: ");

                    System.out.println(" SELECIONE O TIPO DO VEICULO: ");

                    System.out.println(" 1 - VEICULO LEVE ");
                    System.out.println(" 2 - VEICULO PESADO ");

                    int op = scanner.nextInt();

                    switch (op) {
                        case 1:

                            System.out.println(" VEICULO LEVE ");

                            System.out.println("Insira o ID do veiculo: ");
                            int idVeiculoLeve = scanner.nextInt();

                            System.out.println("Insira a cor do veiculo: ");
                            String cor = scanner.nextLine();

                            System.out.println("Insira a marca: ");
                            String marca = scanner.nextLine();

                            System.out.println("Insira o modelo do veiculo: ");
                            String modelo = scanner.nextLine();

                            System.out.println("Insira o ano do veiculo: ");
                            int ano = scanner.nextInt();

                            System.out.println("Insira o valor para locação do veiculo: ");
                            double valorParaLocacao = scanner.nextDouble();

                            break;

                        case 2:

                            System.out.println(" VEICULO PESADO ");

                            System.out.println("Insira o ID do veiculo: ");
                            int idVeiculoPesado = scanner.nextInt();

                            System.out.println("Insira as possiveis restrições do veiculo: ");
                            String restricoes = scanner.nextLine();

                            System.out.println("Insira a marca: ");
                            String marcaDois = scanner.nextLine();

                            System.out.println("Insira o modelo do veiculo: ");
                            String modeloDois = scanner.nextLine();

                            System.out.println("Insira o ano do veiculo: ");
                            int ano2 = scanner.nextInt();

                            System.out.println("Insira o valor para locação do veiculo: ");
                            double valorParaLocacaoDois = scanner.nextDouble();

                            break;

                    }

                case 3:

                    System.out.println(" CADASTRAR LOCAÇÃO: ");

                    System.out.println("Insira o ID do veiculo: ");
                    int idDaLocacao = scanner.nextInt();

                    System.out.println("Insira o ID do cliente: ");
                    int idDoclientedois = scanner.nextInt();

                    System.out.println("Insira a data para locação do veiculo (dd/mm/aaaa): ");
                    String dtLocacao = scanner.nextLine();

                    System.out.println("Insira a data para devolução do veiculo (dd/mm/aaaa): ");
                    String dtDevolucao = scanner.nextLine();

                    break;
                case 4:

                    System.out.println(" LISTAR CLIENTES: ");

                    break;
                case 5:

                    System.out.println(" LISTAR VEICULOS: ");
                    break;
                case 6:

                    System.out.println(" LISTAR LOCAÇÕES: ");
                    break;

                case 0:
                    System.out.println("Sair do Menu.");

                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;

            }
            if (menu == 0) {
                break;
            }
        }
        scanner.close();
    }
}
