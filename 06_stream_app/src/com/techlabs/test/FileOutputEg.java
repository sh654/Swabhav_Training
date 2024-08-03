package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fileInputStream= new FileInputStream("D:\\Swabhav_Training\\06_stream_app\\src\\com\\techlabs\\test\\test1.txt");
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\Swabhav_Training\\06_stream_app\\src\\com\\techlabs\\test\\test2.txt");
			int ch;
			while((ch=fileInputStream.read()) !=-1) {
//				System.out.print((char) ch);
				fileOutputStream.write(ch);
			}
			System.out.println("file Copied Successfully");
			} catch (FileNotFoundException e){
				e.printStackTrace();
			}
			 catch(IOException e) {
				 e.printStackTrace();
		}
	}

}
