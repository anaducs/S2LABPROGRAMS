package com.company;

public class product {
	String pname,pcode;
	float price;
	public String getpname()
	{
		return pname;
	}
public product()
{
	
}

public product( String name, String code, float price)
{
	this.pname=name;
	this.pcode=code;
	this.price=price;
}
public void setpname(String pname)
{
this.pname=pname;	
}
public String getpcode()
{
	return pcode;
}
public void setpcode(String pcode)
{
	this.pcode = pcode;
}
public float getprice()
{
	return price;
}
public void display()
{
	System.out.println("product code"+pcode);
	System.out.println("product name"+pname);
	System.out.println("product price"+price);
	
}

}