import java.util.Scanner;

public class AryHerijanto {
    public static void main(String[] args) {
        Library.PrintTitle("Ujian Akhir Semester");
        Library.PrintTitle("DIV Teknik Informatika");
        Library.PrintTitle("Poltek Harapan Bersama");
        Library.PrintTitle("Ujian Akhir Semester");
        Library.PrintTitle("NIM : 2009xxxx");
        Library.PrintTitle("Nama : Ary Herijanto");
        Library.PrintTitle("Kelas : 1F");

        Library.PrintTitle("\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Jumlah Angka Yang Akan Dihitung = ");
        int jumlahAngka = sc.nextInt();

        int[] isiAngka = new int[jumlahAngka];
        int noUrut = 1;
        for (int index = 0; index < isiAngka.length;index++){

            System.out.print("Masukkan Angka Ke " + noUrut + " = " );
            isiAngka[index] = sc.nextInt();
            noUrut++;
        }

        System.out.println("Panjang Array adalah " + isiAngka.length);
        Library.PrintTitle("\n");
        Library.HitungTotalAngka(isiAngka);
    }
}
