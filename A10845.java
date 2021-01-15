package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A10845 {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		List<Integer> queue = new ArrayList<>();
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			 String temp =st.nextToken(); //명령어
	            switch(temp) {
	                case "push":
	                    queue.add(Integer.parseInt(st.nextToken()));                
	                    break;
	                case "pop":    
	                    if(!queue.isEmpty()) {
	                    System.out.println(queue.get(0));
	                    queue.remove(0);
	                    }
	                    else {System.out.println(-1);}
	                    break;
	                case "size":
	                    System.out.println(queue.size());
	                    break;
	                case "empty":
	                    if(queue.isEmpty()) {System.out.println(1);}
	                    else {System.out.println(0);}
	                    break;
	                case "front":
	                    if(queue.isEmpty()) {System.out.println(-1);}
	                    else {
	                    System.out.println(queue.get(0));}
	                    break;
	                case "back":
	                    if(queue.isEmpty()) {System.out.println(-1);}
	                    else {
	                    System.out.println(queue.get(queue.size()-1));
	                    }
	            }
	        
		}

	}

}
