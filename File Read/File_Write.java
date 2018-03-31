package com.file.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Write {

	public static void main(String[] args) {
		  FileReader in = null;
	      FileWriter out = null;

	      try {
	         try {
				in = new FileReader("C:\\\\Users\\\\Shailesh\\\\eclipse-workspace\\\\Excercise\\\\src\\\\com\\\\file\\\\read\\\\Test.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         try {
				out = new FileWriter("C:\\Users\\Shailesh\\eclipse-workspace\\Excercise\\src\\com\\file\\read\\output.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
	         
	         int c;
	         try {
				while ((c = in.read()) != -1) {
				    out.write(c);
				   // System.out.print((char)c);
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }finally {
	         if (in != null) {
	            try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         }
	         if (out != null) {
	            try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         }
	      }
	}

}
