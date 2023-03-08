package HotelSys;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Hotels {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=HotelDBMS;" +
                "encrypt=true;" +
                "trustServerCertificate=true";
        String user = "sa";
        String pass = "root";
//Scanner scanner = new Scanner(System.in);
//System.out.println("enter name");
//        String name = scanner.next();
//System.out.println("enter roll no");
//Integer roll = scanner.nextInt();
//System.out.println("enter class");
//        String cls = scanner.next();
 Connection con = null;
        try {
Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
DriverManager.registerDriver(driver);
            con = DriverManager.getConnection(url, user, pass);
 Statement st = con.createStatement();
            String sql = 
            		
            		"CREATE TABLE Hotels (\r\n" 
            		+ "id Integer Primary Key, \r\n"
            		+ "hotel_name TEXT not null,\r\n"
            		+ "hotel_location TEXT,\r\n"
            		+ "hotel_created_date Date not null,\r\n"
            		+ "hotel_updated_date Date,\r\n"
            		+ "is_Active BIT not null\r\n"
            		+");\r\n"
            		
            		+ "CREATE TABLE Room_Type (\r\n"
            		+ "RoomT_id Integer Primary Key, \r\n"
            		+ "room_type_name TEXT not null,\r\n"
            		+ "created_date Date,\r\n"
            		+ "updated_date Date,\r\n"
            		+ "is_Active BIT not null\r\n"
            		+");\r\n"
            		
            		+"CREATE TABLE Rooms (\r\n" 
            		+ "Room_id Integer Primary Key,\r\n"
            		+ "room_type_id INTEGER REFERENCES Room_Type(id),\r\n"
            		+ "hotel_id INTEGER REFERENCES Hotels(id),\r\n"
            		+ "Room_created_date Date not null,\r\n"
            		+ "Room_updated_date Date,\r\n"
            		+ "Room_is_Active BIT not null\r\n "
            		+");\r\n"
            		
            		+"CREATE TABLE Guests (\r\n"
            		+"Guest_id Integer Primary Key,\r\n"
            		+ "guest_name TEXT not null,\r\n"
            		+ "guest_phone TEXT not null,\r\n"
            		+ "guest_accompanying_members int not null,\r\n"
            		+ "guest_payment_amount integer not null,\r\n"
            		+ "room_id INTEGER REFERENCES Rooms(id),\r\n"
            		+ "hotel_id INTEGER REFERENCES Hotels(id),\r\n"
            		+ "guest_created_date Date not null,\r\n"
            		+ "guest_updated_date Date,\r\n"
            		+ "guest_hotel_is_Active BIT not null\r\n"
            		+");\r\n"
            	
            		+"CREATE TABLE Employee_Type (\r\n"
            		+ "EmployeeT_id Integer Primary Key,\r\n"
            		+ "employee_type_name TEXT not null,\r\n"
            		+ "empT_created_date Date not null,\r\n"
            		+ "empT_updated_date Date,\r\n"
            		+ "empT_is_Active BIT not null\r\n"
            		+");\r\n"
            	
            		+"CREATE TABLE Employees (\r\n"
            		+"Employee_id Integer Primary Key,\r\n"
            		+"employee_name TEXT not null,\r\n"
            		+"employee_phone TEXT not null,\r\n"
            		+ "employee_type_id INTEGER REFERENCES Employee_Type(id),\r\n"
            		+ "room_id INTEGER REFERENCES Rooms(id),\r\n"
            		+ "Employee_created_date Date not null,\r\n"
            		+ "Employee_updated_date Date,\r\n"
            		+ "Employee_is_Active BIT not null\r\n"
            		+");";
            		
            		          		
//            ResultSet resultSet = st.executeQuery(sql);
            
//            ResultSet rs = st.executeQuerysql();
            


        System.out.println("____ first Table___");
        System.out.println("Enter hotel id");
        int id=sc.nextInt();
        System.out.println("Enter Hotel Name: ");
        String hotel_name = sc.next();
        System.out.println("Enter Hotel Location: ");
        String hotel_location = sc.next(); 
        System.out.println("Enter creaed data: ");
        String hotel_created_data = sc.next();
        System.out.println("Enter update data: ");
        String hotel_updated_date = sc.next();
        System.out.println("Enter is Active");
        boolean hotel_is_Active = sc.nextBoolean();
        
//        System.out.println("___second Table___");
//        System.out.println("Enter room type id: ");
//        int RoomT_id = sc.nextInt();
//        System.out.println("Enter Room Type: ");
//        String room_type_name = sc.next();
//        System.out.println("Enter creaed data: ");
//        String created_data = sc.next();
//        System.out.println("Enter update data: ");
//        String updated_date = sc.next();
//        System.out.println("Enter room type is Active True\\False");
//        boolean is_Active = sc.nextBoolean();
//        
//        System.out.println("___third Table___");
//        System.out.println("Enter Room id: ");
//        int Room_id = sc.nextInt();
//        System.out.println("Enter room type id ");
//        int room_type_id= sc.nextInt();
//        System.out.println("Enter hotel id");
//        int hotel_id = sc.nextInt();
//        System.out.println("Enter room created date ");
//        String Room_created_date=sc.next();
//        System.out.println("Enter room updated date ");
//        String Room_updated_date=sc.next();
//        System.out.println("Enter room is Active True\\False");
//        boolean room_is_Active = sc.nextBoolean();
//        
//        System.out.println("___4th Table___");
//        System.out.println("Enter guest id");
//        int Guest_id = sc.nextInt();
//        System.out.println("Enter guset name");
//        String guest_name=sc.next();
//        System.out.println("Enter guset phone");
//        String guest_phone=sc.next();
//        System.out.println("Enter guest accompanying members");
//        int guest_accompanying_members=sc.nextInt();
//        System.out.println("Enter guest payment amount");
//        int guest_payment_amount = sc.nextInt();
//        System.out.println("Enter guset created date");
//        String guest_created_date=sc.next();
//        System.out.println("Enter guest updated date");
//        String guest_updated_date=sc.next();
//        System.out.println("Enter guest hotel is_Active True\\False");
//        boolean guest_hotel_is_Active=sc.nextBoolean();
//        
//        System.out.println("___5th Table___");
//        System.out.println("Enter Employee type id");
//        int EmployeeT_id=sc.nextInt();
//        System.out.println("Enter employee name");
//        String employee_type_name=sc.next();
//        System.out.println("Enter employee created date");
//        String empT_created_date=sc.next();
//        System.out.println("Enter employee update date");
//        String empT_updated_date=sc.next();
//        System.out.println("Enter employee is active True\\False");
//        boolean empT_is_Active=sc.nextBoolean();
//        
//        System.out.println("___6th Table___");
//        System.out.println("Enter Employee id");
//        int Employee_id=sc.nextInt();
//        System.out.println("Enter Employee name");
//        String employee_name=sc.next();
//        System.out.println("Enter employee name");
//        String employee_phone=sc.next();
//        System.out.println("Enter employee type id");
//        int employee_type_id=sc.nextInt();
//        System.out.println("Enter room id ");
//        int room_id=sc.nextInt();
//        System.out.println("Enter employee created date");
//        String Employee_created_date=sc.next();
//        System.out.println("Enter employee update date");
//        String Employee_updated_date=sc.next();
//        System.out.println("Enter employee is active True\\False");
//        boolean Employee_is_Active=sc.nextBoolean();
//        
        
        

        
       
        
        for  (int i=0; i<10001; i++) {
        	System.out.println(hotel_name+i);
            String sql1 = "insert into Hotels values("+id+i+",'"+hotel_name+i+"','"+hotel_location+"','"+hotel_created_data+"','"
                    +hotel_updated_date+"','"+hotel_is_Active+"')";
            st.execute(sql1);
        } 
        
        

        
        
       // Integer m = st.executeUpdate(sql);
//        if (m >= 1) {
//System.out.println("inserted successfully : " + sql);
//} else {
//System.out.println("insertion failed");
//}
//        String sql2 = "Select * from Table_1";
//ResultSet resultSet = st.executeQuery(sql2);
//         while (resultSet.next()) {
//System.out.println(resultSet.getString("name"));
//System.out.println(resultSet.getString("roll"));
//System.out.println(resultSet.getString("cls"));
//}
      
        
        con.close();
} catch (Exception ex) {
System.err.println(ex);
}
}
}
