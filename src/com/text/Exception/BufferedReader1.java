package com.text.Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		FileReader f=new FileReader(file);
BufferedReader br=new BufferedReader(f);
String line=new String();
while((line=br.readLine()) !=null) {
System.out.println(line);}
br.close();
f.close();
	}

}                     
