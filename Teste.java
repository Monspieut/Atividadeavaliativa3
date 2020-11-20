import java.util.Date;
import java.util.Calendar;

public class Teste {
    public static void main(String[] args) {
      Date dtLocacao = Calendar.getTime(10,02,2010);
      Veiculosleves veiculolev1 = new Veiculosleves(1, "preto", "VW", "GOl", 2010, 100.0);
      Veiculospesados veiculopes1 = new Veiculospesados(1, "null", "Fiat", "Fiorino", 2015, 150.0);
      Cliente cliente1 = new Cliente(1, "José", dtLocacao,"01232545" ,2);
      Veiculoslocados veiculoloca1 = new Veiculoslocados(1, 1, 2);
      

        
    }
}
   


