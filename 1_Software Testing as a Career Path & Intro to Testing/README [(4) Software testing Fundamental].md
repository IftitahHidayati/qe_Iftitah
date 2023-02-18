# (4) Software testing Fundamental
### Nama 		: Iftitah Hidayati
### Program	: QE (Quality Engineer) - Alterra 
### Kelas		: A
### Batch 		: 4
___
## **Definisi software testing**
Merupakan proses menganalisis item perangkat lunak untuk mendeteksi perbedaan kondisi skrng dengan yg dibutuhkan. Untuk mengevaluasi fitur item perangkat lunak.
___
## **Seberapa penting software testing**
Software testing sangat penting karena selain menghemat uang kita, menjamin dan kualitas dan kenyamanan pengguna. Bug software sangat berbahaya karena menyebabkan krisis moneter dan manusia. 
___
## **Platform testing**
* **API** adalah sekumpulan definisi dan protocol untuk membangun dan mengintergrasikan aplikasi software singkatnya API adalah mengembangan dari inovasi software yang memungkinkan berbagai aplikasi tertukar data dan fungsionalitas dengan mudah dan aman. 
* **Website** adalah sebuah kumpulan halaman yang berisi informasi tertentu dan dapat diakses oleh banyak orang melalui internet. Website dapat dibuka dengan menuliskan URL atau alamat website di browser
* **Mobile**, dimana dalam software testing dibagi menjadi 2 yaitu android dan iOS
* **Desktop**, terdapat aplikasi seperti code editor, video player, dan sebagainya.
___
## **Tipe dari software testing**
1. **Fungsional testing**
* <sub>Adalah jenis pengujian yang memverifikasi bahwa setiap fungsi aplikasi telah beroperasi sesuai dengan requirement specification
* **Manual Testing**
* <sub>**Manual testing** atau pengujian manual adalah Langkah untuk mencari cacat atau bug pada program perangkat lunak. Pada metode ini, tester atau penguji memiliki peran penting sebagai pengguna terakhir untuk pengecekan semua fitur aplikasi bekerja dengan benar. Penguji melakukan pengujian tanpa menggunakan bantuan tools atau script. Tujuannya adalah untuk memastikan jika aplikasi yang diuji bebas cacat dan aplikasi perangkat lunak dapat bekerja sesuai yang diharapkan
* **Automate**
* <sub>**Automation testing** merupakan sebuah metode pengujian software yang menggunakan suatu software testing dengan tujuan untuk membandingkan antara output yang diprediksikan dengan output yang dihasilkan oleh sistem
* **Perbedaan Manual dan Automate**
1. Manual
* Software tester yang akan menjalankan test case tersebut	
* Test cycle-nya lebih lambat daripada yang automate
* Manual dapat membantu dalam memberikan opini maupun input mengenai tampilan UI
2. Automate
* Software tester membuat script atau code untuk test case tersebut lalu dijalankan melalui automation tools.
* Test cycle lebih cepat
* Terbatas 
* **Etc.**
* <sub>**Contoh : pintu yang otomatis membuka scra otomatis**

2. **Non-Fungsional testing**
* <sub>Adalah pengujian dari aspek non-fungsional suatu aplikasi seperti kinerja, keandalan, kegunaan, keamanan, dan sebagainya. Non-fungsional testing dilakukan setelah fungsional testing dilakukan. Dengan menerapkan non-fungsional testing kita dapat meningkatkan kualitas perangkat lunak hingga tingkat yang sangat tinggi. Sebenarnya fungsional testing juga meningkatkan kualitas, tapi dengan non-fungsional testing kita mempunyai peluang untuk menjadikan perangkat lunak tersebut lebih baik.
Salah satu contoh non-fungsional testing adalah performance testing.
* **Performance testing**
* <sub>Performance testing merupakan jenis pengujian perangkat lunak yang bertujuan memastikan aplikasi bekerja dengan baik dibawah beban kinerja yang diharapkan.
Beberapa concern yang dihadapkan performance testing seperti :
•	Speed yakni menentukan kecepatan respon suatu aplikasi .
•	Scability menentukan maksimum userload yang dapat dihandle oleh aplikasi.
•	Stability menentuka  kestabilan dalam jenis jumlah userload.
Hasil dari performance testing inilah yang bisa sebagai pedoman bagian mana yang harus ditingkatkan 
* **Etc.**

3. **Maintenance**
* <sub>Dilakukan setelah semua aplikasi atau perangkat lunak dirilis ke konsumen atau user, dimana maintenance testing diperlukan untuk mempertahankan atau meningkatkan karakteristik, kualitas non-fungsional dari komponen atau sistem selama masa pakainya. Terutama efisiensi kerja, kompetibilitas, keandalan, keamanan, dan portabilitas
Contoh : regression testing
* **Regression**
* <sub>Setiap kali ada fungsionalitas baru, ditambahkan atau fungsionalitas lama dihapus dalam aplikasi jadi harus dilakukan regression testing agar tidak ada bug baru.
* **Etc.**
___
## **Level testing**
1. **Unit testing**
* <sub>Merupakan sebuah pengujian perangkat lunak yang menguji setiap unit atau komponen dari sebuah perangkat lunak, dilakukan saat masa development dari sebuah perangkat lunak oleh developer.
Komponen unit testing yang diuji yaitu unit-unit dari software, seperti function, method, prosedur, modul, maupun objek. 
Tujuan => memvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yang diharapkan.
Tool untuk unit testing => J unit, N unit, J mokit, Emma, PHP Unit, etc.
2.	**Integration testing**
* <sub>Merupakan pengujian dari hasil penggabungan unit-unit yang ada di dalam perangkat lunak. Biasanya diuji bagaimana unit-unit tersebut bekerja sebagai suatu kombinasi bukan lagi sebagai unit yang individual.
Integration testing biasanya dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika terjadi kesalahan error atau bug.
**Tujuan :**
*	Memeriksa sebuah aplikasi atau software bekerja dan berfungsi dengan baik.
* Memriksa kinerja dari aplikasi dan software
* Mengetes  struktur program yang sudah dirancang
3.	**System testing**
* <sub>Merupakan testing yang dilakukan pada satu keseluruhan sistem yang dilakukan tidak lain adalah end to end testing untuk memverifikasi semua scenario berjalan dengan baik.
Cakupan testing akan mengetes aspek-aspek fungsional dan non-fungsional dari sebuah perangkat lunak
4.	**Acception testing**
* <sub>Digunakan untuk menentukan apakah sistem yang didevelop telah memenuhi kebutuhan pengguna. Dalam beberapa project, acceptance testing dilakukan pada tahap terakhir proses pengujian yaitu sebelum sistem diserahkan kepada pengguna. Acceptance testing biasanya dilakukan setelah beberapa rangkaian testing seperti unit testing, integration testing, system testing selesai.
Tujuan => apakah aplikasi yang selesai dibuat sudah sesuai dengan proses bisnis dan kebutuhan atau tidak

