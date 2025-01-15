package com.winter.app.employees;

import java.util.List;
import java.util.Scanner;

public class EmployeeService {
	
	//의존성(Defendency)
	private EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		//의존성 주입(Defendency Injection: DI)
		employeeDAO = new EmployeeDAO();
	}
	
	//list
	public List<EmployeeDTO> getList(Scanner sc)throws Exception{
		System.out.println("검색어 입력");
		String search = sc.next();
		
		List<EmployeeDTO> ar = employeeDAO.getList(search);
		return ar;
	}

}
