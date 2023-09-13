package com.company;

public class result implements sport, student {

	@Override
	public void displaydetails() {
		// TODO Auto-generated method stub
		System.out.println("Name ="+name);
		System.out.println("Academics");
		System.out.println("subject ="+sub1);
		System.out.println("mark ="+m_m);
		System.out.println("subject ="+sub2);
		System.out.println("mark ="+p_m);
		System.out.println("sports");		
		System.out.println("goals ="+goal);
		System.out.println("assists ="+assist);
		System.out.println("passes ="+passes);
		System.out.println("Minutes played ="+min_played);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result obj = new result();
obj.displaydetails();
	}

}
