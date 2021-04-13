package demontest.Controller;

//import org.springframework.web.bind.annotation.RestController;

import demontest.service.EmpService;

import java.awt.List;
import demontest.entity.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/emp")

public class GreetController {
	
	@Autowired
	EmpService EmpService;
	
	@GetMapping("/get/all")
	public java.util.List<Employee> getAll(){
		return demontest.service.EmpService.getAll();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Employee emp){
		return demontest.service.EmpService.add(emp);
	}
	
	@PutMapping("/edit")
	public String edit(@RequestBody Employee emp){
		return demontest.service.EmpService.edit(emp);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int empNo){
		return demontest.service.EmpService.delete(empNo);
	}
	
}
