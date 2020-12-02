import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Teste {
  public static void main(String[] args) {

    // Primeira maneira de trabalhar com datas

    Date data = new Date(1999 - 10 - 02);
    Date dataLoca = new Date(2020 - 10 - 10);
    Date dataDevo = new Date(2020 - 10 - 15);

    Cliente cliente1 = new Cliente(1, "Luiz", data, "2928282", 7);
    Locacao locacao1 = new Locacao(1, 1, dataLoca, dataDevo);
    Veiculosleves veicuLeve = new Veiculosleves(1, "Preto", "Ford", "Fiesta", 1900, 100.20);
    Veiculospesados veicuPesa = new Veiculospesados(1, "CATEGORIA AB", "Volco", "Scania", 2000, 1000.26);
    Veiculoslocados veicuLocado = new Veiculoslocados(1, 1, 1);

    System.out.println(cliente1);
    System.out.println(locacao1);
    System.out.println(veicuLeve);
    System.out.println(veicuPesa);
    System.out.println(veicuLocado);

    // Segunda maneira de trabalhar com datas

    LocalDate inicioDataLocacao = LocalDate.of(2020, 3, 7);
    LocalDate fimDataLocacao = LocalDate.of(2020, 10, 10);

    Period periodo = Period.between(inicioDataLocacao, fimDataLocacao);
    System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");

    try {

      Conexao.getConnection();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
