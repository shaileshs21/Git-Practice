package com.string.operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNoInFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Shailesh\\eclipse-workspace\\Excercise\\src\\com\\string\\operations\\Text Files\\Test.txt");
		String line;
		String pattern = "\\d+";
        Pattern r = Pattern.compile(pattern);
		
		try {
			FileReader in = new FileReader(file);
			BufferedReader reader = new BufferedReader(in);
			while((line = reader.readLine())!= null) {
				Matcher m = r.matcher(line);
				while(m.find( )){
	                System.out.println(m.group());
	                
	            }
			}	
			reader.close();
					} catch (IOException e) {
			e.printStackTrace();
		}
			
			
		}	
}