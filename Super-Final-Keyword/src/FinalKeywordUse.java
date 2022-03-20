
final class Vehicle
{
	public void vehicleRule()
	{
		System.out.println(" Driving Vehicle Having rule and Guidelines ");
	}
}

/*  we can not extend a class which having final hence 
 * below we will get an error
 * class Car extends Vehicle {  }  
 * */
class Car
{
	public final int speed=90;   
   
	// speed=70;         // by declaring final as variable we can not change it value
	 
	public final void engine() 
	{
		System.out.println("This Car Having 570 CC Engine");
	}
	
}

class Maruti extends Car
{
	/*
	 * we will get error here because we can not override 
	 * final method into subclass 
	public void engine()
	{
		System.out.println("Maruti Car Having 550 CC Engine");
	} 
	*/
}

public class FinalKeywordUse {

	
	
	public static void main(String[] args) {
	
		// Creating object 
		Car c= new Maruti();
		c.engine();
		System.out.println("Final Speed For " +c.speed);

	}

}
