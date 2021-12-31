//Nama : Bangkit Maulana Caniago
//NIM  : 2131710143

import java.util.Scanner;
public class UAS_BangkitMaulanaCaniago_2131710143 {
    public static String[] namaMakanan = new String[20];
    public static int[][] dataMakanan = new int[2][20];
    public static String[] namaDefault = 
        {"Nasi Goreng" , "Mie Goreng" , "Sate Ayam" , "Mie Rebus" , "Ayam Bakar"};
    public static int[][] dataDefault = {
        {6000 , 5000 , 7000 , 4000 , 8000},
        {10 , 11 , 12 , 13 , 14}
    };
    public static Scanner sc = new Scanner(System.in);
    public static int total = 0;
    public static int[][] pesanan;
    public static int[][] tempStok;
    public static void main(String[] args) {
        for(int i = 0 ; i<dataDefault.length;i++){
            for(int j = 0 ; j < dataDefault[0].length; j++){
                dataMakanan[i][j] = dataDefault[i][j];
                namaMakanan[j] = namaDefault[j];
            }
        }
        while(true){
            System.out.println("\n=================================================");
            System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
            System.out.println("| | |                                       | | |");
            System.out.println("| |             SELAMAT DATANG DI             | |");
            System.out.println("|                  MENU UTAMA                   |");
            System.out.println("| |            RESTORAN SUKA MAKAN            | |");
            System.out.println("| | |                                       | | |");
            System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
            System.out.println("=================================================");
            System.out.println("| Pilihan Menu                                  |");
            System.out.println("| 1. Pengelolaan Stok                           |");
            System.out.println("| 2. Sistem Kasir                               |");
            System.out.println("| 3. Keluar Dari Program                        |");
            System.out.println("=================================================");
            System.out.print("Masukan Menu berdasarkan angka : ");
            int b = sc.nextInt();
            if(b == 1){
                menuPengelolaanStok();
            }
            else if(b == 2){
                menuPesanMakanan();
            }
            else if(b == 3) {
                System.out.print("Yakin Ingin keluar dari Program (Y/N) : ");
                char konfirm = sc.next().charAt(0);
                if (konfirm == 'y' || konfirm == 'Y' ) break;
                else if(konfirm == 'n' || konfirm == 'N' ) continue;
                else continue;
            }
            else {
                System.out.println("-------------------------------------------------");
                System.out.println("|           DATA YANG DIMASUKAN SALAH           |");
                System.out.println("-------------------------------------------------");
                continue;
            }
        }
    }
    public static void menuPengelolaanStok(){
        char konfirm;
        do{
            tampilMenuStok();
            System.out.print("Kembali ke Menu Utama (Y/N) : ");
            konfirm = sc.next().charAt(0);
            if (konfirm == 'y' || konfirm == 'Y' ) break;
            else if (konfirm == 'n' || konfirm == 'N' ) continue;
            else {
                System.out.println("-------------------------------------------------");
                System.out.println("|           DATA YANG DIMASUKAN SALAH           |");
                System.out.println("-------------------------------------------------");
                continue;
            }
        }while(konfirm == 'N' || konfirm == 'n' );
    }
    public static void menuPesanMakanan(){
        while(true){
            tampilMenu();
            System.out.println("| Aksi                                          |");
            System.out.println("| 1. Pesan Makanan                              |");
            System.out.println("| 2. Kembali ke Menu Utama                      |");
            System.out.println("=================================================");
            System.out.print("Masukan Nomor Pilihan Aksi : ");
            int nomor = sc.nextInt();
            if(nomor == 1){
                while(true){
		pesanan = new int[2][15];
            	tempStok = new int[2][15];
                    tampilMenu();
                    pesanMakanan();
                    nota();
                    pembayaran();
                    System.out.print("Kembali ke Menu Utama (Y/N) : ");
                    char konfirm = sc.next().charAt(0);
                    if (konfirm == 'y' || konfirm == 'Y' ) break;
                    else if(konfirm == 'N' || konfirm == 'n' ) continue;
                    else break;
                }
            }
            else if(nomor == 2){
                System.out.print("Kembali ke Menu Utama (Y/N) : ");
                char konfirm = sc.next().charAt(0);
                if (konfirm == 'y' || konfirm == 'Y' ) break;
                else if(konfirm == 'N' || konfirm == 'n' ) continue;
                else break;
            }
            else {
                System.out.println("-------------------------------------------------");
                System.out.println("|           DATA YANG DIMASUKAN SALAH           |");
                System.out.println("-------------------------------------------------");
                continue;
            }
            break;
        }
    }
    public static void tampilMenuStok(){
        while(true){
            System.out.println("=================================================");
            System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
            System.out.println("| |              PENGELOLAAN STOK             | |");
            System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
            System.out.println("=================================================");
            System.out.println("| +-----+---------------+-------+-------+       |");
            System.out.println("| | No\t| Nama Makanan\t| Harga\t| Stok\t|       |");
            System.out.println("| +-----+---------------+-------+-------+       |");
            for(int i = 0 ; i < namaMakanan.length ; i++){
                if(namaMakanan[i] == null)continue;
                System.out.println("| |  " +(i+1)+"\t| " +namaMakanan[i] + ((String.valueOf(namaMakanan[i]).length()) > 6 ? "\t| " : "\t\t| ") + dataMakanan[0][i] + "\t|  " + dataMakanan[1][i]+ "\t|       |");
            }
            System.out.println("| +-----+---------------+-------+-------+       |");
            System.out.println("=================================================");
            System.out.println("| Aksi                                          |");
            System.out.println("| 1. Tambah Data Makanan                        |");
            System.out.println("| 2. Ganti Data Makanan                         |");
            System.out.println("| 3. Hapus Data Makanan                         |");
            System.out.println("| 4. Tambah Stok Makanan                        |");
            System.out.println("| 5. Kembali Ke Menu Utama                      |");
            System.out.println("=================================================");
            System.out.print("Masukan Nomor Pilihan Aksi : ");
            int nomor = sc.nextInt();
            switch (nomor){
                case 1:
                    System.out.print("Masukan Nama Makanan\t: ");
                    String nama = sc.nextLine();
                    nama = sc.nextLine();
                    System.out.print("Masukan Harga Makanan\t: ");
                    int harga = sc.nextInt();
                    System.out.print("Masukan Stok Makanan\t: ");
                    int stok = sc.nextInt();
                    tambahDataMakanan(nama, harga, stok);
                    break;
                    case 2:
                    System.out.print("Masukan Nomor Makanan\t: ");
                    int nom = sc.nextInt();
                    System.out.println("=================================================");
                    System.out.println("| +-----+---------------+-------+-------+       |");
                    System.out.println("| | No\t| Nama Makanan\t| Harga\t| Stok\t|       |");
                    System.out.println("| +-----+---------------+-------+-------+       |");
                    System.out.println("| | " +nom+"\t| " +namaMakanan[nom - 1] + ((String.valueOf(namaMakanan[nom - 1]).length()) > 6 ? "\t| " : "\t\t| ") + dataMakanan[0][nom-1] + "\t|  " + dataMakanan[1][nom-1]+ "\t|       |");
                    System.out.println("| +-----+---------------+-------+-------+       |");
                    System.out.println("=================================================");
                    System.out.print("Masukan Nama Makanan yang baru\t: ");
                    String nama1 = sc.nextLine();
                    nama1 = sc.nextLine();
                    System.out.print("Masukan Harga Makanan yang baru\t: ");
                    int harga1 = sc.nextInt();
                    gantiDataMakanan(nom ,nama1, harga1);
                break;
                case 3:
                    System.out.print("Masukan Nomor Makanan\t: ");
                    nom = sc.nextInt();
                    System.out.print("Yakin ingin menghapus " + namaMakanan[nom-1] + " (Y/N) : ");
                    char konfirm = sc.next().charAt(0);
                    if (konfirm == 'y' || konfirm == 'Y' ) hapusDataMakanan(nom);
                    else if(konfirm == 'n' || konfirm == 'N' );
                    else;
                break;
                case 4:
                    System.out.print("Masukan Nomor Makanan\t: ");
                    nom = sc.nextInt();
                    System.out.print("Masukan Stok ditambahkan\t: ");
                    int jum = sc.nextInt();
                    tambahStokMakanan(nom,jum);
                break;
                case 5:
                    System.out.println("KEMBALI KE MENU UTAMA");
                break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|           DATA YANG DIMASUKAN SALAH           |");
                    System.out.println("-------------------------------------------------");
                continue;
            }
            break;
        }
    }
    public static void tambahDataMakanan(String nama, int harga , int stok){
        for(int i = 0 ; i < namaMakanan.length ; i++){
            if(namaMakanan[i] == null){
                namaMakanan[i] = nama;
                dataMakanan[0][i] = harga;
                dataMakanan[1][i] = stok;
                System.out.println("-------------------------------------------------");
                System.out.println("|           DATA BERHASIL DITAMBAHKAN           |");
                System.out.println("-------------------------------------------------");
                break;
            }
        }
    }
    public static void gantiDataMakanan(int nom , String nama, int harga ){
        namaMakanan[nom-1] = nama;
        dataMakanan[0][nom-1] = harga;
        System.out.println("-------------------------------------------------");
        System.out.println("|             DATA BERHASIL DIGANTI             |");
        System.out.println("-------------------------------------------------");
    }
    public static void hapusDataMakanan(int nom ){
        namaMakanan[nom-1] = null;
        dataMakanan[0][nom-1] = 0;
        dataMakanan[1][nom-1] = 0;
        for(int i=0; i<(dataMakanan[0].length-1);i++){
                for(int j=0;j<dataMakanan[0].length-i-1;j++){
                        if (dataMakanan[0][j] == 0){
                        int swap = dataMakanan[0][j];
                        dataMakanan[0][j] = dataMakanan[0][j+1];
                        dataMakanan[0][j+1]=swap;
                        int swapp = dataMakanan[1][j];
                        dataMakanan[1][j] = dataMakanan[1][j+1];
                        dataMakanan[1][j+1]=swapp;
                        String swappp = namaMakanan[j];
                        namaMakanan[j] = namaMakanan[j+1];
                        namaMakanan[j+1]=swappp;
                    }
                }
            } 
            System.out.println("-------------------------------------------------");
            System.out.println("|             DATA BERHASIL DIHAPUS             |");
            System.out.println("-------------------------------------------------");
    }
    public static void tambahStokMakanan(int nom , int jum){
        dataMakanan[1][nom-1] += jum;
        System.out.println("-------------------------------------------------");
        System.out.println("|             STOK BERHASIL DITAMBAH            |");
        System.out.println("-------------------------------------------------");
    }
    public static void tampilMenu(){
        System.out.println("=================================================");
        System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
        System.out.println("| |                SISTEM KASIR               | |");
        System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
        System.out.println("=================================================");
        System.out.println("| +-----+---------------+-------+-------+       |");
        System.out.println("| | No\t| Nama Makanan\t| Harga\t| Stok\t|       |");
        System.out.println("| +-----+---------------+-------+-------+       |");
        for(int i = 0 ; i < namaMakanan.length ; i++){
            if(namaMakanan[i] == null)continue;
            System.out.println("| |  " +(i+1)+"\t| " +namaMakanan[i] + ((String.valueOf(namaMakanan[i]).length()) > 6 ? "\t| " : "\t\t| ") + dataMakanan[0][i] + "\t|  " + dataMakanan[1][i]+ "\t|       |");
        }
        System.out.println("| +-----+---------------+-------+-------+       |");
        System.out.println("=================================================");
    }
    public static void pesanMakanan(){
        int i = 0;
        while(true){
            if(i > 0){
                System.out.println("=================================================");
                System.out.println("| | - - - - - - - - - - - - - - - - - - - - = | |");
                System.out.println("| |           MAKANAN YANG ANDA PESAN         | |");
                System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
                System.out.println("=================================================");
                System.out.println("| +-----+---------------+---------------+-------+");
                System.out.println("| | No\t| Nama Makanan\t| SubTotal\t| Total\t|");
                System.out.println("| +-----+---------------+---------------+-------+");
                for(int q = 0 ; q < pesanan[0].length ; q++){
                    if (pesanan[0][q] == 0)continue;
                    int totalPer =  (pesanan[1][q] * dataMakanan[0][(pesanan[0][q]-1)]);
                    System.out.println("| | " +(q+1)+"\t| " +namaMakanan[(pesanan[0][q]-1)] + ((String.valueOf(namaMakanan[(pesanan[0][q]-1)]).length()) > 6 ? "\t| " : "\t\t| ") +(pesanan[1][q])+" @ "+ dataMakanan[0][pesanan[0][q]-1] + "\t| " +totalPer + "\t|");
                }
                System.out.println("| +-----+---------------+---------------+-------+");
                System.out.println("=================================================");
            }
            int jumlahtemp = 0;
            System.out.print("Angka Makanan yang dipesan : ");
            int nomor = sc.nextInt();
            System.out.print("Jumlah Pesanan             : ");
            int jumlah = sc.nextInt();
            System.out.println("=================================================");
            if (nomor < 1 || nomor > (dataMakanan[0].length + 1) || jumlah < 1) {
                System.out.println("-------------------------------------------------");
                System.out.println("|           DATA YANG DIMASUKAN SALAH           |");
                System.out.println("-------------------------------------------------");
                continue;
            }
            tempStok[0][i] = nomor;
            tempStok[1][i] = jumlah;
            for(int j = 0 ; j < tempStok[0].length; j++){
                if(nomor == tempStok[0][j]){
                    jumlahtemp += tempStok[1][j];
                }
            }
            if(jumlahtemp < dataMakanan[1][nomor-1]){
                System.out.print("Mau Pesan Lagi (Y/N) : ");
                char konfirm = sc.next().charAt(0);
                if (konfirm == 'y' || konfirm == 'Y' ) {
                    pesanan[0][i] = nomor;
                    pesanan[1][i] = jumlah;
                    i++;
                    System.out.println("=================================================");
                    continue;
                }
                else if(konfirm == 'n' || konfirm == 'N' ) {
                    pesanan[0][i] = nomor;
                    pesanan[1][i] = jumlah;
                    System.out.println("=================================================");
                    break;
                }
                else{
                    System.out.println("-------------------------------------------------");
                    System.out.println("|           DATA YANG DIMASUKAN SALAH           |");
                    System.out.println("-------------------------------------------------");
                    continue;
                }
            }
            else{
                tempStok[0][i] = 0;
                tempStok[1][i] = 0;
                System.out.println("-------------------------------------------------");
                System.out.println("|          STOK MAKANAN TIDAK TERSEDIA          |");
                System.out.println("-------------------------------------------------");
                continue;
            }
        }
    }
    
    public static void nota(){
        System.out.println("=================================================");
        System.out.println("| | - - - - - - - - - - - - - - - - - - - - = | |");
        System.out.println("| |               NOTA PEMBAYARAN             | |");
        System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
        System.out.println("=================================================");
        System.out.println("| +-----+---------------+---------------+-------+");
        System.out.println("| | No\t| Nama Makanan\t| SubTotal\t| Total\t|");
        System.out.println("| +-----+---------------+---------------+-------+");
        total = 0;
        for(int q = 0 ; q < pesanan[0].length ; q++){
            if (pesanan[0][q] == 0)continue;
            int totalPer =  (pesanan[1][q] * dataMakanan[0][(pesanan[0][q]-1)]);
            total += totalPer;
            System.out.println("| | " +(q+1)+"\t| " +namaMakanan[(pesanan[0][q]-1)] + ((String.valueOf(namaMakanan[(pesanan[0][q]-1)]).length()) > 6 ? "\t| " : "\t\t| ") +(pesanan[1][q])+" @ "+ dataMakanan[0][pesanan[0][q]-1] + "\t| " +totalPer + "\t|");
        }
        System.out.println("| +-----+---------------+---------------+-------+");
        System.out.println("=================================================");
        System.out.println("Total\t\t\t\t\t  "+total);
    }
    public static void pembayaran() {
        while(true){
            System.out.print("\nMasukan Nominal Uang : ");
            int uang = sc.nextInt();
            int totalAkhir = pengecekanPembayaran(uang);
            if(totalAkhir < 0){
                System.out.println("=================================================");
                System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
                System.out.println("| |                                           | |");
                System.out.println("| |     TERIMA KASIH TELAH MEMESAN MAKANAN    | |");
                System.out.println("| |                                           | |");
                System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
                System.out.println("=================================================");
                for(int j = 0 ; j < pesanan[0].length; j++){
                    if(pesanan[0][j] == 0) continue;
                    dataMakanan[1][(pesanan[0][j] - 1)] -= pesanan[1][j];
                }
                break;
            }
            else if( totalAkhir == 0 ){
                System.out.println("Nominal Uang Kurang");
                continue;
            }
            else{
                System.out.println("Kembalian anda : " + totalAkhir);
                System.out.println("=================================================");
                System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
                System.out.println("| |                                           | |");
                System.out.println("| |     TERIMA KASIH TELAH MEMESAN MAKANAN    | |");
                System.out.println("| |                                           | |");
                System.out.println("| | - - - - - - - - - - - - - - - - - - - - - | |");
                System.out.println("=================================================");
                for(int j = 0 ; j < pesanan[0].length; j++){
                    if(pesanan[0][j] == 0) continue;
                    dataMakanan[1][(pesanan[0][j] - 1)] -= pesanan[1][j];
                }
                break;
            }
        }
    }
    public static int pengecekanPembayaran(int bayar){
        int totalAsli = 0;
        if(bayar == total){
            totalAsli = -1;
        }
        else if(bayar < total){
            totalAsli = 0;
        }
        else if(bayar > total){
            totalAsli = bayar - total;
        }
        return totalAsli;
    }
}