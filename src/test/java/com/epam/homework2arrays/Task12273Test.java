package com.epam.homework2arrays;

import org.junit.Assert;
import org.junit.Test;

public class Task12273Test {
    @Test
    public void testTextWrite(){
        char[][] a = new char[3][3];
        a[0] = new char[]{'1', '2', '3'};
        a[1] = new char[]{'4', '5', '6'};
        a[2] = new char[]{'7', '8', '9'};

        Task12273 task12273 = new Task12273();
        Assert.assertEquals("2" + '\n' + "5" + '\n' + "8" + '\n', task12273.textWrite(a, 3,3));
        Assert.assertNotEquals("1" + '\n' + "5" + '\n' + "1" + '\n', task12273.textWrite(a, 3,3));
    }
}
