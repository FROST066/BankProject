package sqlSql;
import java.awt.GridLayout;
import java.sql.*;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class SqlTable extends JTable
{
 
private Connection conn;

    public SqlTable(Connection conn,String query) throws SQLException {
        this.conn = conn;
        setEnabled(false);
        
        setLayout(new GridLayout());
        setAutoCreateColumnsFromModel(true);
        setAutoCreateRowSorter(true);
        setBounds(0, 0, 200, 100);
        
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rst = ps.executeQuery();
        setModel(DbUtils.resultSetToTableModel(rst));

    }

    public void setQuery(String query) throws SQLException{
    PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rst = ps.executeQuery();
        setModel(DbUtils.resultSetToTableModel(rst));
    }
}
