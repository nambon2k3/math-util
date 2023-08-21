/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nambon.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //trong class nay cung cap cho ta rat nhieu ham xu li toan hoc
    //clone class Math cua JDK
    //ham thu vien xai chung cho ai do ma khong can luu lai trang thai/gia tri ==> dung ham static
    
    //ham tinh giai thua
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0 and 20");
        }
        if(n == 1 || n == 0) {
            return 1;
        }
        
        long product = 1;
        for (int i = 2; i < n + 1; i++) {
            product *= i;
        }
        return product;
    }
}
