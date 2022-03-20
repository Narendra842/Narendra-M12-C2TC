
class SuperClass
{
    String name="This Is Super Class";
    
    public void m1()
    {
    	System.out.println("Super Class m1() ");
    }
}

public class SuperUseCase extends SuperClass
{
    String name= "This Is Sub Class";
   
    public void m1()
    {
    	System.out.println("Sub Class m1()");
    	System.out.println(name);
    	/* by using super keyword we can call super class 
    	 * non-static variable and method's directly
    	 * 
    	 */
    	System.out.println(super.name); 
    	                            
    	super.m1();
    }
	 
	public static void main(String[] args) {
		
		SuperUseCase sub= new SuperUseCase();
		sub.m1();
		

	}

}
