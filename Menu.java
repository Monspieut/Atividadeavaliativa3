import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Menu {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
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

            int opcao = menu.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(" CADASTRAR CLIENTE: ");
                    System.out.println("Digite o ID do cliente: ");
                    int id = scanner.nextInt();
                    System.out.println("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o C.P.F. do cliente: ");
                    String cpf = scanner.nextLine();

                    boolean dateOK = false;
                    Date dtnascimento = new Date();
                    do {
                        System.out.println("Digite a data de nascimento do cliente (dd/mm/aaaa): ");
                        String stringDate = scanner.nextLine();
                        try {
                            dtnascimento = UseCalendar.parseDate(stringDate);
                            dateOK = true;
                        } catch (Exception e) {
                            System.out.println("Data em formato inválido, digite novamente.");
                        }
                    } while (!dateOK);

                    System.out.println("Digite os dias de devolução do cliente: ");
                    int diasparadevolucao = scanner.nextInt();
                    new Cliente(id, nome, dtnascimento, cpf, diasparadevolucao);

                    break;

                case 2:

                    System.out.println(" CADASTRAR VEICULO: ");

                    break;
                case 3:

                    System.out.println(" CADASTRAR LOCAÇÃO: ");
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
            menu.close();

        }
    }
}
