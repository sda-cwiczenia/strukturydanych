public class LiczbyPierwsze {

    // Klasa złożoności obliczeniowej O(sgrt(n))
    public static void main(String[] args) {
        int liczba=153;
        int pierwiastek = (int)Math.sqrt(liczba);
        boolean czyLiczbaPierwsza = true;

        for (int i=2; i<=pierwiastek; i++) {
            if (liczba%i == 0) czyLiczbaPierwsza = false;
        }

        System.out.println("Czy liczba "+liczba+" jest liczbą pierwszą : "+czyLiczbaPierwsza);
    }
}
