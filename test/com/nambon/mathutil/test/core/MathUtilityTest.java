/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nambon.mathutil.test.core;

import com.nambon.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    //day la class se su dung cac ham cua JUnit de verify code chinh
    // test ham tinh giai thua ben package core.MathUtil
    
    
    //co rat nhieu quy tac dat ten ham kiem thu
    //thuong se la noi len muc dich cua viec kiem thu
    //trong 1 tinh huong xai ham 
    //theo kieu thanh cong hoac that bai
    
    //ham duoi day la tinh huong chay thanh cong
    //tra ve ket qua ngon
    //ta se xai ham kieu well dua vao gia tri hop le 5 3 2,...
    
    //Test se phoi hop vs JVM de chay test
    //@test phia hau truong chinh la public static void main()
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n =0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        
        //su dung frame work de comapre expected va actual
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
        //neu giong nhau thi no cho ra ket qua mau xanh
        // neu khong giong nhau thi tra ve mau do
    }
    
    //Nhung tinh huong bat thuong ko de so sanh qua value
    //ma chi co the do luong = su xuat hien cua 1 yeu to nao do 
    //yeu to day thuong la cac Exception dc day ra
    //ham assertEquals() ko dung de so sanh 2 ngoai le voi nhau
    //          equals() la bang nhau hay khong tren value
    //Trong th nay neu ngoai le nem ra giong ten voi ngoai le expected
    //thi se tra ve mau xanh
    //Neu khong giong thi se tra ve mau do
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); // nem ra ngoai le la actual
    }
    
    //cach khac de bat ngoai le
    
}
