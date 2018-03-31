package com.file.read;

import java.util.Scanner;

public class Read_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		Scanner sc = new Scanner(System.in);
		while(true) {
			str = sc.nextLine();
			System.out.println(str);
			if(str.equals("Exit")) {
				sc.close();
				break;
			}
		}
	
		

	}

}
