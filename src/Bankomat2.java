import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bankomat2 {
    public static void main(String[] args) {
        int kwota;

        int ilosc500, ilosc200, ilosc100, ilosc50, ilosc20, ilosc10, ilosc5, ilosc2, ilosc1;
        List<Integer> listaNominalow = new ArrayList<>();
        List<Integer> iloscNominalow = new ArrayList<>();
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

        for (int i=0; i<listaNominalow.size(); i++) {
            iloscNominalow.add((int)(kwota/listaNominalow.get(i)));
            kwota = kwota - iloscNominalow.get(i)*listaNominalow.get(i);
        }


        System.out.println("Bankomat wypłaci :");
        for (int i=0 ; i<listaNominalow.size(); i++) {
            System.out.print("Ilosc "+listaNominalow.get(i)+" : "+iloscNominalow.get(i));
            System.out.println();
        }


    }
}
