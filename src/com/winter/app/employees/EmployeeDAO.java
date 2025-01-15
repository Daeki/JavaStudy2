package com.winter.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class EmployeeDAO {
	
	
	public List<EmployeeDTO> getList()throws Exception{
		List<EmployeeDTO> ar = new ArrayList<>();
		
		//1.DB연결
		Connection con = DBConnection.getConnection();
		
		//2. SQL문 생성
		String sql ="SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID FROM EMPLOYEES";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		
		//5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeeDTO.setLast_name(rs.getString("LAST_NAME"));
			employeeDTO.setJob_id(rs.getString("JOB_ID"));
			ar.add(employeeDTO);
		}
		
		return ar;
	}

}
