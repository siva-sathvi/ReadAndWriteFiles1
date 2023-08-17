package com.text.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputReader {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();

		FileInputStream fis=new FileInputStream(file);
		int asciiCode;
		String text=" ";
		while((asciiCode = fis.read()) != -1) {
			text +=String.valueOf((char)asciiCode);
		System.out.println((char)asciiCode);
		}
		System.out.println(text);
		fis.close();
	}

}
