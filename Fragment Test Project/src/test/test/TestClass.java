package test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import test.HostPackageClass;

public class TestClass
{

    @Test
    public void test()
    {
        final HostPackageClass testClass = new HostPackageClass();
        assertEquals(0, testClass.getInt());
    }
}
