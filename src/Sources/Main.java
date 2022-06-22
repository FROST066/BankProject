package Sources;

import GUI.connexionPage;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main {
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException, SQLException {
   UIManager.setLookAndFeel(new NimbusLookAndFeel());
        connexionPage main=new connexionPage();
        
    }
    
}
