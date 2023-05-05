# (17) Web UI Testing - RESUME
### Nama 		: Iftitah Hidayati
### Program	    : QE (Quality Engineer) - Alterra 
### Kelas		: A
### Batch 		: 4
___
## **Introduction Serenity BDD**
___
    Web automation testing adalah suatu cara yang digunakan untuk melakukan testing pada web yang dibuat. Web testing ini dikerjakan unit terpisah dengan developer, jadi QA tidak berganting pada deskop yang dikerjakan oleh developer. Ada beberapa tools yang digunakan dalam automation testing :
1.	**Katalon :** tools yang selalu digunakan dalam berbagai pengetesan baik dari mobile app, browser deskop. Memainkan secara otomatis untuk test case nya. Katalon bisa digunakan oleh pemula atau yang sudah lama di QA. Pada katalon kita dapat menangkap objek atau element seperti button, element filetext, radiobutton, select, dll. Kita dapat manambahkan script untuk melakukan pengecekan lebih lanjut. 
2.	**Cypress :** merupakan free test yang dapat digunakan pada CI dan dapat digunakan pada operating system pada mac, linux dan windows. Saat ini cypress hanya bisa dilakukan untuk web testing saja. Support dengan semua Bahasa pemrograman baik itu javascript, rubbi, note, C++, dan dapat melakukan pada semua konteks browser.
3.	**Robot Framework :** yaitu Bahasa programming menggunakan python, merupakan salah satu selenium yang dapat dicombine dengan custom function yang dibuat dengan Bahasa python. Merupakan open source yang digunakan dalam otomation seperti web dan mobile. Digunakan secara luas untuk ETDD.
4.	**Test project :** merupkan end to end testing yang kepopulerannya dapat disejajarkan dengan katalon. Jadi selain bisa otomation testing pada website, test project juga dapat dilakukan untuk otomation mobile testing layaknya katalon. Kemudahan penggunaannya sama dengan katalon.
5.	**Serenity BDD** merupakan opensorce yang membantu QA dalam menggunakan step to step dalam menulis automation exception test yang terstruktur, terawat dengan baik dan menghasilkan pelaporan pengujian yang kaya makna. Biasanya dikenal dengan leving documentation yang tidak hanya melaporkan hasil pengujian tetapi juga melaporankan fitur apa yang telah diuji. 
-	**Arsitektur Serenity BDD**
Serenity adalah open source BDD framework, arsitektur terdiri dari requirements, tests, steps, pages and report.
-	**Define Requirement**
Ketika kita ingin melakukan web otomation, kita harus mendefine requirementnya terlebih dahulu, seperti kita harus membuat storiesnya seperti apa. Search by keyword : feature.
-	**Automate Acceptance Criteria**
Setelah mendeskripsikan acceptance criteria ke high-level setelah itu kita record dan kita ubah feature-feature kedalam scenario.feature.
-	**Implement the Test**
Setelah kita buat storinya kita akan melakukan step by stepnya.
-	**Report on Test Result**
Setelah di run maka akan muncul report atau hasil dari testnya. 

___
## **BDD Fremework with cucumber**
___
Karena menggunakan Bahasa java untuk base languagenya, jadi akan menggunakan JBehave dalam menggunakan BDD yang mana sudah integrate sama serenity. Jbehave sendiri adalah framework untuk BDD, ditulis dalam Bahasa java dan memiliki beberapa kelebihan. BDD sendiri merupakan pengembangan dari TDD (Test Driven Development) sayangnya framework ini hanya tersedia dalam Bahasa java. 
___
## **Secara singkat ada 5 langkah yang dilakukan untuk implementasi Jbehave :**
___
1.	**Write Story :** menulis scenario dalam plan text untuk mempermudah QA PE untuk menulis scenario. Scenario yang ditulis QE, Bahasa yang digunakan adalah Gherkin dalam Jbehave  (Given; inisialisasi kondisi, When; aksi yang akan dilakukan, Then; digunakan untuk validasi)
2.	**Configure stories :** pada tahap ini QA akan menentukan story mana yang akan digunakan dan dijalankan, dan juga format output yang digunakan jika hanya menggunakan Jbehave. Sekali dijalankan dapat mengoverite story pad dari class configuration yang dibuat.
3.	**Browser interaction :** map story dengan java code. Map step to browser manipulation. Mapping yaitu melakukan story yang dibuat dengan logic otomation yang menggunakan Bahasa java. Menariknya di framework jbehave terdapat dipedensi injecsi tersendiri.
4.	**Run stories :** menjalankan storynya bisa menggunakan Junit atau intellijIDEA, atau Maven. Menggunakna intellij untuk standar IDE yang digunakan sebagai runnernya. 
5.	View report : memunculkan standar dalam JBehave. 

