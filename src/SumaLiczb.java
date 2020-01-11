import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaLiczb {
    public static void main(String[] args) {
        int iloscLiczb;
        List<Integer> listaLiczb = new ArrayList<>();
        List<Integer> listaSumaLiczb = new ArrayList<>();
        int ostatniaSuma=0;

        System.out.print("Podaj ile chcesz wczytać liczb: ");
        Scanner pobierz = new Scanner(System.in);
        iloscLiczb = pobierz.nextInt();

        for (int i=1 ; i<=iloscLiczb; i++) {
            System.out.print("Podaj liczbę :");
            listaLiczb.add(pobierz.nextInt());
            ostatniaSuma = ostatniaSuma + listaLiczb.get(i-1);
            listaSumaLiczb.add(ostatniaSuma);
        }
        for (int liczba : listaLiczb) System.out.print(liczba+" ");
        System.out.println();
        for (int liczba : listaSumaLiczb) System.out.print(liczba+" ");

    }
}
