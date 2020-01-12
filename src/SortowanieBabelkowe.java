public class SortowanieBabelkowe {
    public static void main(String[] args) {
        int[] tablica = {3, 4, 5, 2, 1};
        int temp;
        int licznik=0;

        // tutaj posortujemy tablicę
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length-1-i; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    //to zamieniamy elementy
                    temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
                licznik++;
            }
        }

        for (int liczba : tablica) System.out.print(liczba + " ");
        System.out.println("Ilość przebiegów pętli : "+licznik);
    }
}
