package com.graymatter;

import java.util.Stack;

public class DemoOnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		for(int i=1;i<=10;i++)
			st.push(i);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.capacity());
		st.trimToSize();
		System.out.println(st.capacity());
		st.add(11);
		System.out.println(st.capacity());


	}

}
