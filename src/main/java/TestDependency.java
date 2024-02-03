import org.testng.annotations.Test;

public class TestDependency 
{

	@Test(priority=1,dependsOnGroups="Sanity")
	public static void method1()
	{
		System.out.println("Test1");
	}
	@Test(priority=2,groups="Sanity")
	public static void method2()
	{
		System.out.println("Test2");	
	}
	@Test(priority=3,groups="Sanity")
	public static void method3()
	{
		System.out.println("Test3");	
	}
}
