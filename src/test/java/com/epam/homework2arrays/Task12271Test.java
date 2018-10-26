package com.epam.homework2arrays;

import org.junit.Assert;
import org.junit.Test;

public class Task12271Test {
    @Test
    public void testTextWrite(){
        char[][] a = new char[3][3];
        a[0] = new char[]{'1', '2', '3'};
        a[1] = new char[]{'4', '5', '6'};
        a[2] = new char[]{'7', '8', '9'};

        Task12271 task12271 = new Task12271();
        Assert.assertEquals("56", task12271.textWrite(a , 2,2, 2));
        Assert.assertNotEquals( "1234", task12271.textWrite(a, 2, 2, 2));
    }
}
