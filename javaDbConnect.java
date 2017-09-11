import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class javaDbConnect 
{
    private static Connection connection = null;
    public static Connection dbConnect() throws Exception
    {
        try{
               Class.forName("org.sqlite.JDBC"); 
               connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Pathak\\Desktop\\council gathering catalog\\council gathering catalog.sqlite");
               return connection;          
            }  
               catch (ClassNotFoundException e)
               {
                JOptionPane.showMessageDialog(null,e);
                return null;
               }
    }
    
}
