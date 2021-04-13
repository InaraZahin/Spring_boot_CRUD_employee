package demontest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demontest.Repository.EmpRepository;
import demontest.entity.Employee;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	
	@Autowired
	 EmpRepository empRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
	}
	
	@Override
	public void run(String...args ) throws Exception{
		Employee e1 = new Employee(1, "Inara Zahin", "Mirpur");
		Employee e2 = new Employee(2, "Alice", "England");
		
		empRepository.employee.addAll(Arrays.asList(e1,e2));
		
	}

}
