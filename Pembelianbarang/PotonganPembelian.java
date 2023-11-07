package Pembelianbarang;

import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total pembelian Rp. = ");
        int totalPembelian = scanner.nextInt();

        int potongan;
        if (totalPembelian < 50000) {
            //total pembelian kurang dari Rp. 50.000,-, potongan 5%
            potongan = (int) (0.05 * totalPembelian);
        } else {
            //total pembelian lebih dari atau sama dengan Rp. 50.000,-, potongan 20%
            potongan = (int) (0.20 * totalPembelian);
        }

        int jumlahYangHarusDibayarkan = totalPembelian - potongan;

        System.out.println("Besarnya potongan Rp. " + potongan );
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahYangHarusDibayarkan );
    }
}
