# (2) Verison Control (Git)
### Nama 		: Iftitah Hidayati
### Program	    : QE (Quality Engineer) - Alterra 
### Kelas		: A
### Batch 		: 4
___
## **Apa itu Versioning?**
Merupakan pengaturan atau pelacakan versi dari setiap code program. 
Contoh saat skripsi, harus membuat dokumen untuk proposal, kemudian dilakukan perubahan dengan file baru untuk buat track (melakukan sebuah pencatatan)
Revision atau versioning tujuannya untuk mengetahui dengan mengetrack setiap perubahan yang kita atau tim lakukan untuk membangun projek.  
___
## **Tools**
**Version Control System (VCS)**
1.	Single user (Local)
-	SCCS – 1972  unix only
-	RCS – 1982 Cross platform, text only
2.	Centralized (server terpusat)
-	CVS – 1986 File focus
-	Perforce – 1995
-	Subversion – 2000 – track directory structure
-	Microsoft team foundation server – 2005 
3.	Distributed 
-	Git (sistem terdistribusi, di lokal ada di server ada) – 2005
-	Mercurial – 2005
-	Bazaar – 2005
___
## **GIT**
Merupakan salah satu version control system popular yang digunakan para developer untuk mengembangkan software secara bersama sama. Dimana digunakan untuk mengetrack project perubahannya apa aja dari perubahan itu nanti bisa dilakukan colaborasi dengan para developer lainnya atau bertim. 
___
## **Real world collaboration**
Terdistribusi bukan tersentralisasi, artinya computer satu dengan lain terhubung dengan git. 
Dibuat oleh Linus Torvalds (2005) – Linux Kernel https://github.com/torvalds/linux 
___
## **Git Repository**
**Versi local memiliki 2 jenis file**
-	Folders and files
-	History (konfigurasi, track, dan pencatatan)
<p>Git dapat mengetrack setiap perubahan. Di git dapat melakukan undo atau mengembalikan sebuah perubahan. Setiap pengiriman ke server (github) terdapat commit dimana setiap commit memiliki atau dapat mengirimkan beberapa perubahan file dan nantinya terdapat pesan juga dari commit yang kita lakukan. Dan commit dilakukan untuk mengetahui riwayat perubahan. </p>
<p>Biasanya dilakukan commit pada github. Github = git hosting service. Dimana kita dapat login di dengan akun di laman github.com dan kita dapat membuat sebuah repository baru.</p>
<p>Pada github terdapat 2 yaitu public dan private. Dimana public bisa diakses oleh orang lain dan biasanya bersifat open source. Sedangkan private untuk project perusahaan dan bersifat pribadi.</p>

___
## **Cara kerja git (the staging area)**
1.	**Working directory (git add) ==> git add .**
- <p>Digunakan untuk melakukan perubahan terkait program atau project yang dibuat di text editor. Kemudian dilakukan git add untuk menambahkan atau mengupload perubahan ke dalam server github kita.</p>
2.	**Staging area (git commit) ==> git commit -m “(diisi pesan)”**
- <p>Setelah dilakukan add maka file yang sudah di lakukan perubahan atau ditambahakan, maka akan berada di staging area. Setelah berada di state area maka kita tinggal melakukan commit yang mana artinya file tersebut siap untuk dilakukan upload dari staging area ke repository githubnya. Dalam melakukan commit diperlukan pesan yang mana itu digunakan sebagai inisialisasi untuk sekali bucket perubahan commit.</p>
3.	**Repository --> git push origin**
- <p>Dilakukan untuk mengepush atau mengupdate perubahan di repository yang telah dilakukan penambahan atau pengeditan data atau file. </p>
___
    Tambahan :
1.	**Git stash** dilakukan untuk melakukan perubahan yang dilakukan untuk menyimpan semua code yang belum selesai dikerjakan untuk dicommit.
2.	**Git stash apply** dilakukan untuk mengembalikan perubahan yang di stash. Setelah apply balik, maka terdapat konflik yang mana terdapat 2 perubahan pada akses file dan di line yang sama. Lalu kita tinggal melakukan perubahan bisa berupa penghapusan salah satu perubahan bisa dihapus yang dari stash ataupun dari yang sudah diupdate. Atau juga bisa digabungkan perubahan untuk keduanya (perlu dipertimbangkan saat ingin fixing perubahan dengan developer). Jika semuanya selesai maka kita dapat melakukan walking area dan lakukan staging area berupa add dan commit lalu push jika sudah fix.
3.	**File ignore**, digunakan untuk mengecualikan file yang tidak ingin dilakukan upload ke github, bisa berupa file atau folder yang tidak ingin di tampilkan di dalam github. Jika nanti file dimasukkan kedalam .ignore maka file tersebut akan berwarna abu-abu dan tidak masuk ke dalam upload an github, dan hanya file .ignore yang akan tetap ke upload di dalam repository github. 

___
## **Syincing**
1.	**Git push**
- <p>Dilakukan untuk mengupdate perubahan pada repository di github.</p>

2.	**Git fetch**
- <p>Hanya mengambil datanya saja dan nanti di marge.</p>
3.	**Git pull**
- <p>Menggabungkan perubahan di master dengan di git push. Perubahan yang ada di master kemudian di marge kedalam branch kita.</p>

___
## **BRACHES**
Digunakan sebagai isolasi dari perubahan-perubahan apa saja yang sudah kita lakukan. 

___
## **WORKFLOW COLLABORATION**
Merupakan bagaimana alur dari menggunakan git di github atau gitlab. Dan bisa tau optimizednya. 
1.	Jangan buat branch master diubah-ubah dan master hanya menerima sebuah pull request dari final.
2.	Development akan mengambil master dan bisa ditambahkan oleh beberapa feature
3.	Meminta full request dan memasang feature untuk development dan untuk digabungkan oleh feature
4.	 Menggabungkan yang dari development ke master kemudian selesai.
