package com.text.Exception;



public class UserDefined {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
try{
			
			System.out.println(1/0);
			
			}catch(ArithmeticException e) {
				
				throw new LoginException("login is failed");
			}
	}
	}


