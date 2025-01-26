import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/db_inventaris"; // Ganti 'inventaris' dengan nama database Anda
    private static final String USER = "root"; // Username default XAMPP
    private static final String PASSWORD = ""; // Password default XAMPP kosong

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
