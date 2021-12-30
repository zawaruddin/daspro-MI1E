import java.util.Scanner; //Library scanner: untuk membaca input dari keyboard
/**
 *
 * @author Nafiaaeluv
 */
public class TugasAkhir {
   static int urutan; //STATIC VARIABEL/VARIABEL CLASS: variabel yang dideklarasikan menggunakan kata kunci static 
   static int banyak = 0; // di luar method, konstruktur maupun blok tetapi masih di dalam suatu class. 
   static String namaNasabah[] = new String[10]; //Variabel ini dibuat ketika suatu program dijalankan dan akan dihapus saat
   static String jenisTabungan[] = new String[10]; //program berhenti.
   static int noNik[] = new int[10];
   static int noRek[] = new int[10];
   static int saldoAwal[] = new int[10];
   static int saldoDinamis[] = new int [10]; //Deklarasi dan Instansiasi objek array. Array saldoDinamis: berisi perubahan saldo.
   static int transferSaldo[] = new int[10];
   static int ambilSaldo[] = new int[10];
   static int setorSaldo[] = new int[10];
   static Scanner input = new Scanner(System.in); //Deklarasi scanner
    /**
     * @param args the command line arguments
     */

public static void main(String[] args) { //fungsi main dalam program java seperti index.html / program yang akan dieksekusi pertama kali.
        while(true){ //looping yang berjalan terus, akan berhenti saat user mennginputkan angka 3. 
            menuUtama(); // fungsi untuk memanggil menuUtama.
        }
    }
    
    public static void menuUtama(){ // fungsi void tanpa parameter. Tidak mengembalikan nilai apapun. 
        System.out.println("========================================================================");
        System.out.println("====================||PROGRAM PERBANKAN BANK YEDAM||====================");
        System.out.println("========================================================================");
        System.out.println("\n1. Data Nasabah");
        System.out.println("2. Transaksi Tabungan");
        System.out.println("3. Keluar");
        System.out.println("Menu mana yang akan Anda tuju (1, 2, atau 3)?");
        int a = input.nextInt(); // variable lokal a: hanya bisa diakses di dalam fungsi menuUtama.
        
        switch(a){ //menggunakan switch decision untuk menyeleksi inputan user.
            case 1:
                menuDataNasabah(); // fungsi pemanggilan menuDataNasabah.
                break;
            case 2:
                menuTransaksi();
                break;
            case 3:
                System.exit(0); // untuk menunjukkan penghentian yang sukses atau tanpa error.
                break;
            default: // sebagai notifikasi yang akan muncul jika inputan pengguna selain angka 1,2,3.
                System.out.println("Data yang Anda inputkan salah. Mohon inputkan 1, 2, atau 3.");
        }
    }
    
    public static void menuDataNasabah(){ 
        System.out.println("-----------------------------------------------------");
        System.out.println("=================||MENU DATA NASABAH||===============");
        System.out.println("-----------------------------------------------------");
        System.out.println("\n1. Input Data Nasabah");
        System.out.println("2. Lihat Data Nasabah");
        System.out.println("3. Pilihan Jenis Tabungan");
        System.out.println("4. Kembali");
        System.out.println("Menu mana yang akan Anda tuju (pilih 1, 2, 3, atau 4)?");
        int b = input.nextInt();
        
        switch(b){
            case 1: // Menu ini digunakan untuk input data nasabah. Inputan tersebut akan ditampung di dalam variabel array.
                System.out.println("*************************************************************************************************");
                System.out.println("==*==*==*==*==*==*==*==*==*==*==*==||MENU INPUT DATA NASABAH||==*==*==*==*==*==*==*==*==*==*==*==");
                System.out.println("*************************************************************************************************");
                System.out.println("Masukkan data nasabah");
                System.out.println("Nama Nasabah\t: ");
                String nama =  input.next(); // variabel lokal nama: hanya dapat diakses di dalam fungsi menuDataNasabah sebagai variabel untuk menyimpan value nama bertipe String.
                System.out.println("NIK Nasabah\t: ");
                int nik = input.nextInt();
                System.out.println("No. Rek\t\t: ");
                int rek = input.nextInt();
                System.out.println("Jenis Tabungan\t: ");
                String tabungan = input.next();
                System.out.println("Saldo Pertama\t: Rp. ");
                int saldo = input.nextInt();
                inputDataNasabah(nama, nik, rek, tabungan, saldo); // dilakukan pemanggilan fungsi inputDataNasabah berparameter inputan.
                break;
            case 2:
                System.out.println("*************************************************************************************************");
                System.out.println("==*==*==*==*==*==*==*==*==*==*==*==||MENU LIHAT DATA NASABAH||==*==*==*==*==*==*==*==*==*==*==*==");
                System.out.println("*************************************************************************************************");
                lihatDataNasabah(); // pemanggilan fungsi lihatDataNasabah tanpa parameter. 
                break;
            case 3:
                System.out.println("**************************************************************************************************");
                System.out.println("==*==*==*==*==*==*==*==*==*==*==*==||MENU PILIHAN JENIS TABUNGAN||==*==*==*==*==*==*==*==*==*==*==");
                System.out.println("**************************************************************************************************");
                System.out.println("Masukkan No. Rekening Nasabah\t: ");
                int nomerRek = input.nextInt(); // user diminta menginputkan nomer rek yang akan dicari.
                pilihanJenisTabungan(nomerRek); // pemanggilan fungsi pilihanJenisTabungan berparameter nomerRek (inputan user)
                break;
            case 4:
                menuUtama(); // Case ke 4, memanggil fungsi menuUtama sebagai fitur kembali.
                break;
            default: // notifikasi inputan pengguna belum sesuai.
                System.out.println("Data yang Anda inputkan salah. Mohon inputkan 1, 2, 3, atau 4.");  
        }   
    }
    
    public static void menuTransaksi(){
        System.out.println("------------------------------------------------------");
        System.out.println("==============||MENU TRANSAKSI TABUNGAN||=============");
        System.out.println("------------------------------------------------------");
        System.out.println("\n1. Cek Saldo");
        System.out.println("2. Setor Tabungan");
        System.out.println("3. Ambil Tabungan");
        System.out.println("4. Transfer");
        System.out.println("5. Cetak Laporan Transaksi per Nasabah");
        System.out.println("6. Kembali");
        System.out.println("Menu mana yang akan Anda tuju (1, 2, 3, 4, 5, atau 6)?");
        int c = input.nextInt(); // variabel lokal yang menampung inputan pengguna dalam memilih menu yang akan dituju. 
        
        switch(c){
            case 1:
                System.out.println("****************************************************************");
                System.out.println("==*==*==*==*==*==*==*==||MENU CEK SALDO||==*==*==*==*==*==*==*==");
                System.out.println("****************************************************************");
                System.out.println("Masukkan nomor rekening nasabah.");
                System.out.println("No. Rekening\t: ");
                int nomerRek1 = input.nextInt();
                cekSaldo(nomerRek1); // pemanggilan fungsi cekSaldo dengan parameter nomerRek1.
                break;
            case 2:
                System.out.println("***************************************************************");
                System.out.println("==*==*==*==*==*==*==||MENU SETOR TABUNGAN||==*==*==*==*==*==*==");
                System.out.println("***************************************************************");
                System.out.println("Masukkan data yang diperlukan.");
                System.out.println("No. Rekening\t: ");
                int nomerRek2 = input.nextInt();
                System.out.println("Nominal Setoran\t: Rp. ");
                int setor = input.nextInt();
                setorTabungan(nomerRek2, setor); // pemanggilan fungsi setorTabungan dengan parameter inputan user.
                break;
            case 3: 
                System.out.println("***************************************************************");
                System.out.println("==*==*==*==*==*==*==||MENU AMBIL TABUNGAN||==*==*==*==*==*==*==");
                System.out.println("***************************************************************");
                System.out.println("Masukkan data yang diperlukan.");
                System.out.println("No. Rekening\t: ");
                int nomerRek3 = input.nextInt();
                System.out.println("Nominal Ambil\t: Rp. ");
                int ambil = input.nextInt();
                ambilTabungan(nomerRek3, ambil); // pemanggilan fungsi berparameter nomer rek dan nominal ambilnya.
                break;
            case 4:
                System.out.println("***************************************************************");
                System.out.println("==*==*==*==*==*==*==*==||MENU TRANSFER||==*==*==*==*==*==*==*==");
                System.out.println("***************************************************************");
                System.out.println("Masukkan data yang diperlukan.");
                System.out.println("No. Rekening\t: ");
                int nomerRek4 = input.nextInt();
                System.out.println("No. Rekening Tujuan\t: ");
                int nomerRek5 = input.nextInt();
                System.out.println("Nominal Transfer\t: Rp. ");
                int transfer = input.nextInt();
                transfer(nomerRek4, nomerRek5 , transfer); // pemanggilan fungsi transfer dengan 3 parameter.
                break;
            case 5:
                System.out.println("**************************************************************");
                System.out.println("==*==*==*==*==||MENU CETAK LAPORAN PER NASABAH||==*==*==*==*==");
                System.out.println("**************************************************************");
                System.out.println("Masukkan data yang diperlukan.");
                System.out.println("No. Rekening\t: ");
                int nomerRek6 = input.nextInt();
                cetakLaporan(nomerRek6); // pemanggilan fungsi cetakLaporan  dengan parameter no rek. No rek ini akan digunakan untuk mencari indeks data nasabah yang akan ditampilkan. 
                break;
            case 6:
                menuUtama(); // pemanggilan fungsi menuUtama sebagai fitur kembali. 
                break;
            default: // notifikasi kesalahan inputan.
                System.out.println("Data yang Anda inputkan salah. Mohon inputkan 1, 2, 3, 4, 5, atau 6.");
        }
    }
    
    public static void inputDataNasabah(String nama, int nik, int rek, String tabungan, int saldo){ //fungsi berparameter inputan sebagai input di dalam fungsi.
        namaNasabah[banyak] = nama; // array namaNasabah berindeks sesuai nilai banyak untuk menampung inputan nama.
        noNik[banyak] = nik;
        noRek[banyak] = rek;
        jenisTabungan[banyak] = tabungan;
        saldoAwal[banyak] = saldo;
        banyak++; // variabel banyak sebelumnya sudah diinisialiasi 0, tujuan: sebagai penunjuk indeks data input di dalam array, sedangkan banyak++ digunakan untuk menambahkan data inputan lagi selama datanya tidak lebih dari 10. 
        dataDinamis(rek, saldo);   
    }
    
    public static void dataDinamis(int rek, int saldo){ // fungsi yang digunakan untuk mengganti-ganti nilai saldo setelah proses manipulasi yang paling terakhir. Jadi, setiap melakukan transaksi / pengolahan data saldo, maka nilai sisa saldo hasil operasi akan ditampung ke fungsi ini.
        urutan = cariDataRek(rek); // variabel urutan untuk memanggil sekaligus menampung hasil pencarian indeks data rekening.
        if(noRek[urutan] == rek){ // jika nomer rekening dengan indeks urutan tersebut nilainya sama dengan nilai rek, maka
            saldoDinamis[urutan] = saldo; // nilai saldo di array saldoDinamis dengan indeks urutan tersebut akan berganti nilai saldo yang baru.
        }
    }
    
    public static int cariDataRek(int rek){ // fungsi berparameter dan memiliki kembalian, biasanya disebut procedure.
        int hasil = 0; // variabel lokal hasil dengan nilai awal 0 untuk menampung hasil indeksnya.
        for(int i = 0; i < banyak; i++){ // perulangan for untuk menemukan data no rek sesuai data nomer rek di indeks arraynya.
            if(noRek[i] == rek){ // jika data di array berindeks i sama dengan data inputan rek, maka
                hasil = i; // hasil akan bernilai indeks i tersebut.
            }
        }return hasil; // hasil tersebut akan dikembalikan menggunakan perintah return.
    }
    
    public static void lihatDataNasabah(){
            System.out.println("No. \t Nama \t\t NIK \t\t No. Rek \t Jenis Tabungan         Saldo");
            for(int i = 0; i < banyak; i++){ // perulangan for untuk menampilkan data array.
            System.out.println( (i+1) + "\t" +namaNasabah[i] + "\t\t" + noNik[i] + "\t\t" + noRek[i] + "\t\t\t" + jenisTabungan[i] + "\t\tRp. " + saldoDinamis[i]);
        } // menggunakan saldo dinamis: agar saat dilakukan manipulasi data, nilai saldo yang ditampilkan adalah saldo terakhir sisa pengoperasian.
    }
        
    public static void pilihanJenisTabungan(int rek){
        urutan = cariDataRek(rek); // variabel urutan memanggil sekaligus menampung hasil pencarian indeks no rek.
        String namaPenabung = namaNasabah[urutan]; // variabel lokal untuk menampung data nama nasabah dengan indeks sesuai hasil pencarian
        String tab = jenisTabungan[urutan];
        int nomerNik = noNik[urutan];
        int saldoNow = saldoDinamis[urutan];
        System.out.println("Nama Nasabah\t\t: " + namaPenabung);
        System.out.println("NIK\t\t\t: " + nomerNik);
        System.out.println("Jenis Tabungan\t\t: " + tab);
        System.out.println("Saldo Nasabah\t\t: " + saldoNow);
        System.out.println("Ketentuan jenis tabungan tersebut sebagai berikut: ");
        switch(tab){ // switch dengan kondisi nilai tab.
            case "Visual": // jika tab berisi nilai Visual, maka akan muncul kalimat berikut.
                System.out.println("Ambil maksimal\t\t: Rp. 1.000.000 \nTransfer maksimal\t: Rp. 700.000");
                break;
            case "Center":
                System.out.println("Ambil maksimal\t\t: Rp. 800.000 \nTransfer maksimal\t: Rp. 500.000");
                break;
            case "Maknae":
                System.out.println("Ambil maksimal\t\t: Rp. 500.000 \nTransfer maksimal\t: Rp. 300.000");
                break;
            default:
                System.out.println("");
        }  
    }
        
    public static void cekSaldo(int rek){
       urutan = cariDataRek(rek);
       String namaPenabung = namaNasabah[urutan];
       String tab = jenisTabungan[urutan];
       int nomerNik = noNik[urutan];
       int saldoNow = saldoDinamis[urutan]; // menggunakan saldo dinamis karena, jika menggunakan saldo pada array inputan maka nilainya akan tidak sinkron setalh dilakukan manipulasi data.
       System.out.println("Nama Nasabah\t\t\t: " + namaPenabung);
       System.out.println("NIK\t\t\t\t: " + nomerNik);
       System.out.println("Jenis Tabungan\t\t\t: " + tab);
       System.out.println("Total saldo sekarang adalah\t: Rp. " + saldoNow);
    }
    
    public static void setorTabungan(int rek, int setor){
       urutan = cariDataRek(rek);
       String namaPenabung = namaNasabah[urutan];
       int saldoNow = saldoDinamis[urutan] + setor;
       System.out.println("Setor tabungan BERHASIL!");
       System.out.println("Nama Nasabah\t\t: " + namaPenabung);
       System.out.println("No. Rekening\t\t: " + rek);
       System.out.println("Nominal Setor\t\t: " + setor);
       System.out.println("Jumlah saldo saat ini\t: Rp. " + saldoNow);
       dataDinamis(rek, saldoNow); // pemanggilan fungsi dataDinamis untuk memperbarui perubahan data saldo terakhir setelah dilakukan operasi aritmatika berdasarkan indeks dari no rek.
       dataSetor(rek, setor); // pemanggilan fungsi dataSetor untuk mengisikan nilai pada array setorSaldo berdasarkan indeks no rek  
    }
    
    public static void ambilTabungan(int rek, int ambil){
       urutan = cariDataRek(rek);
       String namaPenabung = namaNasabah[urutan];
       String tab = jenisTabungan[urutan];
       switch(tab){
           case "Visual":
               if((ambil < saldoDinamis[urutan]) && (ambil <= 1000000)){
                   int saldoNow1 = saldoDinamis[urutan] - ambil;
                   System.out.println("Ambil tabungan BERHASIL!");
                   System.out.println("Nama Nasabah\t\t: " + namaPenabung);
                   System.out.println("No. Rekening\t\t: " + rek);
                   System.out.println("Nominal Ambil\t\t: " + ambil);
                   System.out.println("Jumlah saldo saat ini\t: Rp. " + saldoNow1);
                   dataDinamis(rek, saldoNow1); // pemanggilan fungsi dataDinamis untuk memperbarui perubahan data saldo terakhir setelah dilakukan operasi aritmatika berdasarkan indeks dari no rek.
                   dataAmbil(rek, ambil); // pemanggilan fungsi dataAmbil untuk menyimpan nilai ambil di array ambilTabungan berdasarkan indeks dari no rek.
               }else if((ambil < saldoDinamis[urutan]) && (ambil > 1000000)){
                   System.out.println("Ambil tabungan atas nama: " + namaPenabung + " GAGAL!");
                   System.out.println("Masukkan nominal ambil tabungan kurang dari Rp. 1.000.000");
                   menuTransaksi(); // tidak memenuhi kualifikasi kondisi, pengguna di-redirect ke menuTransaksi.
               }else{
                   System.out.println("Ambil tabungan atas nama: " + namaPenabung + " GAGAL!");
                   System.out.println("Saldo nasabah tidak cukup.");
                   menuTransaksi(); // tidak memenuhi kualifikasi kondisi, pengguna di-redirect ke menuTransaksi.
               }
               break;
           case "Center":
               if((ambil < saldoDinamis[urutan]) && (ambil <= 800000)){
                   int saldoNow2 = saldoDinamis[urutan] - ambil;
                   System.out.println("Ambil tabungan BERHASIL!");
                   System.out.println("Nama Nasabah\t\t: " + namaPenabung);
                   System.out.println("No. Rekening\t\t: " + rek);
                   System.out.println("Nominal Ambil\t\t: " + ambil);
                   System.out.println("Jumlah saldo saat ini\t: Rp. " + saldoNow2);
                   dataDinamis(rek, saldoNow2);
                   dataAmbil(rek, ambil);
               }else if((ambil < saldoDinamis[urutan]) && (ambil > 800000)){
                   System.out.println("Ambil tabungan atas nama: " + namaPenabung + " GAGAL!");
                   System.out.println("Masukkan nominal ambil tabungan kurang dari Rp. 800.000");
                   menuTransaksi();
               }else{
                   System.out.println("Ambil tabungan atas nama: " + namaPenabung + " GAGAL!");
                   System.out.println("Saldo nasabah tidak cukup.");
                   menuTransaksi();
               }
               break;
           case "Maknae":
               if((ambil < saldoDinamis[urutan]) && (ambil <= 500000)){
                   int saldoNow3 = saldoDinamis[urutan] - ambil;
                   System.out.println("Ambil tabungan BERHASIL!");
                   System.out.println("Nama Nasabah\t\t: " + namaPenabung);
                   System.out.println("No. Rekening\t\t: " + rek);
                   System.out.println("Nominal Ambil\t\t: " + ambil);
                   System.out.println("Jumlah saldo saat ini\t: Rp. " + saldoNow3);
                   dataDinamis(rek, saldoNow3);
                   dataAmbil(rek, ambil);
               }else if((ambil < saldoDinamis[urutan]) && (ambil > 500000)){
                   System.out.println("Ambil tabungan atas nama: "+ namaPenabung + " GAGAL!");
                   System.out.println("Masukkan nominal ambil tabungan kurang dari Rp. 500.000");
                   menuTransaksi();
               }else{
                   System.out.println("Ambil tabungan atas nama: " + namaPenabung + " GAGAL!");
                   System.out.println("Saldo nasabah tidak cukup.");
                   menuTransaksi();
               }
               break;
           default:
               System.out.println("");               
       }
    }
    
    public static void transfer(int rek1, int rek2, int transfer){
       urutan = cariDataRek(rek1);
       String namaPenabung = namaNasabah[urutan];
       String tab = jenisTabungan[urutan];
       switch(tab){
           case "Visual":
               if((transfer < saldoDinamis[urutan]) && (transfer <= 700000)){
                   int saldoNow1 = saldoDinamis[urutan] - transfer;
                   System.out.println("Transfer tabungan BERHASIL!");
                   System.out.println("Nama Nasabah\t\t: " + namaPenabung);
                   System.out.println("No. Rekening Nasabah\t: " + rek1);
                   System.out.println("No. Rekening Tujuan\t: " + rek2);
                   System.out.println("Nominal transfer\t: Rp. " + transfer);
                   System.out.println("Jumlah saldo saat ini\t: Rp. " + saldoNow1);
                   dataDinamis(rek1, saldoNow1); // pemanggilan fungsi dataDinamis untuk mengubah nilai saldo berdasarkan indeks no rek
                   dataTransfer(rek1, transfer); // pemanggilan fungsi dataTransfer untuk menngisikan nilai transfer pada array transferTabungan di fungsi tsb
               }else if((transfer < saldoDinamis[urutan]) && (transfer > 700000)){
                   System.out.println("Transfer tabungan atas nama: " + namaPenabung + " GAGAL!");
                   System.out.println("Masukkan nominal transfer tabungan kurang dari Rp. 700.000");
                   menuTransaksi(); // kondisi belum memenuhi di-redirect ke menuTransaksi.
               }else{
                   System.out.println("Transfer tabungan atas nama: " + namaPenabung + " GAGAL!");
                   System.out.println("Saldo nasabah tidak cukup.");
                   menuTransaksi(); // kondisi salah, pengguna dialihkan ke menuTransaksi lagi. 
               }
               break;
           case "Center":
               if((transfer < saldoDinamis[urutan]) && (transfer <= 500000)){
                   int saldoNow2 = saldoDinamis[urutan] - transfer;
                   System.out.println("Transfer tabungan BERHASIL!");
                   System.out.println("Nama Nasabah\t\t: " + namaPenabung);
                   System.out.println("No. Rekening Nasabah\t: " + rek1);
                   System.out.println("No. Rekening Tujuan\t: " + rek2);
                   System.out.println("Nominal transfer\t: Rp. " + transfer);
                   System.out.println("Jumlah saldo saat ini\t: Rp. " + saldoNow2);
                   dataDinamis(rek1, saldoNow2);
                   dataTransfer(rek1, transfer);
               }else if((transfer < saldoDinamis[urutan]) && (transfer > 500000)){
                   System.out.println("Transfer tabungan atas nama: " + namaPenabung + " GAGAL!");
                   System.out.println("Masukkan nominal tranfer tabungan kurang dari RP. 500.000");
                   menuTransaksi();
               }else{
                   System.out.println("Transfer tabungan atas nama: " + namaPenabung + " GAGAL!");
                   System.out.println("Saldo nasabah tidak cukup.");
                   menuTransaksi();
               }
               break;
           case "Maknae":
               if((transfer < saldoAwal[urutan]) && (transfer <= 300000)){
                   int saldoNow3 = saldoDinamis[urutan] - transfer;
                   System.out.println("Transfer tabungan BERHASIL!");
                   System.out.println("Nama Nasabah\t\t: " + namaPenabung);
                   System.out.println("No. Rekening nasabah\t: " + rek1);
                   System.out.println("No. Rekening Tujuan\t: " + rek2);
                   System.out.println("Nominal transfer\t: Rp. " + transfer);
                   System.out.println("Jumlah saldo saat ini\t: Rp. " + saldoNow3);
                   dataDinamis(rek1, saldoNow3);
                   dataTransfer(rek1, transfer);
               }else if((transfer < saldoDinamis[urutan]) && (transfer > 300000)){
                   System.out.println("Transfer tabungan atas nama: " + namaPenabung +  " GAGAL!");
                   System.out.println("Masukkan nominal transfer tabungan kurang dari Rp. 300.000");
                   menuTransaksi();
               }else{
                   System.out.println("Transfer tabungan atas nama: " +namaPenabung + " GAGAL!");
                   System.out.println("Saldo nasabah tidak cukup");
                   menuTransaksi();
               }
               break;
           default:
               System.out.println("");
       }
    }
    
    public static void dataSetor(int rek, int saldo){ // fungsi dataSetor dengan parameter rek dan saldo sebagai inputan
        urutan = cariDataRek(rek); // memanggil dan menampung hasil pencarian indeks no rek
        if(noRek[urutan] == rek){ // jika nilai pada array no rek dengan indeks hasil pencarian sama dengan rek inputan, maka 
            setorSaldo[urutan] = saldo; // nilai di array setorSaldo akan diisi nominal input setor
        }
    }
    
    public static void dataAmbil(int rek, int saldo){
        urutan = cariDataRek(rek);
        if(noRek[urutan] == rek){
            ambilSaldo[urutan] = saldo;
        }
    }
    
    public static void dataTransfer(int rek, int saldo){
       urutan = cariDataRek(rek);
       if(noRek[urutan] == rek){
           transferSaldo[urutan] = saldo;
       }
    }
    
    public static void cetakLaporan(int rek){
       urutan = cariDataRek(rek);
       String namaPenabung = namaNasabah[urutan];
       String tab = jenisTabungan[urutan];
       int nomerNik = noNik[urutan];
       int nilaiSetor = setorSaldo[urutan];
       int nilaiAmbil = ambilSaldo[urutan];
       int nilaiTransfer = transferSaldo[urutan];
       int nilaiSisa = saldoDinamis[urutan];
       System.out.println("===========================================================||TABEL||==========================================================");
       System.out.println("No. \t Nama \t NIK \t No. Rekening \t Jenis Tabungan  Nominal Setor \t Nominal Ambil \t Nominal Transfer \t Sisa Tabungan");
       System.out.println((urutan+1) + " \t " + namaPenabung + " \t " + nomerNik + " \t " + rek + " \t " + tab + " \t " + nilaiSetor + " \t " + nilaiAmbil + " \t " + nilaiTransfer + " \t\t " + nilaiSisa);
       System.out.println("===========================================================||LIST||===========================================================");
       System.out.println("Nama Nasabah\t: " + namaPenabung);
       System.out.println("NIK\t\t: " + nomerNik);
       System.out.println("No. Rekening\t: " + rek);
       System.out.println("Jenis Tabungan\t: " + tab);
       System.out.println("Setor\t\t: Rp. " + nilaiSetor);
       System.out.println("Ambil\t\t: Rp. " + nilaiAmbil);
       System.out.println("Transfer\t: Rp. " + nilaiTransfer);
       System.out.println("Sisa Tabungan\t: Rp. " + nilaiSisa);
    }    
}