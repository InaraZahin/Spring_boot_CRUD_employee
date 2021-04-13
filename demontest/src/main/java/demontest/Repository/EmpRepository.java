package demontest.Repository;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import demontest.entity.Employee;

@Repository
public class EmpRepository {
	public static ArrayList<Employee> employee = new ArrayList<Employee>();

	public static java.util.List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employee;
	}

	public static String add(Employee emp) {
		
		employee.add(emp);
		return "Successfully added";
	}

	
	public static String edit(Employee emp) {
		// TODO Auto-generated method stub
		employee.stream().filter(e->e.getEmployeeId()== emp.getEmployeeId()).forEach(e->{
			e.setAddress(emp.getAddress());
			e.setName(emp.getName());
		});
		
		return "Successfully Updated";
		
	}

	public static String delete(int empNo) {
		// TODO Auto-generated method stub
		employee.remove(empNo-1);
		return "Deleted Successfully";
	}

}
