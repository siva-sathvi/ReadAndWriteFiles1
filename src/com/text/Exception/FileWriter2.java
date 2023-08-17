package com.text.Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./sample.txt");
		if(file.exists())
			file.delete();
			file.createNewFile();


FileWriter fw=new FileWriter(file);
String s="hello lakshmi";
fw.write(s);
fw.close();}

}
