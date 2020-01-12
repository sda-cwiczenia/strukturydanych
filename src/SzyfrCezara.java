import java.util.Scanner;

public class SzyfrCezara {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);
        String wiadomoscOdCezara;
        System.out.println("Podaj wiadomość.");
        wiadomoscOdCezara = podaj.nextLine();
        char znak;
        int wielkosc;
        System.out.print("Oto wiadomość zaszyfrowana: ");
        for (int i = 0; i < wiadomoscOdCezara.length(); i++) {
            znak = wiadomoscOdCezara.charAt(i);
            if ((int) znak > 64 && (int) znak < 91)
                wielkosc = 0;  //duża litera
            else {
                if ((int) znak > 96 && (int) znak < 123)
                    wielkosc = 1;  //mała litera
                else
                    wielkosc = 3;  //inny znak
            }
            char znakCezara;
            switch (wielkosc) {
                case 1:
                    znakCezara = (char) (97 + ((((int) znak - 97) + 3) % 26));
                    System.out.print(znakCezara);
                    break;
                case 0:
                    znakCezara = (char) (65 + ((((int) znak - 65) + 3) % 26));
                    System.out.print(znakCezara);
                    break;
                case 3:
                    System.out.print(znak);
            }
        }
    }
}