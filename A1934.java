package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1934 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			int a=0 ,b =0;
			int big,small;
			int mok, nmg;
			int LCM,GCD;
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(a>=b) {
				big = a;
				small = b;
			}else {
				big=b;
				small=a;
			}while(true) {
				mok = big/small;
				nmg = big-small*mok;
				if(nmg==0) {
					GCD = small;
					LCM = (a*b)/GCD;
					System.out.println(LCM);
					break;
				}else {
					big=small;
					small=nmg;
				}
				
			}
			
		}
	}

}
