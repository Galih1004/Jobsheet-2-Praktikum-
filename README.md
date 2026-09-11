Ambil kesimpulan tentang kegunaan dari kata kunci return, kapan suatu method 
harus memiliki kata kunci return? 

Kesimpulan kegunaan return:

Mengirim nilai hasil pemrosesan ke luar method 
— return dipakai kalau method tersebut menghasilkan sebuah nilai yang dibutuhkan lagi di luar method itu, misalnya untuk disimpan ke variabel atau dipakai method lain.
Menentukan tipe kembalian method 
— method yang punya return nilai; harus dideklarasikan dengan tipe data sesuai nilai yang dikembalikan (int, String, boolean, objek, dll), bukan void.
Menghentikan eksekusi method 
— begitu return diexecute, method langsung berhenti, meski masih ada baris kode setelahnya.

Kapan suatu method harus memiliki return:

Jika tipe kembalian method bukan void. Contoh: getMerk(), getSuhu() di class AC 
— method ini dideklarasikan mengembalikan String/int, jadi wajib ada return di setiap jalur eksekusi (kalau tidak, program tidak akan bisa dikompilasi).

Jika hasil dari method itu masih akan dipakai/diolah lebih lanjut di luar method, misalnya nilai yang mau ditampilkan, dihitung ulang, atau disimpan.

Kapan method tidak perlu return (cukup void):

Kalau tugas method itu hanya melakukan aksi
— seperti mencetak ke layar (System.out.println) atau mengubah state objek lewat setter — dan tidak ada nilai yang perlu "dikirim balik" untuk dipakai lagi.