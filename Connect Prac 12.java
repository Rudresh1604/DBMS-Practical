package session;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");//Instantiation of the driver

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe",
                    "xe", "SYSTEM123"); //creation of statement for execution
            Statement st = con.createStatement(); //opening the connection with db

            // create table
            ResultSet rs = st.executeQuery("create table conndemo(name varchar(25), roll int,marks int)");
            ResultSet rs1 = st.executeQuery("insert into conndemo values('lmn',2,21)"); //inserted to table
            ResultSet rs2 = st.executeQuery("insert into conndemo values('abc',3,25)");
            ResultSet rs3 = st.executeQuery("insert into conndemo values('xyz',4,22)");
            ResultSet rs4 = st.executeQuery("insert into conndemo values('def',5,27)");
            ResultSet rs5 = st.executeQuery("select * from conndemo"); //fetching data
            System.out.println("executed successfully");
            while (rs5.next()) {
                System.out.println(rs5.getString("name") + " " + rs5.getInt("roll") + " " +
                        rs5.getInt(3));
            }

            int rs6 = st.executeUpdate("update studjdbcdemo set name='tina' where roll=3");
            ResultSet rs7 = st.executeQuery("drop table studjdbcdemo"); //Deleting the database table view
            ResultSet rs8 = st.executeQuery("create view viewJDBCNamee as select name from  studjdbcdemo"); //creating view
                    ResultSet rs9 = st.executeQuery("select * from viewJDBCNamee");
            while (rs9.next()) {
                System.out.println("" + rs9.getString(1));
            }

            ResultSet rs10 = st.executeQuery("alter table studjdbcdemo add admissionDate Date");
//alter table structure

            ResultSet rs11 = st.executeQuery("alter table studjdbcdemo drop column admis￾sionDate");

            // rs.close();
            st.close();
            con.close();

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}