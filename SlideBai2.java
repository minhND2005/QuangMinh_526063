import java.util.Scanner;

public class SlideBai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Nhap " + n + " phan tu:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Nhap so nguyen can tim: ");
        int target = scanner.nextInt();

        boolean found = false;
        System.out.print("Chi so (bat dau tu 0) cua phan tu " + target + ": ");
        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("khong tim thay");
        }
        System.out.println();

        scanner.close();
    }
}
