package JenkinsTest.Jenkins;

import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test(priority=1)
	public void Test1(){
		System.out.println("Test 1 is passed");
	}
	@Test(priority=2)
	public void Test2(){
		System.out.println("Test 2 is passed");
	}
	@Test(priority=3)
	public void Test3(){
		System.out.println("Test 3 is passed");
	}
	@Test(priority=4)
	public void Test4(){
		System.out.println("Test 4 is passed");
	}
	@Test(priority=5)
	public void Test5(){
		System.out.println("Test 5 is passed");
	}
	@Test(priority=6)
	public void Test6(){
		System.out.println("Test 6 is passed");
	}
	@Test(priority=7)
	public void Test7(){
		System.out.println("Test 7 is passed");
	}
	@Test(priority=8)
	public void Test8(){
		System.out.println("Test 8 is passed");
	}
	@Test(priority=9)
	public void Test9(){
		System.out.println("Test 9 is passed");
	}
	@Test(priority=10)
	public void Test10(){
		System.out.println("Test 10 is passed");
	}
	
	@Test(priority=11)
	public void Test11() {
		System.out.println(5/0);	}
	
	public void test12() {
		System.out.println("hello 12");
	}
}
