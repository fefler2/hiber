import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
    // DB Connection variables

    static Connection connection = null;
    static String dataBaseName = ""; // nazwa bazy danych
    //
    //    czy bez "/" na koncu static String url = "jdbc:mysql://localhost"
    static String url = "jdbc:mysql://localhost/studentdatabase"; // nazwa bazy danych, a nie tabeli!

//     static String url = "jdbc:mysql://localhost:3306/fussa?useLegacyDatetimeCode=false&serverTimezone=UTC\n" +dataBaseName;
    static String username = "root";
    static String password  = ""; // bez hasla?, chyba jest dobrze
//    static String password  = ""; // bez hasla?




    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url, username, password);

        String sql;
//        PreparedStatement ps = connection.prepareStatement("select * from student");
//        System.out.println(ps.toString());
        // studentdatabase
//        PreparedStatement ps = connection.prepareStatement("insert into student (studentID) values (7);");
        PreparedStatement sel = connection.prepareStatement("select * from student");
//        INSERT INTO 'studendatabase', 'student' ('name') VALUES ('michael clark');
//        int status = ps.executeUpdate();
        System.out.println(sel.executeQuery().getMetaData().getColumnCount());
        System.out.println(sel);

//        if (status != 0) {
//            System.out.println("Database was Connection");
//            System.out.println("Record was inserted");
//        }

    }
}
