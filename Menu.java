package view;

import java.util.Scanner;
import javax.swing.JFrame;

import DAO.ClienteDAO; //Fazendo os imports para trabalhar com as pastas e as classes
import DAO.LocacaoDAO;
import DAO.VeiculoPesadoDAO;
import DAO.VeiculosLeveDAO;
import models.Locacao;
import models.Veiculosleves;
import models.Veiculospesados;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Menu extends JFrame { // Menu com Interface gráfica (Frontend)

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

        // Criando o ActionListener para aguardar a execução

        ActionListener acaoCadastroCliente = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCadastroCliente(e);
            }
        };

        ActionListener acaoCadastroVeiculo = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCadastrarVeiculo(e);
            }
        };

        ActionListener acaoCadastroLocacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCadastrarLocacao(e);
            }
        };

        ActionListener acaoListarCliente = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleListarCliente(e);
            }
        };

        ActionListener acaoListarVeiculo = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handlelistarVeiculo(e);
            }
        };

        ActionListener acaoListarLocacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleListarLocacao(e);
            }
        };

        ActionListener acaoSair = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleSair(e);
            }
        };

        Container pane1 = this.getContentPane();

        // Criando os labels e os butttons para vizualização e utilização da tela

        pane1.setLayout(new FlowLayout());
        pane1.add(sistemaLocacao);
        pane1.add(cadastroCliente);
        pane1.add(cadastroVeiculo);
        pane1.add(cadastroLocacao);
        pane1.add(listarCliente);
        pane1.add(listarVeiculo);
        pane1.add(listarLocacao);
        pane1.add(sair);

        this.setSize(230, 300);
        this.setVisible(true);

        cadastroCliente.addActionListener(acaoCadastroCliente);
        cadastroVeiculo.addActionListener(acaoCadastroVeiculo);
        cadastroLocacao.addActionListener(acaoCadastroLocacao);
        listarCliente.addActionListener(acaoListarCliente);
        listarVeiculo.addActionListener(acaoListarVeiculo);
        listarLocacao.addActionListener(acaoListarLocacao);
        sair.addActionListener(acaoSair);
    }

    // Chamando os métodos das classes

    private void handleCadastroCliente(ActionEvent e) {
        new CadastroCliente();
    }

    private void handleCadastrarVeiculo(ActionEvent e) {
        new CadastroVeiculo();

    }

    private void handleCadastrarLocacao(ActionEvent e) {
        new CadastroLocacao();
    }

    private void handleListarCliente(ActionEvent e) {
        new ListarCliente();

    }

    private void handlelistarVeiculo(ActionEvent e) {
        new ListarVeiculo();
    }

    private void handleListarLocacao(ActionEvent e) {
        new ListarVeiculo();
    }

    private void handleSair(ActionEvent e) { // Utilizar na Opção de sair do Menu
        int mensagem = JOptionPane.showConfirmDialog(this, "Deseja sair do menu?", "Sair", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (mensagem == JOptionPane.OK_CANCEL_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) throws SQLException {

        // Utilização do menu via terminal (Backend)

        Scanner scanner = new Scanner(System.in);

        while (true) {

            Menu main = new Menu();

            System.out.println("\n\n            Sistema de Locação de Veiculos ");
            System.out.println(" \n                   ==========================");
            System.out.println("                   |   1 - Cadastrar Cliente |         ");
            System.out.println("                   |   2 - Cadastrar Veiculo |        ");
            System.out.println("                   |  3 - Cadastrar LOCAÇÃO  |       ");
            System.out.println("                   |   4 - Listar Cliente    |     ");
            System.out.println("                   |   5 - Listar veiculos   |      ");
            System.out.println("                   |   6 - Listar Locações   |");
            System.out.println("                   |   0 - Sair              |");
            System.out.println("                   ==========================\n");
            System.out.println("                          Digite sua opção: \n");

            int menu = scanner.nextInt(); // Abrindo o scanner

            switch (menu) {

                // Cadastrando as informações de cliente

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

                    // Cadastrando as informações de veiculo podendo cadastrar com opção de veiculo
                    // leve ou pesado

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

                    // Cadastrando as informações de locação

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

                    // Listando os clientes cadastrados utilizando ArrayList

                    System.out.println(" LISTAR CLIENTES: ");
                    ArrayList<models.Cliente> clientes = ClienteDAO.listarTodosClientes();

                    for (models.Cliente cliente : clientes) {
                        System.out.println(cliente);
                    }
                    break;
                case 5:

                    // Listando os veiculos cadastrados utilizando ArrayList

                    System.out.println(" LISTAR VEICULOS: ");

                    System.out.println(" LISTAR Veiculos Leves: ");
                    ArrayList<Veiculosleves> veiculosLeves = VeiculosLeveDAO.listarVeiculosLeves();

                    for (models.Veiculosleves veicLeve : veiculosLeves) {
                        System.out.println(veiculosLeves);
                    }

                    System.out.println(" LISTAR Veiculos Pesados: ");
                    ArrayList<Veiculospesados> veiculosPesados = VeiculoPesadoDAO.listarVeiculoPesados();

                    for (models.Veiculospesados veicPesado : veiculosPesados) {
                        System.out.println(veiculosPesados);
                    }

                    break;
                case 6:

                    // Listando as locações cadastradas utilizando ArrayList

                    System.out.println(" LISTAR LOCAÇÕES: ");

                    ArrayList<Locacao> locacoess = LocacaoDAO.listarLocacoes();

                    for (models.Locacao locacao : locacoess) {
                        System.out.println(locacoess);
                    }

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
        scanner.close(); // Fechando o scanner
    }
}
