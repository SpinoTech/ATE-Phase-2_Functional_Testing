package package1.sampleTest;

import org.testng.annotations.Test;


public class test001 {
  @Test(priority=2)
  public void sample1() {
	  System.out.println("hello world");
  }
  @Test(priority=1)
  public void sample2() {
	  System.out.println("hello world 2");
  }
  @Test(priority=4)
  public void sample3() {
	  System.out.println("hello world 3");
  }
  @Test(priority=3)///for priorities the test case
  public void sample4() {
	  System.out.println("hello world 4");
  }
  @Test(enabled=false) ///for ignoring the test case
  public void sample5() {
	  System.out.println("ignored part");
  }
}
