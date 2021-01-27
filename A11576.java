package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class A11576 {
	static void change(int k, int fNum2) {
		if(k==0) {
			return;
		}
		change(k/fNum2, fNum2);
		System.out.print(k%fNum2 + " ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int fNum = sc.nextInt();
	int fNum2 = sc.nextInt();
	int sNum = sc.nextInt();
	int k = 0;
	for(int i=0;i<sNum;i++) {
		int num = sc.nextInt();
		k = k*fNum+num;
	}
	System.out.println(k);
	change(k, fNum2);
	
	}

}
