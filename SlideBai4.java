import java.util.Scanner;

public class SlideBai4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so luong hinh: ");
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("So luong hinh khong duoc am.");
                scanner.close();
                return;
            }
            
            Hinh[] danhSachHinh = new Hinh[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\nChon loai hinh cho hinh thu " + (i + 1) + ":");
                System.out.println("1. Tam giac");
                System.out.println("2. Hinh tron");
                System.out.println("3. Chu nhat");
                System.out.print("Lua chon: ");
                int luaChon = scanner.nextInt();
                
                switch (luaChon) {
                    case 1 -> {
                        System.out.print("Nhap ba canh tam giac: ");
                        danhSachHinh[i] = new TamGiac(
                                scanner.nextDouble(),
                                scanner.nextDouble(),
                                scanner.nextDouble());
                    }
                    case 2 -> {
                        System.out.print("Nhap ban kinh hinh tron: ");
                        danhSachHinh[i] = new HinhTron(scanner.nextDouble());
                    }
                    case 3 -> {
                        System.out.print("Nhap chieu dai va chieu rong: ");
                        danhSachHinh[i] = new ChuNhat(
                                scanner.nextDouble(),
                                scanner.nextDouble());
                    }
                    default -> {
                        System.out.println("Loai hinh khong hop le, vui long nhap lai.");
                        i--;
                    }
                }
            }
            
            System.out.println("\nKet qua:");
            for (int i = 0; i < danhSachHinh.length; i++) {
                System.out.printf("Hinh %d - Chu vi: %.2f; Dien tich: %.2f%n",
                        i + 1,
                        danhSachHinh[i].tinhChuVi(),
                        danhSachHinh[i].tinhDienTich());
            }
        }
    }
}
