# Ujian Tengah Semester (UTS)

- **NIM   :** 2131710139 
- **Nama  :** Jati Wahyu Kusuma
- **Kelas :** MI-1E

## Deskripsi
+ Silahkan kerjakan soal yang sekiranya mudah dahulu
+ Jawaban langsung ditulis di bawah soal
+ Waktu pengerjaan UTS adalah *90 menit*
    - submit jawaban ke LMS maksimal pukul 10.45, lebih dari itu **nilai dikurangi**
    - submit dan pull-request via github akan diberi nilai tambah (maksimal pukul 10.50, lebih dari itu **tidak diberi** nilai tambah)

## Soal UTS
### Soal 1  (skor 30)
Buatlah sebuah program untuk menentukan minimal lembar uang yang dikeluarkan berdasarkan inputan uang yang diinputkan user (menggunakan _library Scanner_). Lembar uang sesuai dengan lembar nominal mata uang Rupiah yaitu lembar uang 1.000, 2.000, 5.000, 10.000, 20.000, 50.000, dan 100.000.

Contoh: ![Contoh Soal 1](images/Soal1.png)


```Java
/* Jawaban Soal 1 */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
String nama;
int nominal, nim, lembar1,lembar2,lembar3,lembar4,lembar5,lembar6,lembar7;
System.out.println("**Progam menentukan miinimal lembar mata ang yang dikeluarkan**");
System.out.print("Masukkan Nama : ");
nama = sc.nextLine();
System.out.print("Masukkan Nim : ");
nim = sc.nextInt();
System.out.println("--------------");
System.out.println(">> Mulai");
System.out.println("Masukkan Nominal Uang : ");
nominal = sc.nextInt();
System.out.println("--------------");
System.out.println(">> Hasil");
System.out.print("Lembar uang 100.0000 : ");
lembar1 = sc.nextInt();
System.out.print("Lembar uang 50.0000 : ");
lembar2 = sc.nextInt();
System.out.print("Lembar uang 20.0000 : ");
lembar3 = sc.nextInt();
System.out.print("Lembar uang 10.0000 : ");
lembar4 = sc.nextInt();
System.out.print("Lembar uang 5.000 : ");
lembar5 = sc.nextInt();
System.out.print("Lembar uang 2.000 : ");
lembar6 = sc.nextInt();
System.out.print("Lembar uang 1.000 : ");
lembar7 = sc.nextInt();
System.out.println("Selesai>>");

```

    **Progam menentukan miinimal lembar mata ang yang dikeluarkan**
    Masukkan Nama : Jati Wahyu Kusuma
    Masukkan Nim : 2131710139
    --------------
    >> Mulai
    Masukkan Nominal Uang : 
    137000
    --------------
    >> Hasil
    Lembar uang 100.0000 : 1
    Lembar uang 50.0000 : 0
    Lembar uang 20.0000 : 1
    Lembar uang 10.0000 : 1
    Lembar uang 5.000 : 1
    Lembar uang 2.000 : 1
    Lembar uang 1.000 : 0
    Selesai>>
    

### Soal 2 (skor 20)
Buatlah program dengan menggunakan **semua perulangan** _(for, while, do-while)_ untuk menampilkan huruf abjad A-Z secara terurut. Program akan selesai menampilkan huruf abjad (selesai _looping_) ketika huruf yang ditampilkan sama dengan huruf yang dimasukkan oleh pengguna.

Contoh ![Contoh Soal 2](images/Soal2.png)


```Java
/* Jawaban Soal 2 */
Scanner sc = new Scanner(System.in);

System.out.println("*Program menampilkan huruf abjad*");
System.out.println("NIM : 2131710139");
System.out.println("Nama : Jati Wahyu Kusuma ");
System.out.println("--------------------------");

char huruf;
System.out.println(">>>Mulai");
System.out.print("Masukkan huruf untuk berhenti looping : ");
huruf = sc.next().charAt(0);

// for
System.out.print("\nOutput Program (looping FOR) : ");
for(char i = 'A';i < huruf; i++){
    System.out.print(i);
}
int nomor = (int) huruf;
nomor -= 65;
System.out.println("\nProgram Berhenti looping di iterasi ke-" + nomor);

// While
System.out.print("\nOutput Program (looping While) : ");
char j = 'A';
while(j<huruf){
    System.out.print(j);
    j++;
}
System.out.println("\nProgram Berhenti looping di iterasi ke-" + nomor);

// do while
System.out.print("\nOutput Program (looping Do While) : ");
char k = 'A';
do {
    System.out.print(k);
    k++;
}
while(k<huruf);
System.out.println("\nProgram Berhenti looping di iterasi ke-" + nomor);
System.out.println("Selesai <<<");



```

    *Program menampilkan huruf abjad*
    NIM : 2131710139
    Nama : Jati Wahyu Kusuma 
    --------------------------
    >>>Mulai
    Masukkan huruf untuk berhenti looping : M
    
    Output Program (looping FOR) : ABCDEFGHIJKL
    Program Berhenti looping di iterasi ke-12
    
    Output Program (looping While) : ABCDEFGHIJKL
    Program Berhenti looping di iterasi ke-12
    
    Output Program (looping Do While) : ABCDEFGHIJKL
    Program Berhenti looping di iterasi ke-12
    Selesai <<<
    

### Soal 3 (skor 20/30)
Buatlah sebuah program dengan menggunakan **satu jenis perulangan** untuk menghitung nilai berdasarkan masukkan dari user. Perulangan akan terus berjalan jika user mengetikkan huruf kapital **"Y"** dan perulangan akan berhenti saat user mengetikkan huruf kapital **"N"**. 
Setelah perulangan berhenti, program akan memilih **angka terkecil** dan **angka terbesar** dari angka yang dimasukkan user dan menghitung jumlah dan rata-rata angkat-angka tersebut. Program boleh menggunakan salah satu perulangan : 

  + _While_ (20 poin), atau
  + _Do-while_ (20 poin), atau
  + _For_ (30 poin)
  
Contoh ![Contoh Soal 3](images/Soal3.png)



```Java
/* Jawaban Soal 3 */
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;
angka = input.nextInt();
do

```

    121
    

### Soal 4 (skor 30++)
Buatlah program klasifikasi umur yang sesuai dengan flowchar berikut **(skor 30)**. 
![Contoh Soal 4](images/Soal4.png)

Saat perulangan berhenti. Hitung jumlah rata-rata umur yang telah dimasukkan, dan dari rata-rata tersebut termasuk klasifikasi umur apa? **(+poin 20)**


```Java
/* Jawaban Soal 4 */
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur, rata2;
String ulang;

do{
    System.out.print("Masukkan umur anda : ");
    umur = input.nextInt();
    if(umur<=5){
        System.out.println("Balita");
    }else if(umur<=10){
        System.out.println("Anak-anak");
    }else if(umur<=17){
        System.out.println("Remaja");
    }else if(umur<=40){
        System.out.println("Dewasa");
    }else if(umur<=60){
        System.out.println("Paruh baya");
    }else{
        System.out.println("Tua");
    }
    System.out.println("Apakah anda ingin memasukkan umur kembali? <Y/N>");
    ulang = input.next();
}while((ulang.charAt(0)=='Y'||ulang.charAt(0)=='y'));
System.out.println("=====SELESAI=====");


```

    Masukkan umur anda : 18
    Dewasa
    Apakah anda ingin memasukkan umur kembali? <Y/N>
    Y
    Masukkan umur anda : 18
    Dewasa
    Apakah anda ingin memasukkan umur kembali? <Y/N>
    N
    =====SELESAI=====
    


```Java

```
