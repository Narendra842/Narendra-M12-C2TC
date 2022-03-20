package com.m12;

class X
{
	public void m1()
	{
		System.out.println("This is X class m1()");
	}
}

class Y extends X
{
	public void m2()
	{
		System.out.println("this is Y class m2()");
	}
}

class Z extends Y
{
	public void m3()
	{
		System.out.println("this is Z class m3() ");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {

		 Z z= new Z();
		 // calling Z,Y,X class method because here we used the concept 
		 // of multilevel inheritance 
		 z.m1();
		 z.m2();
		 z.m3();


	}

}
