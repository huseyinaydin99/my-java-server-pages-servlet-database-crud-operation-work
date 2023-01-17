package tr.com.huseyinaydin.dao;

import java.util.List;

import tr.com.huseyinaydin.model.Employee;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Java Server Pages
 * 
 */

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	boolean save(Employee employee);
	
	boolean delete(int id);
	
	boolean update(Employee employee);
}
