public class Tablice {
    public static void main(String[] args) {

        String[] tablicaImion = new String[5];
        tablicaImion[0] = "Piotr";
        tablicaImion[1] = "Marta";
        tablicaImion[2] = "Adam";
        tablicaImion[3] = "Kasia";
        tablicaImion[4] = "Zosia";

        for (int i=tablicaImion.length-1; i>=0; i-=2) {
            System.out.println(tablicaImion[i]);
        }
    }
}
