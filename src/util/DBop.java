package util;
import java.sql.*;

public class DBop {
    //private  static String drive="org.gjt.mm.mysql.Driver";
    private static String url="jdbc:mysql://localhost:3306/webtest";
    private static String name="root";
    private static String password="songhuiqiao428";
    private static Connection connect=null;
    private static ResultSet resultset=null;
    private static PreparedStatement ppstmt=null;
    private static Statement stmt=null;
    public static void init() throws SQLException,ClassNotFoundException{
        try{
            //Class.forName(drive);
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("load drive success");
            connect=DriverManager.getConnection(url,name,password);
            System.out.println("create connect success");
        }catch(Exception e){
            System.out.println("failed to initialize MySQL");
            e.printStackTrace();
        }
    }
    public static int mysqlUpdate(String sql){
        int i=0;
        try{
            ppstmt=connect.prepareStatement(sql);
            int flag =ppstmt.executeUpdate();
            if(flag>0){
                i++;
            }
        }catch(SQLException e){
            System.out.println("failed to update MySQL");
            e.printStackTrace();
        }
        return i;
    }
    public static ResultSet mysqlquery(String sql){
        ResultSet resultset=null;
        try{
            ppstmt=connect.prepareStatement(sql);
            resultset=ppstmt.executeQuery();

        }catch(Exception e){
            System.out.println("failed to query MySQL");
            e.printStackTrace();
        }
        return resultset;
    }
    public static void connectClose() {
        try {
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            System.out.println("failed to clase connection");
        }
    }
}
