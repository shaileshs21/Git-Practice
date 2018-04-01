package com.pattern.pyramids;

import java.util.Scanner;

public class ReverseSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Pyramid:");
		int n = sc.nextInt();
		
		for(int i=n;i>0;i--) {
			for(int j=0;j<=n;j++) {
					if(j>=i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
				
		
		sc.close();
	}

}
