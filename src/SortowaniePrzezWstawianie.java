public class SortowaniePrzezWstawianie {
    public static void main(String[] args) {
        int[] tablica = {3, 6, 4, 8, 2, 1, 7, 5};
        int temp;

        System.out.println("Tablica przed sortowaniem:");
        for (int element : tablica) System.out.print(element + " ");
        System.out.println();

        for (int i = tablica.length - 2; i >= 0; i--) {
            temp = tablica[i];
            for (int j = i + 1; j < tablica.length; j++) {
                if (temp > tablica[j]) {
                    tablica[j - 1] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }
        System.out.println("Tablica po sortowaniu:");
        for (int element : tablica) System.out.print(element + " ");
    }
}
