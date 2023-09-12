package com.company;

public class productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1 = new product("Benz","Ben0012",200000);
		System.out.println("**Display = P1**");
		p1.display();
		product p2 = new product("Jagaur","jg0012",500000);
		System.out.println("**Display = P2**");
		p2.display();
		product p3 = new product("Maruthi","MA0012",100000);
		System.out.println("**Display = P3**");
		p3.display();
		product p = new product();
		if(p1.price < p2.price && p1.price < p3.price)
			p=p1;
		else if(p2.price < p3.price)
			p=p2;
		else
			p=p3;
		System.out.println("**Display Product with Lowest Price **");
		p.display();
		
		

	}

}
