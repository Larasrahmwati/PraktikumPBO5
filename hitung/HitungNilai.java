package hitung;
import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("NPM : ");
        String npm = scanner.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String nama = scanner.nextLine();
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = Double.parseDouble(scanner.nextLine());
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = Double.parseDouble(scanner.nextLine());
        System.out.print("Nilai UTS : ");
        double nilaiUTS = Double.parseDouble(scanner.nextLine());
        System.out.print("Nilai UAS : ");
        double nilaiUAS = Double.parseDouble(scanner.nextLine());
        
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);
        
        char grade;
        if (nilaiAkhir >= 76) {
            grade = 'A';
        } else if (nilaiAkhir >= 66) {
            grade = 'B';
        } else if (nilaiAkhir >= 56) {
            grade = 'C';
        } else if (nilaiAkhir >= 46) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        
        String keterangan;
        if (grade == 'A') {
            keterangan = "ISTIMEWA";
        } else if (grade == 'B') {
            keterangan = "BAIK";
        } else if (grade == 'C') {
            keterangan = "CUKUP";
        } else if (grade == 'D') {
            keterangan = "KURANG";
        } else {
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println("NPMMahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
