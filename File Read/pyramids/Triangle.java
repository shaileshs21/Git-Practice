package com.pattern.pyramids;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Pyramid:");
		int n = sc.nextInt();
		
		for(int i=n-1;i>=0;i--) {
			for(int spaces=i;spaces>0;spaces--) {
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
				
		
		sc.close();
	}

}
