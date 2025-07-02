package Form;

import Koneksi.DatabaseConnection;
import helper.PasswordUtil;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserDAO {
    private final Connection connection;
    
    public UserDAO() {
        connection = DatabaseConnection.getConnection();
    }
    
public User login(String username, String password) {
    String sql = "SELECT * FROM user WHERE username = ?";
    User user = null;

    try {
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, username.trim());

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            String dbPassword = rs.getString("password");
            String inputHashed = PasswordUtil.hashPassword(password.trim());

            if (inputHashed.equals(dbPassword)) {
                user = new User();
                user.setIdUser(rs.getString("id_user"));
                user.setUsername(rs.getString("username"));
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return user;
}
}