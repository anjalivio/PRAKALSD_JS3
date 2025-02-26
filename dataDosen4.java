public class dataDosen4 {
    public static void dataDosen(dosen4[] arrayOfDosen) {
        System.out.println("        Data Semua Dosen ");
        System.out.println("================================");
        for (dosen4 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
    }
    public static void jumlahDosen(dosen4[] arrayOfDosen) {
        int jmlP = 0, jmlW = 0;
        for (dosen4 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jmlP++;
            } else {
                jmlW++;
            }
        }
        System.out.println("Jumlah Dosen Pria  : " + jmlP);
        System.out.println("Jumlah Dosen Wanita: " + jmlW);
    }
    public static void rataUsia(dosen4[] arrayOfDosen) {
        int totalUsiaPria = 0, jmlP = 0;
        int totalUsiaWanita = 0, jmlW = 0;

        for (dosen4 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) { 
                totalUsiaPria += dosen.usia;
                jmlP++;
            } else { 
                totalUsiaWanita += dosen.usia;
                jmlW++;
            }
        }
        System.out.println("================================");
        System.out.println("Rata-rata Usia Dosen Pria  : " + (jmlP > 0 ? (totalUsiaPria / jmlP) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita: " + (jmlW > 0 ? (totalUsiaWanita / jmlW) : 0));
        System.out.println("================================");
    }
    public static void infoTertua(dosen4[] arrayOfDosen) {
        if (arrayOfDosen.length == 0)
            return;
        dosen4 dosenTertua = arrayOfDosen[0];
        for (dosen4 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("        Dosen Paling Tua ");
        System.out.println("================================");
        dosenTertua.tampilkanInfo();
    }
    public static void infoTermuda(dosen4[] arrayOfDosen) {
        if (arrayOfDosen.length == 0)
            return;
        dosen4 dosenTermuda = arrayOfDosen[0];
        for (dosen4 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("        Dosen Paling Muda ");
        System.out.println("================================");
        dosenTermuda.tampilkanInfo();
    }
}
