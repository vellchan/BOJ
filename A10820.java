package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10820 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		int smallA;
		int bigA;
		int num;
		int space;
		/*StringTokenizer st = new StringTokenizer(br.readLine());
		int n = st.countTokens();*/
		while((s=br.readLine()) != null) {
			if(s.isEmpty()) {
				break;
			}//비어있으면 끝
			
			smallA=0;
			bigA=0;
			num=0;
			space=0;
			

			for(int i=0;i<s.length();i++) {
				char spell = s.charAt(i);
				if(spell>=65&&spell<=90) {
					bigA++;
				}else if(spell>=97&&spell<=122){
					smallA++;
				}else if(spell>=48&&spell<=57) {
					num++;
				}else if(spell==32) {
					space++;
				}
				
			}
			System.out.println(smallA+" "+bigA+" "+num+" "+space);
			
		}
		
		
	}

}
