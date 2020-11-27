import java.util.Scanner;
import javax.swing.JFrame;
import java.util.Date;
import java.util.Calendar;
import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

  
    JLabel sistemaLocacao = new JLabel(" Sistema de Locação de Veiculos ");
    JButton cadastroCliente = new JButton(" 1 - Cadastrar Cliente ");
    JButton cadastroVeiculo = new JButton(" 2 - Cadastrar Veículo   ");
    JButton cadastroLocacao = new JButton(" 3 - Cadastrar Locação ");
    JButton listarCliente = new JButton(" 4 - Listar Clientes ");
    JButton listarVeiculo = new JButton(" 5 - Listar Veículos ");
    JButton listarLocacoes = new JButton(" 6 - Listar Locações ");
    JButton sair = new JButton(" Sair ");

    public Menu() {
        Container pane = this.getContentPane();

        pane.setLayout(new FlowLayout());
        pane.add(sistemaLocacao);
        pane.add(cadastroCliente);
        pane.add(cadastroVeiculo);
        pane.add(cadastroLocacao);
        pane.add(listarCliente);
        pane.add(listarLocacoes);
        pane.add(sair);

        

        this.setSize(200, 250);
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
