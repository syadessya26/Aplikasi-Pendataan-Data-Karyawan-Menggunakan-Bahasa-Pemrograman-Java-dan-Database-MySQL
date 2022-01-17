# CRUD-Java-by-Dessya_C_E_18083000158
                                                        UAS Pemograman Java

Nama : Dessya Christianita Effendi

NIM : 18083000158

Kelas : 7F

Pada CRUD ini mengenai data-data karyawan yang menggunakan pemograman java GUI dan penggunaan MYSQL sebagai databasenya.
Berikut gambaran aplikasi CRUD

![Gambar Aplikasi Karyawan](https://user-images.githubusercontent.com/81345337/149688146-9ba5511c-f542-4af1-a0f0-5a199a7eca9b.jpg)

catatan : sebelum run project ini pastikan konfig sesuai dengan database yang telah dibuat atau tuliskan dpada konfig seperti code dibawah ini.

    
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
