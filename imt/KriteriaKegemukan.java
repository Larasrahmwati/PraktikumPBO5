package imt;

import java.util.Scanner;

public class KriteriaKegemukan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berat Badan (kg): ");
        double beratBadan = scanner.nextDouble();
        System.out.print("Tinggi Badan (m): ");
        double tinggiBadan = scanner.nextDouble();
     
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        //kriteria kegemukan
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }
        
        System.out.println("Nilai IMT: " + imt);
        System.out.println("Kriteria Kegemukan: " + kriteria);
    }
}

