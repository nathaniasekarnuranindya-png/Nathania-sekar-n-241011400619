import java.util.Scanner;

public class NilaiKehadiran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan persentase kehadiran: ");
        int kehadiran = input.nextInt();

        if (kehadiran >= 75) {
            if (kehadiran >= 80) {
                System.out.println("Nilai: A");
            } else if (kehadiran >= 70) {
                System.out.println("Nilai: B");
            } else if (kehadiran >= 60) {
                System.out.println("Nilai: C");
            } else if (kehadiran >= 55) {
                System.out.println("Nilai: D");
            } else {
                System.out.println("Nilai: E");
            }
        } else {
            System.out.println("Tidak memenuhi syarat (kehadiran < 75%)");
        }

        input.close();
    }
}