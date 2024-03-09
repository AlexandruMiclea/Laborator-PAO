import Curieri.Livrare;
import Produse.Electrocasnic;
import Produse.Haina;

//tema -> exemplu de multiple inheritance cu 4 clase cu static final, interfata, overriding si overloading in diverse clase
public class Main {
    public static void main(String[] args) {
        Electrocasnic e = new Electrocasnic("Masina de spalat", 1259.99, 140, 2600, "Whirpool");
        Haina h = new Haina("Bluza Emporio Armani", 499.99, 0.2, "M", "Lana");
        Livrare ptMasina = new Livrare("Fan Courier", "Baciului 25", "Maine", 15);
        Livrare ptBluza = new Livrare("DPD courier", "La mine acasa", "25.04.2024", 9);
        System.out.println(ptMasina.CalculeazaCostTransport(e));
        System.out.println(ptBluza.CalculeazaCostTransport(h));
        ptMasina.ConfirmaLivrare(e);
        ptBluza.Livreaza("Academiei 14");
        ptMasina.Livreaza();
        ptBluza.Livreaza();
        ptBluza.ConfirmaLivrare(h);
        ptBluza.Livreaza();
    }
}
