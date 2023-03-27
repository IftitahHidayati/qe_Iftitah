# (12) RESTful API TESTING - RESUME
### Nama 		: Iftitah Hidayati
### Program	    : QE (Quality Engineer) - Alterra 
### Kelas		: A
### Batch 		: 4
___
## **BASIC OF API TESTING**
___

### **API and REST API**
-	**API atau Application Programming Interface** merupakan suatu penghubung yang memungkinkan suatu aplikasi untuk berinteraksi dengan aplikasi lainnya dan berbagi data. Tujuan penggunaan API adalah mempercepat menggunaan development dengan menyediakan function secara terpisah sehingga developer tidak perlu membuat fitur yang serupa. API berperan sebagai pembawa pesan yang menerima permintaan dari pengguna dan memberitahu sistem apa yang harus dilakukan dan memberikan response yang sesuai untuk permintaan tersebut. 
API Workflow 
Client -> (request) ->API -> (request) -> System / Server
Client <- (response) <-API <- (response) <- System / Server
___
-	**REST API**
REST (Representational State Transfer) merupakan arsitektur dasar komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web. Umumnya menggunakan HTTP sebagai protokol untuk komunikasi data. Rest juga merupakan bentuk implementasi dari web service sebagai standart yang digunakan dalam pertukaran data baik aplikasi maupun sistem. Rest API berisi aturan atau Batasan yang dapat membatasi programmer untuk mengakses atau tindakan-tindakan tertentu pada sebuah database. Jika API sebagai penghubung maka REST ini yang membuat aturan sesuai keinginan programmer dalam rancang web service. Data yang digunakan dalam REST API umumnya berupa json.
___
-	**HTTP METHOD**
HTTP dirancang untuk komunikasi antara client dan server, berfungsi sebagai protocol response dan dari permintaan client dan server 
**Ada 4 yaitu :**
1.	**GET :** Membaca data
2.	**PUT :** Membuat / mengganti
3.	**POST :** Membuat data baru
4.	**DELETE :** Menghapus data yang ada
___
-	**REST API Component**
1.	**Method**, seperti get, post, put dan delete
2.	**URL (Base URL + Path)** adalah car akita mendapatkan request untuk menuju ke server yang akan kita lakukan.
3.	**Header**, kumpulan field dan value yang terkait pemberian informasi atau pesan ke penerima juga berisi autentikasi yang memberitahukan bahwa pesan tersebut sah.
4.	**Body**, mendefinisikan apa yang dikirim ke server, ini menentukan informasi dibuat, diupdate atau dihapus.
___
-	**JSON (JavaScript Object Notation)**
Merupakan sebuah format data yang digunakan untuk pertukaran dan penyimanan data. JSON merupakan bagian dari JavaScript. 
___
-	**HTTP Response Code**
1.	200 : ok atau berhasil (OK)
2.	201 : membuat (post atau put) (Created)
3.	400 : datanya tidak sesuai ataupun salah dalam format (Bad Request)
4.	404 : biasanya response tidak ditemukan (Not Found)
5.	401 : karena tidak melakukan autentikasi terlebih dahulu sebelum melakukan request (Unauthorized)
6.	405 : HTTP request method yg digunakan tidak support atau salah HTTP methodnya.
7.	500 : error ini karena ada kesalahan di server 
-	**Tools yang familiar di dunia testing yaitu postman.**
___
### **Testing API**
API testing merupakan testing yang dilakukan pada layer dimana API yang didesain untuk berinteraksi pada aplikasi dipastikan fungtional tesnya melalui rangkaian atau  set dari tes. Diharapkan API testing memberikan gambaran bagaimana respone dari aplikasi web tanpa ataupun sebelum GUI nya siap. API testing memiliki tujuan yakni meluaskan cakupan testing itu sendiri dan melakukan testing sedini mungkin dimana GUI masih belum sepenuhnya siap untuk diikutsertakan dalam testing.

-	**API testing dibagi menjadi 3 macam yaitu :**
1.	**Functionality :** tes ini ditujukan untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum.
2.	**Load test :** memiliki tujuan untuk menguji kekuatan load sistem. Apakah mampu mengelola data dari beban yang diberikan.
3.	**Security :** memiliki tujuan untuk menguji keamanan dari suatu load sistem. 
___
-	**API Testing Tools :**
1.	Postman 
2.	Apache JMeter
3.	Frisby.js
4.	REST-assured
___
-	**Perbedaan antara API Test dan Unit Test**

•	**Unit Test**
1.	Dilakukan oleh Developer
2.	Fungsi-fungsi terpisah
3.	Developer bisa mengakses source code
4.	Hanya dasar functionality yang di test
5.	Scopenya terbatas
6.	Biasanya 

•	**API Test**
1.	Tester perform it
2.	End to End
3.	Tidak bisa mengakses source code
4.	Hanya fungsi API saja
5.	Semua functional issue
6.	Scopenya lebih luas
7.	Dilakukan setelah build.
___
-	**API testing Process**
1.	**Specification review**, untuk meriew spesifikasi dari API dan domain.
2.	**Spesification development**, untuk memastikan detail dokumen dari tes condution.
3.	**Framework Development**, harus memiliki tools apa dalam API testing nanti
4.	**Test Case Development**, pada tahap ini kita akan membuat test scenario maupun test casenya 
5.	**Execution & Report**, mengeksekusi test yang sudah dibuat, lalu membuat report untuk hasil testing yang sudah dilakukan
___
-	**Contoh Test Cases dalam API Testing**
1.	Mendapatkan balikan atau response yang sesuai dengan inputan
2.	Apakah memberikan balikan atau tidak
3.	Apakah menggangu fitur yang lain atau tidak
4.	Update struktur data
5.	Memodifikasi data yang ada
___
-	**Best Practices of API Testing**
1.	Kelompokkan test case kedalam beberapa kategori
2.	Beri judul yang sesuai pada setiap test.
3.	Harus berhati-hari Ketika melakukan test yang berhubungan dengan menghapus sesuatu
4.	Ketika membuat test case harus dipikirkan juga segala kombinasi input pada API
___
-	**Types of Output of an API**
1.	Bisa berbentuk apa saja, tapi pada umumnya JSON atau XML
2.	Status balikan (response) apakah passed atau failed
3.	Memanggil fungsi API lain.
___
-	**Common Types of Test in API Testing**
1.	Memverifikasi apakah kita mendapat respon dari API
2.	Memverifikasi apakah hasil input / request sudah sesuai apa belum
3.	Memverifikasi apakah data yang kita input / update sudah benar-benar berubah atau bertambah
4.	Memverifikasi waktu response yang diberikan.
___
-	**Type of Bugs that API Testing Detects**
1.	Gagal melakukan error handling pada keadaan tertentu
2.	Kesulitasn untuk tersambung dan mendapat respon API
3.	Isu keamanan
4.	Performance issue
5.	Error atau warning yang tidak tepat
6.	Struktur dari data respone yang tidak benar (JSON & XML)
___
### **Advantages and Challenge**
-	**Advantages atau manfaat API Testing :**
1.	Efisiensi waktu
2.	Bahasa yang independent
3.	Mengurangi biaya testing
4.	Mengurangi resiko

-	**Challenge atau tantangan API Testing :**
1.	Kombinasi parameter, pemilihan parameter
2.	Tidak ada GUI (Graphical User Interface)
3.	Kita harus mengetahui terlebih dahulu parameter
4.	Perlu juga mengetest error handling dari setiap API
___
## **KESIMPULAN**
API terdiri dari kumpulan class atau function atau procedures yang mana merepresentasikan bisnis logic. Jika API tidak dites sebaik mungkin itu akan menyebabkan masalah pada API bahkan juga pada aplikasinya. API testing ini sangat diperlukan oleh software engineer. 
