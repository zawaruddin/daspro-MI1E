import java.util.Scanner;
public class 2131710081_FerlyYanuarPrasetyo{
    static String nasabah [] = new String[10];
    static int nomerrek [] = new int[10];
    static int saldo [] = new int[10]; 
    static int setortabung [] = new int[10];
    static int ambiltabung[] = new int[10];
    static int transferx[] = new int[10];
    static int size = 0;
    static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
     
       
       while(true){
           
           menu();
       }
        
    }
    public static void menu(){
        
        
        System.out.println("============ SELAMAT DATANG DI BANK JAYA MAKMUR ==========");
        System.out.println("1. Input data Nasabah ");
        System.out.println("2. Lihat data Nasabah ");
        System.out.println("3. pilih jenis Tabungan ");
        System.out.println("4. Transaksi ");
        System.out.println("5. exit");
        System.out.println("Masukkan Perintah : ");
        int cmd = in.nextInt();
        
        if(cmd==1){
            System.out.println("Masukkan nama :");
            in.nextLine();
            String nama = in.nextLine();
            System.out.println("Masukkan Nomer Rekening : ");
            int norekx = in.nextInt();
            System.out.println("Masukkan saldo :");
            int saldo1 = in.nextInt();
            inputData(nama,norekx,saldo1);
        }else if(cmd==2){
            lihatData();
        }else if(cmd==3){
            menuJ();
        }else if(cmd==4){
            menuT();
        }else if(cmd==5){
            System.out.println("Terimakasih Telah Melakukan Transaksi");
            System.exit(0);
        }
        
        
    }
    public static void menuJ(){
        System.out.println("===================Silahkan Pilih Jenis Tabungan======================");
        System.out.println("1. Tabungan Pintar");
        System.out.println("2. Tabungan Taplus");
        System.out.println("3. Tabungan Anak");
        System.out.println("Masukkan Perintah :");
        int jenistabungan = in.nextInt();
        if(jenistabungan == 1){
            int pintar = 15000;
            System.out.println("Anda dikenakan biaya pajak sebesar Rp."+pintar);
            System.out.println("Masukkan nomer rekening Anda :");
            int norek = in.nextInt();
            tabunganPintar(norek,pintar);
        }else if(jenistabungan == 2){
            int taplus = 10000;
            System.out.println("Anda dikenakan biaya pajak sebesar Rp."+taplus);
            System.out.println("Masukkan nomer rekening Anda :");
            int norek = in.nextInt();
            tabunganTaplus(norek,taplus);
        }else if(jenistabungan == 3){
            int anak = 5000;
            System.out.println("Anda dikenakan biaya pajak sebesar Rp."+anak);
            System.out.println("Masukkan nomer rekening Anda :");
            int norek = in.nextInt();
            tabunganAnak(norek,anak);
        }
    }
    public static void menuT(){
        System.out.println("============ Tabungan ==========");
        System.out.println("1. Cek saldo ");
        System.out.println("2. Setor tabungan ");
        System.out.println("3. Ambil tabungan ");
        System.out.println("4. Transfer ");
        System.out.println("5. Cetak laporan ");
        System.out.println("Masukkan Perintah : ");
        int cmd1 = in.nextInt();
        if(cmd1==1){
            System.out.println("Masukkan Nomer Rekening Anda : ");
            int norek = in.nextInt();
            cekSaldo(norek);
        }else if(cmd1==2){
           System.out.println("Masukkan Nomer Rekening : ");
           int norek = in.nextInt();
           System.out.println("Masukkan jumlah setoran");
           int setor = in.nextInt();
           setorTabungan(norek,setor);
           
        }else if(cmd1==3){
           System.out.println("Masukkan Nomer Rekening : ");
           int norek = in.nextInt();
           System.out.println("Masukkan jumlah uang");
           int setor = in.nextInt();
           ambilTabungan(norek,setor);
        }else if(cmd1==4){
           System.out.println("Masukkan Nomer Rekening Anda : ");
           int norek1 = in.nextInt();
           System.out.println("Masukkan Nomer rekening Tujuan : ");
           int norek2 = in.nextInt();
           System.out.println("Masukkan jumlah uang : ");
           int setor = in.nextInt();
           transfer(norek1,norek2,setor);
        }else if(cmd1==5){
            System.out.println("Masukkan Nomer rekening : ");
            int norek = in.nextInt();
            cetakLaporan(norek);
        }
    }
    public static void cekSaldo(int norek){
        int indeks = cariData(norek);
        String namaa = nasabah[indeks];
        int sald = saldo[indeks];
        System.out.println("Nama Nasabah : "+namaa);
        System.out.println("Nomer Rekening : "+norek);
        System.out.println("Saldo anda tersisa Rp."+sald);
        
        
    }
    public static  void lihatData(){
        System.out.println("============== Data Nasabah ===============");
        for(int i=0;i<size;i++){
            System.out.println("Nama : "+nasabah[i]);
            System.out.println("Nomer Rekening : "+nomerrek[i]);
            System.out.println("Saldo : "+saldo[i]);
            System.out.println("==========================================");
        }
    }
    public static void inputData(String nama, int norekx, int saldo1){
        nasabah[size] = nama;
        nomerrek[size] = norekx;
        saldo[size] = saldo1;
        size++;
    }
    public static void setorTabungan(int norek, int setor){
        int indeks = cariData(norek);
        saldo[indeks]+= setor;
        setortabung[indeks]=setor;
        System.out.println("Tabungan berhasil disetor");
        cekSaldo(norek);
    }
    public static void ambilTabungan(int norek, int setor){
        int indeks = cariData(norek);
        saldo[indeks]-= setor;
        ambiltabung[indeks]=setor;
        System.out.println("Tabungan berhasil diambil");
        cekSaldo(norek);
    }
    public static void transfer1(int norek, int setor){
        int indeks = cariData(norek);
        saldo[indeks]+= setor;
        cekSaldo(norek);
    }
    public static void transfer3(int norek, int setor){
        int indeks = cariData(norek);
        saldo[indeks]-=setor;
        transferx[indeks]=setor;
        cekSaldo(norek);
    }
    public static void transfer( int norek1,int norek2, int setor){
        transfer3(norek1,setor);
        transfer1(norek2,setor);
        System.out.println("Transfer berhasil ");
        
        
    }
    public static void tabunganPintar(int norek, int pintar){
        int indeks = cariData(norek);
        saldo[indeks]-=pintar;
        cekSaldo(norek);
    }
    public static void tabunganTaplus(int norek, int taplus){
        int indeks = cariData(norek);
        saldo[indeks]-=taplus;
        cekSaldo(norek);
    }
    public static void tabunganAnak(int norek, int anak){
        int indeks = cariData(norek);
        saldo[indeks]-=anak;
        cekSaldo(norek);
    }
    public static void cetakLaporan(int norek){
        int indeks = cariData(norek);
        System.out.println("====================LAPORAN TRANSAKSI NASABAH====================");
        System.out.println("Nama nasabah : "+nasabah[indeks]);
        System.out.println("Nomer Rekening : "+nomerrek[indeks]);
        System.out.println("Saldo : "+saldo[indeks]);
        System.out.println("Setor Tabungan : "+setortabung[indeks]);
        System.out.println("Ambil Tabungan : "+ambiltabung[indeks]);
        System.out.println("Transfer :"+transferx[indeks]);
    }
    
    public static  int cariData(int norek){
        int result1 = 0;
        for(int i=0 ; i<size;i++){
            if(nomerrek[i]==(norek)){
               result1 = i; 
            }
        }
        return result1;
    }
}    
