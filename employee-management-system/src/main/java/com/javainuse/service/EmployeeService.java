package com.javainuse.service;

import java.util.List;
import com.javainuse.dao.EmployeeDAO;
import com.javainuse.domain.Employee;

public class EmployeeService {
    //insert dependency using new keyword
    //EmployeeDAO empDAO = new EmployeeDAO(); 
	EmployeeDAO empDAO;



    
    public EmployeeService(EmployeeDAO empDAO) {
		super();
		this.empDAO = empDAO;
	}

    public EmployeeService() {    	
    }

	public void addNewEmployee(Employee emp) {
        empDAO.addNewEmployee(emp);
    }

    public List<Employee> getEmployees() {
        return empDAO.getAllEmployees();
    }
    
    
//    public void setEmpDAO(EmployeeDAO empDAO) {
//    	this.empDAO = empDAO;
//    }
}