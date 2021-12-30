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

```


```Java
3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas
```


```Java
// Ketik kode program di bawah sini
int angka, faktorial=1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan :");
angka= input.nextInt();
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalalah : "+ faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan :2
    Nilai faktorial bilangan tersebut adalalah : 240

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan :");
angka= input.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalalah : "+ faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan :2
    Nilai faktorial bilangan tersebut adalalah : 2

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.print("Masukkan Bilangan :");
angka= input.nextInt();
int i=1;
do{
    faktorial*=i;
    i++;
}
while(i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalalah : "+ faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====
    Masukkan Bilangan :40
    Nilai faktorial bilangan tersebut adalalah : 0

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

faktorial *= i merupakan code yang mempersingkat dari code faktorial = faktorial * i, jadi keimpulanya sama saja

// Ketik jawaban disini
faktorial * = i merupakan code yang mempersingkat dari code faktorial = faktorial * i, jadi keimpulanya sama saja


// Ketik jawaban disini
faktorial * = i merupakan code yang mempersingkat dari code faktorial = faktorial * i, jadi keimpulanya sama saja


2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.println("Masukan Bilangan : ");
angka = input.nextInt();
int i =1 ;
System.out.print(angka + "Faktorial = " );
for(i = 1;i <= angka  ; i++){
    faktorial *= i;
//     System.out.print(angka + "Faktorial = 1x" );
    if(i == angka){
        System.out.print(i);
    }else{
        System.out.print(i + "x");
    }
}
System.out.println(" = " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukan Bilangan : 
    5
    5Faktorial = 1x2x3x4x5 = 120
    

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input=new Scanner(System.in);
int angka,total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0;true;){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50)break;
}
System.out.println("Jumlah angka-angka yang telat dimasukkan : "+total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 1
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 4
    Masukkan Bilangan : 5
    Masukkan Bilangan : 6
    Masukkan Bilangan : 7
    Masukkan Bilangan : 8
    Masukkan Bilangan : 9
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 4
    Jumlah angka-angka yang telat dimasukkan : 54
    

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total=0;
 while(true){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50)break;
}
System.out.println("Jumlah angka-angka yang telat dimasukkan : "+total);

```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 1
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 4
    Masukkan Bilangan : 5
    Masukkan Bilangan : 6
    Masukkan Bilangan : 7
    Masukkan Bilangan : 8
    Masukkan Bilangan : 9
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 4
    Jumlah angka-angka yang telat dimasukkan : 54
    

3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total=0;
 do
 {
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50)break;
}
while(true);
System.out.println("Jumlah angka-angka yang telat dimasukkan : "+total);


```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 1
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 4
    Masukkan Bilangan : 5
    Masukkan Bilangan : 6
    Masukkan Bilangan : 7
    Masukkan Bilangan : 8
    Masukkan Bilangan : 9
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 4
    Jumlah angka-angka yang telat dimasukkan : 54
    

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

Perintah break jika digunakan di dalam perulangan berfungsi untuk 'menghentikan paksa' proses perulangan yang berlangsung. Kita juga telah melihat penggunaan perintah break dalam struktur SWITCH. Break biasanya digunakan setelah kondisi IF, untuk menyeleksi 'kapan' perulangan harus dihentikan.


2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>



Fungsinya yaitu supaya perulangannya berjalan jika kondisinya true. ketika nilai total dimulai dari 0 jika itu true maka statement selanjutnya akan dijalankan.

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
Scanner input=new Scanner(System.in);
int angka, total,count;
double avg;
count=0;
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0;i<5;i++){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    if(angka>=50) continue;
    total+=angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: "+total);
avg=(double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50: "+avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 1
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 4
    Masukkan Bilangan : 5
    Jumlah angka-angka yang kurang dari 50: 15
    Rata-rata angka yang kurang dari 50: 3.0
    

###### 5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

Jika perintah break jika digunakan untuk 'menghentikan paksa' proses perulangan yang berlangsung, perintah continue hanya akan menghentikan perulangan yang saat ini terjadi (1 iterasi saja), dan kemudian melanjutkan perulangan iterasi berikutnya, atau bisa disebut juga untuk 'melewati' 1 perulangan.


2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

percabangan if yaitu percabangan yang hanya memiliki satu blok pilihan jika saat kondisinbernilai benar. fungsi dari kode diatas ialah untuk menampilkan jumlah dan rata-rata dari angka yang sudah di jalankan pada program diatas.


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
int bil, jbilgenap;
int totalgenap = 0;
double avg;

System.out.print("Masukkan Bilangan\t\t\t\t\t\t\t: ");
bil = input.nextInt();
jbilgenap = bil/2;
System.out.println("Banyak bilangan genap dari 1 sampai " + bil + " Adalah\t\t\t\t: " + jbilgenap);
System.out.print("Angka Genap dalam range tersebut adalah\t\t\t\t\t: ");
for(int i = 1; i <= bil; i++){
    if(i%2!=0){
        continue;
    }else{
        if(i == bil){
            System.out.println(i);
        }else{
            if (bil % 2 == 0){
                System.out.print(i + ", ");
            }else{
                System.out.println(i);
            }
        }
        totalgenap += i;
    }
}
    avg = totalgenap / jbilgenap;
    System.out.println("Hasil Penjumlahan Bilangan Genap dari 1 sampai " + bil + " adalah\t\t: " + totalgenap);
    System.out.println("Rata Rata Bilangan Genap dari 1 sampai " + bil + " adalah\t\t\t: " + avg);
```

    Masukkan Bilangan							: 2
    Banyak bilangan genap dari 1 sampai 2 Adalah				: 1
    Angka Genap dalam range tersebut adalah					: 2
    Hasil Penjumlahan Bilangan Genap dari 1 sampai 2 adalah		: 2
    Rata Rata Bilangan Genap dari 1 sampai 2 adalah			: 2.0
    

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil;
for(i=1;i<=bil;i++) {
    if(i%5==0)continue;
    System.out.println(i);
}
```

    1
    2
    

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
//menghitung nilai deret fibonacci ke-n
int a,b,c,n;
System.out.print("mengambil nilai fibonacci ke- : ");
n = input.nextInt();

c = 0;
b = 1;
a = 1;

for(i=0;i<=n;i++){
    a = b + c;
    c = b;
    b = a;
    System.out.println("nilai ke - " + i + " adalah " + a);
}
```

    mengambil nilai fibonacci ke- : 2
    nilai ke - 0 adalah 1
    nilai ke - 1 adalah 2
    nilai ke - 2 adalah 3
    


```Java

```
