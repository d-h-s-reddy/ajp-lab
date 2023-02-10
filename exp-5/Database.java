import java.sql.*;
import java.util.*;
public class Database{
    public static void main(String[] args)throws Exception{
        //first establish the connection by placing the connection is equal to null
        Connection con=null;
        Scanner sc=new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/students","root","");
            System.out.println("Xampp server is running");
            Statement st=con.createStatement();
            System.out.println("Enter the number the operation that is need to do:\n 1)Create a table 2)inseert the values 3)retreving the values");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter the name of the table:");
                    String tname=sc.next();
                    int val=st.executeUpdate("Create table "+tname+"(id integer,name char(10),result integer)");
                    if(val<=0){
                        System.out.println("table created");
                    }
                    else{
                        System.out.println("The table is not crerated");
                    }
                    break;
                case 2:
                    //inserting the data into the database
                    System.out.println("Enter the no of tuples to be entered:");
                    int no=sc.nextInt();
                    for(int i=0;i<no;i++){
                        System.out.println("Enter the values to be inserted in the order id,name,result");
                        int stid=sc.nextInt();
                        String stname=sc.next();
                        int stresult=sc.nextInt();
                        st.executeUpdate("insert into student values("+stid+",'"+stname+"','"+stresult+"')");
                    }
                    break;
                case 3:
                    //extracting the results from the database
                    System.out.println("The results of the students are:");
                    System.out.println("Enter the elements that are needed to extract");
                    String variable=sc.next();
                    ResultSet rs = st.executeQuery("Select result from "+variable);
                    while(rs.next()){
                        System.out.println(rs.getInt("result"));
                    }
                    break;
        }
        con.close();
    }
        catch(Exception e){
            System.out.println(e);
        }   
    }
}