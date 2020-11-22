import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
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

                    new Cliente(idCliente, nome, dtnascimento, cpf, diasparadevolucao);

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
                    scanner.close();

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

                    menu.close();

            }
        }
    }
}
