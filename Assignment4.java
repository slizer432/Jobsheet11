import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] dataAtlet = {{"Joko","Badminton"},
                                {"Arif","Badminton"},
                                {"Heru","Badminton"},
                                {"Rayhan","Badminton"},
                                {"Alif","Badminton"},
                                {"Diyaz","Tenis meja"},
                                {"Tora","Tenis meja"},
                                {"Abib","Tenis meja"},
                                {"Abdillah","Tenis meja"},
                                {"Ajeng","Tenis meja"},
                                {"Rafedo","Basket"},
                                {"Cleva","Basket"},
                                {"Pinkan","Basket"},
                                {"Raisa","Basket"},
                                {"Abdillah","Basket"},
                                {"Abil","Bola voly"},
                                {"Adil","Bola voly"},
                                {"Rosa","Bola voly"},
                                {"Rijal","Bola voly"},
                                {"Nisa","Bola voly"}};
        
        for (int i = 0; i < dataAtlet.length - 1; i++) {
            for (int j = 0; j < dataAtlet.length - i - 1; j++) {
                if (dataAtlet[j][0].compareTo(dataAtlet[j + 1][0]) > 0) {
                    String[] temp = dataAtlet[j];
                    dataAtlet[j] = dataAtlet[j + 1];
                    dataAtlet[j + 1] = temp;
                }
            }
        }
        System.out.println("\nInformasi Atlet Porseni 2024:");
        for (String[] atlet : dataAtlet) {
            System.out.println("Nama: " + atlet[0] + ", Cabang: " + atlet[1]);
        }
    }
}
