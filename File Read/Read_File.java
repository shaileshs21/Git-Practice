package com.file.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_File {

	public static void main(String[] args) {
		FileReader in = null;
		File file = new File("C:\\Users\\Shailesh\\eclipse-workspace\\Excercise\\src\\com\\file\\read\\Test.txt");
			try {
				in = new FileReader(file);
				int c;
				while((c = in.read())!= -1) {
					System.out.print((char)c);
				}
			} catch (Exception e) {
				System.out.println("File Not Found"+e.getMessage());
			}finally {
				if(in != null) {
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}	
}