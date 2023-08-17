package com.text.Exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./sample.txt");
		//if(file.exists())
			//file.delete();
			//file.createNewFile();
		
		String existingText=new String();
		FileReader f=new FileReader(file);
		BufferedReader br=new BufferedReader(f);
		String line=new String();
		while((line=br.readLine()) !=null) {
		existingText+= line+"\n";}
		
		
		
		String s="i am lakshmi";
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		bw.write(existingText+s);
		bw.close();
		br.close();
		
	}

	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
