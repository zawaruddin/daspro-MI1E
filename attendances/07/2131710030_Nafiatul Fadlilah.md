## JOBSHEET 7

## PERULANGAN 1

### Tujuan

Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks perulangan 1 dan mengimplemantasikannya dalam bahasa pemrogaman java.

### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1 : Penggunaan for, while dan do-while

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart perulangan for dibawah ini!

    <p align="left">
    <img width="197" height="259" src="images/flowchartFaktorial.png">
    </p>
    

> Flowchart diatas digunakan untuk menghitung nilai faktorial, selanjutnya kita akan membuat programnya berdasarkan
> flowchart di atas!

2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel angka untuk menampung data yang diinput melalui keyboard




```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;
```

###### 3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;
int faktorial = 1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;
int faktorial = 1;

System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan: ");
angka= input.nextInt();
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah: " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan: 5
    Nilai faktorial bilangan tersebut adalah: 120

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, faktorial;

faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan: ");
angka= input.nextInt();
int i=1; 
while (i<=angka) {
    faktorial*=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah: " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan: 5
    Nilai faktorial bilangan tersebut adalah: 120

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, faktorial;

faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan: ");
angka= input.nextInt();
int i=1; 
do {
    faktorial*=i;
     i++;
} 
while (i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalah: " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan: 5
    Nilai faktorial bilangan tersebut adalah: 120

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>  

#### jawab
Untuk menghitung variabel faktorial dengan mengalikan nilai 1 pada variabel faktorial dengan i selama nilai i kurang dari sama dengan angka yang diinputkan.

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, faktorial;

faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukan Bilangan : ");
angka = input.nextInt();
int i =1 ;
System.out.print(angka + " Faktorial = " );
for(i = 1;i <= angka  ; i++){
    faktorial *= i;
    if(i == angka){
        System.out.print(i);
    }else{
        System.out.print(i + "x");
    }
}
System.out.println(" = " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukan Bilangan : 5
    5 Faktorial = 1x2x3x4x5 = 120
    

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0;true;){
    System.out.print("Masukkan Bilangan: ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
} 
System.out.println("Jumlah angka-angka yang telah dimasukkan: " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 50
    Jumlah angka-angka yang telah dimasukkan: 90
    

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK");
total = 0;
while (true){
    System.out.print("Masukkan Bilangan: ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan: " + total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 50
    Jumlah angka-angka yang telah dimasukkan: 90
    

3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total = 0;
do {
    System.out.print("Masukkan Bilangan: ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan: " + total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 50
    Jumlah angka-angka yang telah dimasukkan: 90
    

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

#### jawab

Fungsi kode program di atas yaitu untuk menghitung total angka yang diinputkan. Dimana perulangan penginputan akan berhenti setelah user memasukkan angka 50 atau lebih dari itu. Hal itu terjadi karena menggunakan command break yang berfungsi untuk keluar dari perulangan.

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


### jawab
Untuk melakukan perulangan input nilai dimana perulangan akan terus dilakukan karena akan selalu memenuhi syarat perulangan yakni ekspresi 2 (true) dan akan berhenti jika inputan sama dengan kondisi di break.

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, total, count;
double avg;
count = 0;
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0;i<5;i++){
    System.out.print("Masukkan Bilangan: ");
    angka = input.nextInt();
    if (angka>=50) continue;
    total += angka;
    count++;
} 
System.out.println("Jumlah angka-angka yang kurang dari 50: " + total);
avg=(double) total/count;
System.out.println("Rata-rata angka yang kurang dari 50: " + avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 10
    Masukkan Bilangan: 50
    Jumlah angka-angka yang kurang dari 50: 40
    Rata-rata angka yang kurang dari 50: 10.0
    

5. Jalankan program. Amati apa yang terjadi!

### jawab
Kesimpulan: Perulangan/looping hanya terjadi 5 kali, dengan ketentuan jika angka yang diinputkan bernilai lebih dari sama dengan tidak akan dilakukan operasi aritmatika (dilewati saja), sedangkan inputan angka yang bernilai di bawah 50 akan dilakukan proses operasi aritmatika.

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

### jawab
Di percobaan 2 menggunakan command break yang membuat semua perulangan akan berhenti dilakukan saat inputan sama dengan yang didefinisikan di break. Selain itu dengan command break, semua input akan dieksekusi atau dikerjakan operasi aritmatikanya. Sedangkan di percobaan 3 menggunakan command continue yang mana program perulangan akan melakukan perulangan dengan syarat masih sesuai dengan persyaratan ekspresi 2 yakni jika i < 5 dan inputan hanya akan dieksekusi saat sama dengan definisi di 
continue. Jadi saat dilakukan operasi aritmatika, continue bisa digunakan untuk melompati nilai inputan yang tidak sesuai syarat/kondisi. 

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

### jawab
Ketika angka yang diinputkan bernilai lebih dari sama dengan 50, maka dalam pengoperasian aritmatika akan di-skip/ tidak ikut dieksekusi. Jadi, angka yang akan diproses hanya angka-angka yang bernilai kurang dari 50.  

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program yang meminta masukan user sebuah bilangan bulat N (N > 0). Program kemudian menampilkan penjumlahan N bilangan genap positif pertama (bilangan genap ≥ 0).
Contoh: 
    •	Jika user memasukkan N = 10, program akan menghitung banyaknya jumlah bilangan positive di dalam range bilangan 1-10   kemudian menampilkan penjumlahan bilangan positive bilangan bilangan diantara 1-10 yaitu : 
        0 + 2 + 4 + 6 + 10 = 30. 
        Setelah itu program akan menampilkan rata-rata dari bilangan positive yang telah dijumlahkan tadi.
    •	Contoh output program dan flowchart
<br/><img width="303" height="529" src="images/hasilTugasFc.jpg" align="left"><br/>
  

<br/><img width="303" height="529" src="images/fcTugasJS7.png" align="left">



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil, jmlBilGenap;
int totalGenap = 0;
double avg;

System.out.print("Masukkan angka: ");
bil = input.nextInt();
jmlBilGenap = bil / 2;
System.out.println("Banyaknya bilangan genap dari 1 sampai " + bil + " adalah " + jmlBilGenap);
System.out.print("Angka genap dalam range tersebut adalah");
int i;
for(int i = 1;i <= bil;i++){
    if (i%2 != 0) continue;
    System.out.print(", " + i);
    totalGenap += i;
    avg = totalGenap / jmlBilGenap;
}
System.out.println("\nHasil penjumlahan bilangan genap dari 1 sampai " + bil + " adalah " + totalGenap);
System.out.println("Rata-rata bilangan genap dari 1 sampai " + bil + " adalah " + avg);
```

    Masukkan angka: 10
    Banyaknya bilangan genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah, 2, 4, 6, 8, 10
    Hasil penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    Rata-rata bilangan genap dari 1 sampai 10 adalah 6.0
    

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;

System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE MELOMPATI ANGKA 5===");
System.out.print("Masukkan angka: ");
angka = input.nextInt();
int x;
for(x = 1; x <= angka ; x++){
    if (x == 5) continue;
    System.out.println(x);  
} 
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE MELOMPATI ANGKA 5===
    Masukkan angka: 19
    1
    2
    3
    4
    6
    7
    8
    9
    10
    11
    12
    13
    14
    15
    16
    17
    18
    19
    

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int i, deret;
System.out.print("Masukan banyak deret bilangan yang ingin ditampilkan : ");
deret = input.nextInt();
int x = 0;
int y = 1;
int z= 1;
for (i = 0; i < deret; i++) {
            System.out.println("Sum of: " + x + "+" + y + "=" + (z + x));
            z = x + y;
            x = y;
            y = z;
        }
```

    Masukan banyak deret bilangan yang ingin ditampilkan : 10
    Sum of: 0+1=1
    Sum of: 1+1=2
    Sum of: 1+2=3
    Sum of: 2+3=5
    Sum of: 3+5=8
    Sum of: 5+8=13
    Sum of: 8+13=21
    Sum of: 13+21=34
    Sum of: 21+34=55
    Sum of: 34+55=89
    
