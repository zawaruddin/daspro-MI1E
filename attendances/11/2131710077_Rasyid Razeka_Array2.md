# JOBSHEET 11. ARRAY 2

## Tujuan
* Mahasiswa mampu memahami pembuatan array dua dimensi
* Mahasiswa mampu menyelesaikan studi kasus dengan memanfaatkan array dua dimensi

## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi
Pada Percobaan 1, kode program yang dibuat digunakan untuk menyimpan nilai praktikum dari 2 orang mahasiswa pada 3 mata kuliah yang berbeda.
1.	Buat array bertipe **integer** dengan nama **nilai** dengan kapasitas baris 2 elemen (menyatakan jumlah mahasiswa) dan kolom 3 elemen (menyatakan jumlah mata kuliah)
![Gambar 1](images/percobaan1-1.PNG)


```Java
int[][] nilai = new int[2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
nilai[0][0] = 75;
nilai[0][1] = 90;
nilai[0][2] = 88;
nilai[1][0] = 79;
nilai[1][1] = 82;
nilai[1][2] = 67;
```




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67
    

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

Jika menggunakan looping dan input dengan scanner maka harus berurutan. jika pengisian elemen array dengan mengakses indeks baris dan kolom dari variable array, kemudian nilai diisikan menggunakan operator assignment tidak harus berurutan. jika menggunakan inisialisasi array harus diisikan secara berurutan.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
int[][] nilai = new int[2][3];
nilai[0][0] = 75;
nilai[0][1] = 90;
nilai[0][2] = 88;
nilai[1][0] = 79;
nilai[1][1] = 82;
nilai[1][2] = 67;
for(int i=0; i<nilai.length; i++){
    for(int j=0; j<nilai[0].length; j++){
        System.out.print(nilai[i][j] + " ");
    }
    System.out.println();
}
```

    75 90 88 
    79 82 67 
    

### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
int[][] rating = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
for(int i=0; i<rating.length; i++){
    for(int j=0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println();
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 10
    Masukkan rating pengguna 0 untuk restoran 1 : 9
    
    Masukkan rating pengguna 1 untuk restoran 0 : 8
    Masukkan rating pengguna 1 untuk restoran 1 : 7
    
    Masukkan rating pengguna 2 untuk restoran 0 : 9
    Masukkan rating pengguna 2 untuk restoran 1 : 10
    
    Masukkan rating pengguna 3 untuk restoran 0 : 6
    Masukkan rating pengguna 3 untuk restoran 1 : 4
    
    

4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
for(int[] rtg : rating){
    for(int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println();
}
```

    10 9 
    8 7 
    9 10 
    6 4 
    

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
for(int i=0; i<rating.length; i++){
    for(int j=0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[j][i] = sc.nextInt();
    }
    System.out.println();
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    


    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#39:4)


tidak bisa, karena terjadi eror pada length indeksnya.

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[][] rating = new int[4][2];
for(int i=0; i<rating.length; i++){
    for(int j=0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println();
}
System.out.println("Banyak baris adalah " + rating.length);
System.out.println("Banyak kolom adalah " + rating[0].length);
```

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    Masukkan rating pengguna 2 untuk restoran 1 : 6
    
    Masukkan rating pengguna 3 untuk restoran 0 : 7
    Masukkan rating pengguna 3 untuk restoran 1 : 8
    
    Banyak baris adalah 4
    Banyak kolom adalah 2
    

## Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
int[][] harga = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
for(int i=0; i<harga.length; i++){
    total = 0;
    rata = 0;
    for(int j=0; j<harga[0].length; j++){
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total+=harga[i][j];
    }
    rata=total/harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 2000
    Masukkan harga[0][1]: 3000
    Masukkan harga[0][2]: 4000
    Masukkan harga[0][3]: 5000
    Masukkan harga[0][4]: 6000
    Masukkan harga[0][5]: 7000
    Rata-rata harga bahan ke-0 adalah 4500,00
    Masukkan harga[1][0]: 1000
    Masukkan harga[1][1]: 2000
    Masukkan harga[1][2]: 3000
    Masukkan harga[1][3]: 4000
    Masukkan harga[1][4]: 5000
    Masukkan harga[1][5]: 6000
    Rata-rata harga bahan ke-1 adalah 3500,00
    Masukkan harga[2][0]: 7000
    Masukkan harga[2][1]: 8000
    Masukkan harga[2][2]: 9000
    Masukkan harga[2][3]: 10000
    Masukkan harga[2][4]: 11000
    Masukkan harga[2][5]: 12000
    Rata-rata harga bahan ke-2 adalah 9500,00
    

#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

untuk menghitung rata-rata yang memiliki rumus total dibagi dengan banyak kolom harga.

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

jika variabel total=0 dan rata=0 terletak diluar perulangan for maka terjadi penumpukan dari nilai total dan rata.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double[][] suhu = new double[5][7];
int x, y;
double max=0;

for(x=0; x<suhu.length; x++){
    max=0;
    for(y=0; y<suhu[0].length; y++){
        System.out.print("Masukkan suhu : ");
        suhu[x][y] = sc.nextDouble();
        if(suhu[x][y]>max){
            max=suhu[x][y];
        }
    }
    System.out.println("Data suhu selama 7 hari kota " + x);
    System.out.println("Suhu paling tinggi ialah " + max);
}
```

    Masukkan suhu : 21
    Masukkan suhu : 22
    Masukkan suhu : 23
    Masukkan suhu : 24
    Masukkan suhu : 25
    Masukkan suhu : 26
    Masukkan suhu : 27
    Data suhu selama 7 hari kota 0
    Suhu paling tinggi ialah 27.0
    Masukkan suhu : 11
    Masukkan suhu : 12
    Masukkan suhu : 13
    Masukkan suhu : 14
    Masukkan suhu : 15
    Masukkan suhu : 16
    Masukkan suhu : 17
    Data suhu selama 7 hari kota 1
    Suhu paling tinggi ialah 17.0
    Masukkan suhu : 31
    Masukkan suhu : 32
    Masukkan suhu : 34
    Masukkan suhu : 35
    Masukkan suhu : 36
    Masukkan suhu : 37
    Masukkan suhu : 33
    Data suhu selama 7 hari kota 2
    Suhu paling tinggi ialah 37.0
    Masukkan suhu : 45
    Masukkan suhu : 47
    Masukkan suhu : 42
    Masukkan suhu : 41
    Masukkan suhu : 43
    Masukkan suhu : 44
    Masukkan suhu : 46
    Data suhu selama 7 hari kota 3
    Suhu paling tinggi ialah 47.0
    Masukkan suhu : 58
    Masukkan suhu : 59
    Masukkan suhu : 72
    Masukkan suhu : 35
    Masukkan suhu : 68
    Masukkan suhu : 90
    Masukkan suhu : 23
    Data suhu selama 7 hari kota 4
    Suhu paling tinggi ialah 90.0
    

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
int min=100;
String[] nama = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
int[][] data = {
    {19, 51, 155},
    {18, 55, 163},
    {18, 45, 153},
    {20, 46, 158},
    {19, 58, 160}
};
double rata, total=0;
int tertua=0, umur;

for(int i=0; i<data.length; i++){
    if(data[i][1]<min){
        min=data[i][1];
    }
}
System.out.println("Berat badan paling rendah diantara 5 mahasiswa adalah " + min);

for(int i=0; i<data.length; i++){
    total+=data[i][2];
}
rata = total/data.length;
System.out.println("Rata-rata tinggi badan dari kelima mahasiswa tersebut adalah " + rata);

for(int i=0; i<data.length; i++){
    if(data[i][0]>tertua){
        tertua=data[i][0];
        umur=i;
    }
}
System.out.println("Mahasiswa tertua yang berumur " + tertua + " ialah bernama " + nama[umur]);
```

    Berat badan paling rendah diantara 5 mahasiswa adalah 45
    Rata-rata tinggi badan dari kelima mahasiswa tersebut adalah 157.8
    Mahasiswa tertua yang berumur 20 ialah bernama Beky
    
