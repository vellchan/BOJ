package algorithm;

import java.util.Scanner;

public class A10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	
		for(int j='a'; j<='z'; j++) {
			
				int v = s.indexOf(j);
				System.out.print(v+" ");
			
		}

	}

}
