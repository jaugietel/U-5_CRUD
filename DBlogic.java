import java.sql.*;

public class DBlogic {

    String DB = "jdbc:mysql://localhost:3306/2811";
    String USER = "root";
    String PASS = "Umberts21";

    //insert
    public void insert() {
        try {
            //conn
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO users (name) VALUE ('Linda')";

            stmt.executeUpdate(sql);

            System.out.println("Dati ievadīti!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        }
    //update
    public void update() {
        try {
            //conn
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "UPDATE users SET name = 'Edgars' WHERE id = 2";

            stmt.executeUpdate(sql);

            System.out.println("Dati atjaunoti!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    //delete
    public void delete() {
        try {
            //conn
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "DELETE FROM users WHERE id = 3";

            stmt.executeUpdate(sql);

            System.out.println("Dati dzēsti!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    //read
    public void read() {
        try {
            //conn
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "SELECT name FROM users WHERE id = 1";

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    }

