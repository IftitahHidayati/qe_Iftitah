# (14) BDD (Behavior Driven Development)
### Nama 		: Iftitah Hidayati
### Program	    : QE (Quality Engineer) - Alterra 
### Kelas		: A
### Batch 		: 4
___
## **Apa itu BDD?**
___
    TDD (Test Driven Development) merupakan proses software development yang menerapkan penulisan test case sebelum developer menuliskan production code nya. Proses BDD sendiri berfokus pada penulisan komponen-komponen dan test case ditulis dalam Bahasa pemrograman. 
<p>     Serupa dengan TDD, Behavior Driven Development (BDD) juga menerapkan test first namun dengan konsep yang berbeda. Dalam BDD test, tim developer akan menuliskan berbagai scenario yang menjelaskan behavior sistem dari perspektif pengguna. Scenario dituliskan dengan menggunakan format Bahasa yang mudah dipahami oleh seluruh stackholder dalam pengembangan sistem. 
BDD memiliki tujuan utama dalam komunikasi dan kolaborasi dari seluruh stackholder tim bisnis dan teknikal yang terlibat dalam pengembangan sistem. Hal ini dapat membantu memastikan bahwa fitur-fitur dalam sistem dapat dipahami dengan baik oleh seluruh anggota tim. Komunikasi yang baik dapat menyatukan stackholder yang berbeda beda dalam pemahaman dan ekspektasi yang sama serta fitur-fitur dalam sistem dapat memenuhi kebutuhan pengguna dan menghasilkan bisnis. </p>

<p>     Prinsip dasar BDD adalah mendeskripsikan behavior dalam sistem tanpa melibatkan penjelasan implementasinya secara rinci. Terdapat pemisahan antar keduanya. Dalam pendekatan BDD seluruh stackholder teknikal maupun non teknikal saling berkolaborasi untuk mendeskripsikan kebutuhan pengguna dan kebutuhan fungsional sistem yang dituliskan melalui feature file. Deskripsi yang ada dalam features file berperan sebagai test holder yang kemudian menjadi dasar quality assurance. Dalam menuliskan test script dalam pengujian dan dasar bagi developer dalam membangun test codenya pada sebuah sistem. 
Features file dalam BDD dituliskan menggunakan Bahasa Gherkin. Dengan format berbahasa inggris yang mudah dipahami oleh siapapun terlepas dari apapun knowledge yang dimiliki dengan demikian non-teknikal stackholder dapat memahami test logic tanpa perlu memahami implementasi menggunakan code pemrograman yang lebih kompleks. Begitu pula sebaliknya teknikal developer turut memahami aspek bisnis dari sistem yang mereka implementasikan secara mendasar terdapat 3 tahapan untuk melakukan test dalam BDD. 

1.	**Menentukan User Story**
Untuk menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan 
2.	**Menuliskan scenario dalam features file** menggunakan Gherkin sintaks berdasarkan user storiesnya. Menentukan test case dalam step file berdasarkan scenario. As a [X]  want [Y] So that [Z]
3.	**Menuliskan skenario pada features file**. Dari 1 atau lebih untuk menjelaskan apa saja yang dilakukan untuk menentukan arsitek tertentu.
4.	**Terdapat beberapa scenario utama dalam BDD :**
-	**Given**, menjelaskan konteks dari scenario
-	**When** menjelaskan tindakan yang dilakukan oleh user 
-	**Then** menjelaskan yang akan dilakukan oleh user.

___
## **Apa itu Cucumber?**
___
    Untuk melakukan serangkaian behavior test ada yang Namanya cucumber. Cucumber adalah sebuah tools yang mendukung sebuah BDD. Cucumber membaca semacam ketentuan yang dieksekusi dimana menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakukan apa yang dituliskan dalam ketentuan tersebut yang mana terdiri dari beberapa scenario. 
