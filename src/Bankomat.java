import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int kwota;
        int pozostalaKwota;
        int ilosc500, ilosc200, ilosc100, ilosc50, ilosc20, ilosc10, ilosc5, ilosc2, ilosc1;
        List<Integer> listaNominalow = new ArrayList<>();
        listaNominalow.add(500);
        listaNominalow.add(200);
        listaNominalow.add(100);
        listaNominalow.add(50);
        listaNominalow.add(20);
        listaNominalow.add(10);
        listaNominalow.add(5);
        listaNominalow.add(2);
        listaNominalow.add(1);

        Scanner pobierz = new Scanner(System.in);
        System.out.print("Podaj kwotę do wypłaty: ");
        kwota = pobierz.nextInt();

        //ilośc 500zł
        ilosc500 = (int)kwota/500;
        kwota = kwota-ilosc500*500;

        //ilośc 200zł
        ilosc200 = (int)kwota/200;
        kwota = kwota-ilosc200*200;

        System.out.println("Bankomat wypłaci :");
        System.out.println("500zł : "+ilosc500);
        System.out.println("200zł : "+ilosc200);


    }
}
