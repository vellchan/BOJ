package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2609 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] str = br.readLine().split(" ");
	long a = Long.parseLong(str[0]);
	long b = Long.parseLong(str[1]);
	long big, small;
	long mok, nmg;
	long GCD = 0;
	long LCM = 0;
	
	if(a>=b) {
		big = a;
		small = b;
	}else {
		small = a;
		big = b;
	}
	while(true) {
		mok = big/small;
		nmg = big - small * mok;
		if(nmg==0) {
			GCD = small;
			LCM = a*b/GCD;
			System.out.println(GCD);
			System.out.println(LCM);	
			break;
		}else {
			big=small;
			small=nmg;
		}
	}
		

	
	
	}
}


