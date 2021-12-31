import java.util.Scanner;

public class inven{
static String y, n, lagi;
static Boolean found = true, menu = true;
static int totB;
static Scanner input = new Scanner(System.in);
static String [][] barang = {
    {"Tenda","4"},
    {"Kursi","300"},
    {"Panggung","20"},
    {"KipasAngin","20"},
    {"Meja","50"}, 
    {"TaplakMeja","240"},
    {"-","-"},
    {"-","-"},
    {"-","-"},
    {"-","-"},
    };
    
    
        
    public static void main(String[] args){
        System.out.println("***********************************************");
        System.out.println("*     SELAMAT DATANG DI PROGRAM INVENTORY     *");
        System.out.println("***********************************************");
        menu();
}
//FUNGSI MENU
public static void menu(){
    System.out.println("----------------------------------------------");
    System.out.println("                   Menu                       ");
    System.out.println("1. Input Data Barang");
    System.out.println("2. Input Barang Masuk");
    System.out.println("3. Input Barang Keluar");
    System.out.println("4. Input barang Rusak");
    System.out.println("5. Pencarian Data Barang");
    System.out.println("6. Laporan Data Barang Saat Ini");
    System.out.println("7. Keluar Program");
    System.out.println("----------------------------------------------");
    System.out.print("Masukkan Angka Menurut Menu = ");
    int angka = input.nextInt();
    switch(angka){
        case 1:
        inputdataBarang();
        break;
        case 2:
        inputbarangMasuk();
        break;
        case 3:
        inputbarangKeluar();
        break;
        case 4:
        inputbarangRusak();
        break;
        case 5:
        pencarian();
        break;
        case 6:
        laporandata();
        break;
        case 7:
        System.exit(7);
        break;
    default:
    System.out.println("Angka yang Anda masukkan salah!\n");
    }
    menu();
}
public static void inputdataBarang(){
System.out.println("----------------------------------------------");
System.out.println("              INPUT DATA BARANG               ");
System.out.print(" Masukkan nama barang        : ");
String namaB = input.next();
System.out.print(" Masukkan jumlah barang masuk: ");
int jumlahB = input.nextInt();
for (int i=0;i<barang.length;i++){
    if(barang[i][0].equalsIgnoreCase("-")){
        barang[i][0] = namaB;
        System.out.println("Nama barang baru   = " +namaB);
        barang[i][1] = String.valueOf(jumlahB);
        System.out.println("Jumlah barang baru = " +jumlahB);
        System.out.print("Input barang lagi?(y/n)");
        lagi = input.next();       
         if (lagi.equalsIgnoreCase("y")){
             inputdataBarang();
         }else if(lagi.equalsIgnoreCase("n")){
             menu();
            }
        }
    }
}

public static void inputbarangMasuk(){
System.out.println("----------------------------------------------");
System.out.println("              INPUT BARANG MASUK              ");
System.out.print("Masukkan nama barang        : ");
   String namaB = input.next();
System.out.print("Masukkan jumlah barang masuk: ");
   int jumlahB = input.nextInt();
    for(int i = 0;i<barang.length;i++){
     if(barang[i][0].equalsIgnoreCase(namaB)){
        found = true;
        System.out.println("Nama barang: "+barang[i][0]);
        int BarangS = Integer.valueOf(barang[i][1]);
        totB = BarangS + jumlahB;
        barang[i][1] = String.valueOf(totB);
        System.out.println("Jumlah barang saat ini= " +totB);
        System.out.print("Input barang lagi?(y/n)");
        lagi = input.next();
        if (lagi.equalsIgnoreCase("y")){
            inputbarangMasuk();
        }else if(lagi.equalsIgnoreCase("n")){
            menu();
            }
        }
    }
}  
public static void inputbarangKeluar(){
    System.out.println("----------------------------------------------");
    System.out.print("             INPUT BARANG KELUAR                  \n");
    System.out.print("Masukkan nama barang         : ");
    String namaB = input.next();
    System.out.print("Masukkan jumlah barang keluar: ");
    int jumlahB = input.nextInt();
    for (int i=0; i<barang.length;i++){
        if (barang[i][0].equalsIgnoreCase(namaB)){
            found =true;
            int BarangS = Integer.valueOf(barang[i][1]);
            System.out.println("Nama barang    = " +barang[i][0]);
            totB = BarangS - jumlahB;
            barang[i][1] = String.valueOf(totB);
            System.out.println("Sisa barang    = " +totB);
            System.out.print("Input barang lagi?(y/n)");
            lagi = input.next();
            if (lagi.equalsIgnoreCase("y")){
            inputbarangKeluar();
            }else if(lagi.equalsIgnoreCase("n")){
            menu();
            }
        }
    }
}
public static void inputbarangRusak(){
    System.out.println("----------------------------------------------");
    System.out.println("             INPUT BARANG RUSAK               ");
    System.out.print("Masukkan nama barang         : ");
    String namaB = input.next();
    System.out.print("Jumlah barang rusak          : ");
    int jumlahB = input.nextInt();
    for (int i=0; i<barang.length;i++){
        if (barang[i][0].equalsIgnoreCase(namaB)){
            found =true;
            int BarangS = Integer.valueOf(barang[i][1]);
            System.out.println("Nama barang  = "+barang[i][0]);
            totB = BarangS - jumlahB;
            barang[i][1] = String.valueOf(totB);
            System.out.println("Sisa barang  = " +totB);
            System.out.print("Input barang lagi?(y/n)");
            lagi = input.next();
            if (lagi.equalsIgnoreCase("y")){
            inputbarangKeluar();
            }else if(lagi.equalsIgnoreCase("n")){
            menu();
            }
        }
    }
}
public static void pencarian(){
    System.out.println("----------------------------------------------");
    System.out.println("            PENCARIAN DATA BARANG             ");
    System.out.print("Masukkan nama barang: ");
    String namaB = input.next();
    for (int i=0; i<barang.length; i++){
       if (barang[i][0].equalsIgnoreCase(namaB)){
        found = true;
           System.out.println("Nama barang: "+barang[i][0]);
           System.out.println("Stok barang: "+barang[i][1]);
           System.out.print("Input barang lagi?(y/n)");
            lagi = input.next();
            if (lagi.equalsIgnoreCase("y")){
            pencarian();
        }else if(lagi.equalsIgnoreCase("n")){
             menu();
            }
       }  
    }
}
public static void laporandata(){
    System.out.println("----------------------------------------------");
    System.out.println("        LAPORAN DATA BARANG SAAT INI          ");
    System.out.println("=======================");
    System.out.println("|Nama Barang || Jumlah|");
    System.out.println("=======================");
    //for (int i=0; i<barang.length; i++){
        //for (int j=0; j<barang[i].length; j++){
            //System.out.print("/"+barang[i][j]);
            //System.out.print(" ");
        System.out.println(barang[0][0]+"\t\t"+barang[0][1]);
        System.out.println(barang[1][0]+"\t\t"+barang[1][1]);
        System.out.println(barang[2][0]+"\t"+barang[2][1]);
        System.out.println(barang[3][0]+"\t"+barang[3][1]);
        System.out.println(barang[4][0]+"\t\t"+barang[4][1]);
        System.out.println(barang[5][0]+"\t"+barang[5][1]);
        System.out.println(barang[6][0]+"\t\t"+barang[6][1]);
        System.out.println(barang[7][0]+"\t\t"+barang[7][1]);
        System.out.println(barang[8][0]+"\t\t"+barang[8][1]);
        System.out.println(barang[9][0]+"\t\t"+barang[9][1]);
        //}
        //System.out.println("");
        //}
    menu();
    } 
}