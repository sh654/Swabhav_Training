package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fileInputStream= new FileInputStream("D:\\Swabhav_Training\\06_stream_app\\src\\com\\techlabs\\test\\test1.txt");
		int ch;
		while((ch=fileInputStream.read()) !=-1) {
			System.out.print((char) ch);
		}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		 catch(IOException e) {
			 e.printStackTrace();
		 }
	}

}
