import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = sc.nextInt();
        if (N < 5) {
            System.out.println("Nilai N minimal 5");
        }else
        for (int i = N; i > 0; i--) {
            int row = N;
            while (row > 0) {
                System.out.print("*");
                row--;
            }
            System.out.print("\n");
            N--;
        }
    }
}
