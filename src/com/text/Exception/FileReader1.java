package com.text.Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileReader1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();


FileReader f=new FileReader(file);
int asciiCode;
String text=new String();
while((asciiCode = f.read()) != -1) {
	text +=String.valueOf((char)asciiCode);
//System.out.print((char)asciiCode);
}
System.out.print(text);
f.close();
	}

}
