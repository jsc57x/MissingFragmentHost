package test.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import test.HostPackageClass;

public class TestClass {

	@Test
	public void test()
	{
		HostPackageClass testClass = new HostPackageClass();
		assertEquals(0, testClass.getInt());
	}
}
