package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class A10866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		

		Deque<Integer> deque = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			int num=0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String temp = st.nextToken();
			if(st.countTokens() >= 1) 
				num = Integer.parseInt(st.nextToken());
				
			if(temp.equals("push_back"))
				deque.addLast(num);
			else if(temp.equals("push_front"))
				deque.addFirst(num);
			else if(temp.equals("front")) {
				if(deque.size()==0) {
					sb.append("-1\n");
					
				}
				else {
					sb.append(deque.peekFirst()+"\n");
				}
			}
			else if(temp.equals("back")) {
				if(deque.size()==0) {
					sb.append("-1\n");
				}
				else {
					sb.append(deque.peekLast()+"\n");
				}
				
			}
			else if(temp.equals("pop_front")) {
				if(deque.size()==0) {
					sb.append("-1\n");
				}
				else {
					sb.append(deque.pollFirst()+"\n");
				}
			}
			else if(temp.equals("pop_back")) {
				if(deque.size()==0) {
					sb.append("-1\n");
				}
				else {
					sb.append(deque.pollLast()+"\n");
				}
			}
			else if(temp.equals("size")) {
				sb.append(deque.size()+"\n");
				
			}
			else if(temp.equals("empty")) {
				if(deque.isEmpty()) {
					sb.append("1\n");
				}
				else {
					sb.append("0\n");
				}
			}
			
				
			
			
			
		}
		System.out.println(sb);
	}
}
