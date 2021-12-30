import java.util.Scanner;
public class UAS_2131710089_RizqiZamzamiJamil {
    static Scanner input = new Scanner(System.in);
	static int rekening[] = new int[50];
	static String jenisTab[] = new String[50];
	static int saldo[] = new int[50];
    static int banyak; 
	static int laporann [][] = new int[6][50];
	static int f = 0;
    static String nama[] = new String[50];
    static String namaMenu[] = {"   Cek Saldo   ","Setor  Tabungan" , "Tarik  Tabungan" , "    Transfer   "};
	
    public static void main(String[] args) {
		
        while(true){          
           menu();
		}
	}
		public static void menu(){// Menu Utama
		char back;
        do{ //menggunakan bentuk perulangan do while
			System.out.println("");
            System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
			System.out.println("|=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=|");
			System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
			System.out.println("|						|");
			System.out.println("|		1. Lihat Data Nasabah 	 	|");
			System.out.println("|		2. Input Data Nasabah 	 	|");
			System.out.println("|		3. Transaksi			|");
			System.out.println("|		4. Ketentuan Jenis Tabungan	|");
			System.out.println("|		5. Keluar			|");
			System.out.println("|						|");
			System.out.println("| 	*Panduan				|");
			System.out.println("| 	Masukkan kode sesuai nomor menu		|");
			System.out.println("|						|");
            System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
			System.out.print("	Masukkan kode : ");
			int kode = input.nextInt();
			System.out.println("");
            switch (kode){ //menggunakan bentuk pemilihan switch case
                case 1:lihat(); //fungsi lihat data
				break;
                case 2:input(); //fungsi input data
                break;
                case 3:transaksi(); //fungsi transaksi
				break;
                case 4:ketentuan(); //fungsi ketentuan jenis tabungan
                break;
				case 5:terimakasih(); //fungsi ucapan terimakasih
                break;
                default:beriTeguran(); //fungsi beri teguran
            }
            if(kode == 5){
                back = 'T';
            } else{
                System.out.print(" Ketik apa saja untuk kembali ke menu utama : ");
                back = input.next().charAt(0);  
                System.out.println("|------------------------><---------------------|");
				loading();
				}
            }			
            while(back != 'T');
		}
		
	static void input(){ //Menu input data nasabah
         int jml,no=1;
		System.out.println("");
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|						|");
		System.out.println("|=-=-=-=-=-=-= Input Data Nasabah =-=-=-=-=-=-=-|");
		System.out.println("|						|");
		System.out.println("|						|");
        System.out.print("|	Masukan Jumlah Nasabah Baru : ");
        jml = input.nextInt(); 
		System.out.println("|						|");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
        for(int i = banyak;i < banyak+jml;i++) //menggunakan bentuk perulangan for
        {
            System.out.println("|	Nasabah ke : "+ no + "				|"); 
	        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");			
            System.out.print("|	Masukkan Rekenening : "); //inputan Rekening
            rekening[i] = input.nextInt();
            input.nextLine();
	        System.out.println("|_______________________________________________|");			
			System.out.println("|	~~~~~Pilih Jenis Tabungan~~~~		|");
			System.out.println("|		1. BISNIS			|");
			System.out.println("|		2. PLUS				|");
			System.out.println("|		3. REGULER			|");
			System.out.println("|						|");	
            System.out.print("|	Masukkan Jenis Tabungan (Ketik) : "); //inputan Jenis tabungan
            jenisTab[i] = input.nextLine();
	        System.out.println("|_______________________________________________|");	
            System.out.print("|	Masukkan Nama Nasabah : "); //inputan Nama Nasabah
            nama[i] = input.nextLine();
	        System.out.println("|_______________________________________________|");					
            System.out.print("|	Masukkan Saldo Awal : "); //inputan saldo awal
            saldo[i] = input.nextInt(); 
	        System.out.println("|_______________________________________________|");
        	System.out.println("|						|");    
			no++;
        }
		banyak+=jml;
		loading();
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|						|");
		System.out.println("|	Tabungan Berhasil Dibuat !		|");
		System.out.println("|						|");	
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		}
	
    static void lihat(){ //menu tampil data nasabah
		loading();
		System.out.println("");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|								    |");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=- Data Nasabah -=-=-=-=-=-=-=-=-=-=-=-=-=-|");
		System.out.println("|								    |");
        System.out.println("|   Rekening    | Jenis Tabungan | Nama  Nasabah |  Saldo Tabungan  |");
        System.out.println("|-------------------------------------------------------------------|");
        for(int i = 0;i < banyak;i++){
            System.out.println("|\t"+  rekening[i]+ "\t|\t"+   jenisTab[i]+"\t |\t"+   nama[i]+"\t |  Rp. "+   saldo[i]+"\t    |");
        }
		System.out.println("|								    |");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");		
    }

    static void transaksi(){ //fungsi untuk menu transaksi
		loading();
		System.out.println("");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|						    |");
		System.out.println("|=-=-=-=-=-=-=-=-=-= Transaksi -=-=-=-=-=-=-=-=-=-=-|");
		System.out.println("|						    |");
        System.out.println("|		1. Cek Saldo			    |");
        System.out.println("|		2. Setor Tabungan 		    |");
        System.out.println("|		3. Ambil Tabungan 		    |");
        System.out.println("|		4. Transfer 			    |");
        System.out.println("|		5. Cetak Laporan Transaksi	    |");
		System.out.println("|		6. Kembali Ke Menu Utama 	    |");
		System.out.println("|						    |");
		System.out.println("| 	*Panduan				    |");
		System.out.println("|	 Masukkan kode sesuai nomor menu	    |");
		System.out.println("|						    |");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");		
        System.out.print("	Masukkan Kode : ");
		int kode2 = input.nextInt();
		switch(kode2){ //
            case 1:{ //cek saldo
				System.out.println("");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|						    |");
				System.out.println("|=-=-=-=-=-=-=-=-=-= Cek Saldo -=-=-=-=-=-=-=-=-=-=-|");
				System.out.println("|						    |");
				System.out.print("|	Masukkan Rekening Nasabah : ");
				int norek = input.nextInt();
				cekSaldo(norek);
				System.out.println("|						    |");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
                break;
            } 
            case 2: { //setor tabungan
				System.out.println("");
				System.out.println("");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|						    |");
				System.out.println("|=-=-=-=-=-=-=-=-= Setor Tabungan =-=-=-=-=-=-=-=-=-|");
				System.out.println("|						    |");
				System.out.print("|	Masukkan Nomer Rekening : ");
				int norek = input.nextInt();
				
				System.out.println("|___________________________________________________|");
				System.out.print("|	Masukkan Jumlah Setoran : ");
				int setor = input.nextInt();
				setorTabungan(norek,setor);
				
				System.out.println("|						    |");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
                break;
			}
			case 3: { //ambil tabungan
				System.out.println("");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|						    |");
				System.out.println("|=-=-=-=-=-=-=-=-= Tarik Tabungan =-=-=-=-=-=-=-=-=-|");
				System.out.println("|						    |");
				System.out.print("|	Masukkan Nomer Rekening : ");
				int norek = input.nextInt();
			
				System.out.println("|___________________________________________________|");
				System.out.print("|	Masukkan jumlah Uang : ");
				int setor = input.nextInt();
				
				ambilTabungan(norek,setor);
				System.out.println("|						    |");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
                break;
			}
			case 4: { //transfer tabungan
				System.out.println("");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|						    |");
				System.out.println("|=-=-=-=-=-=-=-=- Transfer Tabungan =-=-=-=-=-=-=-=-|");
				System.out.println("|						    |");
                System.out.print("|	Masukkan Rekening : ");
				int norek = input.nextInt();
		   
				System.out.println("|___________________________________________________|");
				System.out.print("|	Masukkan Rekening Tujuan : ");
				input.nextLine();
				int norek2 = input.nextInt();
         
				System.out.println("|___________________________________________________|");
				System.out.print("|	Masukkan Nominal Transfer : ");
				int transfer = input.nextInt();
				transfer(norek,norek2,transfer);
				System.out.println("|						    |");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				
                break;
			}
			case 5: { //cetak transaksi
                System.out.println("");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=-=|");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
				System.out.println("|						    |");
				System.out.println("|=-=-=-=-=-=-= Cetak Transaksi Nasabah -=-=-=-=-=-=-|");
				System.out.println("|						    |");
				System.out.print("|	Masukkan Rekening Anda : ");
				input.nextLine();
				int norek = input.nextInt();
					
				laporan(norek);
				System.out.println("");
				System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
                break;
			}
			case 6: { //kembali ke menu utama
				loading();
                menu();
                break;
			}
		}
    }
	static void ketentuan(){ //fungsi ketentuan jenis tabungan
		System.out.println("");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|						    |");
		System.out.println("|=-=-=-=-=-=-= Ketentuan Jenis Tabungan -=-=-=-=-=-=|");
		System.out.println("|						    |");
		System.out.println("|	*semua transaksi cek saldo bebas  biaya Admin|");
		System.out.println("|						    |");
		System.out.println("|	    ~~~~~ Tabungan REGULER ~~~~~	    |");
		System.out.println("|						    |");
		System.out.println("| 1. Maksimal setor adalah sebesar Rp. 3.000.000    |");
		System.out.println("| 2. Maksimal nominal transfer adalah Rp. 2.000.000 |");
		System.out.println("| 3. Biaya Admin setiap transaksi adalah Rp. 2.000  |");
		System.out.println("|---------------------------------------------------|");
		System.out.println("|						    |");
		System.out.println("|	    ~~~~~ Tabungan PLUS ~~~~~		    |");
		System.out.println("|						    |");
		System.out.println("| 1. Maksimal setor adalah Sebesar Rp. 5.000.000    |");
		System.out.println("| 2. Maksimal nominal transfer adalah Rp. 4.000.000 |");
		System.out.println("| 3. Biaya Admin setiap transaksi adalah Rp. 3.000  |");
		System.out.println("|---------------------------------------------------|");
		System.out.println("|						    |");
		System.out.println("|	    ~~~~~ Tabungan BISNIS ~~~~~		    |");
		System.out.println("|						    |");
		System.out.println("| 1. Jumlah tabungan tanpa batas		    |");
		System.out.println("| 2. Nominal transfer tanpa batas		    |");
		System.out.println("| 3. Biaya Admin setiap transaksi adalah Rp. 5.000  |");
		System.out.println("|---------------------------------------------------|");
	}
	
    static void loading() { //fungsi loading
        System.out.println("	Sedang Memproses...Mohon Menunggu...");
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());;
        }
    }
	
	static void terimakasih() { //fungsi ucapan terimakasih
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=-=> BANK RAKYAT MALANG <-=-=-=-=-=-=-=|");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("|						    |");
		System.out.println("|						    |");
		System.out.println("|  	Terimakasih Telah Bertransaksi... >^<	    |");
		System.out.println("|						    |");
		System.out.println("|	   --Dibuat Oleh Rizqi Zamzami Jamil--	    |");
		System.out.println("|		--NIM 2131710089--		    |");
		System.out.println("|						    |");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.exit(0);
	}
	
    static void beriTeguran(){ //fungsi salah input menu
        System.out.println("|	Mohon Maaf Anda Salah Memasukkan Kode ^_^");
		
    } 
	
	public static void sisaSaldo(int norek){// Digunakan untuk memanggil nama, nomer, dan saldo tersisa nasabah setiap transaski
        int indeks = cariRek(norek);
        String namaa = nama[indeks];
        int sald = saldo[indeks];
				
		System.out.println("");
        System.out.println("	Nama Nasabah 		: "+namaa);
        System.out.println("	Nomer Rekening  	: "+norek);
        System.out.println("	Saldo Yang Tersisa 	: Rp. "+sald);		
	}	
	
	public static void cekSaldo(int norek){ //fungsi cek saldo
        int indeks = cariRek(norek);
        String namaa = nama[indeks];
        int sald = saldo[indeks];	
		
		laporann[0][f] = rekening[indeks];
		laporann[1][f] = 0;
		laporann[2][f] = saldo[indeks];
		sisaSaldo(norek);
		f++;
	}
	
	public static void setorTabungan(int norek, int sald){ //fungsi setor tabungan
        int indeks = cariRek(norek);
        saldo[indeks]+= sald;
		int biayaAdmin = 0;		
		if(jenisTab[indeks].equals("REGULER")){
			if(saldo[indeks]>= 3000000){
				System.out.println("");
				System.out.println("|---------------------------------------------------|");
				System.out.println("	Mohon maaf, Tabungan Anda sudah mencapai batas!");
				int kembalian = saldo[indeks] - 3000000;
				System.out.println("|---------------------------------------------------|");
				System.out.println("	Sisa Kembalian Saldo Setoran adalah "+kembalian);
				saldo[indeks]= 3000000;
			}
			biayaAdmin = 2000;
		}else if(jenisTab[indeks].equals("PLUS")){
			if(saldo[indeks]>= 5000000){
				System.out.println("|---------------------------------------------------|");
				System.out.println("	Mohon maaf, Tabungan Anda sudah mencapai batas!");
				int kembalian = saldo[indeks] - 5000000;
				System.out.println("|---------------------------------------------------|");
				System.out.println("	Sisa Kembalian Saldo Setoran adalah "+kembalian);
				saldo[indeks]= 5000000;
			}
			biayaAdmin = 3000;
		}else if(jenisTab[indeks].equals("BISNIS")){
			biayaAdmin = 5000;
		}
			
				
		saldo[indeks] -= biayaAdmin;
		
		laporann[0][f] = rekening[indeks];
		laporann[1][f] = 1;
		laporann[2][f] = saldo[indeks];
		laporann[3][f] = sald;
		f++;		
		System.out.println("|						    |");
		System.out.println("|						    |");
		System.out.println("|  	Tabungan Berhasil Disetor... >^<	    |");
		System.out.println("|						    |");
		System.out.println("|						    |");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("");
		System.out.println("	Biaya Admin Transaksi 	: Rp. "+biayaAdmin);
        sisaSaldo(norek);
    }
	
	public static void ambilTabungan(int norek, int sald){ //fungsi ambil tabungan
        int indeks = cariRek(norek);
        saldo[indeks]-= sald;
		int biayaAdmin = 0;		
		if(jenisTab[indeks].equals("REGULER")){
			biayaAdmin = 2000;
		}else if(jenisTab[indeks].equals("PLUS")){
			biayaAdmin = 3000;
		}else if(jenisTab[indeks].equals("BISNIS")){
			biayaAdmin = 5000;
		}		
		saldo[indeks] -= biayaAdmin;
		
		System.out.println("|						    |");
		System.out.println("|						    |");
		System.out.println("|  	Tabungan Berhasil Ditarik... >^<	    |");
		System.out.println("|						    |");
		System.out.println("|						    |");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("");
		System.out.println("	Biaya Admin Transaksi 	: Rp. "+biayaAdmin);
        sisaSaldo(norek);
		laporann[0][f] = rekening[indeks];
		laporann[1][f] = 2;
		laporann[2][f] = saldo[indeks];
		laporann[4][f] = sald;
		f++;
    }
	
	public static void transfer(int norek, int norek2, int transfer){ //fungsi transfer tabungan
		int indeks1 = cariRek(norek);
		int indeks2 = cariRek(norek2);				
		int biayaAdmin = 0;
		if(jenisTab[indeks1].equals("REGULER")){
			saldo[indeks1]-= transfer;
			saldo[indeks2]+= transfer;
			if(transfer>= 2000000){
				System.out.println("|---------------------------------------------------|");
				System.out.println(" Mohon maaf, Nominal transfer Anda sudah mencapai batas!");
				System.out.println("");
				System.out.println("	*Tabungan anda gagal ditransfer");
				System.out.println("|---------------------------------------------------|");
				saldo[indeks1]+= transfer;
				saldo[indeks2]-= transfer;
			}
			biayaAdmin = 2000;
		}else if(jenisTab[indeks1].equals("PLUS")){
			saldo[indeks1]-= transfer;
			saldo[indeks2]+= transfer;
			if(transfer>= 4000000){
				System.out.println("|---------------------------------------------------|");
				System.out.println(" Mohon maaf, Nominal transfer Anda sudah mencapai batas!");
				System.out.println("");
				System.out.println("	*Tabungan anda gagal ditransfer");
				System.out.println("|---------------------------------------------------|");
				saldo[indeks1]+= transfer;
				saldo[indeks2]-= transfer;
			}
			biayaAdmin = 3000;
		}else if(jenisTab[indeks1].equals("BISNIS")){
			saldo[indeks1]-= transfer;
			saldo[indeks2]+= transfer;
			biayaAdmin = 5000;
		}
		saldo[indeks1] -= biayaAdmin;
        System.out.println("|						    |");
		System.out.println("|						    |");
		System.out.println("|  	Tabungan Berhasil Ditransfer... >^<	    |");
		System.out.println("|						    |");
		System.out.println("|						    |");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("");
		System.out.println("	Biaya Admin Transaksi 	: Rp. "+biayaAdmin);        
		sisaSaldo(norek);
		sisaSaldo(norek2);
		laporann[0][f] = rekening[indeks1];
		laporann[1][f] = 3;
		laporann[2][f] = saldo[indeks1];
		laporann[5][f] = transfer;
		f++;
	}
	
	public static void laporan(int norek){ //fungsi cetak transaksi
		int indeks = cariRek(norek);
		System.out.println("|						    |");
		System.out.println("| Nama Nasabah  | Jenis Transaksi |   Rekening  |\tSaldo\t|  Total Setor  | Total Penarikan | Total Transfer |");
		System.out.println("|------------------------------------------------------------------------------------------------------------------|");
		for(int i = 0;i<laporann[0].length;i++){
			if(laporann[0][i] == norek){
				System.out.print("|\t"+nama[indeks] + "\t| " + namaMenu[laporann[1][i]] + " |\t" + norek + "\t| Rp. " +laporann[2][i] + "\t| Rp. " +laporann[3][i] + " \t| Rp. " +laporann[4][i] + " \t  | Rp. " +laporann[5][i] + "\t| \n");
			}
		}		
	}
	
	public static  int cariRek(int norek){ //fungsi untuk mencari data dari rekening
        int result1 = 0;
        for(int i=0 ; i<rekening.length;i++){
            if(rekening[i]==(norek)){
               result1 = i; 
            }
        }return result1;
    }
}