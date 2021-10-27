<dl>
  <dt>NIM :</dt>
  <dd>2131710077</dd>

  <dt>Nama :</dt>
  <dd>Rasyid Razeka Alamsyah</dd>
    
  <dt>Kelas :</dt>
  <dd>MI-1E</dd>
</dl>


___


# JOBSHEET 09 - Perulangan 2

## Tujuan
+ Mahasiswa memahami konsep perulangan bersarang (_nested loop_)
+ Mahasiswa dapat menjelaskan format penulisan perulangan bersarang (_nested loop_)
+ Mahasiswa dapat mengimplementasikan _flowchart_ perulangan bersarang menggunakan bahasa pemrograman Java

## Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet
+ Anaconda3 + Java kernel (opsional)

## Praktikum
### Percobaan 1: Bintang Persegi
1. Perhatikan Flowchart di bawah ini
![Gambar 0](images/img-00.png)
> flowchart di atas digunakan untuk menggambar sebuah persegi dengan simbol * (bintang)
2. Pada percobaan ke-1 akan dilakukan percobaan tentang _nested loop_. Kasus yang akan diselesaikan adalah untuk membuat tampilan persegi * , dengan panjang sisi sebanyak N. Misalkan N dimasukan **5**, maka hasilnya adalah
![Gambar 1](images/img-01.png)
3. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
4. Ketikan kode program di bawah ini
![Gambar 2](images/img-02.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i=1; i<=N; i++){
    for(int j=1; j<=N; j++){
        System.out.print("*");
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    *****
    *****
    *****
    *****
    *****
    

5.	Perhatikan sintaks perulangan yang digunakan untuk mencetak * sebanyak N kali ke arah samping. Di tahap 4 di atas kode _looping **for**_ kita jadikan sebagai _**inner loop**_. 
6.	Kita looping lagi _inner loop_ sebanyak N kali untuk menghasilkan _output_ seperti tahap 2. Maka perlu ditambahkan perulangan luar (_outer loop_).
![Gambar 3](images/img-03.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 6 (gabungkan dengan inner loop pada langkah 4)
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int outer=1; outer<=N; outer++){
    for(int i=1; i<=N; i++){
        for(int j=1; j<=N; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
```

    Masukkan nilai N : 5
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    *****
    

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 2?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Belum sesuai
2. Jawaban ada dibawah ini


```Java
// Tulis Kode program Percobaan 1 yang benar menurut kalian
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int outer=1; outer<=N; outer++){
    for(int i=1; i<=N; i++){
        System.out.print("*");
        for(int j=1; j<=N; j++){
        }
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    *****
    *****
    *****
    *****
    *****
    

***
### Percobaan 2: Bintang Segitiga
1.	Pada percobaan ke-2 akan dilakukan percobaan segitiga * sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti gambar berikut
![Gambar 4](images/img-04.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 5](images/img-05.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();

int i=0;
while(i<=N){
    int j=0;
    while(j<i){
        System.out.print("*");
        j++;
    }
    i++;
}
```

    Masukkan nilai N = 5
    ***************

Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. Belum sesuai
2. Harus diberi output pada outer loop. Perbaikan ada dibawah ini


```Java
// Tulis Kode program Percobaan 2 yang benar menurut kalian
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();

int i=0;
while(i<=N){
    int j=0;
    while(j<i){
        System.out.print("*");
        j++;
    }
    System.out.println();
    i++;
}
```

    Masukkan nilai N = 5
    
    *
    **
    ***
    ****
    *****
    

***
### Percobaan 3: Segitiga Angka
1.	Pada percobaan ke-3 akan dilakukan percobaan segitiga angka sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti berikut
![Gambar 7](images/img-07.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 8](images/img-08.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();


for(int i=1; i<=N; i++){
    for(int j=1; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
}
```

    Masukkan nilai N = 5
    1
    12
    123
    1234
    12345
    

#### Pertanyaan 
1. Apakah kode program di atas menghasilkan _output_ yang diharapkan?
2. Jika belum, kode program mana yang harus modifikasi? Jelaskan

#### Jawaban
1. Belum sesuai
2. 


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();

for(int i=1; i<=N; i++){
    for(int j=1; j<=i; j++){
        System.out.print(i);
    }
    System.out.println();
}
```

    Masukkan nilai N = 5
    1
    22
    333
    4444
    55555
    

***
### Percobaan 4: Tebak Angka
1. Pada Percobaan 4 ini, kita akan belajar membuat kode untuk menebak angka menggunakan _nested loop_.
2. Pada percobaan ini kita menggunakan library Scanner untuk menangkap input dari keyboard dan Random untuk meng-generate angka secara acak
3. Ketik dan pahami kode program di bawah ini
![Gambar 6](images/img-06.png)


```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer==number){
            System.out.println("Yay... tebakan anda benar... SELAMAT!!!");
            success = true;
        }
    }while(!success);
    
    System.out.print("Apakah anda ingin mengulang permainan (Y/y)? ");
    menu = input.nextLine().charAt(0);
}while(menu=='y' || menu=='Y');
```

    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 4
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 6
    Yay... tebakan anda benar... SELAMAT!!!
    Apakah anda ingin mengulang permainan (Y/y)? t
    

#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Program diatas menggunakan nested loop do-while dan menggunakan kode random untuk mengacak nomor. Pada program tersebut kita disuruh untuk memasukkan angka 1-10. Dan jika yang dimasukkan belum sesuai dengan kode random maka akan diulang dan jika sudah sesuai maka akan keluar output yang tertera.
2. Dengan menginputkan huruf selain Y atau y.


```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.A disini */
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer==number){
            System.out.println("Yay... tebakan anda benar... SELAMAT!!!");
            success = true;
        }else if(answer<number){
            System.out.println("Angka yang anda masukkan lebih kecil. Silahkan menebak lagi!!");
        }else{
            System.out.println("Angka yang anda masukkan lebih besar. Silahkan menebak lag!!");
        }
    }while(!success);
    
    System.out.print("Apakah anda ingin mengulang permainan (Y/y)? ");
    menu = input.nextLine().charAt(0);
}while(menu=='y' || menu=='Y');
```

    Tebak angka (1-10) : 2
    Angka yang anda masukkan lebih kecil. Silahkan menebak lagi!!
    Tebak angka (1-10) : 5
    Angka yang anda masukkan lebih besar. Silahkan menebak lag!!
    Tebak angka (1-10) : 4
    Angka yang anda masukkan lebih besar. Silahkan menebak lag!!
    Tebak angka (1-10) : 3
    Yay... tebakan anda benar... SELAMAT!!!
    Apakah anda ingin mengulang permainan (Y/y)? t
    


```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';
int kesempatan=1;

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(kesempatan==10){
            System.out.println("Maaf kesempatan yang anda miliki telah habis.");
            break;
        }else if(answer==number){
            System.out.println("Yay... tebakan anda benar... SELAMAT!!!");
            success = true;
        }else if(answer<number){
            kesempatan+=1;
        }else{
            kesempatan+=1;
        }
    }while(!success);
    
    System.out.print("Apakah anda ingin mengulang permainan (Y/y)? ");
    menu = input.nextLine().charAt(0);
}while(menu=='y' || menu=='Y');
```

    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 4
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 6
    Tebak angka (1-10) : 7
    Yay... tebakan anda benar... SELAMAT!!!
    Apakah anda ingin mengulang permainan (Y/y)? y
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 4
    Maaf kesempatan yang anda miliki telah habis.
    Apakah anda ingin mengulang permainan (Y/y)? t
    

***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
/* Jawaban Soal 1 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int n;
System.out.print("Masukkan nilai N : ");
n = sc.nextInt();

for(int i=1; i<=n; i++){
    for(int j=n; j>=1; j--){
        if(i<j){
            System.out.print(" ");
        }else{
            System.out.print("*");
        }
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
        *
       **
      ***
     ****
    *****
    

***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int n;
System.out.print("Masukkan nilai N : ");
n = sc.nextInt();

for(int i=1; i<=n; i++){
    for(int j=1; j<=n; j++){
        if(i==1 || i==n || j==1 || j==n){
            System.out.print(n + " ");
        }else{
            System.out.print("  ");
        }
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    5 5 5 5 5 
    5       5 
    5       5 
    5       5 
    5 5 5 5 5 
    

***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int n;
System.out.print("Masukkan nilai N : ");
n = sc.nextInt();

for(int i=1; i<=n; i++){
    for(int j=i; j<=n; j++){
        System.out.print("  ");
    }
    for(int k=0; k<=(i*2)-2; k++){
        System.out.print("* ");
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
              * 
            * * * 
          * * * * * 
        * * * * * * * 
      * * * * * * * * * 
    
