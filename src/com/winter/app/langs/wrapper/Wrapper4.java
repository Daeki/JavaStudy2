package com.winter.app.langs.wrapper;

public class Wrapper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10진수
		int num=8;
		
		//2진수
		String str = Integer.toBinaryString(num);
		
		System.out.println(str);
		
		//16진수
		str = Integer.toHexString(num);
		System.out.println(str);
		
		//8진수
		str = Integer.toOctalString(num);
		System.out.println(str);

	}

}