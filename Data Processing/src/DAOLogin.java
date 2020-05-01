import javax.swing.*;
import java.sql.*;

public class DAOLogin {
    Connection koneksi;
    Statement statement;
    ResultSet resultSet;

    public DAOLogin() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/praktikumpbo";
            koneksi = DriverManager.getConnection(url, "root", "");
            statement = koneksi.createStatement();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class Not found : " + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception : " + ex);
        }
    }

    public void login(ModelLogin modelLogin) {
        try {
            String query = "SELECT * FROM tb_users WHERE username = '" + modelLogin.getUsername() + "' " + "AND password = '" + modelLogin.getPassword() + "'";
            resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                if (modelLogin.getUsername().equals(resultSet.getString("username")) && modelLogin.getPassword().equals(resultSet.getString("password"))) {
                    MVC mvc = new MVC();
                    JOptionPane.showMessageDialog(null, "Login Berhasil");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password Salah");
            }
        } catch (Exception sql) {
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}
