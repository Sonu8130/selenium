package Demo;

import org.testng.annotations.Test;

public class CarTest {

	@Test
	public void Air1() {

		System.out.print("This is plane testcase1");
	}

	@Test(groups= {"smoke"})
	public void Air2() {

		System.out.print("This is plane testcase2");
	}
@Test
	public void Air3() {

		System.out.print("This is plane testcase3");
	}
@Test(groups={"smoke"})
	public void Air4() {

		System.out.print("This is plane testcase4");
	}
@Test
	public void Air5() {

		System.out.print("This is plane testcase5");
	}
@Test(groups= {"smoke"})
	public void Air6() {

		System.out.print("This is plane testcase6");
	}
}
