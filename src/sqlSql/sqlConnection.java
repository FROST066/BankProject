package sqlSql;

import java.sql.*;
import javax.swing.*;

public class sqlConnection {

    Connection conn = null;

    public static Connection dbConnector() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.db");
            //JOptionPane.showMessageDialog(null,"Connection Successed");
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
