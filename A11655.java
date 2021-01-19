package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11655 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
	
		char[] cArr = new char[text.length()];
		for(int j=0; j<text.length();j++) {
			cArr[j]=text.charAt(j);
		}

		for(int i = 0; i<cArr.length; i++) {
			if(cArr[i]==32) {
				cArr[i]=cArr[i];
			}
			else if(cArr[i]>=65&&cArr[i]<=90){
			cArr[i]=(char)(cArr[i]+13);
			if(cArr[i]>90) {
				cArr[i]=(char)(cArr[i]-90+64);
			}	
		}else if(cArr[i]>=97&&cArr[i]<=122) {
			cArr[i]=(char)(cArr[i]+13);
			if(cArr[i]>122) {
				cArr[i]=(char)(cArr[i]-122+96);
			}
		}
		}
		System.out.println(cArr);
		 
	}

}
