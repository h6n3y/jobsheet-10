import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {

            System.out.print("Masukkan Nama  : ");
            nama = scan.nextLine();

            System.out.print("Masukkan Baris : ");
            baris = scan.nextInt();

            System.out.print("Masukkan Kolom : ");
            kolom = scan.nextInt();

            scan.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input Penonton lainnya? (Y/N) : ");
            next = scan.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}