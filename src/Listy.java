import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listy {
    public static void main(String[] args) {
        List<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(5);
        listaLiczb.add(2);
        listaLiczb.add(7);
        listaLiczb.add(12);
        listaLiczb.add(4);
        listaLiczb.add(1);
        listaLiczb.add(8);



        for (int liczba : listaLiczb) {
            System.out.print(liczba+" ");
        }
        System.out.println();
        Collections.reverse(listaLiczb);
        System.out.println("W kolejności odwrotnej:");

        for (int liczba : listaLiczb) {
            System.out.print(liczba+" ");
        }

        Collections.sort(listaLiczb);
        System.out.println("Dane posortowane:");

        for (int liczba : listaLiczb) {
            System.out.print(liczba+" ");
        }

//        for (int i=listaLiczb.size()-1; i>=0; i--) {
//            System.out.print(listaLiczb.get(i)+" ");
//        }
    }
}
