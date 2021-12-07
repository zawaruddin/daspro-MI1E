# Ujian Tengah Semester (UTS)

- **NIM   : 2131710064
- **Nama  : Nanda Shabrina Putri Kurnia
- **Kelas : MI-1E

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
int nominalUang, lembar uang;

System.out.println("*** Program menentukan minimal lembar mata uang yang dikeluarkan ***");
System.out.println("NIM  : 2131710064");
System.out.println("Nama : Nanda Shabrina Putri Kurnia");
System.out.println("-----------------------------------");

System.out.println(">> Mulai");
System.out.print("Masukkan nominal uang: ");
nominalUang = input.nextInt();
System.out.println("------------------------------");

System.out.println(">> Hasil");

```


    |   int nominalUang, lembar uang;

    ';' expected

    


### Soal 2 (skor 20)
Buatlah program dengan menggunakan **semua perulangan** _(for, while, do-while)_ untuk menampilkan huruf abjad A-Z secara terurut. Program akan selesai menampilkan huruf abjad (selesai _looping_) ketika huruf yang ditampilkan sama dengan huruf yang dimasukkan oleh pengguna.

Contoh ![Contoh Soal 2](images/Soal2.png)


```Java
/* Jawaban Soal 2 */
import java.util.Scanner;
Scanner input = new Scanner(System.in);
char huruf1, huruf2;

System.out.println("*** Program menentukan minimal lembar mata uang yang dikeluarkan ***");
System.out.println("NIM  : 2131710064");
System.out.println("Nama : Nanda Shabrina Putri Kurnia");
System.out.println("-----------------------------------");

System.out.println(">> Mulai");
System.out.print("Masukkan huruf untuk berhenti looping: ");
huruf1 = input.next().charAt(0);
System.out.println("-----------------------------------");

for(char huruf2=0;huruf2<=12;huruf2++){
    System.out.print("Masukkan huruf: ");
    huruf2 = input.next().charAt(0);
}

```

    *** Program menentukan minimal lembar mata uang yang dikeluarkan ***
    NIM  : 2131710064
    Nama : Nanda Shabrina Putri Kurnia
    -----------------------------------
    >> Mulai
    Masukkan huruf untuk berhenti looping: M
    -----------------------------------
    Masukkan huruf: M
    

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
int angka, pilihan, total;

System.out.println("*** Program Menghitung Angka ***");
System.out.println("NIM  : 2131710064");
System.out.println("Nama : Nanda Shabrina Putri Kurnia");
System.out.println("-----------------------------------");

System.out.println(">> Mulai");
pilihan=1;
while(true){
    System.out.print("Masukkan angka: ");
    angka = input.nextInt();
    System.out.print("Mau memasukkan angka kembali?(Y/T): ");
    pilihan = input.nextInt();
    total += angka;
    if(total<=100) break;
}
if(angka)
```

    *** Program Menghitung Angka ***
    NIM  : 2131710064
    Nama : Nanda Shabrina Putri Kurnia
    -----------------------------------
    >> Mulai
    Masukkan angka: 12
    Mau memasukkan angka kembali?(Y/T): 0
    


    Incomplete input:

    |   if(angka)


### Soal 4 (skor 30++)
Buatlah program klasifikasi umur yang sesuai dengan flowchar berikut **(skor 30)**. 
![Contoh Soal 4](images/Soal4.png)

Saat perulangan berhenti. Hitung jumlah rata-rata umur yang telah dimasukkan, dan dari rata-rata tersebut termasuk klasifikasi umur apa? **(+poin 20)**


```Java
/* Jawaban Soal 4 */
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur, berhenti, totalumur, count;

System.out.println("*** Soal Nomor 4 ***");
System.out.println("NIM  : 2131710064");
System.out.println("Nama : Nanda Shabrina Putri Kurnia");
System.out.println("-----------------------------------");

System.out.println("Apakah anda ingin berhenti?");
count = 0;
while (true){
    System.out.println("Masukkan umur: ");
    umur = input.nextInt();
    if(umur <= 5){
        System.out.println("Balita");
    }else if(umur <= 10){
        System.out.println("Anak-anak");
    }else if(umur <= 17){
        System.out.println("Remaja");
    }else if(umur <= 40){
        System.out.println("Dewasa");
    }else if(umur <= 60){
        System.out.println("Paruh baya");
    }else{
        System.out.println("Tua");
    }
    totalumur += umur;
    count++;
    if(totalumur>=100) break;
    }
}  
System.out.println("Total umur: "+totalumur);
avg = totalumur / count;
System.out.println("Rata-rata umur: "+avg);



```

    *** Soal Nomor 4 ***
    NIM  : 2131710064
    Nama : Nanda Shabrina Putri Kurnia
    -----------------------------------
    Apakah anda ingin berhenti?
    Masukkan umur: 
    12
    Remaja
    Masukkan umur: 
    18
    Dewasa
    Masukkan umur: 
    70
    Tua
    


    |   }  

    illegal start of statement

    



```Java

```
