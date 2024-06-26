Analisa :
1. Switchable.java 
   - Interface switchhable mendefinisikan kontrak untuk perangkat yang dapat dihidupkan dan dimatikan. Interface ini membuat modul tingkat tinggi (dalam hal ini Switch) bergantung pada abstraksi. 
   - Kelas LightBuld mewakili bohlam lampu yang dapat dihidupkan dan dimatikan. Kelas ini mengimplementasikan interface Switchable dan menyediakan implementasi spesifik dari metode turnOn dan turnOff. 
   - Kelas switch mewakili saklar yang dapat menghidupkan atau mematikan perangkat Switchable. Kelas ini bergantung pada abstraksi Switchable daripada implementasi konkret, sehingga mematuhi prinsip DIP.


2. Main.java
   - Menginisialisasi objek LightBulb dan Switch, kemudian memanggil metode flip pada Switch untuk menghidupkan dan mematikan bohlam lampu. Ini menunjukkan bagaimana Switch bergantung pada abstraksi Switchable dan tidak pada implementasi konkret LightBulb.
