package priority;

import org.testng.annotations.Test;

public class Task_1 {
	@Test(priority = 1,dependsOnMethods ="payment_page")
	void log_in()
	{
		System.out.println("username");
		System.out.println("password");
	}
	@Test(priority = -1,invocationCount =3)
	void search_page()
	{
		System.out.println("product");
		System.out.println("price");
	}
	@Test(priority = 2)
    void add_tocart()
    {
    	System.out.println("savings");
    	System.out.println("orders");
    	
    }
	@Test(priority = 2)
    void payment_page()
    {
    	System.out.println("checkout");
    	System.out.println("account");
    }
}
