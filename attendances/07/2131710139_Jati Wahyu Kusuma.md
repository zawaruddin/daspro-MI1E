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
int faktorial=1;

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
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah : "+faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 20
    Nilai faktorial bilangan tersebut adalah : 0

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan : 20
    Nilai faktorial bilangan tersebut adalah : -2102132736

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.print("Masukkan Bilangan :");
angka = input.nextInt();
int i=1;
do{
    faktorial*=i;
    i++;
}
while(i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : "+faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====
    Masukkan Bilangan :10
    Nilai faktorial bilangan tersebut adalah : 3628800

// Ketik kode program di atas di bawah sini


##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

fungsinya agar hasil didalam output bilangan yang kita masukkan tadi menjadi suatu perkalian bilangan yang kita masukkan tadi;


2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
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

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL=====
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
    System.out.print("Masukkan bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan ; "+total);
    

```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan bilangan : 10
    Masukkan bilangan : 10
    Masukkan bilangan : 50
    Jumlah angka-angka yang telah dimasukkan ; 70
    

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total=0;
while(true){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50)break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 20
    Masukkan Bilangan : 10
    Masukkan Bilangan : 30
    Jumlah angka-angka yang telah dimasukkan : 60
    

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
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 10
    Masukkan Bilangan : 30
    Masukkan Bilangan : 20
    Jumlah angka-angka yang telah dimasukkan : 60
    

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

jawab : kode program diatas menggunakan do while loop dengan break yaitu fungsinya break adalah  perintah khusus yang dipakai untuk memaksa sebuah perulangan berhenti sebelum waktunya.


2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


jawab : Fungsinya ketika nilai total dimulai dari nol, jika itu true maka statement selanjutnya
akan di jalankan.

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
Scanner input=new Scanner(System.in);
int angka, total, count;
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
System.out.println("Rata-rata angka yang dikurang dari 50: "+avg);


```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 10
    Masukkan Bilangan : 30
    Masukkan Bilangan : 20
    Masukkan Bilangan : 50
    Masukkan Bilangan : 5
    Jumlah angka-angka yang kurang dari 50: 65
    Rata-rata angka yang dikurang dari 50: 16.25
    


```Java
5. Jalankan program. Amati apa yang terjadi!
```

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

jawab : perbedaannya jika percobaan ke 2 menggunakan  menggunakan break kalau percobaan 3 menggunakan continue

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

jawab : Fungsi dari if(angka>=50) continue adalah jika kita memasukkan angka lebih besar
sama dengan 50 maka program akan melewati perulangan, tetapi tetap melanjutkan ke tahap
berikutnya. Fungsi dari total+=angka; adalah jika kita memasukkan angka yang dimasukkan
sesuai dengan syarat dari perulangan. Fungsi dari count++ adalah untuk mencatat looping yang
ditentukan.


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
int bil, jmlBilGenap, totalGenap = 0;
double avg;
System.out.print("Masukkan angka : ") ;
bil = input.nextInt();
jmlBilGenap=bil/2;
System.out.println("Banyaknya angka genap dari 1 sampai " +bil + " adalah " + jmlBilGenap);
for(int i=1; i<=bil; i++){
if(i%2!=0) continue;
totalGenap+=i;
}
System.out.print("Angka genap range adalah ");
for(int i=1; i<=10; i++)
if(i%2==0){
System.out.print( i +" ");
}
System.out.println(" Hasil dari penjumlahan bilangan genap dari 1 sampai " +bil + 'a' );
avg=totalGenap/jmlBilGenap;
System.out.println("Rata-rata bilangan genap dari 1 sampai " +bil + " adalah " + avg);
```

    Masukkan angka : 10
    Banyaknya angka genap dari 1 sampai 10 adalah 5
    Angka genap range adalah 2 4 6 8 10  Hasil dari penjumlahan bilangan genap dari 1 sampai 10a
    Rata-rata bilangan genap dari 1 sampai 10 adalah 6.0
    

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;

Scanner input = new Scanner(System.in);

int bil;
System.out.print("Masukan Angka : " );
bil = input.nextInt();
int i;
for (i = 1;i<=bil;i++){
    if(i%5 == 0)continue;
    System.out.println(i);
}

```

    Masukan Angka : 19
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
int n1= 0 ,n2= 1 ,n3,i,count ;
Scanner scan = new Scanner(System.in);
System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
count = scan.nextInt();
for (i= 2 ;i<count;++i) //loop dimulai dari 2 karena 0 dan 1 sudah dicetak
{
n3=n1+n2;
System.out.println( "Sum of: " +n1+ "+" +n2+ "=" +n3);
n1=n2;
n2=n3;
}
```

    Masukkan jumlah deret bilangan fibonacci: 10
    Sum of: 0+1=1
    Sum of: 1+1=2
    Sum of: 1+2=3
    Sum of: 2+3=5
    Sum of: 3+5=8
    Sum of: 5+8=13
    Sum of: 8+13=21
    Sum of: 13+21=34
    
