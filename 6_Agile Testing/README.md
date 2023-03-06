# (6) Agile Testing
### Nama 		: Iftitah Hidayati
### Program	    : QE (Quality Engineer) - Alterra 
### Kelas		: A
### Batch 		: 4
___
## **Definisi dari SDLC**
<p>SDLC (Software Development Life Cycle) merupakan proses yang digunakan untuk merancang, mengembangkan, dan menguji software yang berkualitas tinggi. </p>

<p>Tujuan SDLC : adalah untuk menyediakan alur terstruktur yang membantu organisasi menghasilkan software berkualitas tinggi, yang diselesaikan dengan perkiraan waktu yang sangat singkat dan biaya yang lebih rendah. Namun tetap memenuhi atau melebihi harapan pelanggan. SDLC dimulai dengan mengevaluasi sistem yang ada untuk mendefinisikan persyaratan pada sistem yang baru, setelah itu software akan dibuat berdasarkan tahapan-tahapan SDLC yang ada.</p>

<p>Dengan adanya SDLC dapat menimalisir kemungkinan kesalahan sehingga mengurangi adanya perbaikan setelah software jadi. SDLC juga merupakan metodologi yang berulang, sehingga kita harus memastikan kode yang ada disetiap siklusinya. Sangat sulit untuk membuat website tanpa perancangan yang maksimal. </p>

___
## **Fase SDLC**
1.	**Requirements Gathering** : sistem akan dianalisis bagaimana akan dijalankan nantinya, dapat berupa kelebihan, kelemahan sistem hingga pembaruan yang diterapkan. Merupakan bagian perencanaan Hasil dari tahap ini adalah rencana proyek, jadwal estimasi biaya dan ketentuan. Developer dapat bekerja maksimal pada tahap ini.
2.	**Design** : tahap dimana kita akna membuat model cara kerja aplikasi atau software. Beberapa aspek yang dikerjakan dalam design yaitu 

- a.	Communication : yaitu mendefinisikan metode atau cara aplikasi berkomunikasi dengan asset lainnya. Seperti server pusat atau aplikasi lainnya.
- b.	Programming : menentukan metode pemecahan masalah dan tugas-tugas yang ada dalam aplikasi 
- c.	Arsitektur : menentukan dasar pemrograman dan praktik dalam industri desain keseluruhan dan menggunakan template tertentu.
- d.	User interface : mendefiniskan bagaimana cara pelanggan berinteraksi dengan software dan bagaimana software tersebut merespon input yang ada.
- e.	Platform : mendefinisikan platform dimana software akan dijalankan misalnya versi android, ios, linux
- f.	Security : mendefinisikan Langkah-langkah mengamankan aplikasi. Mengamankan sandi, traffic ssl, atau word credential penggunaan yang aman.
- g.	Prototype : menjadi tahapan desain dalam desain. 
Mengilustrasikan bagaimana aplikasi dapat terlihat dan bekerja
3.	**Development (code)** : pada tahap ini dimana code atau program ditulis. Jika proyek kecil maka program bisa ditulis oleh 1 developer saja, namun jika proyek besar bisa dipecah dan dikerjakan oleh beberapa tim. Pada fase ini bisa juga digunakan oleh aplikasi akses control atau source code management untuk membantu developer dalam melacak perubahan kode dan memmastikan compatibilitas antar proyek tim yang berbeda. Proses coding tidak hanya dilakukan sebatas Menyusun code agar aplikasi dapat berjalan tapi juga mencakup banyak tugas lain, misalnya menemukan dan memperbaiki error yang ditemukan. Tahapan ini merupakan salah satu fase development lifecycle yang memakan waktu yang lebih panjang, karena akan muncul kendala-kendala baru yang mungkin dapat menghambat jalannya pengembangan sistem. 
4.	**Testing** : setelah sistem selesai dikembangkan maka sistem dilakukan pengujian sebelum digunakan atau dipublish. Harus memperhatikan beberapa hal seperti kemudahan penggunaan sistem sesuai tujuan sistem. Merupakan bagian tahap penting, karena untuk menjamin kualitas sistem sebelum nantinya dipublish. Beberapa hal yang harus dilewati yaitu : kualitas code, functional code, integration testing, performance testing dan security testing. 
5.	**Deployment** : pada tahap ini aplikasi sudah ada pada user sebelum nantinya digunakan.
6.	**Maintenance** : pada tahap ini aplikasi bisa digunakan di lapangan, namun dianggap penting karena bisa jadi pengguna menemukan bug selama pengujian sehingga kesalahan perlu diatasi.

**Beberapa model yang dikembangkan dengan SDLC :**
-	**Waterfall model** : dimana merupakan model tertua dan tersingkat dalam penentuannya. Fase ini memiliki alur yang menurun, mangkanya disebut waterfall atau air terjun. Kekurangannya yaitu jika ada satu detail kecil yang tertinggal, dan mempengaruhi keseluruhan yang berakhir berantakan 
-	**Agile model** : adalah SDLC yang dapat memisahkan antara produk dan proses dan waktu pengerjaannya cepat. Metode ini diyakini sangat tepat untuk keberhasilan suatu produk. Kelemahannya yaitu dapat memicu proyek kearah yang tidak sesuai dengan kemauan dan ekspektasi dari customer 
-	**Iterative model** : adalah model yang memiliki repretisi yang tinggi dimana developer akan menciptakan dengan versi cepat dan murah. Kekurangannya dapat dapat mengkonsumsi bahan baku jika ada salah satu detail yang tertinggal untuk dikerjakan.
-	**V-Shape model** : adalah lanjutan dari waterfall model, dimana pada SDLC ini akan mencoba tiap perkembangan suatu produk.
-	**Big bank model** : adalah model yang diklaim memiliki resiko tinggi saat dijalankan, karena dalam pengerjaannya tim akan menginvestasikan pengerjaannya semua bahan baku kedalam proyek tersebut. Sehingga berhasil jika mengerjakan proyek yang kecil dan cenderung berbahaya ke proyek yang besar. 
-	**Spiral model** : adalah model paling fleksibel dan mirip dengan iterative model, metode ini mirip dengan repetisi dan pengerjaannya.

___
## **Agile testing manifesto**
Salah satu pengaruh adanya agile testing manifesto yaitu untuk mengukur dan mengupayakan pengujian kita sebagai seorang QE dapat mengevaluasi seberapa baik dalam melakukan software testing, sedangkan itu tidak kita dapatkan jika menggunakan metode yang hanya ada distep akhir proses development. 
Terdapat 5 kunci dalam melakukan testing manifesto :
1.	Testing is an activity not a phase, dengan cara lama seorang tester akan kewalahan di akhir proses testing karena melakukan full-test pada aplikasi yang belum pernah kita tes sebelumnya. 
2.	Prevent bugs rather than finding bugs
Beberapa factor yang memunculkan bug, diantaranya yaitu Requirement yang kurang lengkap atau kurang detail untuk mengurangi kemunculan bug. 
3.	Don’t be a checker, be a tester
4.	Don’t try to break the system, instead help build the best possible system 
5.	The whole team is responsible for quality, not just the tester.

___
## **Testing pyramid**
Merupakan strategi yang dapat membantu tim development dan automation dalam membuat software testing yang berkualitas tinggi dan handal, ini dapat mengurangi waktu dalam tim untuk mengidentifikasi apakah perubahannya itu dilakukan dapat merusak sistem dengan menawarkan feedback secara langsung. Testing pyramid yang beroperasi pada 3 tingkat yang membantu mengurangi jumlah waktu yang dihabiskan tim automation dalam mengeksekusi jalannya case dengan mengkategorikan setiap fitur baru kedalam satu atau semua test. 
*<p>**Terdapat 3 level dari testing pyramid :</p>**

1.	Paling bawah yaitu Unit Test, merupakan pengujian perangkat lunak yang menguji setiap unit atau komponen dari tiap perangkat lunak, dilakukan saat masa pengembangan atau saat menuliskan kode program dari developer. Yang diuji yaitu unit-unit dalam perangkat lunak. Tujuan yaitu untuk memvalidasi tiap unit dari code perangkat lunak dapat berjalan seperti yang diharapkan.
2.	Integration testing, yaitu pengujian penggabungan unit-unit yang ada didalam software, sebaiknya dilakukan bertahap untuk menghindari adanya conflict. 
3.	UI Test atau end-to end test,  merupakan test yang paling dekat dengan pengguna baik aplikasi web atau android atau ios. 
<p>Dengan testing pyramid dapat melihat hal penting yaitu :</p>

-	Semakin tinggi level semakin sedikit test yang dilakukan.
-	Test yang paling bawah cenderung berjalan lebih cepat karena pedoman dom yang lengkap dan mudah dimaintenance karena pengujian masih berskala kecil.
-	Tiap penulisan test pasti berbeda tiap tingkatannya.
-	Tidak dapat menguji semua tipe testing, apakah ui ini cocok dengan desain misalnya seperti itu dan itulah mengapa testing dengan level tinggi harus focus pada scenario yang penting. 
