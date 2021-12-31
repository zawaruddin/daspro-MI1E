// Fitrah Rahmadhani Ahmad (06)
// 2131710092
// MI-1E

import java.util.*;

public class FitrahRahmadhaniAhmad_TugasAkhir {
    static Scanner inputUser = new Scanner(System.in);
    static String[][] hasilDataPegawai;
    static int[][] dataGaji;
    static int lokasi, status, jalan, jumlah;
    public static void main(String[] args) {
        welcome();
    }
    private static void welcome() {
        String inputAwal;
        System.out.println("====================================");
        System.out.println("========== Selamat Datang ==========");
        System.out.println("====================================\n");
        System.out.println("A. INFORMASI APLIKASI");
        System.out.println("B. MASUK APLIKASI");
        System.out.println("C. KELUAR\n");
        System.out.print("Pilih menu... ");
        inputAwal = inputUser.next();
        if (inputAwal.equalsIgnoreCase("A")) {
            informasi();
        } else if (inputAwal.equalsIgnoreCase("B")) {
            masukAplikasi();
            menu();
        }else if (inputAwal.equalsIgnoreCase("C")) {
            System.out.println("=== Selesai ===");
        } else {
            System.out.println("\n=== Data yang Anda masukkan salah!===\n");
            welcome();
        }
    }
    public static void masukAplikasi(){
        System.out.print("\n==== Input Data Pegawai ====\nMasukkan jumlah pegawai: ");
        jumlah = inputUser.nextInt();
        hasilDataPegawai = new String[jumlah][1];
        for (int b = 0; b < hasilDataPegawai.length; b++) {
            System.out.print("Nama pegawai " + (b + 1) + ": ");
            hasilDataPegawai[b][0] = inputUser.next();
        }
        dataGaji = new int[jumlah][3];
        for(int b = 0; b < dataGaji.length; b++){
            System.out.println("\n=============================================");
            System.out.print(hasilDataPegawai[b][0] + " masuk kerja selama(hari): ");
            dataGaji[b][0] = inputUser.nextInt();
            System.out.print(hasilDataPegawai[b][0] + " lembur selama(jam): ");
            dataGaji[b][1] = inputUser.nextInt();
            System.out.print(hasilDataPegawai[b][0] + " terlambat(jam): ");
            dataGaji[b][2] = inputUser.nextInt();
            System.out.println("=============================================\n");
        }
    }
    private static void menu(){
        String input;
        int jawaban = 1;
        while (jawaban == 1) {
            System.out.println("\n===== DAFTAR MENU =====");
            System.out.println("A. CETAK SLIP GAJI");
            System.out.println("B. PENCARIAN DATA PEGAWAI");
            System.out.println("C. PELAPORAN");
            System.out.println("D. GANTI PEGAWAI");
            System.out.println("E. TAMBAH PEGAWAI");
            System.out.println("F. KELUAR APLIKASI");
            System.out.print("Pilih menu yang Anda tuju ... ");
            input = inputUser.next();
            if(input.equalsIgnoreCase("F")){
                System.out.println("=== Selesai ===");
                jawaban = 0;
            }else {
                seleksi(input);
                System.out.print("\nTekan 1 (daftar menu)\nTekan 0 (mengakhiri program)\nMasukkan jawaban...");
                jawaban = inputUser.nextInt();
            }
        }
    }
    private static void informasi() {
        String input;
        int jawaban = 1;
        while (jawaban == 1) {
            System.out.println("====================== INFORMASI =====================\n");
            System.out.println("Selamat Datang di aplikasi Penggajian PT. Restu Bumi");
            System.out.println("Halaman ini berisi pengenalan dan tata cara penggunaan\naplikasi\n");
            System.out.println("A. CETAK SLIP GAJI");
            System.out.println("B. PENCARIAN DATA PEGAWAI");
            System.out.println("C. PELAPORAN");
            System.out.println("D. ATURAN GAJI");
            System.out.println("E. GANTI PEGAWAI");
            System.out.println("F. TAMBAH PEGAWAI");
            System.out.println("G. KEMBALI");
            System.out.print("\nPilih menu... ");
            input = inputUser.next();
            if (input.equalsIgnoreCase("G")) {
                jawaban = 0;
                welcome();
            } else {
                seleksiInformasi(input);
                System.out.print("\nTekan 1 (halaman Informasi)\nTekan 0 (kembali)\nMasukkan jawaban...");
                jawaban = inputUser.nextInt();
                if(jawaban == 0){
                    welcome();
                }
            }
        }
    }
    private static void tambahPegawai(){
        int tambah, total;
        System.out.print("Masukkan jumlah pegawai baru: ");
        tambah = inputUser.nextInt();
        total = hasilDataPegawai.length + tambah;
        String[][] dataPegawaiSementara = new String[(hasilDataPegawai.length)][1];
        int[][] dataGajiSementara = new int[dataGaji.length][3];
        for(int a = 0; a < dataPegawaiSementara.length; a++){
            dataPegawaiSementara[a][0] = hasilDataPegawai[a][0];
            dataGajiSementara[a][0] = dataGaji[a][0];
            dataGajiSementara[a][1] = dataGaji[a][1];
            dataGajiSementara[a][2] = dataGaji[a][2];
        }
        hasilDataPegawai = new String[total][1];
        dataGaji = new int[total][3];
        for(int b = 0; b < dataPegawaiSementara.length; b++){
            hasilDataPegawai[b][0] = dataPegawaiSementara[b][0];
            dataGaji[b][0] = dataGajiSementara[b][0];
            dataGaji[b][1] = dataGajiSementara[b][1];
            dataGaji[b][2] = dataGajiSementara[b][2];
        }
        for (int b = (hasilDataPegawai.length - tambah); b < total; b++) {
            System.out.print("Nama pegawai " + (b + 1) + ": ");
            hasilDataPegawai[b][0] = inputUser.next();
        }
        for(int b = (hasilDataPegawai.length - tambah); b < total; b++) {
            System.out.println("\n=============================================");
            System.out.print(hasilDataPegawai[b][0] + " masuk kerja selama(hari): ");
            dataGaji[b][0] = inputUser.nextInt();
            System.out.print(hasilDataPegawai[b][0] + " lembur selama(jam): ");
            dataGaji[b][1] = inputUser.nextInt();
            System.out.print(hasilDataPegawai[b][0] + " terlambat(jam): ");
            dataGaji[b][2] = inputUser.nextInt();
            System.out.println("=============================================\n");
        }
    }
    private static void seleksi(String input){
        String cari;
        if (input.equalsIgnoreCase("A")) {
            //fungsi cetak slip gaji
            System.out.print("Masukkan nama pegawai: ");
            cari = inputUser.next();
            jalan = 1;
            cek(jalan, cari, hasilDataPegawai, dataGaji);
        } else if (input.equalsIgnoreCase("B")) {
            //fungsi pencarian data pegawai
            System.out.print("Masukkan nama pegawai: ");
            cari = inputUser.next();
            jalan = 2;
            cek(jalan, cari, hasilDataPegawai, dataGaji);
        } else if (input.equalsIgnoreCase("C")) {
            //fungsi pelaporan
            pelaporan(dataGaji, hasilDataPegawai);
        } else if (input.equalsIgnoreCase("D")) {
            //fungsi aturan gaji
            gantiPegawai(hasilDataPegawai);
        } else if (input.equalsIgnoreCase("E")){
            tambahPegawai();
        } else{
            System.out.println("\n=== Data yang Anda masukkan salah!===\n");
        }
    }
    private static void seleksiInformasi(String input){
        if(input.equalsIgnoreCase("A")){
            System.out.println("\nCETAK SLIP GAJI berfungsi untuk mencetak struk gaji tiap karyawan\nyang dicari");
        }else if(input.equalsIgnoreCase("B")){
            System.out.println("\nPENCARIAN DATA PEGAWAI berfungsi untuk mencari riwayat aktivitas\nyang telah dilakukan pegawai dalam 1 bulan kerja");
        }else if(input.equalsIgnoreCase("C")){
            System.out.println("\nPELAPORAN berfungsi untuk mencetak semua struk gaji karyawan");
        }else if(input.equalsIgnoreCase("D")){
            aturanGaji();
        }else if(input.equalsIgnoreCase("E")){
            System.out.println("\nGANTI PEGAWAI berfungsi untuk mengganti data seorang pegawai\nlengkap dengan nama dan aktivitas kehadiran selama satu bulan\nkerja");
        }else if(input.equalsIgnoreCase("F")){
            System.out.println("\nTAMBAH PEGAWAI berfungsi untuk menambah data beberapa pegawai\nbaru lengkap dengan nama dan aktivitas kehadiran selama satu\nbulan kerja");
        }else{
            System.out.println("\n=== Data yang Anda masukkan salah!===");
        }
    }
    private static void aturanGaji(){
        System.out.println("\n========== ATURAN GAJI PT. RESTU BUMI ==========\n\n");
        System.out.println("Sebulan karyawan bekerja selama 20 Hari (Senin - Jum'at)");
        System.out.println("1. Aturan tunjangan:");
        System.out.println("   a. Tunjangan 20% = 20 HARI KERJA + LEMBUR 20 JAM");
        System.out.println("   b. Tunjangan 15% = 18-19 HARI KERJA + LEMBUR LEBIH DARI SAMA DENGAN 15 JAM");
        System.out.println("   c. Tunjangan 15% = 15-17 HARI KERJA + LEMBUR LEBIH DARI SAMA DENGAN 10 JAM");
        System.out.println("   d. Selain kategori di atas TIDAK MENDAPAT tunjangan\n");
        System.out.println("2. Aturan lembur:");
        System.out.println("   a. Tiap 1 jam lembur mendapat komisi Rp8.000 dan berlaku kelipatannya\n");
        System.out.println("3. Aturan Keterlambatan:");
        System.out.println("   a. Tiap 1 jam terlambat hadir dikenakan potongan 10% dari gaji pokok perhari\ndan berlaku kelipatannya\n");
        System.out.println("\n=============== TERIMA KASIH ===============\n");
    }
    private static void cek(int jalan, String cari, String[][] dataPegawai, int [][] dataGaji) {
        switch (jalan) {
            case 1 :
                status = 0;
                for (int b = 0; b < dataPegawai.length; b++) {
                    if (cari.equalsIgnoreCase(dataPegawai[b][0])) {
                        lokasi = b;
                        hitungGaji(dataPegawai, dataGaji, lokasi);
                        status = 1;
                    }
                }
                if (status == 0) {
                    System.out.println("\n=== Pegawai tidak ditemukan ===");
                }
            break;
            case 2:
                status = 0;
                for (int b = 0; b < dataPegawai.length; b++) {
                    if (cari.equalsIgnoreCase(dataPegawai[b][0])) {
                        lokasi = b;
                        pencarian(dataPegawai, dataGaji, lokasi);
                        status = 1;
                    }
                }
                if (status == 0) {
                    System.out.println("\n=== Pegawai tidak ditemukan ===\n");
                }
            break;
            default: System.out.println("error 404");
        }
    }
    private static void gantiPegawai(String[][] hasilDataPegawai){
        System.out.println("\n=== DAFTAR PEGAWAI ====\n");
        for (String[] strings : hasilDataPegawai) {
            System.out.println(strings[0].toUpperCase());
        }
        System.out.print("\nPegawai yang diganti adalah: ");
        String ganti = inputUser.next();
        status = 0;
        for (int b = 0; b < hasilDataPegawai.length; b++) {
            if (ganti.equalsIgnoreCase(hasilDataPegawai[b][0])) {
                lokasi = b;
                status = 1;
            }
        }
        if (status == 0) {
            System.out.println("\n=== Pegawai tidak ditemukan ===\n");
        }else {
            System.out.print("Masukkan nama pegawai baru: ");
            String namabaru = inputUser.next();
            hasilDataPegawai[lokasi][0] = namabaru;
            System.out.print(hasilDataPegawai[lokasi][0] + " masuk kerja selama(hari): ");
            dataGaji[lokasi][0] = inputUser.nextInt();
            System.out.print(hasilDataPegawai[lokasi][0] + " lembur selama(jam): ");
            dataGaji[lokasi][1] = inputUser.nextInt();
            System.out.print(hasilDataPegawai[lokasi][0] + " terlambat(jam): ");
            dataGaji[lokasi][2] = inputUser.nextInt();
        }
    }
    private static void hitungGaji(String[][] dataPegawai, int [][] dataGaji, int lokasi){
        if(dataGaji[lokasi][0] == 20 && dataGaji[lokasi][1] == 20){
            double totalGaji = (dataGaji[lokasi][0] *  200000);
            double tunjangan = (totalGaji * 0.20);
            double lembur = (dataGaji[lokasi][1] * 8000);
            double potongan = ((200000 * 0.10) * dataGaji[lokasi][2]);
            tampilkanStruk(dataGaji, dataPegawai, lokasi, totalGaji, tunjangan, lembur, potongan);
        }else if(dataGaji[lokasi][0] >= 18 && dataGaji[lokasi][1] >= 15){
            double totalGaji = (dataGaji[lokasi][0] *  200000);
            double tunjangan = (totalGaji * 0.15);
            double lembur = (dataGaji[lokasi][1] * 8000);
            double potongan = ((200000 * 0.10) * dataGaji[lokasi][2]);
            tampilkanStruk(dataGaji, dataPegawai, lokasi, totalGaji, tunjangan, lembur, potongan);
        }else if(dataGaji[lokasi][0] >= 15 && dataGaji[lokasi][1] >= 10){
            double totalGaji = (dataGaji[lokasi][0] *  200000);
            double tunjangan = (totalGaji * 0.10);
            double lembur = (dataGaji[lokasi][1] * 8000);
            double potongan = ((200000 * 0.10) * dataGaji[lokasi][2]);
            tampilkanStruk(dataGaji, dataPegawai, lokasi, totalGaji, tunjangan, lembur, potongan);
        }else{
            double totalGaji = (dataGaji[lokasi][0] *  200000);
            double tunjangan = 0        ;
            double lembur = (dataGaji[lokasi][1] * 8000);
            double potongan = ((200000 * 0.10) * dataGaji[lokasi][2]);
            tampilkanStruk(dataGaji, dataPegawai, lokasi, totalGaji, tunjangan, lembur, potongan);
        }
    }
    private static void pencarian(String[][] dataPegawai, int [][] dataGaji, int lokasi){
        System.out.println("\n====================================================");
        System.out.println("                     DATA PEGAWAI");
        System.out.println("====================================================\n");
        System.out.println("Nama Pegawai: " + dataPegawai[lokasi][0].toUpperCase());
        System.out.println("Jumlah kehadiran: " + dataGaji[lokasi][0] + " hari");
        System.out.println("Lembur selama: "+ dataGaji[lokasi][1] +" jam");
        System.out.println("Terlambat selama: "+ dataGaji[lokasi][2] +" jam");
        System.out.println("====================================================");

    }
    private static void tampilkanStruk(int[][] dataGaji, String [][] dataPegawai, int lokasi, double totalGaji, double tunjangan, double lembur,double potongan){
        double total = (totalGaji + tunjangan + lembur - potongan);
        System.out.println("\n=============================================");
        System.out.println("                  STRUK GAJI");
        System.out.println("=============================================");
        System.out.println("Nama: " + dataPegawai[lokasi][0].toUpperCase() );
        System.out.println("Gaji pokok (" + dataGaji[lokasi][0] + ") hari = Rp" + (int)totalGaji);
        System.out.println("Tunjangan Rp" + (int)tunjangan);
        System.out.println("Lembur selama "+ dataGaji[lokasi][1] +" jam = Rp" + (int)lembur);
        System.out.println("Absensi terlambat "+ dataGaji[lokasi][2] +" jam = -Rp" + (int)potongan);
        System.out.println("TOTAL GAJI= RP" + (int)total );
        System.out.println("=============================================");
    }
    private static void pelaporan(int[][] dataGaji, String [][] dataPegawai){
        for(int i = 0; i < dataPegawai.length; i++){
            hitungGaji(dataPegawai, dataGaji, i);
        }
    }
}
