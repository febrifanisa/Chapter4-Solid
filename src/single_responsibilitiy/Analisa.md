Analisa:
1. Author.java
   - Menyimpan data tentang seorang penulis (author). Kelas ini hanya memiliki atribut authorId dan name beserta getter dan setter untuk mengakses dan memodifikasinya.
   

2. AuthorRepo.java 
   - Mendefinisikan kontrak untuk operasi yang bisa dilakukan pada objek Author. Terdapat dua metode: checkAuthorId untuk memeriksa keberadaan penulis berdasarkan ID, dan save untuk menyimpan objek Author.	
   

3. AuthorService.java 
   - Menyediakan layanan untuk objek Author. Method saveIfNotExist memastikan bahwa penulis dengan authorId tertentu sudah ada, jika tidak, maka akan membuat dan menyimpan penulis baru dengan nama "unknown".
   

4. Book.java
   - Menyimpan data tentang buku. Kelas ini memiliki atribut authorId, name, dan publisher beserta getter dan setter untuk mengakses dan memodifikasinya.


5. BookRepo.java
   - Mendefinisikan kontrak untuk operasi yang bisa dilakukan pada objek Book. Terdapat dua metode: save untuk menyimpan objek Book, dan findByAuthorIdAndBookName untuk mencari buku berdasarkan authorId dan bookName.


6. BookService.java
   - Menyediakan layanan untuk objek Book. Method saveBook mengelola penyimpanan buku, memvalidasi keberadaan buku, dan memastikan penulis sudah ada sebelum menyimpan buku. Juga mengelola nilai default untuk penerbit jika tidak disediakan.


7. InMemoryAuthorRepo.java
   - Implementasi in-memory dari AuthorRepo. Menyimpan penulis dalam memori menggunakan HashMap.
   

8. InMemoryBookRepo.java 
   - Implementasi in-memory dari BookRepo. Menyimpan buku dalam memori menggunakan HashMap.
 
  
9. Main.java
   - Menginisialisasi repositori dan layanan, serta mengelola penyimpanan dan pengambilan data buku dan penulis. Menunjukkan bagaimana layanan ini dapat digunakan dalam sebuah aplikasi.
