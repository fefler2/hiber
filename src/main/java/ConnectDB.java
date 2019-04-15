import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
    // DB Connection variables

    static Connection connection = null;
    static String dataBaseName = "";
    //
    //    czy bez "/" na koncu static String url = "jdbc:mysql://localhost"
    static String url = "jdbc:mysql://localhost/" +dataBaseName;

//     static String url = "jdbc:mysql://localhost:3306/fussa?useLegacyDatetimeCode=false&serverTimezone=UTC\n" +dataBaseName;
    static String username = "root";
    static String password  = ""; // bez hasla?, chyba jest dobrze
//    static String password  = ""; // bez hasla?




    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url, username, password);

        String sql;
        PreparedStatement ps = connection.prepareStatement("select * from student212dfs");
        System.out.println(ps.toString());
//        PreparedStatement ps = connection.prepareStatement("INSERT INTO 'studentdatabase', 'student' ('name') VALUES ('michael clark');");
        int status = ps.getResultSetType();
//        int status = ps.executeUpdate();
//        if (status != 0) {
//            System.out.println("Database was Connection");
//            System.out.println("Record was inserted");
//        }

    }
}
