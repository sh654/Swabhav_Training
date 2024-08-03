package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReadingEg1 {
public static void main(String args[] ){
	
	try {
	FileInputStream fileInputStream = new FileInputStream("D:\\Swabhav_Training\\06_stream_app\\src\\com\\techlabs\\test\\Untitled 2"); 
	
	int ch;
	int numberLines=1;
	int numberChar=-1;
	int numberWords=1;
	while((ch=fileInputStream.read())!=-1) {
		System.out.print((char)ch);
		
		if(ch== '\n') {
			numberLines++;
		} else {
			if(ch!=' ')numberChar++;
		}
		
		if(ch == ' ' || ch=='\t' || ch=='\n') numberWords++;
	} 
	
	if(numberChar==-1) numberChar=0;
	System.out.println("Number of lines: "+numberLines);
	System.out.println("Number of Char: "+numberChar);
	System.out.println("Number of lines: "+numberWords);
	
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	 catch(IOException e) {
		 e.printStackTrace();
	 }
	}
}
