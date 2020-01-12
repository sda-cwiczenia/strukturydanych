import java.util.Scanner;

public class Bankomat3 {
    public static void main(String[] args) {
        int kwota;
        int[] nominaly = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] iloscNominalow = new int[nominaly.length];

        System.out.print("Podaj wartość wypłaty z bankomatu : ");
        Scanner pobierz = new Scanner(System.in);
        kwota = pobierz.nextInt();

        for (int i=0; i<nominaly.length; i++) {
            iloscNominalow[i] = (int)(kwota/nominaly[i]);
            kwota = kwota - iloscNominalow[i]*nominaly[i];
        }

        System.out.println("Bankomat wypłaci:");
        for (int i=0; i<nominaly.length; i++) {
            if (iloscNominalow[i] == 0) continue;
            else System.out.println("Kwota : "+nominaly[i]+" - ilość : "+iloscNominalow[i]);
        }

    }
}
