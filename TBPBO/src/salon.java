import java.sql.*;

//interface

public interface salon {
    void idLayanan() throws SQLException;

    void jenisLayanan() throws SQLException;

    void namaPelanggan() throws SQLException;

    void jenisPelanggan() throws SQLException;

    void harga() throws SQLException;

    void hargaTotal() throws SQLException;
}
