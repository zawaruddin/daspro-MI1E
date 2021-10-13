### Nama : Halim Teguh Saputro
### NIM    : 2131710122
---
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
int angka;
```

##### 3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas


```Java
// Ketik kode program di bawah sini
int faktorial = 1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
for(int i=1; i<= angka; i++){
    faktorial *= i;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i = 1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.println("Nilai faktorial bilangan tersebut adalah : "+faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120
    

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i = 1;
do{
    faktorial *= i;
    i++;
}
while(i<=angka);
System.out.println("Nilai faktorial bilangan tersebut adalah : "+faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120
    

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>
    
### Jawab

    


digunakan untuk mengalikan nilai faktorial dengan nilai dari variable i sebanyak nilai dari variabel angka.

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukan Bilangan : ");
angka = input.nextInt();
int i =1 ;
System.out.print(angka + "Faktorial = " );
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
    5Faktorial = 1x2x3x4x5 = 120
    

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0;true;){
    System.out.print("Masukkan bilangan: ");
    angka = input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan bilangan: 5
    Masukkan bilangan: 5
    Masukkan bilangan: 5
    Masukkan bilangan: 5
    Masukkan bilangan: 100
    Jumlah angka-angka yang telah dimasukkan : 120
    

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total = 0;
while(true){
    System.out.print("Masukkan bilangan: ");
    angka=input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan bilangan: 5
    Masukkan bilangan: 5
    Masukkan bilangan: 5
    Masukkan bilangan: 5
    Masukkan bilangan: 100
    Jumlah angka-angka yang telah dimasukkan : 120
    

3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total = 0;
do {
    System.out.print("Masukkan bilangan : ");
    angka = input.nextInt();
    total+=angka;
    if(total>50) break;
}while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan bilangan : 5
    Masukkan bilangan : 5
    Masukkan bilangan : 5
    Masukkan bilangan : 5
    Masukkan bilangan : 100
    Jumlah angka-angka yang telah dimasukkan : 120
    

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

JAWAB


fungsinya adalah untuk menjumlahkan semua bilangan input yang dibawah atau sama dengan 50.

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


JAWAB


untuk ekspresi1 total dimulai dari 0; ekspresi2 for akan selalu benar dan terus menjalankan program. untuk tidak terjadi loop forever, menggunakan if sebagai batasan apa bila if nya true maka ditambahkan break agar loop nya berhenti.

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka, total, count;
double avg;
count = 0;
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0;i<5;i++){
    System.out.print("Masukkan bilangan: ");
    angka=input.nextInt();
    if(angka>=50) continue;
    total+=angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: "+total);
avg = (double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50: "+avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan bilangan: 5
    Masukkan bilangan: 5
    Masukkan bilangan: 5
    Masukkan bilangan: 5
    Masukkan bilangan: 100
    Jumlah angka-angka yang kurang dari 50: 20
    Rata-rata angka yang kurang dari 50: 5.0
    

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

JAWAB


percobaan 2 melakukan looping untuk input dan operasinya kemudian melakukan if kemudian break sebagai batasannya. sedangkan percobaan 3 melakukan looping untuk inputannya apabila inputannya lebih dari 50 maka akan lanjut ke program operasi.

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

JAWAB

agar tidak melooping inputan terus menerus dan melanjutkan ke program operasi apabila inputannya lebih atau samadengan 50

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
Scanner input1 = new Scanner(System.in);
int bil, jmlBilanganGenap;
int totalGenap = 0;
double avg;

System.out.print("Masukkan bilangan: ");
bil = input.nextInt();
jmlBilanganGenap = bil/2;
System.out.println("banyak bilangan genap dari 1 sampai " + bil + " adalah " + jmlBilanganGenap);
System.out.print("angka genap dalam range tersebut adalah ");
for(int i=1; i<=bil; i++){
    if(i%2!=0){
        continue;
    }else{
        if(i == bil){
            System.out.print(i);
        }else{
            if (bil % 2 == 0){
                System.out.print(i + ", "); 
            }else{
                System.out.print(i);
            }
            
        }
        totalGenap +=i;
    }
}
    avg=totalGenap/jmlBilanganGenap;
    System.out.println("\nhasil penjumlahan bilangan genap dari 1 sampai " + bil + " adalah " + totalGenap);
    System.out.println("rata-rata bilangan genap dari 1 sampai " + bil + " adalah " + avg);
```

    Masukkan bilangan: 10
    banyak bilangan genap dari 1 sampai 10 adalah 5
    angka genap dalam range tersebut adalah 2, 4, 6, 8, 10
    hasil penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    rata-rata bilangan genap dari 1 sampai 10 adalah 6.0
    

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input2 = new Scanner(System.in);
int angka;
System.out.print("Masukkan angka : ");
angka = input2.nextInt();
for(int i = 1; i<=angka; i++){
    if(i%5 == 0){
    continue;    
    }else{
    System.out.println(i);
    }
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
import java.util.Scanner;
Scanner input3 = new Scanner(System.in);
int bil1=0, bil2=1, bil3, angka;
hasil = 0;
System.out.print("Masukkan angka : ");
angka = input3.nextInt();

for(int i=0; i<=angka; i++){ 
     bil3=bil1+bil2;  
     System.out.println("sum of: "+ bil1 + " + " + bil2 + "\t= " +bil3);  
     bil1=bil2;  
     bil2=bil3; 
}
```

    Masukkan angka : 9
    sum of: 0 + 1	= 1
    sum of: 1 + 1	= 2
    sum of: 1 + 2	= 3
    sum of: 2 + 3	= 5
    sum of: 3 + 5	= 8
    sum of: 5 + 8	= 13
    sum of: 8 + 13	= 21
    sum of: 13 + 21	= 34
    sum of: 21 + 34	= 55
    sum of: 34 + 55	= 89
    


```Java

```
