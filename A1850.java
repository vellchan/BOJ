package algorithm;


import java.util.Scanner;

public class A1850 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	StringBuilder sb1 = new StringBuilder();
	String[] str = br.readLine().split(" ");
	int a = Integer.parseInt(str[0]);
	int b = Integer.parseInt(str[1]);
	long[] aArr = new long[a];
	long[] bArr = new long[b];
	long big, small;
	long mok, nmg;
	long GCD = 0;
	long LCM = 0;
	for(int i = 0; i<aArr.length; i++) {
		aArr[i]=1;
		sb.append(aArr[i]);
	}
	for(int j = 0; j<bArr.length; j++) {
		bArr[j]=1;
		sb1.append(bArr[j]);
	}
	System.out.println(sb);
	System.out.println(sb1);
	String aSb = String.valueOf(sb);
	String bSb = String.valueOf(sb1);
	
	long aNum = Long.parseLong(aSb);
	long bNum = Long.parseLong(bSb);
	
	if(aNum>=bNum) {
		big = aNum;
		small = bNum;
	}else {
		small = aNum;
		big = bNum;
	}
	while(true) {
		mok = big/small;
		nmg = big - small * mok;
		if(nmg==0) {
			GCD = small;
			
			System.out.println(GCD);
				
			break;
		}else {
			big=small;
			small=nmg;
		}
}*/
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long big, small;
		long mok, nmg;
		long GCD = 0;
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
				
				
				break;
			}else {
				big=small;
				small=nmg;
			}
	}
		for(int i = 0; i<GCD;i++) {
			sb.append(1);
		}
		System.out.println(sb);
}
}
