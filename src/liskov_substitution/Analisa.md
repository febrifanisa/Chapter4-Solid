Analisa:
1. Shape
   - Mendefinisikan kontrak untuk menghitung luas area dari berbagai bentuk (shape). Interface ini memastikan bahwa setiap bentuk harus mengimplementasikan metode calculateArea. 
   - Mewakili bentuk persegi panjang (rectangle) dan menghitung luasnya. Kelas ini mengimplementasikan interface Shape dan menyediakan metode calculateArea yang mengembalikan hasil perkalian lebar dan tinggi. 
   - Mewakili bentuk lingkaran (circle) dan menghitung luasnya. Kelas ini mengimplementasikan interface Shape dan menyediakan metode calculateArea yang mengembalikan hasil perkalian pi dengan kuadrat jari-jari. 
   - Menghitung luas area dari objek Shape apa pun. Kelas ini menggunakan polimorfisme untuk memanggil metode calculateArea yang sesuai berdasarkan jenis bentuk yang diterima sebagai parameter.


2. Main.java 
   - Menginisialisasi objek Rectangle dan Circle, serta menggunakan AreaCalculator untuk menghitung dan menampilkan luas dari masing-masing bentuk. Kelas ini menunjukkan bagaimana prinsip OCP diterapkan dalam kode.
