import java.util.Scanner;
public class dosenDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dosen4[] dataDosen = new dosen4[3];
        String dummy;
        for (int i = 0; i < dataDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode               : ");
            String kode = sc.nextLine();
            System.out.print("Nama               : ");
            String nama = sc.nextLine();
            boolean jenisKelamin = false;
            while (true) {
                System.out.print("Jenis Kelamin (L/P): ");
                char jk = sc.nextLine().trim().toUpperCase().charAt(0);
                if (jk == 'L') {
                    jenisKelamin = true;
                    break;
                } else if (jk == 'P') {
                    jenisKelamin = false;
                    break;
                } else {
                    System.out.println("Input salah! Masukkan 'L' untuk Laki-laki atau 'P' untuk Perempuan.");
                }
            }
            System.out.print("Usia               : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("================================");

            dataDosen[i] = new dosen4(kode, nama, jenisKelamin, usia);
        }
        
        // panggil method DataDosen
        dataDosen4.dataDosen(dataDosen);
        dataDosen4.jumlahDosen(dataDosen);
        dataDosen4.rataUsia(dataDosen);
        dataDosen4.infoTertua(dataDosen);
        dataDosen4.infoTermuda(dataDosen);
    }
}
