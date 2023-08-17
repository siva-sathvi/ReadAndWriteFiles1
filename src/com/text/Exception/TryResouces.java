package com.text.Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryResouces {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		try(
				FileReader f=new FileReader(file);
BufferedReader br=new BufferedReader(f);//try resources:what class impliment the auto closable interfacethat class instance can pass the try block parameterthis proccss is
				){//advantage :no memory leakage
String line=new String();
while((line=br.readLine()) !=null) {
System.out.println(line);
	}

}}}
