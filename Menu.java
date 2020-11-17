import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n Sistema de Locação de Veiculos ###");
            System.out.println("\n                 =========================");
            System.out.println("                      1 - Cadastrar Cliente         ");
            System.out.println("                      2 - Cadastrar Veículo     ");
            System.out.println("                      3 - Cadastrar Locação       ");
            System.out.println("                      4 - Listar Clientes      ");
            System.out.println("                      5 - Listar Veículos    ");
            System.out.println("                      6 - Listar Locações   ");
            System.out.println("                      0 - Sair          ");
            System.out.println("                  =========================\n");

            int opcao = menu.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(" CADASTRAR CLIENTE: ");
                    
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
