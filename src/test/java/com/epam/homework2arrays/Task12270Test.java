package com.epam.homework2arrays;

import org.junit.Assert;
import org.junit.Test;

public class Task12270Test {
    @Test
    public void testTextWrite(){
        Task12270 task12270 = new Task12270();
        int[][] a = new int[3][3];
        a[0] = new int[]{1, 2, 3};
        a[1] = new int[]{4, 5, 6};
        a[2] = new int[]{7, 8, 9};
        Assert.assertEquals("1739", task12270.textWrite(a, 3, 3));
        Assert.assertNotEquals( "1234", task12270.textWrite(a, 3, 3));
    }
}
