Analisa:
1. Workable.java 
    - Interface Workable mendefinisikan kontrak untuk bekerja. Setiap kelas yang mengimplementasikan antarmuka ini harus menyediakan implementasi dari metode work. 
    - Interface eatable mendefinisikan kontrak untuk makan. Setiap kelas yang mengimplementasikan antarmuka ini harus menyediakan implementasi dari metode eat. 
    - Kelas Developer mengimplementasikan kedua antarmuka Workable dan Eatable serta menyediakan implementasi dari metode work dan eat. 
    - Kelas robot mewakili sebuah robot yang hanya bisa bekerja. Kelas ini hanya mengimplementasikan antarmuka Workable dan menyediakan implementasi dari metode work


2. Main.java 
    - Menginisialisasi objek Developer dan Robot, serta memanggil metode work dan eat yang sesuai. Ini menunjukkan bagaimana kita bisa menggunakan antarmuka Workable dan Eatable dengan objek yang sesuai.
