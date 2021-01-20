package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10824 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str =  br.readLine().split(" ");
		
		long a = Long.parseLong(str[0]+str[1]);
		long b = Long.parseLong(str[2]+str[3]);

		System.out.println(a+b);
		
		
		
	}

}
