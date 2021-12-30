### Nama : Sabila Nadia Islamia
### NIM    : 2131710046



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
// Ketik kode program di bawah sini
import java.util.Scanner; 
Scanner input = new Scanner(System.in);
```

3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas


```Java
// Ketik kode program di bawah sini
int angka;
int faktorial = 1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka;
int faktorial = 1;

System.out.println("===PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR===");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();

for (int i=1; i <= angka; i++){
    faktorial = faktorial * i;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    ===PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR===
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini

import java.util.Scanner;

Scanner input = new Scanner(System.in);
int angka;
int faktorial = 1;

System.out.println("===PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE===");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();

int i=1;
while (i <= angka){
    faktorial *= i; 
    i++; 
}
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    ===PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE===
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;

Scanner input = new Scanner(System.in);
int angka;
faktorial = 1;

System.out.println("===PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE===");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();

int i = 1;
do{
    faktorial *= i;
    i++;
}
while (i <= angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    ===PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE===
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

### Jawaban

Kegunaan baris berikut adalah untuk proses menghitung nilai faktorial dengan cara mengalikan nilai faktorial itu sendiri demham i.faktorial = faktorial * i

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini

import java.util.Scanner;

Scanner input = new Scanner(System.in);
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukan Bilangan : ");
angka = input.nextInt();
int i =1;
System.out.print(angka + "Faktorial = " );
for(i = 1; i <= angka; i++){
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
    5Faktorial = 1x2x3x4x5 = 120
    

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for (total = 0; true;){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if (total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 5
    Masukkan Bilangan : 10
    Masukkan Bilangan : 15
    Masukkan Bilangan : 51
    Jumlah angka-angka yang telah dimasukkan : 81
    

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
int angka, total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total = 0;
while (true){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if (total>50) break; 
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 1
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 100
    Jumlah angka-angka yang telah dimasukkan : 106
    

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
do
{
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka; 
    if (total>50) break; 
}
while (true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 1
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 4
    Masukkan Bilangan : 5
    Masukkan Bilangan : 100
    Jumlah angka-angka yang telah dimasukkan : 115
    

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

### Jawaban

Kode program diatas adalah statement BREAK yang berfungsi untuk menghentikan looping atau perulangan secara paksa disaat kondisi sudah sesuai dengan kondisi pada BREAK, dan selanjutnya akan mengeksekusi kode/ perintah di luar perulangan.

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


### Jawaban

Kode program tersebut merupakan salah satu konstruksi dalam perulangan For, tempat dimana kita akan memberikan nilai awal pada variabel counter dan perhitungan tersebut akan terus bernilai dieksekusi, jika kondisi sesuai pada ekspresi kedua yaitu ekspresi kondisional yang bernilai true. Fungsinya untuk inisialisai nilai dan mendeklarasikan syarat atau kondisi yang harus dipenuhi agar looping terus terjadi.  

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
for (int i = 0; i < 5; i++){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if (angka >= 50) continue; 
    total += angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: " + total);
avg = (double)total/count; 
System.out.println("Rata-rata angka yang kurang dari 50: " + avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 50
    Masukkan Bilangan : 51
    Masukkan Bilangan : 1
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Jumlah angka-angka yang kurang dari 50: 6
    Rata-rata angka yang kurang dari 50: 2.0
    

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

### Jawaban

Pada Percobaan 2, kode program yang dijalankan adalah Statement BREAK yang berfungsi sebagai salah satu cara menghentikan looping atau perulangan. Sedangkan pada percobaan 3, kode program yang dijalankan adalah statement CONTINUE yang berarti melompati atau tidak akan mengeksekusi suatu iterasi yang memenuhi persyaratan continue, dan akan tetap melanjutkan perulangan pada syarat atau kondisi berikutnya. 


2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

### Jawaban

Perintah atau kode program tersebut adalah statement continue, fungsinya adalah jika angka yang dimasukkan dari inputan lebih besar atau sama dengan 50 maka angka tersebut memenuhi persyaratan continue, sehingga angka tersebut tidak akan di lewati/ tidak akan di eksekusi pada perhitungan rumus aritmatika dibawahnya yaitu total = total + angka dan increament. 

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
	int bil, jmlhBilGenap; 
	int totalGenap = 0; 
	double avg; 

	System.out.print("Masukkan Bilangan Bulat: ");
	bil = input.nextInt();
	jmlhBilGenap = bil/2; 

	System.out.println("Banyaknya bilangan genap dari 1 sampai 10 adalah " + jmlhBilGenap);
	System.out.print("Angka genap dalam range tersebut adalah");

	for(int i=1; i<= bil; i++){
		if (i%2!=0){
			continue;
		} 
		System.out.print("," + i);
		totalGenap+=i;
	}
avg = totalGenap/jmlhBilGenap; 
System.out.println("\nHasil penjumlahan bilangan genap dari 1 sampai 10 adalah: " + totalGenap);
System.out.println("Rata-rata bilangan genap dari 1 sampai 10 adalah: " + avg);
```

    Masukkan Bilangan Bulat: 10
    Banyaknya bilangan genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah,2,4,6,8,10
    Hasil penjumlahan bilangan genap dari 1 sampai 10 adalah: 30
    Rata-rata bilangan genap dari 1 sampai 10 adalah: 6.0
    

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini

import java.util.Scanner; 

int angka;

System.out.print("Masukkan angka : ");
angka = input.nextInt();

for(int i=1; i<=angka; i++){
	if (i%5==0){
		continue;
	}
	System.out.println(i);
}
```

    Masukkan angka : 19
    1
    2
    3
    4
    6
    7
    8
    9
    11
    12
    13
    14
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

int bil1=0, bil2=1, hasil;

System.out.println("\nFibonacci Series\n");

for (int i=1; i<=10; i++){
	hasil = bil1 + bil2; 
	System.out.println("Sum of : " + bil1 + "+" + bil2 + "=" + hasil);

	bil1 = bil2;
	bil2 = hasil;
}
```

    
    Fibonacci Series
    
    Sum of : 0+1=1
    Sum of : 1+1=2
    Sum of : 1+2=3
    Sum of : 2+3=5
    Sum of : 3+5=8
    Sum of : 5+8=13
    Sum of : 8+13=21
    Sum of : 13+21=34
    Sum of : 21+34=55
    Sum of : 34+55=89
    
