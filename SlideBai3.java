import java.util.Scanner;

public class SlideBai3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap cac so nguyen, cach nhau boi dau cach:");
            String input = scanner.nextLine().trim();
            
            int count = 0;
            long sum = 0;
            
            if (!input.isEmpty()) {
                String[] elements = input.split("\\s+");
                count = elements.length;
                
                for (String element : elements) {
                    sum += Integer.parseInt(element);
                }
            }
            
            System.out.println("So phan tu: " + count + "; Tong: " + sum);
        }
    }
}
