/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.nambon.mathutil.test.core;

import com.nambon.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */

//cau lenh nay chi choi voi JUnit
//bao hieu rang se can loop qua tap data
//de lay du lieu test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //Tra ve mang 2 chieu gom nhieu cap expected | input
    @Parameterized.Parameters // JUnit se loop qua tung dong cua mang de lay ra tung cap data input|expected
    public static Object[][] initData() {
        return new Integer[][] {
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {5,120},
            {6,120},
        };
    } 
    
    @Parameterized.Parameter(value = 0) // value = 0 la map voi mang data tai vi tri 0
    public int input; // bien map voi value cua cot 0 cua mang
    @Parameterized.Parameter(value = 1)
    public long expected; //bien map voi gia tri tra ve cua ham getFactorial()
    
     @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(input));
    }
    
}
