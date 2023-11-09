import java.util.Scanner;

public class NestedLoop_2341720086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        double[] rata2 = new double[5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            double jumlah = 0;
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
                jumlah = temps[i][j];
            }
            rata2 [i] = jumlah / 5;
            System.out.println();
        }
        
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double temperature : temps[i]) {
                System.out.print(temperature + " ");
            }
            System.out.print("dengan rata rata sebesar " + rata2[i]);
            System.out.println();
        }
    }
}
