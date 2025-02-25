import java.util.Scanner;

public class MataKuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Matkul : ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());

        Matakuliah04[] arrayOfMatakuliah = new Matakuliah04[jumlahMatkul];

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = Matakuliah04.tambahData(sc);
        }
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo(i);
        }
    }
}
