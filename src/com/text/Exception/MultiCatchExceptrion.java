package com.text.Exception;



public class MultiCatchExceptrion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int arr[]= {1,2};
		System.out.println(arr[2]/0);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e1) {
			e1.printStackTrace();//multiple exception in a single block
			System.out.println("common output");
	}
	}}
