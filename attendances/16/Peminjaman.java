
import java.util.Date;
import java.util.Scanner;
class Pinjam { 
  
    public int id; 
    public String name; 
    private final String nama;
    private final String buku;
    private final int lama;
  
    Pinjam( String nama, String buku, int lama){ 
        this.nama = nama; 
        this.buku = buku;
        this.lama = lama;
    } 

}
public class Peminjaman {
    public static void main(String[] args) {
        while(true){
        Scanner sc=new Scanner (System.in);
        int lp = 5;
        int n = 4;
        int p = 6;
        int k = 7;
        int d = 8;
        int pk = 3;
        int m = 9;
        int sp = 10;
        int harga =  2000;
        int bayar;
        Pinjam[] hasil_pinjam = null;
        int i = 0;
        int hitung = 0;
        int hitung_lama =0;
        String nama_Peminjam;
        String judul_buku;
        String kode_buku;
        int tglpinjam;
        int tglkembali;
        int hitung_peminjaman;
        int denda;
        int tgl_pengembalian = 2;
        String kodeBuku[] = {"lp", "n", "p", "k", "d", "pk", "m", "sp"};
        String ckode;
        int hasil =0;
        int pilih=0;
        System.out.println("========================================" ); 
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN POLINEMA");
        System.out.println("           Telp(0341)404424            " );
        System.out.println("  Jl. Soekarno Hatta No.9, Jatimulyo" );
        System.out.println("       Kec. Lowokwaru, Kota Malang " ); 
        System.out.println("          Jawa Timur 65141 " ); 
        System.out.println("========================================");
        System.out.println("1. Stok Buku");
        System.out.println("2. Peminjaman buku");
        System.out.println("3. Pengembalian Buku");
        System.out.println("4. Pencarian Buku");
        System.out.println("====================");
        System.out.println("Pilih Daftar Menu : ");
        pilih=sc.nextInt();
        if(pilih == 1){ //Fitur menu data master barang dan stoknya
            System.out.println("====================" );
            System.out.println("     STOK BUKU       ");
            System.out.println("====================" );
            System.out.println("(LP)Laskar Pelangi  = "+lp);
            System.out.println("(N) Naruto  = "+n);
            System.out.println("(P) Popeye  = "+p);
            System.out.println("(K) Kancil  = "+k);
            System.out.println("(D) Doraemon = "+d);
            System.out.println("(PK)Perahu Kertas = "+pk);
            System.out.println("(M) Mariposa = "+m);
            System.out.println("(SP)Sang Pemimpi = "+sp);
            System.out.println("Biaya Sewa Satu Barang = "+ harga);
        }else if(pilih == 2){ //Fitur menu input peminjaman dan Pembayaran
            System.out.println("================");
            System.out.println("PEMINJAMAN BUKU");
            System.out.println("================");
            System.out.println("Masukan Nama Peminjam :");
            String nama=sc.next();
            System.out.println("Masukan kode = ");
            String kode=sc.next();
            System.out.println("Kode "+kode);
            if(kode.equals("LP")){
                System.out.println("Buku Laskar Pelangi");
                System.out.println("Jumlah Pinjam = ");
                int pinjam = sc.nextInt();
                System.out.println("Lama Pinjam = ");
                int lama_pinjam = sc.nextInt();
                if(pinjam != 0){
                    hitung = lp-pinjam;
                    hitung_lama = lama_pinjam * harga;
                    i=1;
                     System.out.println("No "+(i));
                    System.out.println("Nama "+nama);
                    System.out.println("Kode Buku "+kode);
                    System.out.println("Jumlah Pembayaran "+hitung_lama);     
                }
            }else if(kode.equals("N")){
                System.out.println("Naruto");
                System.out.println("Jumlah Pinjam = ");
                int pinjam = sc.nextInt();
                System.out.println("Lama Pinjam = ");
                int lama_pinjam = sc.nextInt();
                if(pinjam != 0){
                    hitung = lp-pinjam;
                    hitung_lama = lama_pinjam * harga;
                    i=1;
                     System.out.println("No "+(i));
                    System.out.println("Nama "+nama);
                    System.out.println("Kode Buku "+kode);
                    System.out.println("Jumlah Pembayaran "+hitung_lama);   
                }
            }else if(kode.equals("P")){
                System.out.println("Popeye2");
                System.out.println("Jumlah Pinjam = ");
                int pinjam = sc.nextInt();
                System.out.println("Lama Pinjam = ");
                int lama_pinjam = sc.nextInt();
                if(pinjam != 0){
                    hitung = lp-pinjam;
                    hitung_lama = lama_pinjam * harga;
                    i=1;
                    System.out.println("No "+(i));
                    System.out.println("Nama "+nama);
                    System.out.println("Kode Buku "+kode);
                    System.out.println("Jumlah Pem4bayaran "+hitung_lama);
                }
            }else if(kode.equals("K")){
                System.out.println("Kancil");
                System.out.println("Jumlah Pinjam = ");
                int pinjam = sc.nextInt();
                System.out.println("Lama Pinjam = ");
                int lama_pinjam = sc.nextInt();
                if(pinjam != 0){
                    hitung = lp-pinjam;
                    hitung_lama = lama_pinjam * harga;
                    i=1;
                    System.out.println("No "+(i));
                    System.out.println("Nama "+nama);
                    System.out.println("Kode Buku "+kode);
                    System.out.println("Jumlah Pem4bayaran "+hitung_lama);
                }
            }else if(kode.equals("D")){
                System.out.println("Doraemon");
                System.out.println("Jumlah Pinjam = ");
                int pinjam = sc.nextInt();
                System.out.println("Lama Pinjam = ");
                int lama_pinjam = sc.nextInt();
                if(pinjam != 0){
                    hitung = lp-pinjam;
                    hitung_lama = lama_pinjam * harga;
                    i=1;
                    System.out.println("No "+(i));
                    System.out.println("Nama "+nama);
                    System.out.println("Kode Buku "+kode);
                    System.out.println("Jumlah Pem4bayaran "+hitung_lama);
                }
            }else if(kode.equals("PK")){
                System.out.println("Perahu Kertas");
                System.out.println("Jumlah Pinjam = ");
                int pinjam = sc.nextInt();
                System.out.println("Lama Pinjam = ");
                int lama_pinjam = sc.nextInt();
                if(pinjam != 0){
                    hitung = lp-pinjam;
                    hitung_lama = lama_pinjam * harga;
                    i=1;
                    System.out.println("No "+(i));
                    System.out.println("Nama "+nama);
                    System.out.println("Kode Buku "+kode);
                    System.out.println("Jumlah Pem4bayaran "+hitung_lama);
                }
            }else if(kode.equals("M")){
                System.out.println("Mariposa");
                System.out.println("Jumlah Pinjam = ");
                int pinjam = sc.nextInt();
                System.out.println("Lama Pinjam = ");
                int lama_pinjam = sc.nextInt();
                if(pinjam != 0){
                    hitung = lp-pinjam;
                    hitung_lama = lama_pinjam * harga;
                    i=1;
                    System.out.println("No "+(i));
                    System.out.println("Nama "+nama);
                    System.out.println("Kode Buku "+kode);
                    System.out.println("Jumlah Pem4bayaran "+hitung_lama);
                }
            }else if(kode.equals("SP")){
                System.out.println("Sang Pemimpi");
                System.out.println("Jumlah Pinjam = ");
                int pinjam = sc.nextInt();
                System.out.println("Lama Pinjam = ");
                int lama_pinjam = sc.nextInt();
                if(pinjam != 0){
                    hitung = lp-pinjam;
                    hitung_lama = lama_pinjam * harga;
                    i=1;
                    System.out.println("No "+(i));
                    System.out.println("Nama "+nama);
                    System.out.println("Kode Buku "+kode);
                    System.out.println("Jumlah Pem4bayaran "+hitung_lama);
                }
            }else{
                System.out.println("Kode Tidak Ada");
            }
          }else if(pilih==3){ //Fitur menu input pengembalian dan Denda
             System.out.println("===================" ); 
             System.out.println("INPUT PENGEMBALIAN" ); 
             System.out.println("===================" ); 
             System.out.println("Nama : " );
             nama_Peminjam=sc.next();
             System.out.println("Judul Buku : " );
             judul_buku=sc.next();
             System.out.println("Kode Buku : " );
             kode_buku=sc.next();
             System.out.println("Tanggal Pinjam : ");
             tglpinjam=sc.nextInt();
             System.out.println("Tanggal Kembali: ");
             tglkembali=sc.nextInt();

                hitung_peminjaman = tglkembali - tglpinjam;
                bayar = hitung_peminjaman * 2000;
        if(hitung_peminjaman <= tgl_pengembalian){

            System.out.println("\nNama \t\t\t: "+nama_Peminjam);
            System.out.println("judul buku \t\t: "+judul_buku);
            System.out.println("Kode buku \t\t: "+kode_buku);
            System.out.println("Tanggal Pinjam \t\t: "+tglpinjam+" Februari 2021");
            System.out.println("Tanggal Kembali \t: "+tglkembali+" Februari 2021");
                        System.out.println("Bayar \t\t: Rp. "+bayar+"");
            System.out.println("Denda \t\t\t: Tidak Ada Denda");
        }
        else
        {
                    
                denda=(hitung_peminjaman * 500);
            System.out.println("\nNama \t\t\t: "+nama_Peminjam);
            System.out.println("Judul buku \t\t: "+judul_buku);
            System.out.println("Kode Buku \t\t: "+kode_buku);
            System.out.println("Tanggal Pinjam \t\t: "+tglpinjam+" Februari 2021");
            System.out.println("Tanggal Kembali \t: "+tglkembali+" Februari 2021");
                         System.out.println("Bayar \t\t\t: Rp. "+bayar+"");
            System.out.println("Denda \t\t\t: Rp. "+denda);
        }  
            }else if(pilih == 4){ //Fitur menu pencarian barang
            System.out.println("====================" );
            System.out.println("   PENCARIAN BUKU   ");
            System.out.println("====================" );
            System.out.println("DAFTAR BUKU :");
            System.out.println("1. Laskar Pelangi ");
            System.out.println("2. Naruto ");
            System.out.println("3. Popeye ");
            System.out.println("4. Kancil ");
            System.out.println("5. Doraemon "); 
            System.out.println("6. Perahu Kertas ");
            System.out.println("7. Mariposa ");
            System.out.println("8. Sang Pemimpi ");  
            System.out.println("=============== ");
             for(int j=0;j<kodeBuku.length;j++){
                    System.out.println((j+1) + ". "+kodeBuku[j]);
                }
            System.out.println("Masukkan Kode : ");
            ckode = sc.next();
            
            if(ckode.equals("lp")){
               
                for (int b=0; b<kodeBuku.length;b++){
                    if (kodeBuku[b].equals(ckode)){
                        System.out.println("Kode yang dicari ada di index ke : "+b);
                        hasil=1;
                    }else{

                    }
                    if (hasil==0){

                    }else{
                        System.out.println("kode yang dicari tidak ada");
                    }
                }    
            }else if(ckode.equals("n")){
                
                 for (int b=0; b<kodeBuku.length;b++){
                    if (kodeBuku[b].equals(ckode)){
                        System.out.println("Kode yang dicari ada di index ke : "+b);
                        hasil=1;
                    }else{

                    }
                    if (hasil==0){

                    }else{
                        System.out.println("kode yang dicari tidak ada");
                    }
                }   
                
            }else if(ckode.equals("p")){
                for (int b=0; b<kodeBuku.length;b++){
                    if (kodeBuku[b].equals(ckode)){
                        System.out.println("Kode yang dicari ada di index ke : "+b);
                        hasil=1;
                    }else{

                    }
                    if (hasil==0){

                    }else{
                        System.out.println("kode yang dicari tidak ada");
                    }
                }
                
            }else if(ckode.equals("k")){
                for (int b=0; b<kodeBuku.length;b++){
                    if (kodeBuku[b].equals(ckode)){
                        System.out.println("Kode yang dicari ada di index ke : "+b);
                        hasil=1;
                    }else{

                    }
                    if (hasil==0){

                    }else{
                        System.out.println("kode yang dicari tidak ada");
                    }
                }
                
            }else if(ckode.equals("d")){
                for (int b=0; b<kodeBuku.length;b++){
                    if (kodeBuku[b].equals(ckode)){
                        System.out.println("Kode yang dicari ada di index ke : "+b);
                        hasil=1;
                    }else{

                    }
                    if (hasil==0){

                    }else{
                        System.out.println("kode yang dicari tidak ada");
                    }
                }
                
            }else if(ckode.equals("pk")){
                for (int b=0; b<kodeBuku.length;b++){
                    if (kodeBuku[b].equals(ckode)){
                        System.out.println("Kode yang dicari ada di index ke : "+b);
                        hasil=1;
                    }else{

                    }
                    if (hasil==0){

                    }else{
                        System.out.println("kode yang dicari tidak ada");
                    }
                }
                
            }else if(ckode.equals("m")){
                for (int b=0; b<kodeBuku.length;b++){
                    if (kodeBuku[b].equals(ckode)){
                        System.out.println("Kode yang dicari ada di index ke : "+b);
                        hasil=1;
                    }else{

                    }
                    if (hasil==0){

                    }else{
                        System.out.println("kode yang dicari tidak ada");
                    }
                }
                
            }else if(ckode.equals("sp")){
                for (int b=0; b<kodeBuku.length;b++){
                    if (kodeBuku[b].equals(ckode)){
                        System.out.println("Kode yang dicari ada di index ke : "+b);
                        hasil=1;
                    }else{

                    }
                    if (hasil==0){

                    }else{
                        System.out.println("kode yang dicari tidak ada");
                    }
                }
            }
            
        }

        System.out.println("Mau Pesan Lagi (Y/N) : ");
            char konfirm = sc.next().charAt(0);
           
            if (konfirm == 'N' || konfirm == 'n' ) break;
             else if (konfirm == 'y' || konfirm == 'Y' ) continue;
            else continue;
    }
        
    }
}

       