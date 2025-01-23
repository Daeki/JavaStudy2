package com.winter.app.ztest;

import java.util.List;

import com.winter.app.users.UserDAO;
import com.winter.app.users.UserDTO;

public class UserDAOTest {
	
	private UserDAO userDAO;
	
	public UserDAOTest() {
		//생성자???
		this.userDAO = new UserDAO();
	}
	
	public void getDetailTest()throws Exception{
		UserDTO userDTO = new UserDTO();
		userDTO.setUserName("testuser123");
		userDTO = userDAO.getDetail(userDTO);
		
		if(userDTO != null) {
			System.out.println("Null이 아니다");
		}else {
			System.out.println("Null이다");
		}
		
	}
	
	public void getListTest()throws Exception{
		List<UserDTO> ar = userDAO.getList();
		
		if(ar.size()>0) {
			System.out.println("Test 성공");
		}else {
			System.out.println("Test 실패");
		}
		
	}
	
	
	public void joinTest()throws Exception{
		UserDTO userDTO = new UserDTO();
		userDTO.setUserName("testuser2");
		userDTO.setPassword("testpassword");
		userDTO.setName("test");
		userDTO.setPhone("010-1234-5678");
		userDTO.setEmail("test@naver.com");
		
		
		int result = userDAO.join(userDTO);
		
		if(result==1) {
			System.out.println("테스트 통과");
		}else{
			System.out.println("테스트 실패");
		}
		
	}

}
