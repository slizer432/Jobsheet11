import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
       for (int i = 0; i < N; i++) {
           System.out.print(N);
        }
        System.out.print("\n");
        for (int i = 2; i < N; i++) {
            System.out.print(N);
            for (int j = 2; j < N; j++) {
                System.out.print(" ");
            }
            System.out.print(N);
            System.out.print("\n");
        }
        for (int i = 0; i < N; i++) {
            System.out.print(N);
        }
    }
    
}
