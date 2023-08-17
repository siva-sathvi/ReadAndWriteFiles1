package com.text.Exception;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputWriter {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./sample.txt");
		if(file.exists())
			file.delete();
			file.createNewFile();
			String s="hello";
			FileOutputStream fos=new FileOutputStream(file);
			for(char ch:s.toCharArray()) {
				fos.write(ch);
			}
			//fos.write(75);
			fos.close();
	}

}
