### Nama : Halim Teguh Saputro
### NIM    : 2131710122 
---

## JOBSHEET 6

## PEMILIHAN 2

### Tujuan

Mahasiswa memahami tentang operator logika; Mahasiswa mampu menyelesaikan permasalahan dengan menggunakan sintaks pemilihan bersarang; Mahasiswa mampu membuat sebuah program Java yang memanfaatkan sintaks pemilihan bersarang


### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1

#### Waktu percobaan : 40 menit

1. Tambahkan library Scanner, deklarasi Scanner

2. Buatlah variabel nilai yang memiliki tipe data int untuk menampung data yang diinput melalui keyboard

    ![](images/03.png)


```Java
// Ketik kode di sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();
```

    Masukkan nilai ujian (0-100): 105
    

3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
// Ketik kode di sini
if(nilai >= 0 && nilai <=100){
    if(nilai >= 90 && nilai <=100){
        System.out.println("Nilai A, EXCELLENT!");
    }else if(nilai >= 80 && nilai <=89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if(nilai >= 60 && nilai <=79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if(nilai >= 50 && nilai <=59){
        System.out.println("Nilai D, Tingkatkan prestasi Anda!");
    }else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
}else{
    System.out.println("Nilai yang anda masukkan tidak valid!");
}
```

    Nilai yang anda masukkan tidak valid!
    

> Penjelasan kode program percobaan 1

setelah menginputkan nilai, selanjutnya dilakukan pengecekan dengan fungsi if. apabila nilai lebih dari 0 dan kurang dari 100 maka akan melakukan pemilihan tingkat 2, tetapi bila kurang dari 0 dan lebih dari 100 maka nilai tidak valid. pada pemilihan tingkat 2 dilakukan pengecekan nilai sesuai dengan rentang nya, 90-100 nilai A, 80-89 nilai B, 60-79 nilai C, 50-59 nilai D, dan kurang dari 50 nilai E.

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

    jawab


```Java
// Jawaban pertanyaan
if(nilai >= 0 && nilai <=100){
    if(nilai >= 90 && nilai <=100){
        System.out.println("Nilai A, EXCELLENT!");
    }else if(nilai >= 80 && nilai <=89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if(nilai >= 60 && nilai <=79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if(nilai >= 50 && nilai <=59){
        System.out.println("Nilai D, Tingkatkan prestasi Anda!");
    }else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
}else{
    if(nilai < 0){
        System.out.println("Nilai yang Anda masukkan kurang dari 0");
    }else{
        System.out.println("Nilai yang Anda masukkan lebih dari 100");
    }
}
```

    Nilai yang Anda masukkan lebih dari 100
    


2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

    jawab
    - fungsi tersebut digunakan untuk mengecek data dari variabel nilai apakah lebih dari 0 dan kurang dari 100


3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?

    jawab
    - hasilnya adalah "Nilai E, Anda tidak lulus!" karena data dari variabel nilai lebih dari 0 sehingga bisa masuk ke fungsi if tingkat 1, tapi karena if tingkat 2 nya tidak ada kondisi untuk data yang lebih dari 100, maka langsung menjalankan default yaitu fungsi else yang outputnya nilai E


```Java
// Ketik kode di sini
if(nilai >= 0 || nilai <=100){
    if(nilai >= 90 && nilai <=100){
        System.out.println("Nilai A, EXCELLENT!");
    }else if(nilai >= 80 && nilai <=89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if(nilai >= 60 && nilai <=79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if(nilai >= 50 && nilai <=59){
        System.out.println("Nilai D, Tingkatkan prestasi Anda!");
    }else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
}else{
    System.out.println("Nilai yang anda masukkan tidak valid!");
}
```

    Nilai E, Anda tidak lulus!
    

---
#### Percobaan 2

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

![](images/02.png)

> Flowchart tersebut digunakan untuk menghitung gaji bersih seseorang setelah dipotong pajak sesuai dengan kategorinya (pekerja dan pebisnis) dan besarnya penghasilan. 

2. Tambahkan library Scanner dan deklarasi Scanner

3. Deklarasikan variabel kategori, penghasilan, gajiBersih, dan pajak

    ![](images/05.png)


```Java
// Ketik kode di sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();
```

    Masukkan kategori: pebisnis
    Masukkan besarnya penghasilan: 2000000
    

4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
// Ketik kode di sini
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    }else if (penghasilan <= 3000000){
        pajak = 0.15;
    }else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima: " + gajiBersih);
    
} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    }else if (penghasilan <= 3500000){
        pajak = 0.2;
    }else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji Bersih yang anda terima: " + gajiBersih);
}else {
    System.out.println("Kategori yang anda masukkan salah!");
}
```

    Gaji Bersih yang anda terima: 1700000
    

5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan kode program percobaan 2

setelah penginputan kategori dan penghasilan, akan dilakukan pengecekan menggunakan fungsi if untuk menghitung gaji bersih dari suatu kategori pekerjaan dengan ketentuan yang berbeda.

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?
    
    jawab
    - outputnya adalah 1741212, angka di belakang koma tidak ditampilkan karena variebel gajiBersih memiliki tipe data integer. dan kemudian walau dari pajak bertipe data double. di operasi gajiBersih dilakukan narrowing sehingga tipe data double berubah menjadi integer

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```
     jawab
     - untuk melakukan Narrowing casting (manual) yaitu mengubah tipe data dari yang ukurannya lebih besar (double) ke tipe data yang lebih kecil (integer) dari hasil operasi "penghasilan - (penghasilan * pajak)".
     
     

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

    jawab
    - untuk mengabaikan huruf kapital pada pengecekan string, sehingga apabila ada perbedaan huruf kapital tapi hurufnya sama antara operasi fungsi if dan inputan hasilnya tetap bernilai true
    
    
4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

    jawab
    - equals() digunakan untuk membandingkan 2 data string, kedua data tersebut harus sama persis dari huruf-huruf, urutan, dan besar kecilnya untuk mendapakan nilai true. apabila ada perbedaan huruf-huruf, urutan, atau besar kecilnya makan akan bernilai false.


```Java
// Jawaban pertanyaan
if(kategori.equals ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    }else if (penghasilan <= 3000000){
        pajak = 0.15;
    }else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima: " + gajiBersih);
    
} else if (kategori.equals ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    }else if (penghasilan <= 3500000){
        pajak = 0.2;
    }else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji Bersih yang anda terima: " + gajiBersih);
}else {
    System.out.println("Kategori yang anda masukkan salah!");
}
```

    Kategori yang anda masukkan salah!
    

---
### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program kalkulator sederhana menggunakan bahasa pemrograman Java. User akan menginputkan dua buah bilangan riil dan satu buah operator aritmatika (+, -, *, atau /), kemudian program akan mengoperasikan dua bilangan tersebut dengan operator yang sesuai. Petunjuk: gunakan pernyataan switch-case.
Contoh tampilan program:

```
Masukkan bilangan pertama: 2.5
Masukkan operator (+, -, *, /): *
Masukkan bilangan kedua: 4
2.5 * 4.0 = 10.0

```


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner input1 = new Scanner(System.in);
double bil1, bil2, hasil;
char operator;

System.out.print("Masukkan bilangan pertama: ");
bil1 = input1.nextDouble();
System.out.print("Masukkan Operator (+, -, *, /): ");
operator = input1.next().charAt(0);
System.out.print("Masukkan bilangan kedua: ");
bil2 = input1.nextDouble();

switch(operator){
    case '+':
        hasil = bil1 + bil2;
        System.out.println(bil1 + " + " + bil2 + " = " + hasil);
        break;
    case '-':
        hasil = bil1 - bil2;
        System.out.println(bil1 + " - " + bil2 + " = " + hasil);
        break;
    case '*':
        hasil = bil1 * bil2;
        System.out.println(bil1 + " * " + bil2 + " = " + hasil);
        break;
    case '/':
        hasil = bil1 / bil2;
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        break;
    
}
```

    Masukkan bilangan pertama: 2.5
    Masukkan Operator (+, -, *, /): *
    Masukkan bilangan kedua: 4
    2.5 * 4.0 = 10.0
    

---
2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner input2 = new Scanner(System.in);
double bil1, bil2, bil3;

System.out.print("Masukkan sisi 1: ");
bil1 = input2.nextDouble();
System.out.print("Masukkan sisi 2: ");
bil2 = input2.nextDouble();
System.out.print("Masukkan sisi 3: ");
bil3 = input2.nextDouble();

if(bil1 == bil2 && bil1 == bil3){
    System.out.println("Segitiga sama sisi");
}else if(bil1 == bil2 || bil2 == bil3 || bil1 == bil3){
    System.out.println("Segitiga sama kaki");
}else if(bil1 != bil2 && bil2 != bil3 && bil3 != bil1){
    System.out.println("Segitiga sembarang");
}else {
    System.out.println("Bukan segititga");
}
```

    Masukkan sisi 1: 5
    Masukkan sisi 2: 10
    Masukkan sisi 3: 10
    Segitiga sama kaki
    

---
3. Warung Padang Gembira meminta Anda membuat sebuah program untuk menerima pesanan dari internet. Program yang Anda buat meminta user untuk memasukkan nama makanan dan harga. Setelah itu, user ditawarkan untuk menggunakan pengiriman ekspres. Jika pengguna menolak, maka jenis pengiriman yang digunakan adalah pengiriman reguler. Biaya pengiriman reguler untuk harga makanan kurang dari Rp 100.000 adalah Rp 20.000, sedangkan untuk harga makanan sama dengan atau lebih dari Rp 100.000 biaya pengirimannya adalah Rp 30.000. Untuk jenis pengiriman ekspres, tambahkan biaya tambahan sebesar Rp 25.000 dari standar biaya pengiriman reguler. Tampilkan struk yang berisi nama makanan yang dibeli + harga, biaya pengiriman, dan total yang harus dibayar!
Contoh hasil output program:

```
Masukkan nama makanan: Tuna salad
Masukkan harga makanan: Rp 115000
Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 0

STRUK PEMBELIAN
Tuna salad        Rp 115000
Biaya pengiriman  Rp 30000
TOTAL             Rp 145000

```

```
Masukkan nama makanan: Beef bulgogi
Masukkan harga makanan: Rp 78000
Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 1

STRUK PEMBELIAN
Beef bulgogi      Rp 115000
Biaya pengiriman  Rp 45000
TOTAL             Rp 123000

```




```Java
import java.util.Scanner;
Scanner input3 = new Scanner(System.in);
int harga, tawaran, total;
int reg1 = 20000, reg2 = 30000;
int eks1 = 45000, eks2= 55000;
String nama;

System.out.print("Masukkan nama makanan: ");
nama = input3.nextLine();
System.out.print("Masukkan harga makanan: ");
harga = input3.nextInt();
System.out.print("apakan anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? ");
tawaran = input3.nextInt();

System.out.println("\nSTRUK PEMBELIAN");
System.out.println(nama + "\t\tRp "+harga);

if (tawaran == 0){
    if (harga >= 100000){
    System.out.println("Biaya pengiriman\tRp " + reg2);
    harga += reg2;
    }else {
    System.out.println("Biaya pengiriman\tRp " + reg1);
    harga += reg1;
    }
}else if(tawaran == 1){
    if (harga >= 100000){
    System.out.println("Biaya pengiriman\tRp " + eks2);
    harga += eks2;
    }else {
    System.out.println("Biaya pengiriman\tRp " + eks1);
    harga += eks1;
    }
}

System.out.println("TOTAL\t\t\tRp " + harga);

```

    Masukkan nama makanan: beef bulgogi
    Masukkan harga makanan: 78000
    apakan anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 1
    
    STRUK PEMBELIAN
    beef bulgogi		Rp 78000
    Biaya pengiriman	Rp 45000
    TOTAL			Rp 123000
    

---
4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner input4 = new Scanner(System.in);
int umur, status, pendapatan, tanggungan, biaya;

System.out.print("Masukkan umur: ");
umur = input4.nextInt();

if (umur >= 18){
    System.out.print("Masukkan Status bekerja (0 = tidak, 1 = ya): ");
    status = input4.nextInt();
    if(status == 1){
        System.out.print("Masukkan pendapatan perbulan: ");
        pendapatan = input4.nextInt();
        System.out.print("Masukkan jumlah tanggungan: ");
        tanggungan = input4.nextInt();
        biaya = pendapatan/tanggungan;
        
        if(biaya < 300000){
            System.out.println("Penduduk Miskin");
        }else {
            System.out.println("Bukan Penduduk Miskin");
        }
    }else if(status == 0){
        System.out.println("Penduduk Miskin");
    }
}else{
    System.out.print("Masukkan Status Sekolah (0 = tidak, 1 = ya): ");
    status = input4.nextInt();
    if(status == 1){
        System.out.println("Bukan Penduduk Miskin");
    }else {
        System.out.println("Penduduk Miskin");
    }
}


```

    Masukkan umur: 16
    Masukkan Status Sekolah (0 = tidak, 1 = ya): 0
     Penduduk Miskin
    


```Java

```


```Java

```
