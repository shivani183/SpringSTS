package in.krishna.dao;

import java.sql.SQLException;
import java.util.List;

import in.krishna.model.Employee;

public interface IEmployee {
	
	public List<Employee> getAllDetail() throws SQLException;

}
