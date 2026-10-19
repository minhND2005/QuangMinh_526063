
import java.util.Scanner;

public class SlideBai1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n, tong = 0;
            int[] a = new int[100];
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            // Nhap mang
            for (int i = 0; i < n; i++) {
                System.out.print("a[" + i + "] = ");
                a[i] = sc.nextInt();
            }   // In mang va tinh tong
            System.out.print("Mang vua nhap: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
                tong = tong + a[i];
            }   System.out.println("\nTong cac phan tu = " + tong);
        }
    }
}
