package in.krishna;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


	public class App {
		public static void main(String[] args) throws Exception {
			
			
			String url="jdbc:mysql://localhost:3306/school";
			String username="root";
			String password="Shivani123";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("connection obj is created "+connection);
			
			Statement statement=connection.createStatement() ;
			System.out.println("Statement obj is created "+statement);
			
			String sqlQuery="select * from student";
			ResultSet resultSet = statement.executeQuery(sqlQuery);

			System.out.println("ResultSet obj is created "+resultSet);
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt(1);
				String name= resultSet.getString(2);
				Integer age= resultSet.getInt(3);
				String addr= resultSet.getString(4);
				
				System.out.println(id +"\t" + name + "\t" +age+ "\t" +addr);	
			}
			connection.close();
					
		}

	}


