package com.epam.homework2arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class Task12274Test {
    @Test
    public void testTextWrite(){
        char[][] a = new char[3][3];
        a[0] = new char[]{'1', '2', '3'};
        a[1] = new char[]{'4', '5', '6'};
        a[2] = new char[]{'7', '8', '9'};

        Task12274 task12274 = new Task12274();
        Assert.assertEquals("17" + '\n' + "28" + '\n' + "39" + '\n', task12274.textWrite(a, 3,3));
        Assert.assertNotEquals("1" + '\n' + "5" + '\n' + "1" + '\n', task12274.textWrite(a, 3,3));
    }
}

