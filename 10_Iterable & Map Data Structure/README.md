# (10) Iterable and Map Data Structure - RESUME
### Nama 		: Iftitah Hidayati
### Program	    : QE (Quality Engineer) - Alterra 
### Kelas		: A
### Batch 		: 4
___
## **ITERABLE**
___
Iterable merupakan sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan kepadanya. Interface Itarable menjadi tertinggi dalam struktur. Seluruh interface dalam struktur hierarki interface dapat dilakukan perulangan masing-masing data yang disimpan. **Berikut ini interface pada iterable yaitu :**
1.	Set, untuk implementasi terdapat HashSet untuk Hash Table, TreeSet untuk Tree dan LikendHashSet untuk Hash table dan linked.
2.	List, untuk implementasi terdapat ArrayList pada Resizable array, dan LinkedList
3.	Deque, untuk implementasi terdapat ArrayDeque pada Resizable array, dan LinkedList

Method pada Itarable : 
1.	**forEach**, perulangan dengan pemanggilan pada array list.
2.	**iterator**, merupakan class yang me-manage class dari sebuah iterable. Iterator ini mengelola pada bagian mana kita melakukan itarasi pada iterable dan mengetahui data apa yang berikutnya dapat diambil dan bagaimana mengambilnya. 
3.	**Spliterator**
___
**Collections**

Collections merupakan sekumpulan dari objek data yang diletakkan dalam satu tempat yang sama, atau dikenal collection of object.
Collection merupakan turunan dari interface iterable. Lalu masih banyak lagi interface yang menjadi turunan dari Collection ini. Terdapat banyak method yang secara garis besar merupakan method penambahan, pengubahan, pengahapusan dari data yang tersedia, dan method untuk melihat ukuran dari collection. 
___
**List**

List merupakan sebuah interface yang menyediakan cara untuk menyimpan data secara linier. List ini merupakan turunan dari interface collection, kemudian list juga dapat menerima nilai yang sama. Jika kita menginputkan nilai yang sama maka dalam list itu dapat dilakukan. Urutan dalam list berdasarkan kapan data itu dimasukkan. Jadi data pertama yang dimasukkan maka berada diurutan pertama. Lalu data berikutnya menyusul. Pada dasarnya method-method pada list digunakan untuk memanagement data yang terdapat pada list seperti menambah, menghapus, mengecek dan mencocokkan apakah sama dengan list lainnya. Kemudian method-method lainnya yang terdapat dalam sebuah collection. 

*Java List terdapat beberapa implementasi*
1.	**Abstract collection**
2.	**ArrayList**, menyediakan penyimpanan data yang dinamis, artinya tidak terikat dengan kapasitas data yang disimpan dalam arraylist tersebut. Jadi data ynag disimpan dapat sebanyak apapun selama memori komputer masih sanggup. 
**Cara kerja Array List :**
- Step 1 : merupakan pembuatan array list yang datanya masih kosong
- Step 2 : setelah menambahkan data-data pada element maka array akan terisi.
- Step 3 : ketika data sudah penuh, lalu kita tetap memaksa data pada arraylist maka
- Step 4 :  arraylist akan membuat array baru dan memindahkan seluruh data pada array tersebut.
- Step 5 : dilakukan hal yang sama dengan step 4 jika arraylist sudah penuh.

3.	LinkedList, merupakan struktur data yang menyimpan setiap elementnya dapat terhubung satu sama lain. Cara menghubungkan satu element dengan elemnt lainnya adalah dengan menyimpan alamat memori dalam element baik element setelah atau sebeumnya. Jadi dalam tiap element pada linkedlist akan menyimpan alamat memory sebelumnya. Lalu element sebelumnya akan menyimpan elemnt dari sebelumnya lagi. 

**Perbedaan antara ArrayList dan LinkedList**
-	Jika pada arraylist kita bisa melihat seperti ruang kosong kemudian diisi data.
-	Sedangkan linkedlist bentuknya seperti gerbong kereta api. Dalam tiap element menyimpan data selain itu juga menyimpan alamat data yang berikutnya, maka dapat terhubung antara element 1 dan element lainnya.  
Jika dilihat dari time complexity perbedaan antara arraylist dan linkedlist maka 
-	Pada arraylist untuk akses element terdapat O(1) yang artinya konstan dan di linkedlist mendapatkan O(n) yang artinya untuk mengambil element linkedlist memiliki kemungkinan untuk memerlukan waktu yang lebih lama. 
-	Saat menghapus atau menambahakan data bagian awal, arraylist bisa lebih lama daripada linkedlist
-	Untuk menambah atau menghapus pada bagian akhir disini arraylist dan linkedlist memiliki time complexity yang sama. 
-	Untuk menambah dan menghapus pada bagian tengah, arraylist dan linkedlist juga memiliki time complexity yang sama.

4.	**Immutable List**, merupakan bagian dari list tetapi immutable list tidak dapat diubah datanya. 
5.	**Stack**, menyimpan data secara linear tetapi dalam proses pengambilan datanya itu menggunakan LIFO (Last In Fisrt Out), ibarat tumpukan buka, jika ingin mengambil data atau buku maka kita mengambilnya dari tumpukan paling akhir. Method dalam stack yaitu pop(mengambil), push(menambah) dan juga peek (mengintip).
___
**Set**

Set merupakan struktur data yang dapat menyimpan sekumpulan data secara linier sama seperti list, tetapi set tidak dapat menerima data yang duplikat. Pada hierarki terdapat abstrack collection kemudian abstrack set dan implementasinya terdapat enumSet. HashSet. TreeSet, dan Linked HashSet. 
1.	Hash Set, secara garis besar method-method yang terdapat pada hashset dapat dilakukan untuk mengelola seluruh data atau element yang terdapat dalam hashSet. Bagian yang menarik dalam hast set adalah dapat dikatakan sebagai struktur data yang dapat dilakukan pencarian data secara cepat.
2.	Link HashSet, menyimpan insertion order artinya data yang diinput lebih dulu maka akan terdapat pada urutan paling depan. 
3.	SortedSet, dapat digunakan untuk mengurutkan set data yang tersedia. Terdapat beberapa method sortedSet, salah satunya yaitu terdapat headSet dan TailSet yang artinya kita dapat melihat data yang terdapat pada kepala ataupun ekor dari set. Implementasi sorted set yaitu navigable set dan tree set. Namun pada navigatable set ini berupa interface sehingga implementasi yang bisa digunakan adalah treeSet. 
___
**Queue**

Queue mengimplementasi First In First Out (FIFO) yang artinya data yang lebih dulu dimasukkan akan lebih dulu diambil, dan bisa diibaratkan seperti antrian. Untuk mengambil data pada queue disini kita menggunakan dequeue yang mana akan mengambil data yang paling depan dari sebuah queue. Untuk menambahkan data dapat menggunakan enqueue yang mana akan menambahkan data dari belakang. Pada implementasi Queue terdapat implementasi priorityQueue dan Deque yang mana Deque terdapat ArrayDeque dan LinkedList. 
___
**Dequeue**

Dequeue atau double-ended queue ini merupakan sebuah queue tetapi memiliki 2 ujung, seperti yang terdapat pada method untuk menambah dapat menggunakan method addFirst atau addLast artinya kita dapat menambah dari dari depan atau belakang, kemudian ada GetFirst dan GetLast yang artinya kita dapat mengambil dari depan atau belakang.

___
## **MAP**
___
Map merupakan struktur data yang ada di java yang dapat digunakan untuk menyimpan banyak data didalamnya. Data-data yang ada didalam map diindentifikasi dengan menggunakan Key dan setiap Key memiliki datanya sendiri yang disebut value. Dengan begitu map dapat disebut sebagai penyimpanan data berbasis Key value. Pada dasarnya method-method yang ada didalam Map dapat menggunakan untuk menambah, menghapus, mengubah dan memeriksa isi dari map. 
Bentuk implementasi Map yaitu 
1.	**HashMap**, merupakan implementasi hashmap yang menggunakan algoritma struktur data hashtable.
2.	**WeakHashMap**, masih menggunakan HashTable tapi bedanya pada bagian WeakHashMap Key itu dapat dihilangkan jika sudah tidak digunakan.
3.	**IdentityHashMap**, masih menggunakan HashTable tapi jika Key memiliki referensi memori yang berbeda maka akan dianggap sebagai kode yang berbeda. 
4.	**LinkedHashMap**, tidak ada perbedaan yang signifikan dengan HashMap tetapi secara internal, LinkedHashMap menerapkan double LinkedList dan juga HashTable sebagai struktur data di dalam map nya. 
5.	**EnumHashMap**, artinya map dalam bentuk ini tidak dapat diubah atau ditambah isinya. 
___
**SortedMap**

SortedMap artinya dapat diurutkan baik secara ascending dan descending. Masing-masing sorted ini memiliki caranya sendiri-sendiri dalam melakukan sorting. Pada dasarnya sorted map terdapat method yang digunakan untuk mengurutkan Key yang ada di map tersebut, selain itu method lainnya digunakan untuk mendapatkan Key berdasarkan sorted yang diinginkan bisa pertama atau terakhir. 
___
**Navigable Map**

Navigable Map masih termasuk sorted map tetapi dengan method-method dengan anvigasi yang lebih lengkap, mulai dari Key yang lebih rendah sampai Key yang lebih tinggi, Key paling awal dan key paling akhir.
