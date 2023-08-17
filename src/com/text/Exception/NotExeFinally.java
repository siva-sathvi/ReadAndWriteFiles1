package com.text.Exception;

public class NotExeFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.exit(0);
		try{
			int arr[]= {1,2};
			System.out.println(arr[2]);
			
			}
			catch(ArrayIndexOutOfBoundsException  e1) {
				e1.printStackTrace();//multiple exception in a single block
				System.out.println("common output");
		}finally {
			System.out.println("finally");
		}
	}

}
