# Intent
# Halaman Awal
![WhatsApp Image 2021-02-10 at 07 44 38 (1)](https://user-images.githubusercontent.com/54672937/107448434-40a70c80-6b74-11eb-9e32-bfadc753ce31.jpeg)
# Send Data
![WhatsApp Image 2021-02-10 at 07 44 38](https://user-images.githubusercontent.com/54672937/107448443-44d32a00-6b74-11eb-94d7-1dd241359387.jpeg)
# Penjelasan
Intent juga merupakan suatu objek yang terdapat dalam suatu activity dimana objek tersebut dapat komunikasi dengan activity yang lain, baik activity pada fungsi internal android misal seperti memanggil activity dalam satu package atau beda package yang masih berada dalam satu project.Intent merupakan objek tipe android.content.Intent. Melalui metode startActivity() yang digunakan untuk memulai sebuah activity lain.
Intent sendiri terdiri dari 2 jenis yaitu 
1. Intent eksplisit
berfungsi untuk mengaktifkan komponen-komponen dalam satu aplikasi yang sama. Misalnya seperti : Berpindah Activity.
2. Intent Implisit
berfungsi untuk memanggil fungsi activity yang sudah ada di fungsi internal android seperti Dial Number, Open Browser dan lainnya.
# Method onCreate dan onPause
1. Metode onCreate
merupakan metode yang dibuat pada suatu activity yang berfungdi untuk wadah/tempat melakukan inisiasi seperti create view, list data, dan
lain-lain. Method onCreate() selalu diikuti oleh onStart()
2. Metode onPause
Ketika sebuah activity lainnya dipanggil atau dimulai, Y onResume()
method ini digunakan ketika data tidak harus disimpan or onStop()
kedalam system secara permanen, method ini diikuti
onResume() atau onStop()
# Fungsi Intent
1. Intent berfungsi untuk berpindah halaman dari satu Activity ke Activity lainnya
2. Untuk mengakses fitur/activity yang terdapat pada perangkat yang digunakan seperti telepon, kamera, email
