import java.util.Scanner;
import javax.swing.JFrame;

import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame { // Menu com Interface gráfica

    private JButton mensagem;
    
    JLabel sistemaLocacao = new JLabel(" Sistema de Locação de Veiculos ");
    JButton cadastroCliente = new JButton(" 1 - Cadastrar Cliente ");
    JButton cadastroVeiculo = new JButton(" 2 - Cadastrar Veículo   ");
    JButton cadastroLocacao = new JButton(" 3 - Cadastrar Locação ");
    JButton listarCliente = new JButton(" 4 - Listar Clientes ");
    JButton listarVeiculo = new JButton(" 5 - Listar Veículos ");
    JButton listarLocacao = new JButton(" 6 - Listar Locações ");
    JButton sair = new JButton(" Sair ");

    public Menu() {

        ActionListener cadastrarClientes = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCadastroClientes(e);
            }
        };

        ActionListener cadastrarVeiculos = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCadastrarVeiculos(e);
            }
        };

        ActionListener cadastrarLocacoes = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCadastrarLocacoes(e);
            }
        };

        ActionListener listarClientes = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleListarClientes(e);
            }
        };

        ActionListener listarVeiculos = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handlelistarVeiculos(e);
            }
        };

        ActionListener listarLocacoes = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleListarLocacoes(e);
            }
        };

        Container pane1 = this.getContentPane();

        pane1.setLayout(new FlowLayout());
        pane1.add(sistemaLocacao);
        pane1.add(cadastroCliente);
        pane1.add(cadastroVeiculo);
        pane1.add(cadastroLocacao);
        pane1.add(listarCliente);
        pane1.add(listarVeiculo);
        pane1.add(listarLocacao);
        pane1.add(sair);

        this.setSize(200, 250);
        this.setVisible(true);

    }

    private void handleCadastroClientes(ActionEvent e) {
        CadastroCliente cadastrarClientes = new CadastroCliente();
        cadastrarClientes.setVisible(true);
    }

    private void handleCadastrarVeiculos(ActionEvent e) {

    }

    private void handleCadastrarLocacoes(ActionEvent e) {

    }

    private void handleListarClientes(ActionEvent e) {

    }

    private void handlelistarVeiculos(ActionEvent e) {

    }

    private void handleListarLocacoes(ActionEvent e) {

    }

    private void buttonConfirmationActionPerformed(ActionEvent e) { // Utilizar na Opção de sair do Menu
        int mensagem = JOptionPane.showConfirmDialog(this, "Deseja sair do menu?", "Sair", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (mensagem == JOptionPane.OK_CANCEL_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            Menu main = new Menu();

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(" CADASTRAR CLIENTE: ");

                    System.out.println("Informe o ID do cliente: ");
                    int idCliente = scanner.nextInt();

                    System.out.println("Informe o nome do cliente: ");
                    String nome = scanner.next();

                    System.out.println("Informe o C.P.F. do cliente: ");
                    String cpf = scanner.next();

                    boolean dateOK = false;
                    Date dtnascimento = new Date();
                    do {
                        System.out.println("Informe a data de nascimento do cliente (dd/mm/aaaa): ");
                        String stringDate = scanner.next();
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
                            String cor = scanner.next();

                            System.out.println("Insira a marca: ");
                            String marca = scanner.next();

                            System.out.println("Insira o modelo do veiculo: ");
                            String modelo = scanner.next();

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
                            String restricoes = scanner.next();

                            System.out.println("Insira a marca: ");
                            String marcaDois = scanner.next();

                            System.out.println("Insira o modelo do veiculo: ");
                            String modeloDois = scanner.next();

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
                    String dtLocacao = scanner.next();

                    System.out.println("Insira a data para devolução do veiculo (dd/mm/aaaa): ");
                    String dtDevolucao = scanner.next();

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
