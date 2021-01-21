package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2745 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		char[] cArr = str[0].toCharArray();
		int[] arr = new int[cArr.length];
		int sysN = Integer.parseInt(str[1]);
		int n =0;
		int c=1;
		for(int i = 0;i<cArr.length;i++) {
			if(cArr[i]>=65) {
				arr[i]=(int)cArr[i]-55;
			}else {
				arr[i]=(int)cArr[i]-48;
			}
		}
		
	
		int sum=arr[arr.length-1];
		
		
		for(int j=(arr.length-2);j>=0;j--) {
			n=c;
		
			while(n-->0) {
				arr[j]=arr[j]*sysN;
			}
			c++;
			sum=sum+arr[j];
			}
		System.out.println(sum);
	}

}
