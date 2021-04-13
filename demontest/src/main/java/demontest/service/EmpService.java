
package demontest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demontest.Repository.EmpRepository;
import demontest.entity.Employee;

import java.util.List;


@Service
public class EmpService {
	
@Autowired
EmpRepository empRepository;

 public static List<Employee> getAll(){
		return EmpRepository.getAll();
	}

public static String add(Employee emp) {
	// TODO Auto-generated method stub
	return EmpRepository.add(emp);
}

public static String edit(Employee emp) {
	// TODO Auto-generated method stub
	return EmpRepository.edit(emp);
}

public static String delete(int empNo) {
	// TODO Auto-generated method stub
	return EmpRepository.delete(empNo);
}

}
