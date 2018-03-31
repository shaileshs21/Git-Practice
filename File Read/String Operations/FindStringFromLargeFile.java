package com.string.operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindStringFromLargeFile {

	public static void main(String[] args) {
		int count = 0;
		String line;
		
		try {
			FileReader in = new FileReader("C:\\\\Users\\\\Shailesh\\\\eclipse-workspace\\\\Excercise\\\\src\\\\com\\\\file\\\\read\\\\Test.txt");
			BufferedReader reader = new BufferedReader(in);
			while((line = reader.readLine())!= null) {
				if(line.contains("This String")) {
					System.out.println("No of Occurances of String:"+ ++count);
				}
			}	
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
