### NAMA : RAHMAT HIDAYAT
### NIM : 2131710043

# Ujian Tengah Semester (UTS)

- **NIM   :** 
- **Nama  :** 
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
Scanner input = new Scanner(System.in);
int angka, sisa;

System.out.println("*** Program menentukan minimall lembar mata uang yang dikeluarkan ***");
System.out.println("NIM : 2131710043");
System.out.println("NAMA : RAHMAT HIDAYAT");
System.out.println("-------------------");

System.out.println(">> Mulai");
System.out.println("Masukkan nominal uang: ");
angka = input.nextInt();
int a=angka/100000;
sisa=angka%100000;
int b=sisa/50000;
sisa=sisa%50000;
int c=sisa/20000;
sisa=sisa%20000;
int d=sisa/10000;
sisa=sisa%10000;
int e=sisa/5000;
sisa=sisa%5000;
int f=sisa/2000;
sisa=sisa%2000;
int g=sisa/1000;
sisa=sisa%1000;

System.out.println(">> Hasil");
System.out.println("Lembar uang 100.000 : "+a);
System.out.println("Lembar uang 50.000 : "+b);
System.out.println("Lembar uang 20.000 : "+c);
System.out.println("Lembar uang 10.000 : "+d);
System.out.println("Lembar uang 5.000 : "+e);
System.out.println("Lembar uang 2.000 : "+f);
System.out.println("Lembar uang 1.000 : "+g);
System.out.println(">> Selesai");


```

    *** Program menentukan minimall lembar mata uang yang dikeluarkan ***
    NIM : 2131710043
    NAMA : RAHMAT HIDAYAT
    -------------------
    >> Mulai
    Masukkan nominal uang: 
    137000
    >> Hasil
    Lembar uang 100.000 : 1
    Lembar uang 50.000 : 0
    Lembar uang 20.000 : 1
    Lembar uang 10.000 : 1
    Lembar uang 5.000 : 1
    Lembar uang 2.000 : 1
    Lembar uang 1.000 : 0
    >> Selesai
    

### Soal 2 (skor 20)
Buatlah program dengan menggunakan **semua perulangan** _(for, while, do-while)_ untuk menampilkan huruf abjad A-Z secara terurut. Program akan selesai menampilkan huruf abjad (selesai _looping_) ketika huruf yang ditampilkan sama dengan huruf yang dimasukkan oleh pengguna.

Contoh ![Contoh Soal 2](images/Soal2.png)


```Java
/* Jawaban Soal 2 */


```

### Soal 3 (skor 20/30)
Buatlah sebuah program dengan menggunakan **satu jenis perulangan** untuk menghitung nilai berdasarkan masukkan dari user. Perulangan akan terus berjalan jika user mengetikkan huruf kapital **"Y"** dan perulangan akan berhenti saat user mengetikkan huruf kapital **"N"**. 
Setelah perulangan berhenti, program akan memilih **angka terkecil** dan **angka terbesar** dari angka yang dimasukkan user dan menghitung jumlah dan rata-rata angkat-angka tersebut. Program boleh menggunakan salah satu perulangan : 

  + _While_ (20 poin), atau
  + _Do-while_ (20 poin), atau
  + _For_ (30 poin)
  
Contoh ![Contoh Soal 3](images/Soal3.png)



```Java
/* Jawaban Soal 3 */
import java.util.Scanner ;
Scanner input = new Scanner(System.in);


System.out.println("*** Program menghitng angka ***");
System.out.println("NIM : 2131710043");
System.out.println("NAMA : RAHMAT HIDAYAT");


```

    *** Program menghitng angka ***
    NIM : 2131710043
    NAMA : RAHMAT HIDAYAT
    

### Soal 4 (skor 30++)
Buatlah program klasifikasi umur yang sesuai dengan flowchar berikut **(skor 30)**. 
![Contoh Soal 4](images/Soal4.png)

Saat perulangan berhenti. Hitung jumlah rata-rata umur yang telah dimasukkan, dan dari rata-rata tersebut termasuk klasifikasi umur apa? **(+poin 20)**


```Java
/* Jawaban Soal 4 */


```
