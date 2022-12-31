import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws Exception {

        String judul = "Program Buku";

        System.out.println("===================================");

        // String

        System.out.println(judul.toUpperCase());
        System.out.println("===================================");

        pelanggan salon = new pelanggan();
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        int pilih;
        int a = 0;

        // Date

        Date datenow = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("E, dd/MM/yyyy");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss zzz");

        String url = "jdbc:mysql://localhost:3306/dbsalon";
        try {
            System.out.println("Tanggal\t: " + tgl.format(datenow));
            System.out.println("Waktu\t: " + time.format(datenow));
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
            System.out.println("DATABASE TERHUBUNG!");

            while (menu) {
                System.out.println("");
                System.out.println("PROGRAM CRUD BUKU");

                // CRUD

                System.out.println("1. Create Data Layanan");
                System.out.println("2. Cek Data Layanan");
                System.out.println("3. Update Data Layanan");
                System.out.println("4. Delete Data Layanan");
                System.out.println("5. Exit Program");
                System.out.println("");
                System.out.println("Masukkan Pilihan: ");
                pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        salon.idLayanan();
                        salon.jenisLayanan();
                        salon.harga();
                        salon.InsertDbLayanan();
                        break;

                    case 2:
                        salon.tampilData1();
                        break;

                    case 3:
                        salon.tampilData1();
                        salon.updateData();
                        break;

                    case 4:
                        salon.tampilData1();
                        salon.deleteData();
                        break;

                    case 5:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Inputkan Data dengan Benar!");
                        break;

                }
            }
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver Error");
            System.exit(0);
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal");
        }

    }
}
