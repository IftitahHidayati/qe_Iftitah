# (15) RESTful API With Rest Assured - RESUME
### Nama 		: Iftitah Hidayati
### Program	    : QE (Quality Engineer) - Alterra 
### Kelas		: A
### Batch 		: 4
___
## **Pengertian REST**
___
REST atau Resquational Test Transfer merupakan standar arsitektur komunikasi berbentuk berbasis web yang sering diterapkan dalam layanan berbasis web. Umumnya menggunakan HTTP sebagai protocol untuk komunikasi data. Rest juga merupakan salah satu implementasi dari web servise sebagai standart yang digunakan untuk pertukaran data antara applikasi atau sistem. Rest API berisi aturan yang dapat membatasi programmer untuk mengakses atau melakukan tindakan-tindakan tertentu pada database. Jika API adalah penghubung maka Rest yang membuat aturan sesuai programmer dalam merancang web service. Simpelnya terdapat response pada data yang dikirimkan ataupun yang diterima. Dalam penggunaan Rest API umumnya menggunakan JSON. 
___
## **API Consept**
___
User (Mobile App) -> request -> Waiter (API) -> request -> Kitchen (Application)
User (Mobile App) <- response <- Waiter (API) <- response <- Kitchen (Application)

**Fundamental API (Test Process)**
1.	Definisikan API yang akan dites
2.	Inputkan data yang dibutuhkan di body header maupun di body requestnya. 
3.	Rekontruksi ke server
4.	Lalu lakukan validasi testnya
___
## **Test Pyramid**
___
Dikelompokkan kedalam berbagai kategori, jumlah test secara teoritis akan berkurang saat kita naik dalam tiap kategori. 
1.	**UNIT :** test pyramid paling bawah, merupakan pengujian perangkat lunak yang menguji setiap unit atau komponen dari setiap perangkat lunak. Unit testing dilakukan saat tahap pengembangan atau pada saat menuliskan kode program dari sebuah perangkat lunak oleh developer. Seperti Namanya, unit testing menguji komponen-komponen atau unit dari perangkat lunak, dan unit disini dapat berupa function, method, procedure, maupun objek. Fungsi unit testing adalah menguji tiap komponen perangkat lunak dapat berjalan seperti yang diharapkan.
2.	**Component :** merupakan jenis pengujian perangkat lunak dimana pengujian dilakukan pada setiap komponen inidividu secara terpisah tanpa terintegrasi komponen lain. Umumnya secara keseluruhan terbuat dari beberapa komponen. Pengujian tingkat komponen umumnya berkaitan dengan pengujian tingkat komponen. Ini adalah salah satu jenis blackbox testing yang sering dilakukan oleh tim QA.
3.	**Integration :** merupakan pengujian dari penggabungan unit-unit yang ada di software. Biasanya QA menguji bagaimana unit-unit tersebut bekerja sebagai suatu kombinasi, bukan lagi suatu unit yang individu. Integration testing sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran error atau bug. 
4.	**UI :** level pengujian paling atas. UI test atau End to End merupakan test yang paling dekat dengan pengguna. Data harus disajikan kepada pengguna dan UI harus berubah seperti yang diharapkan. Dengan menggunakan tools, end to end test ini memberitahu browser apa yang harus dilakukan seperti click, atau expected result yang diharapkan melalui test tersebut.

Dari test pyramid ini dapat diketahui bahwa semakin tinggi level semakin sedikit test yang dilakukan. Karena semakin tinggi test yang dapat dijalankan serta maintenance yang memelukan biaya yang lebih mahal. Testing paling rendah tingkatannya cenderung berjalan lebih cepat karena tidak memerlukan pedoman DOM yang lengkap dan mudah di maintenance karena masih berskala kecil. Penulisan test berbeda tiap tingkat detailnya. Harus berfokus pada unit test, karena mencakup semua pernyataan dari semua kondisi input dan output dari fungsi testingnya. Untuk menulis beberapa behavior dengan benar. Meskipun kita dapat menampilkan aplikasi dan koneksi dari ujung ke ujung, kita tidak dapat mengetes semua tipe testing. Itulah mengapa harus berfokus pada scenario yang dibuat. 
