import java.util.Scanner;

public class KodCezara {
    public static void main(String[] args) {
        String tekst;
        char[] tablicaLiter;
        char[] tablicaZakodowana;

        System.out.print("Podaj tekst do zakodowania : ");
        Scanner pobierz = new Scanner(System.in);
        tekst = pobierz.nextLine();
        tablicaLiter = tekst.toCharArray();

        tablicaZakodowana = new char[tablicaLiter.length];
        for (int i = 0; i < tablicaLiter.length; i++) {
            switch (tablicaLiter[i]) {
                case 'x':
                    tablicaZakodowana[i] = 'a';
                    break;
                case 'y':
                    tablicaZakodowana[i] = 'b';
                    break;
                case 'z':
                    tablicaZakodowana[i] = 'c';
                    break;
                case 'X':
                    tablicaZakodowana[i] = 'A';
                    break;
                case 'Y':
                    tablicaZakodowana[i] = 'B';
                    break;
                case 'Z':
                    tablicaZakodowana[i] = 'C';
                    break;
                default: {
                    if (((int) tablicaLiter[i] >= 65 && (int) tablicaLiter[i] <= 87) || ((int) tablicaLiter[i] >= 97 && (int) tablicaLiter[i] <= 119))
                        tablicaZakodowana[i] = (char) ((int) tablicaLiter[i] + 3);
                    else tablicaZakodowana[i] = tablicaLiter[i];
                }

            }

        }

        System.out.println("Tekst zakodowany :");
        for (char znak : tablicaZakodowana) System.out.print(znak);

    }
}
