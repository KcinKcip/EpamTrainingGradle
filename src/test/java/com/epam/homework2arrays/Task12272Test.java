package com.epam.homework2arrays;

import org.junit.Assert;
import org.junit.Test;

public class Task12272Test {
    @Test
    public void testTextWrite(){
        char[][] a = new char[3][3];
        a[0] = new char[]{'1', '2', '3'};
        a[1] = new char[]{'4', '5', '6'};
        a[2] = new char[]{'7', '8', '9'};

        Task12272 task12272 = new Task12272();
        Assert.assertEquals("13579", task12272.textWriteA(a, 3,3));
        Assert.assertNotEquals( "1234", task12272.textWriteA(a, 3, 3));
        Assert.assertEquals("17539", task12272.textWriteB(a, 3,3));
        Assert.assertNotEquals( "1234", task12272.textWriteB(a, 3, 3));
    }
}
