package algorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] cArr = new char[s.length()];
		
		int count = 0;
		for(int i=0;i<s.length();i++) {
			cArr[i]=s.charAt(i);
		}
		for(int j='a'; j<='z'; j++) {
			count=0;
			for(int k=0;k<cArr.length;k++) {
				if(cArr[k]==j) {
					count++;
				}
			}
			System.out.print(count+" ");
		}
		}
	
	}
