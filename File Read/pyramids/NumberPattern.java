package com.pattern.pyramids;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Pyramid:");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
			}
			System.out.println();
		}
				
		
		sc.close();
	}

}
