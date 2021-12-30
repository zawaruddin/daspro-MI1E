package tugasuas;

import java.util.Scanner;

//PROYEK AKHIR UAS (PEMINJAMAN BARANG)
//NAMA : WIRASWANTI RISMANDA PUTRI
//NIM  : 2131710021
//KELAS: MI-1E

public class TugasUAS {
static Scanner input = new Scanner(System.in);
static String jenisBarang[] = new String[10];
static String namaBarang[] = new String[10];
static String pilihanKebersihan[] = {"Sapu    ", "Kemoceng", "Pel       "};
static String pilihanKesehatan[] = {"Termometer", "Stetoskop", "Tensimeter"};
static String pilihanKomputer[] = {"Keyboard", "Mouse   ", "Flashdisk"};
static int stokKebersihan[] = {10, 10, 10};
static int stokKesehatan[] = {5, 5, 5};
static int stokKomputer[] = {3, 3, 3};
static int jmlBarang[] = new int[10];
static String nama[] = new String[10];
static int warga[] = new int[10];
static int banyak;
static int jumlah;
static int lamaPinjam;

    public static void main(String[] args) {
        int pilih;
	char kembali;
	do {
            System.out.println("***    Selamat Datang di Program Peminjaman      ***");
            System.out.println("==================== MENU UTAMA ====================");
            System.out.println("1. Pilih Barang");
            System.out.println("2. Daftar Barang");
            System.out.println("3. Peminjaman");
            System.out.println("4. Pencarian");
            System.out.println("5. Pembayaran");            
            System.out.println("6. Pengembalian");
            System.out.println("7. Keluar\n");
            System.out.print("Masukan Pilihan : ");
            pilih = input.nextInt();
            switch(pilih) {
                case 1:pilihBarang();break;
                case 2:daftarBarang();break;
                case 3:peminjaman();break;
                case 4:pencarian();break;
                case 5:pembayaran();break;
                case 6:pengembalian();break;
                case 7:System.out.println("Anda telah keluar program !");break;
                default:System.out.println("Pilihan yang Anda masukkan salah !");
                pilih = input.nextInt();
            } if(pilih == 7) {
                kembali ='T';
            } else {
                System.out.print("\n\nKembali ke Menu Utama ? [Y/T] : ");
                kembali = input.next().charAt(0);  
                System.out.println("-----------------------------------------------------------------");
            }   
        }while(kembali != 'T');
	}
    
    static void tampilKebersihan() {
        System.out.println("No" + "\t" + "Nama Barang" + "\t" + "Jumlah Stok"); 
        System.out.println("-----------------------------------------------------");
        for(int i = 0; i < pilihanKebersihan.length; i++) {
            System.out.println((i+1) + "\t" + pilihanKebersihan[i] + "\t" + stokKebersihan[i]);
        }
    }

    static void tampilKesehatan() {
        System.out.println("No" + "\t" + "Nama Barang" + "\t" + "Jumlah Stok"); 
        System.out.println("-----------------------------------------------------");
        for(int i = 0; i < pilihanKesehatan.length; i++) {
            System.out.println((i+1) + "\t" + pilihanKesehatan[i] + "\t" + stokKesehatan[i]);
        }  
    }
    
    static void tampilKomputer() {
        System.out.println("No" + "\t" + "Nama Barang" + "\t" + "Jumlah Stok"); 
        System.out.println("-----------------------------------------------------");
        for(int i = 0; i < pilihanKomputer.length; i++) {
            System.out.println((i+1) + "\t" + pilihanKomputer[i] + "\t" + stokKomputer[i]);
        }
    }

    static void pilihBarang() {
        int no=1;
        System.out.print("Masukan jumlah peminjaman : ");
        jumlah = input.nextInt();
        System.out.println("==================== PILIH BARANG ===================");
        System.out.println("PILIHAN JENIS BARANG");
        System.out.println("1. Kebersihan");
        tampilKebersihan();
        System.out.println("\n2. Kesehatan");
        tampilKesehatan();
        System.out.println("\n3. Komputer");
        tampilKomputer();
        for(int i = banyak;i < banyak+jumlah; i++) {
            System.out.println("\nBarang ke " + no);
            System.out.print("Jenis Barang : ");
            jenisBarang[i] = input.next();
            switch (jenisBarang[i]) {
                case "Kebersihan":
                    System.out.print("Nama Barang : ");
                    namaBarang[i] = input.next();
                    System.out.print("Jumlah pinjam : ");
                    jmlBarang[i] = input.nextInt();
                    break;
                case "Kesehatan":
                    System.out.print("Nama Barang : ");
                    namaBarang[i] = input.next();
                    System.out.print("Jumlah pinjam : ");
                    jmlBarang[i] = input.nextInt();
                    break;
                case "Komputer":
                    System.out.print("Nama Barang : ");
                    namaBarang[i] = input.next();
                    System.out.print("Jumlah pinjam : ");
                    jmlBarang[i] = input.nextInt(); 
                    break;
                default:
                    System.out.print("Pilihan Jenis Barang salah !");
                    break;
            }
            System.out.println("--------------------------------");
            no++;
        }
        banyak+=jumlah;
        System.out.print("Barang berhasil disimpan !");      
    }
   
    static void daftarBarang() {
        System.out.println("=================== DAFTAR BARANG ===================");
        int no=1;
        System.out.println("No" + "\t" + "Jenis Barang" + "\t" + "Nama Barang" + "\t" + "Jumlah Barang");
        System.out.println("-----------------------------------------------------");
        for(int i=0; i < banyak; i++) {
            System.out.println(no + "\t" + jenisBarang[i] + "\t" + namaBarang[i] + "\t\t" + jmlBarang[i]);
            no++;
        }  
    }
    
    static void peminjaman() {
        System.out.println("==================== PEMINJAMAN =====================");
        daftarBarang();
        System.out.print("Masukan Nama Anda : ");
        nama[0] = input.next();
        System.out.print("NIK : ");
        warga[0]= input.nextInt();
        System.out.println("1. Dusun Bawangan");
        System.out.println("2. Dusun Kesamben");
        System.out.println("3. Dusun Losari");
        System.out.print("Alamat : ");
        warga[1] = input.nextInt();
        System.out.println("\nBarang berhasil dipinjam !");
        
    }
    
    static void pencarian() {
        String jenisBarang2;
        String pesan = "";
        System.out.println("===================== PENCARIAN =====================");
        System.out.print("Masukkan Jenis Barang yang dicari : ");
        jenisBarang2 = input.next();
        System.out.println("Nama Barang" + "\t" + "Jumlah Barang");
        System.out.println("-------------------------------------------------");
        for(int i=0; i<banyak; i++) {
            if(jenisBarang[i].equals(jenisBarang2)) {  
            System.out.println(namaBarang[i] + "\t\t" + jmlBarang[i]);
            pesan = "";
            } else {
                pesan = "Barang yang Anda Cari Tidak Ditemukan!";
            }
        }  
    }
   
    static void pembayaran() {
        int harga, tglPinjam, tglKembali, sum = 0;
        char cetak;
        for(int num : jmlBarang) {
            sum = sum+num;
        }
        System.out.print("Masukkan tanggal pinjam [1-30] : ");
        tglPinjam = input.nextInt();
        System.out.print("Masukkan tanggal dikembalikan [1-30] : ");
        tglKembali = input.nextInt();
        System.out.print("Cetak Struk Pembayaran? [Y/T]: ");
        cetak = input.next().charAt(0);
        if(cetak=='Y'){
            System.out.println("=====================================================");
            System.out.println("                 STRUK PEMBAYARAN                    ");
            System.out.println("=====================================================");
            daftarBarang();
            System.out.println("\n---------------------------------------------");
            System.out.println("Harga pinjaman per barang (1 hari) = Rp 2000");
            System.out.println("---------------------------------------------");
            System.out.println("\nNama\t: " + nama[0]);
            System.out.println("NIK\t: " + warga[0]);
            System.out.println("Alamat\t: " + warga[1]);
            System.out.println("Tanggal pinjam\t: " + tglPinjam);
            System.out.println("Tanggal kembali\t: " + tglKembali);
            lamaPinjam = tglKembali-tglPinjam;
            harga = sum * 2000 * lamaPinjam;
            System.out.println("Biaya peminjaman: Rp " + harga);
        }else {
            System.out.println("Struk harus dicetak !");
        }
    }
        
    static void pengembalian() {
        int denda, tglPinjam1, tglKembali1, lamaPinjam1, pilih2, tglPerpanjangan, sum=0, lamaPerpanjangan, biayaTambahan;
        for(int num : jmlBarang) {
            sum = sum+num;
        }
        daftarBarang();
        System.out.print("Masukan Nama Anda : ");
        nama[0] = input.next();
        System.out.print("NIK : ");
        warga[0]= input.nextInt();
        System.out.println("1. Dusun Bawangan");
        System.out.println("2. Dusun Kesamben");
        System.out.println("3. Dusun Losari");
        System.out.print("Alamat : ");
        warga[1] = input.nextInt();
        System.out.print("\nMasukkan tanggal pinjam : ");
        tglPinjam1 = input.nextInt();
        System.out.print("Masukkan tanggal sekarang : ");
        tglKembali1 = input.nextInt();
        lamaPinjam1 = tglKembali1-tglPinjam1;
        denda = (lamaPinjam1-lamaPinjam)*sum*500;
        if(lamaPinjam1==lamaPinjam) {
            System.out.println("Pengembalian SUKSES");
        } else {
            System.out.println("Pengembalian TERLAMBAT");
            System.out.print("\nPilih PERPANJANGAN atau DENDA? (0=Perpanjangan, 1=Denda) = ");
            pilih2 = input.nextInt();
            switch(pilih2) {
                case 0 : 
                    System.out.println("==================== PERPANJANGAN ====================");
                    System.out.print("Tanggal perpanjangan : ");
                    tglPerpanjangan = input.nextInt();
                    lamaPerpanjangan = tglPerpanjangan-tglKembali1;
                    biayaTambahan = sum*400*lamaPerpanjangan;
                    System.out.println("Tambahan biaya =  Rp " + biayaTambahan);
                    System.out.println("Perpanjangan BERHASIL !");
                    break;
                case 1 :
                    System.out.println("Denda: Rp " + denda);
                    System.out.println("Pengembalian BERHASIL !");
                    break;
                default : 
                    System.out.println("Pilihan salah !");
            }
            
        }   
    }    

}

