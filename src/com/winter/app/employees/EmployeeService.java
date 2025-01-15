package com.winter.app.employees;

import java.util.List;

public class EmployeeService {
	
	//의존성(Defendency)
	private EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		//의존성 주입(Defendency Injection: DI)
		employeeDAO = new EmployeeDAO();
	}
	
	//list
	public List<EmployeeDTO> getList()throws Exception{
		List<EmployeeDTO> ar = employeeDAO.getList();
		return ar;
	}

}
