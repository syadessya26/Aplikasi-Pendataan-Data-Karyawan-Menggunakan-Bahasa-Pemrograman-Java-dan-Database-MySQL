# [Project Kuliah] Aplikasi Pendataan Data Karyawan Menggunakan Bahasa Pemrograman Java dan Database MySQL

Aplikasi ini merupakan aplikasi crud yang digunakan untuk mendata data-data karyawan serta aplikasi sebagai syarat penyelesaian mata kuliah Pemrograman Java. Dalam pembuatan aplikasi ini menggunakan bahasa pemrograman java GUI dan penggunaan MySQL sebagai databasenya.

Berikut tampilan dari aplikasi CRUD :

![Gambar Aplikasi Karyawan](https://user-images.githubusercontent.com/81345337/149688146-9ba5511c-f542-4af1-a0f0-5a199a7eca9b.jpg)

# Catatan

Sebelum melakukan run project pastikan config sesuai dengan database yang telah dibuat atau tuliskan pada config seperti code dibawah ini.

    
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
           String url = "jdbc:mysql://localhost:3306/cruduas" ;
           String user = "root";
           String pass = "";
           
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           MySQLConfig = DriverManager.getConnection(url,user,pass);
           
        }catch(SQLException e){
            System.out.println("Koneksi ke Database Gagal" + e.getMessage());
        }
        
        return MySQLConfig;
    }
