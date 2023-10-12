package in.krishna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.krishna.model.Employee;

@Component
public class EmployeeImp implements IEmployee {
	
	String SQL_STATE="select eid,ename, eaddr, eage from employee";
	
	@Autowired
	private DataSource dataSource;

	@Override
	public List<Employee> getAllDetail() throws SQLException {
		
		List<Employee> emplist=null;
		System.out.println(dataSource.getClass().getName());
		try (Connection con = dataSource.getConnection(); 
				PreparedStatement ps=con.prepareStatement(SQL_STATE);
				ResultSet rs=ps.executeQuery()) {
			
			emplist= new ArrayList<Employee>();
			
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEid(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setEaddr(rs.getString(3));
				emp.setEage(rs.getInt(4));
				
				emplist.add(emp);
			}		
		};
		return emplist;

	}

}
